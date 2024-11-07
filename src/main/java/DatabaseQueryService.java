import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseQueryService {

    // Метод для запиту find_max_projects_client.sql
    public List<MaxProjectCountClient> findMaxProjectsClient() {
        List<MaxProjectCountClient> result = new ArrayList<>();
        try (Connection conn = Database.getInstance().getConnection();
             Statement stmt = conn.createStatement()) {

            String sql = new String(Files.readAllBytes(Paths.get("sql/find_max_projects_client.sql")));
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                result.add(new MaxProjectCountClient(rs.getString("name"), rs.getInt("projectCount")));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    // Метод для запиту find_longest_project.sql
    public List<LongestProject> findLongestProject() {
        List<LongestProject> projects = new ArrayList<>();

        try (Connection conn = Database.getInstance().getConnection();
             Statement stmt = conn.createStatement()) {

            String sql = new String(Files.readAllBytes(Paths.get("sql/find_longest_project.sql")));
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int projectId = rs.getInt("project_id");
                int duration = rs.getInt("duration");
                projects.add(new LongestProject(projectId, duration));
            }
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }

        return projects;
    }

    // Метод для запиту find_max_salary_worker.sql
    public List<MaxSalaryWorker> findMaxSalaryWorker() {
        List<MaxSalaryWorker> workers = new ArrayList<>();

        try (Connection conn = Database.getInstance().getConnection();
             Statement stmt = conn.createStatement()) {

            String sql = new String(Files.readAllBytes(Paths.get("sql/find_max_salary_worker.sql")));
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String name = rs.getString("name");
                int salary = rs.getInt("salary");
                workers.add(new MaxSalaryWorker(name, salary));
            }
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }

        return workers;
    }

    // Метод для запиту find_youngest_eldest_workers.sql
    public List<YoungestEldestWorkers> findYoungestEldestWorkers() {
        List<YoungestEldestWorkers> workers = new ArrayList<>();

        try (Connection conn = Database.getInstance().getConnection();
             Statement stmt = conn.createStatement()) {

            String sql = new String(Files.readAllBytes(Paths.get("sql/find_youngest_eldest_workers.sql")));
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String type = rs.getString("type");
                String name = rs.getString("name");
                String birthday = rs.getString("birthday");
                workers.add(new YoungestEldestWorkers(type, name, birthday));
            }
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }

        return workers;
    }

    // Метод для запиту print_project_prices.sql
    public List<ProjectPrices> printProjectPrices() {
        List<ProjectPrices> projectPrices = new ArrayList<>();

        try (Connection conn = Database.getInstance().getConnection();
             Statement stmt = conn.createStatement()) {

            String sql = new String(Files.readAllBytes(Paths.get("sql/print_project_prices.sql")));
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int projectId = rs.getInt("project_id");
                int price = rs.getInt("price");
                projectPrices.add(new ProjectPrices(projectId, price));
            }
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }

        return projectPrices;
    }


}