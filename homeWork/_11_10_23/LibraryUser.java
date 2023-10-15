package homeWork._11_10_23;

import lombok.*;

import java.util.Arrays;
import java.util.List;
@AllArgsConstructor
@ToString
@Getter
@Setter
@EqualsAndHashCode
public class LibraryUser {
    private String userId;
    private String userName;
    private String userEmail;
    private int userPhone;
    private List<Book> userBooksBorrowed;
    private List<Book> userBooksReserved;
    private static List<LibraryUser> libraryUsers = Arrays.asList(
            new LibraryUser("123AA", "Alex", "hujujk@gmail.com", 76543234, null, null),
            new LibraryUser("113AA", "Kirill", "1234ujk@gmail.com", 1234234, null, null),
            new LibraryUser("332AA", "Anton", "121234ujk@gmail.com", 198734, null, null)
    );
    public static List<LibraryUser> getLibraryUsers(){
        return libraryUsers;
    }
    public static void setLibraryUsers(List<LibraryUser> libraryUsers) {
        LibraryUser.libraryUsers = libraryUsers;
    }
}
