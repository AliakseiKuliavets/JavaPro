package practice.javaPro.aneeshMistryJunitMockito.lesson1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

class BookingManagerTest {
    private HotelDao hotelDaoMock;
    private BookingManager bookingManager;

    @BeforeEach
    public void setUp() {
        hotelDaoMock = Mockito.mock(HotelDao.class);
        bookingManager = new BookingManager(hotelDaoMock);
        List<String> availableRooms = Arrays.asList("A","C");
        when(hotelDaoMock.fetchAvailableRooms()).thenReturn(availableRooms);
    }

    @Test
    void checkRoomAvailabilityTrue() {
        Assertions.assertTrue(bookingManager.checkRoomAvailability("A"));
    }
    @Test
    void checkRoomAvailabilityFalse() {
        Assertions.assertFalse(bookingManager.checkRoomAvailability("B"));
    }
}