package homeWork._11_10_23;

import lombok.*;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@ToString
@Getter
@Setter
public class LibraryUser {
    private String userId;
    private String userName;
    private String userEmail;
    private int userPhone;
    private List<Book> userBooksBorrowed;
    private List<Book> userBooksReserved;
    private static List<LibraryUser> libraryUsers = Arrays.asList(
            new LibraryUser("123AA", "Alex", "hujujk@gmail.com", 76543234),
            new LibraryUser("113AA", "Kirill", "1234ujk@gmail.com", 1234234),
            new LibraryUser("332AA", "Anton", "121234ujk@gmail.com", 198734)
    );

    public LibraryUser(String userId, String userName, String userEmail, int userPhone) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryUser that = (LibraryUser) o;
        return userPhone == that.userPhone && Objects.equals(userId, that.userId) && Objects.equals(userName, that.userName) && Objects.equals(userEmail, that.userEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, userEmail, userPhone);
    }

    public static List<LibraryUser> getLibraryUsers(){
        return libraryUsers;
    }
    public static void setLibraryUsers(List<LibraryUser> libraryUsers) {
        LibraryUser.libraryUsers = libraryUsers;
    }
}
