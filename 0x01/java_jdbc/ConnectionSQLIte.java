import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSQLite {
    public static void initConnection() {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:sqlite_database_2022.db";
            conn = DriverManager.getConnection(url);
            System.out.println("Conexão iniciada.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                    System.out.println("Conexão finalizada.");

                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        initConnection();
    }
}