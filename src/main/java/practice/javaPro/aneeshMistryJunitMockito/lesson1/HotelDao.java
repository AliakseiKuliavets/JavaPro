package practice.javaPro.aneeshMistryJunitMockito.lesson1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HotelDao {
    public List<String> fetchAvailableRooms() {
        List<String> availableRooms = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection("Data_URL");
             Statement statement = conn.createStatement();
             ResultSet rs = statement.executeQuery("SELECT* FROM ROOMS WHERE AVAILABLE like '1'")) {
            while (rs.next()) {
                availableRooms.add(rs.getString("Room name"));
            }
            return availableRooms;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
