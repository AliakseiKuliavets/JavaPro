package practice.javaPro.aneeshMistryJunitMockito.lesson1;

import java.sql.SQLException;
import java.util.List;

public class BookingManager {
    private HotelDao dao;

    public BookingManager(HotelDao dao) {
        this.dao = dao;
    }
    public boolean checkRoomAvailability(String roomName) {

        List<String> roomsAvailable = dao.fetchAvailableRooms();
        return roomsAvailable.contains(roomName);
    }
}
