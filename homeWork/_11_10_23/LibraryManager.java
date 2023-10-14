package homeWork._11_10_23;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LibraryManager {
    private List<Book> libraryCatalog;
    private List<LibraryUser> libraryUsers;

    public LibraryManager(List<Book> libraryCatalog, List<LibraryUser> libraryUsers) {
        this.libraryCatalog = new LinkedList<>(libraryCatalog);;
        this.libraryUsers = libraryUsers;
    }

    public List<Book> getLibraryCatalog() {
        return libraryCatalog;
    }

    public List<LibraryUser> getLibraryUsers() {
        return libraryUsers;
    }

    //Метод, который возвращает список доступных книг заданного жанра.
    public List<Book> listAvailableBooksByGenre(String genre) {
        return libraryCatalog.stream()
                .filter(el -> el.getBookGenre().contains(genre))
                .filter(Book::isBookAvailable)
                .toList();
    }
    //Метод, который возвращает множество адресов электронной почты пользователей, зарезервировавших книги.
    public Set<String> listUserEmailsWithReservedBooks(){
        return libraryUsers.stream()
                .map(LibraryUser::getUserEmail)
                .collect(Collectors.toSet());
    }
    // Метод, который добавляет новую книгу в библиотеку.
    public void addBookToLibrary(Book book){
        libraryCatalog.add(book);
    }
}

