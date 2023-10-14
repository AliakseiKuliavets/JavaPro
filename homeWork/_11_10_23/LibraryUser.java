package homeWork._11_10_23;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;
@AllArgsConstructor
@ToString
@Getter
public class LibraryUser {
    private String userId;
    private String userName;
    private String userEmail;
    private int userPhone;
    private List<Book> userBooksBorrowed;
    private List<Book> userBooksReserved;
}
