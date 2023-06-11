import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String url = "jdbc:mysql://localhost:3306/projekt_java";
    private static final String userName = "root";
    private static final String password = "";
    private Connection connection;

    public void connect() throws SQLException {
        connection = DriverManager.getConnection(url, userName, password);
    }

    public void disconnect(){
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public Connection getConnection(){
        return connection;
    }
}
