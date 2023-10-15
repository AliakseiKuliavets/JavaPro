package homeWork._11_10_23;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;
@AllArgsConstructor
@Getter
@ToString
@Setter
public class Book {
    private String bookId;
    private String bookTitle;
    private String bookAuthor;
    private String bookGenre;
    private int bookYear;
    private boolean bookAvailable;

    private static List<Book> bookList = Arrays.asList(
            new Book("AA1122", "Master and Margarita", "Michael Bulgakov", "Horror", 2006, true),
            new Book("BB1122", "A little prince", "Antoine de Saint-Exupery", "Prose", 2005, true),
            new Book("CC1122", "Catcher in the rye", "Jerome D. Salinger", "Prose", 2008, true)
    );
    public static List<Book> getBookList(){
        return bookList;
    }

}
