import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Date;

import java.util.Random;
import java.util.UUID;

import java.time.LocalDate;
public class EcommerceDataGenerator {

    //CREATE TABLE customers (id INT AUTO_INCREMENT PRIMARY KEY,name VARCHAR(100),email VARCHAR(100),city VARCHAR(50));

    //CREATE TABLE orders (id INT AUTO_INCREMENT PRIMARY KEY,customer_id INT,order_date DATE,amount DECIMAL(10,2),FOREIGN KEY (customer_id) REFERENCES customers(id));

    static String[] cities = {"Chennai", "Bangalore", "Mumbai", "Delhi", "Kolkata"};
    static Random random = new Random();

    public static void main(String[] args) {
        //String url = "jdbc:mysql://localhost:3306/randomgenerate";
        String url = "jdbc:mysql://localhost:3306/randomgenerate?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "Test@1234";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection(url, user, password)) {
                System.out.println("Connected successfully!");
                for (int i = 0; i < 1000; i++) {
                    int customerId = insertCustomer(conn);
                    int orderCount = random.nextInt(5) + 1;
                    for (int j = 0; j < orderCount; j++) {
                        insertOrder(conn, customerId);
                    }
                }
                System.out.println("Random customers and orders inserted.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }catch(Exception e){
            e.printStackTrace();
        }    
    }

    static int insertCustomer(Connection conn) throws SQLException {
        String name = "Customer" + UUID.randomUUID().toString().substring(0, 5);
        String email = name.toLowerCase() + "@mail.com";
        String city = cities[random.nextInt(cities.length)];

        String sql = "INSERT INTO customers (name, email, city) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, city);
            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) return rs.getInt(1);
        }
        return -1;
    }

    static void insertOrder(Connection conn, int customerId) throws SQLException {
        LocalDate date = LocalDate.now().minusDays(random.nextInt(365));
        double amount = 100 + (1000 - 100) * random.nextDouble();

        String sql = "INSERT INTO orders (customer_id, order_date, amount) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, customerId);
            stmt.setDate(2, Date.valueOf(date));
            stmt.setDouble(3, Math.round(amount * 100.0) / 100.0);
            stmt.executeUpdate();
        }
    }

}
