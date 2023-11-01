package lesson20.taski;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


class LibraryTest {
    private final Library library = new Library();
    private Author author;
    private final Book book = createBook();

    private Book createBook() {
        author = new Author("Alexander", 1865);
        return new Book("Koshka", author, "AA11", 12);
    }

    @BeforeEach
    void setUp() {
        library.addBook(book);
    }

    ////////////////////////////////////
    @Test
    void addBookPositiveAddBookTest() {
        library.addBook(book);
        Assertions.assertEquals(1, library.getBooks().size());
    }

    @Test
    void addBookPositiveAddAuthorTest() {
        library.addBook(book);
        Assertions.assertEquals(1, library.getAuthors().size());
    }

    @Test
    void addBookIllegalArgumentExceptionTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> library.addBook(null));
    }


    //////////////////////////////////
    @Test
    void removeBookPositiveTest() {
        library.removeBook(book);
        Assertions.assertEquals(0, library.getBooks().size());
    }

    @Test
    void removeBookIllegalArgumentExceptionTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> library.removeBook(null));
    }

    ////////////////////////////////////
    @Test
    void getBooksByAuthorPositiveTest() {
        Assertions.assertEquals(1, library.getBooksByAuthor(author).size());
    }

    @Test
    void getBooksByAuthorIllegalArgumentExceptionTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> library.getBooksByAuthor(null));
    }

    //////////////////////////////
    @Test
    void getAllAuthorsPositiveTest() {
        Assertions.assertEquals(1, library.getAllAuthors().size());
    }

    ////////////////////////////////
    @Test
    void findBookByISBNPositiveTest() {
        String isbn = "AA11";
        Assertions.assertEquals(book, library.findBookByISBN(isbn));
    }

    @Test
    void findBookByISBNIllegalArgumentExceptionTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> library.findBookByISBN(null));
    }

    ///////////////////////
    @Test
    void searchBooksByTitlePositiveTest() {
        String title = "Koshka";
        library.removeBook(Mockito.mock());
        Assertions.assertEquals(1, library.searchBooksByTitle(title).size());
    }

    @Test
    void searchBooksByTitleIllegalArgumentExceptionTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> library.searchBooksByTitle(null));
    }
}