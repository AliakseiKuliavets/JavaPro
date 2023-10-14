package homeWork._11_10_23;

import java.util.List;

public class LibraryManager {
    private List<Book> libraryCatalog;
    private List<LibraryUser> libraryUsers;

    public LibraryManager(List<Book> libraryCatalog, List<LibraryUser> libraryUsers) {
        this.libraryCatalog = libraryCatalog;
        this.libraryUsers = libraryUsers;
    }
    //Метод, который возвращает список доступных книг заданного жанра.
    public List<Book> listAvailableBooksByGenre(String genre) {
        return libraryCatalog.stream()
                .filter(el -> el.getBookGenre().contains(genre))
                .filter(Book::isBookAvailable)
                .toList();
    }
}

