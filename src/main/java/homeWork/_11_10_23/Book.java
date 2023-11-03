package homeWork._11_10_23;


import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Book {
    private final String bookId;
    private final String bookTitle;
    private final String bookAuthor;
    private final String bookGenre;
    private final int bookYear;
    private boolean bookAvailable;

    public Book(String bookId, String bookTitle, String bookAuthor, String bookGenre, int bookYear, boolean bookAvailable) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookGenre = bookGenre;
        this.bookYear = bookYear;
        this.bookAvailable = bookAvailable;
    }


    public String getBookGenre() {
        return bookGenre;
    }


    public boolean isBookAvailable() {
        return bookAvailable;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookGenre='" + bookGenre + '\'' +
                ", bookYear=" + bookYear +
                ", bookAvailable=" + bookAvailable +
                '}';
    }

    public void setBookAvailable(boolean bookAvailable) {
        this.bookAvailable = bookAvailable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookYear == book.bookYear && bookAvailable == book.bookAvailable && Objects.equals(bookId, book.bookId) && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(bookAuthor, book.bookAuthor) && Objects.equals(bookGenre, book.bookGenre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, bookTitle, bookAuthor, bookGenre, bookYear, bookAvailable);
    }

    private static List<Book> bookList = Arrays.asList(
            new Book("AA1122", "Master and Margarita", "Michael Bulgakov", "Horror", 2006, true),
            new Book("BB1122", "A little prince", "Antoine de Saint-Exupery", "Prose", 2005, true),
            new Book("CC1122", "Catcher in the rye", "Jerome D. Salinger", "Prose", 2008, true)
    );
    public static List<Book> getBookList(){
        return bookList;
    }

    public static void setBookList(List<Book> bookList) {
        Book.bookList = bookList;
    }
}
