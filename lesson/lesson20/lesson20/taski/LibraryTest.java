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

    /**
     * Тест который проверяет добавили ли мы Book в наш Set<Book> у нас была уже данная книга в Set, но если мы ее
     * заново добавим то она перезапишется а размер не измениться
     */
    @Test
    void addBookPositiveAddBookTest() {
        library.addBook(book);
        Assertions.assertEquals(1, library.getBooks().size());
    }

    /**
     * Тест который проверяет добавили ли мы Author в наш List<Authors> при условии что данного автора
     * не было у нас до этого момента в нашем List<Authors> и сравниваем размер
     */
    @Test
    void addBookPositiveAddAuthorTest() {
        library.addBook(book);
        Assertions.assertEquals(1, library.getAuthors().size());
    }

    /**
     * Тест который проверяет на ошибку IllegalArgumentException когда мы хотим добавить Book которая равна NULL
     */
    @Test
    void addBookIllegalArgumentExceptionTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> library.addBook(null));
    }

    //////////////////////////////////

    /**
     * Тест который проверяет удаляется ли наша книга с Set<Book>, представим что у нас есть одна книга в
     * Set<Book> и эту же книгу мы будем удалять тогда размер Set<Book> будет равна 0
     */
    @Test
    void removeBookPositiveTest() {
        library.removeBook(book);
        Assertions.assertEquals(0, library.getBooks().size());
    }

    /**
     * Тест который проверяет на ошибку IllegalArgumentException когда мы хотим удалить Book которая равна NULL
     */
    @Test
    void removeBookIllegalArgumentExceptionTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> library.removeBook(null));
    }

    ////////////////////////////////////

    /**
     * Тест который проверяет возвращает ли все книг List<Book>  данного Author
     * предположим что у нас уже есть одна книга значит размер в Set<Book> будет равна 1 и в List<Authors>
     * тоже будет один Author , мы добавляем все книги этого автора в List<Book> и он будет равен 1
     */
    @Test
    void getBooksByAuthorPositiveTest() {
        Assertions.assertEquals(1, library.getBooksByAuthor(author).size());
    }

    /**
     * Тест который проверяет на ошибку IllegalArgumentException когда Author равен NULL
     */
    @Test
    void getBooksByAuthorIllegalArgumentExceptionTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> library.getBooksByAuthor(null));
    }

    //////////////////////////////

    /**
     * Тест который проверяет возвращает ли List<Author> всех авторов
     * предположим что у нас уже есть одна книга в Set<Book> значит размер List<Author> тоже будет 1
     * но если книг больше 2 тогда мы должны исходить из логики метода addBook(Book book)
     */
    @Test
    void getAllAuthorsPositiveTest() {
        Assertions.assertEquals(1, library.getAllAuthors().size());
    }

    /**
     * Тест который проверяет что бы метод getAllAuthors() при пустых значениях не возвращал NULL
     */
    @Test
    void getAllAuthorsReturnNotNullListTest() {
        library.removeBook(book);
        Assertions.assertNotNull(library.getAllAuthors());
    }

    ////////////////////////////////
    /**
     * Тест который проверяет возвращает ли Book по ISBN
     * В Set<Book> мы имеем данную книгу , и если метод будет успешно выполнен то он вернет эту книгу
     * !!! Не использовать заглушки Moskito лямбда выражения не переваривают их :)))
     */
    @Test
    void findBookByISBNPositiveTest() {
        String isbn = "AA11";
        Assertions.assertEquals(book, library.findBookByISBN(isbn));
    }

    /**
     * Тест который проверяет на ошибку IllegalArgumentException когда ISBN  равен NULL
     */
    @Test
    void findBookByISBNIllegalArgumentExceptionTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> library.findBookByISBN(null));
    }

    ///////////////////////

    /**
     * Тест который проверяет добавили ли мы книги в List по Title
     * сравнинваем по размеру List в начале оно имеет 0, у нас была одна книга и мы ее добавили в List и на
     * выходе ожидаем получить размер 1
     */
    @Test
    void searchBooksByTitlePositiveTest() {
        String title = "Koshka";
        Assertions.assertEquals(1, library.searchBooksByTitle(title).size());
    }

    /**
     * Тест который проверяет на ошибку IllegalArgumentException когда Title равен NULL
     */
    @Test
    void searchBooksByTitleIllegalArgumentExceptionTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> library.searchBooksByTitle(null));
    }
    /**
     * Тест который проверяет что бы метод searchBooksByTitle() при пустых значениях не возвращал NULL
     */
    @Test
    void searchBooksByTitleReturnNotNullListTest() {
        String title = "Koshka";
        library.removeBook(book);
        Assertions.assertNotNull(library.searchBooksByTitle(title));
    }

    //////////////////////////////

    /**
     * Тест который проверяет добавили ли мы столько копий сколько ожидали
     * было 12 копий (Выше при создании книги указывали количество копий) добавили 20 получили 32
     */
    @Test
    void addCopiesPositiveTest() {
        int additionalCopies = 20;
        library.addCopies(book, additionalCopies);
        Assertions.assertEquals(32, book.getCopies());
    }

    /**
     * Тест который проверяет на ошибку IllegalArgumentException если мы добавляем копии NULL книг
     */
    @Test
    void addCopiesIllegalArgumentExceptionBookNullTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> library.addCopies(null, 2));
    }

    /**
     * Тест который проверяет на ошибку IllegalArgumentException если мы добавляем копии меньше 0
     * (т.к. это противоречит названию метода) также дополнительно обьяснил это в методе addCopies(Book book, int copies)
     */
    @Test
    void addCopiesIllegalArgumentExceptionBookCopiesLessZeroTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> library.addCopies(book, -2));
    }

    /////////////////////////////////

    /**
     * Тест который проверяет уменьшилось ли число копий в нашем Set<Book> до проверки было 12 копий
     * (Выше при создании книги указывали количество копий) после вызова метода должно было уменьшится на 1 т.е. 11
     */
    @Test
    void lendBookPositiveTest() {
        library.lendBook(book);
        Assertions.assertEquals(11, book.getCopies());
    }

    /**
     * Тест который проверяет на ошибку IllegalArgumentException если мы вызываем метод и передаем туда Book со
     * значением Null
     */
    @Test
    void lendBookIllegalArgumentExceptionBookNullTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> library.lendBook(null));
    }

    /**
     * Тест который проверяет на ошибку IllegalArgumentException если мы вызываем метод и передаем туда Book
     * которая не доступна или нет в наличии
     */
    @Test
    void lendBookIllegalArgumentExceptionBookNotAvailableTest() {
        Book book1 = Mockito.mock(Book.class);
        Assertions.assertThrows(IllegalArgumentException.class, () -> library.lendBook(book1));
    }

    /**
     * Тест который проверяет на ошибку IllegalArgumentException если мы вызываем метод и передаем туда Book
     * у которой копий меньше или равно 0
     */
    @Test
    void lendBookIllegalArgumentExceptionBookCopiesLessThanZeroTest() {
        book.setCopies(0);
        Assertions.assertThrows(IllegalArgumentException.class, () -> library.lendBook(book));
    }

    //////////////////////////

    /**
     * Тест который проверяет уменьшилось ли число копий в нашем Set<Book> до проверки было 12 копий
     * (Выше при создании книги указывали количество копий) после вызова метода должно было увеличивается на 1 т.е. 13
     */
    @Test
    void returnBookPositiveTest() {
        library.returnBook(book);
        Assertions.assertEquals(13, book.getCopies());
    }

    /**
     * Тест который проверяет на ошибку IllegalArgumentException если мы вызываем метод и передаем туда Book со
     * значением Null
     */
    @Test
    void returnBookIllegalArgumentExceptionBookNullTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> library.returnBook(null));
    }

    /**
     * Тест который проверяет на ошибку IllegalArgumentException если мы вызываем метод и передаем туда Book
     * которой у нас нет в нашем Set<Book> и мы не можем добавить там копии
     */
    @Test
    void returnBookIllegalArgumentExceptionBookTest() {
        Book book1 = Mockito.mock(Book.class);
        Assertions.assertThrows(IllegalArgumentException.class, () -> library.returnBook(book1));
    }
}