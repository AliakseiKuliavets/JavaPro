package homeWork._11_10_23;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Book {
    private String bookId;
    private String bookTitle;
    private String bookAuthor;
    private String bookGenre;
    private int bookYear;
    private boolean bookAvailable;

}
