import java.sql.*;
import java.time.LocalDate;
import java.util.*;
import java.sql.Date;


/*
 * 
 * CREATE TABLE customers (id INT AUTO_INCREMENT PRIMARY KEY,name VARCHAR(100),email VARCHAR(100),city VARCHAR(50));
 * 
 * CREATE TABLE products (id INT AUTO_INCREMENT PRIMARY KEY,name VARCHAR(100),price DECIMAL(10,2));
 * 
 * CREATE TABLE orders (id INT AUTO_INCREMENT PRIMARY KEY,customer_id INT,order_date DATE,FOREIGN KEY (customer_id) REFERENCES customers(id));
 * 
 * CREATE TABLE order_items (id INT AUTO_INCREMENT PRIMARY KEY,order_id INT,product_id INT,quantity INT,price DECIMAL(10,2),FOREIGN KEY (order_id) REFERENCES orders(id),FOREIGN KEY (product_id) REFERENCES products(id));
 * 
 * CREATE TABLE invoices (id INT AUTO_INCREMENT PRIMARY KEY,order_id INT,invoice_date DATE,total_amount DECIMAL(10,2),FOREIGN KEY (order_id) REFERENCES orders(id));
 * 
 */

public class EcommerceFullDataGenerator {
    static String[] cities = {"Chennai", "Bangalore", "Mumbai", "Delhi", "Kolkata"};
    static String[] sampleProducts = {"Laptop", "Phone", "Tablet", "Keyboard", "Mouse", "Headphones", "Monitor", "Speaker"};
    static Random random = new Random();

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/randomgenerate";
        String user = "root";
        String password = "Test@1234";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            insertSampleProducts(conn, sampleProducts.length);

            for (int i = 0; i < 10; i++) {
                int customerId = insertCustomer(conn);
                int orderCount = random.nextInt(3) + 1;

                for (int j = 0; j < orderCount; j++) {
                    int orderId = insertOrder(conn, customerId);
                    double total = insertOrderItems(conn, orderId);
                    insertInvoice(conn, orderId, total);
                }
            }

            System.out.println("✅ E-commerce data inserted successfully.");
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
            return rs.next() ? rs.getInt(1) : -1;
        }
    }

    static void insertSampleProducts(Connection conn, int count) throws SQLException {
        String sql = "INSERT INTO products (name, price) VALUES (?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            for (String product : sampleProducts) {
                double price = 500 + (15000 * random.nextDouble());
                stmt.setString(1, product);
                stmt.setDouble(2, Math.round(price * 100.0) / 100.0);
                stmt.addBatch();
            }
            stmt.executeBatch();
        }
    }

    static int insertOrder(Connection conn, int customerId) throws SQLException {
        String sql = "INSERT INTO orders (customer_id, order_date) VALUES (?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            LocalDate date = LocalDate.now().minusDays(random.nextInt(365));
            stmt.setInt(1, customerId);
            stmt.setDate(2, Date.valueOf(date));
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            return rs.next() ? rs.getInt(1) : -1;
        }
    }

    static double insertOrderItems(Connection conn, int orderId) throws SQLException {
        String sql = "INSERT INTO order_items (order_id, product_id, quantity, price) VALUES (?, ?, ?, ?)";
        List<Integer> productIds = getProductIds(conn);
        int items = random.nextInt(3) + 1;
        double total = 0;

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            for (int i = 0; i < items; i++) {
                int productId = productIds.get(random.nextInt(productIds.size()));
                int quantity = random.nextInt(5) + 1;
                double price = getProductPrice(conn, productId);
                double itemTotal = price * quantity;

                stmt.setInt(1, orderId);
                stmt.setInt(2, productId);
                stmt.setInt(3, quantity);
                stmt.setDouble(4, price);
                stmt.addBatch();

                total += itemTotal;
            }
            stmt.executeBatch();
        }
        return Math.round(total * 100.0) / 100.0;
    }

    static void insertInvoice(Connection conn, int orderId, double total) throws SQLException {
        String sql = "INSERT INTO invoices (order_id, invoice_date, total_amount) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, orderId);
            stmt.setDate(2, Date.valueOf(LocalDate.now()));
            stmt.setDouble(3, total);
            stmt.executeUpdate();
        }
    }

    static List<Integer> getProductIds(Connection conn) throws SQLException {
        List<Integer> ids = new ArrayList<>();
        ResultSet rs = conn.createStatement().executeQuery("SELECT id FROM products");
        while (rs.next()) {
            ids.add(rs.getInt("id"));
        }
        return ids;
    }

    static double getProductPrice(Connection conn, int productId) throws SQLException {
        String sql = "SELECT price FROM products WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, productId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) return rs.getDouble("price");
        }
        return 0;
    }
}