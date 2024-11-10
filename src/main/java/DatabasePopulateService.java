import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class DatabasePopulateService {
    public static void main(String[] args) {
        try (Connection conn = Database.getInstance().getConnection()) {

            String sql = new String(Files.readAllBytes(Paths.get("sql/populate_db.sql")));

            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.execute();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


