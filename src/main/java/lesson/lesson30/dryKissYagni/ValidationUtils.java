package lesson.lesson30.dryKissYagni;

// Нарушение KISS: Избыточная сложность
public class ValidationUtils {
//    public boolean isEmailValid(String email) {
//        String emailRegex = "^[A-Za-z0-9+_.-]+@(?:[A-Za-z0-9-]+\\.)+[A-Za-z]{2,}$";
//        boolean b = checker(emailRegex);
//        return b;
//    }
    
    public boolean isPhoneNumberValid(String phoneNumber) {
        String digitsOnly = phoneNumber.replaceAll("[^0-9]", "");

        // Проверка на допустимую длину номера (например, 10 цифр)
        if (digitsOnly.length() != 10) {
            return false;
        }

        // Проверка кода страны (например, должен начинаться с +1.txt для США)
        if (!digitsOnly.startsWith("+1.txt")) {
            return false;
        }

        return true;
    }
    
    public boolean isPasswordValid(String password) {
        if (password.length() < 8) {
            return false;
        }

        // Пароль должен содержать хотя бы одну заглавную букву (A-Z)
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        // Пароль должен содержать хотя бы одну строчную букву (a-z)
        if (!password.matches(".*[a-z].*")) {
            return false;
        }

        // Пароль должен содержать хотя бы одну цифру (0-9)
        if (!password.matches(".*\\d.*")) {
            return false;
        }

        // Пароль должен содержать хотя бы один специальный символ (например, !, @, #, $, %)
        if (!password.matches(".*[!@#$%].*")) {
            return false;
        }

        // Пароль не должен содержать пробелов
        if (password.contains(" ")) {
            return false;
        }

        // Все правила выполнены
        return true;
    }
}

// Исправлено:
// Упростили методы для проверки email, номера телефона и пароля.
//class ValidationUtils@ {
//    public boolean isEmailValid(String email) {
//        return email.contains("@");
//    }
//
//    public boolean isPhoneNumberValid(String phoneNumber) {
//        // Простая проверка на наличие цифр
//        return phoneNumber.matches("\\d+");
//    }
//
//    public boolean isPasswordValid(String password) {
//        // Простая проверка на длину пароля
//        return password.length() >= 8;
//    }
//}
