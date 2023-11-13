package lesson.lesson21.taski;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class NotificationServiceTest {
    private NotificationService notificationService;

    @Mock
    private EmailService emailService;
    private User user;
    private static final String subject = "qwe";
    private static final String message = "Hallo";
    @BeforeEach
    public void setUp(){
        notificationService = new NotificationService(emailService);
        user = new User("123","kul@mail.ru");
    }

    /**
     * Тест, который проверяет метод notifyUser(User user, String subject, String message) если метод
     * emailService.sendEmail(user.getEmail(), subject, message) == true
     */
    @Test
    public void notifyUserTrue(){
        Mockito.when(emailService.sendEmail(user.getEmail(), subject, message)).thenReturn(true);
        Assertions.assertTrue(notificationService.notifyUser(user,subject,message));
        Mockito.verify(emailService).sendEmail(user.getEmail(), subject, message);
    }

    /**
     * Тест, который проверяет метод notifyUser(User user, String subject, String message) если метод
     * emailService.sendEmail(user.getEmail(), subject, message) == false
     */
    @Test
    public void notifyUserFalse(){
        Mockito.when(emailService.sendEmail(user.getEmail(), subject, message)).thenReturn(false);
        Assertions.assertFalse(notificationService.notifyUser(user,subject,message));
        Mockito.verify(emailService).sendEmail(user.getEmail(), subject, message);
    }
}