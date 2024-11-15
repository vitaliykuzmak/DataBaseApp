import com.example.database.Database;
import com.example.database.DatabaseInitService;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseInitServiceTest {

    @Test
    public void testDatabaseInitialization() {
        // Ініціалізуємо базу даних
        DatabaseInitService.main(new String[]{});

        try (Connection connection = Database.getInstance().getConnection();
             Statement stmt = connection.createStatement()) {

            // Перевіряємо, чи створена одна з таблиць (наприклад, "clients")
            ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM clients");
            assertTrue(rs.next(), "Таблиця clients повинна існувати");

        } catch (Exception e) {
            fail("Виникла помилка під час тестування ініціалізації бази даних: " + e.getMessage());
        }
    }
}
