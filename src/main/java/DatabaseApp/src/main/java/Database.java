import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static Database instance;
    private Connection connection;

    private Database() {
        try {
            // Підключення до бази H2, яка зберігається у файлі test.db
            connection = DriverManager.getConnection("jdbc:h2:./test", "sa", "");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Не вдалося підключитися до бази даних.");
        }
    }

    public static synchronized Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
