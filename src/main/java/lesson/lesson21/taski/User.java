package lesson.lesson21.taski;

/**
 * Задание 2: Сервис уведомлений с зависимостями
 * Бизнес логика:
 *
 * User - класс пользователя, содержащий информацию о пользователе.
 * EmailService - сервис для отправки электронной почты.
 * NotificationService - сервис для отправки уведомлений, который использует EmailService.
 */
public class User {
    private String id;
    private String email;

    public User(String id, String email) {
        this.id = id;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

interface EmailService {
    boolean sendEmail(String toAddress, String subject, String body);
}

class NotificationService {
    private EmailService emailService;

    public NotificationService(EmailService emailService) {
        this.emailService = emailService;
    }

    public boolean notifyUser(User user, String subject, String message) {
        return emailService.sendEmail(user.getEmail(), subject, message);
    }
}
