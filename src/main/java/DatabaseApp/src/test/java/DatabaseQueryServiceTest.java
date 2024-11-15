import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseQueryServiceTest {

    private static DatabaseQueryService queryService;

    @BeforeAll
    public static void setup() {
        // Ініціалізуємо з'єднання з БД та сервіси, якщо це необхідно
        queryService = new DatabaseQueryService();
    }

    @Test
    public void testFindMaxProjectsClient() {
        List<MaxProjectCountClient> clients = queryService.findMaxProjectsClient();
        assertNotNull(clients);
        assertTrue(clients.size() > 0, "Список клієнтів не повинен бути порожнім");
    }

    @Test
    public void testFindLongestProject() {
        List<LongestProject> projects = queryService.findLongestProject();
        assertNotNull(projects);
        assertTrue(projects.size() > 0, "Список проектів не повинен бути порожнім");
    }

    @Test
    public void testFindMaxSalaryWorker() {
        List<MaxSalaryWorker> workers = queryService.findMaxSalaryWorker();
        assertNotNull(workers);
        assertTrue(workers.size() > 0, "Список працівників не повинен бути порожнім");
    }

    @Test
    public void testFindYoungestEldestWorker() {
        List<YoungestEldestWorker> workers = queryService.findYoungestEldestWorkers();
        assertNotNull(workers);
        assertTrue(workers.size() > 0, "Список працівників не повинен бути порожнім");
    }

    @Test
    public void testPrintProjectPrice() {
        List<ProjectPrice> prices = queryService.printProjectPrices();
        assertNotNull(prices);
        assertTrue(prices.size() > 0, "Список цін не повинен бути порожнім");
    }
}

