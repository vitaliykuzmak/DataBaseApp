import org.flywaydb.core.Flyway;

class DatabaseMigrationService {
    public static void main(String[] args) {
        Flyway flyway = Flyway.configure()
                .dataSource("jdbc:h2:~/test", "sa", "")
                .load();

        // Виконуємо міграцію
        flyway.migrate();
    }
}
