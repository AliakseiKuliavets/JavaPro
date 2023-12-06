package lesson.lesson30.dryKissYagni;

public class UserValidation {
    public boolean validateUsername(String username) {
        // Проверка на длину имени
        if (username.length() < 6 || username.length() > 20) {
            return false;
        }
        
        // Проверка на наличие специальных символов
        if (!username.matches("^[a-zA-Z0-9]+$")) {
            return false;
        }
        
        return true;
    }
    
    public boolean validateEmail(String email) {
        // Проверка на длину email
        if (email.length() < 6 || email.length() > 50) {
            return false;
        }
        
        // Проверка на наличие символа '@'
        if (!email.contains("@")) {
            return false;
        }
        
        return true;
    }
}