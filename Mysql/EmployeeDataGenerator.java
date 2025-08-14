import java.sql.*;
import java.time.LocalDate;
import java.util.*;
import java.sql.Date;

/*CREATE TABLE employees (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    salary DECIMAL(10,2) NOT NULL,
    joining_date DATE NOT NULL,
    designation VARCHAR(50) NOT NULL,
    manager_id INT DEFAULT NULL,
    FOREIGN KEY (manager_id) REFERENCES employees(id)
);*/

public class EmployeeDataGenerator {
    static String[] firstNames = {"John", "Jane", "Mike", "Sara", "David", "Priya", "Arun", "Liam", "Emma", "Noah"};
    static String[] lastNames = {"Smith", "Johnson", "Williams", "Brown", "Miller", "Davis", "Patel", "Sharma"};
    static String[] designations = {"Manager", "Team Lead", "Developer", "Tester", "Analyst"};
    static Random random = new Random();

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/randomgenerate";
        String user = "root";
        String password = "Test@1234";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            List<Integer> managerIds = new ArrayList<>();
            List<Integer> teamLeadIds = new ArrayList<>();

            // Insert Managers
            for (int i = 0; i < 3; i++) {
                int managerId = insertEmployee(conn, "Manager", null);
                managerIds.add(managerId);
            }

            // Insert Team Leads under Managers
            for (int i = 0; i < 5; i++) {
                int randomManager = managerIds.get(random.nextInt(managerIds.size()));
                int tlId = insertEmployee(conn, "Team Lead", randomManager);
                teamLeadIds.add(tlId);
            }

            // Insert Employees under Team Leads
            for (int i = 0; i < 20; i++) {
                int randomTL = teamLeadIds.get(random.nextInt(teamLeadIds.size()));
                insertEmployee(conn, getRandomDesignation(), randomTL);
            }

            System.out.println("✅ Employee data generated successfully!");
        }
    }

    static int insertEmployee(Connection conn, String designation, Integer managerId) throws SQLException {
        String name = getRandomName();
        String email = name.toLowerCase().replace(" ", ".") + "@company.com";
        double salary = getRandomSalary(designation);
        LocalDate joinDate = LocalDate.now().minusDays(random.nextInt(2000));

        String sql = "INSERT INTO employees (name, email, salary, joining_date, designation, manager_id) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setDouble(3, salary);
            stmt.setDate(4, Date.valueOf(joinDate));
            stmt.setString(5, designation);
            if (managerId != null) {
                stmt.setInt(6, managerId);
            } else {
                stmt.setNull(6, java.sql.Types.INTEGER);
            }
            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            return rs.next() ? rs.getInt(1) : -1;
        }
    }

    static String getRandomName() {
        return firstNames[random.nextInt(firstNames.length)] + " " + lastNames[random.nextInt(lastNames.length)];
    }

    static double getRandomSalary(String designation) {
        switch (designation) {
            case "Manager": return 80000 + random.nextInt(40000);
            case "Team Lead": return 60000 + random.nextInt(20000);
            default: return 30000 + random.nextInt(20000);
        }
    }

    static String getRandomDesignation() {
        return designations[2 + random.nextInt(designations.length - 2)]; // Developer, Tester, Analyst
    }
}

