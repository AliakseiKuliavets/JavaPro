package homeWork._11_10_23;

import java.util.*;
import java.util.stream.Collectors;

public class LibraryManager {
    private List<Book> libraryCatalog;
    private List<LibraryUser> libraryUsers;

    public LibraryManager(List<Book> libraryCatalog, List<LibraryUser> libraryUsers) {
        this.libraryCatalog = libraryCatalog;
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
    public Set<String> listUserEmailsWithReservedBooks() {
        return libraryUsers.stream()
                .map(LibraryUser::getUserEmail)
                .collect(Collectors.toSet());
    }

    // Метод, который добавляет новую книгу в библиотеку.
    public void addBookToLibrary(Book book) {
        List<Book> newListBook = new LinkedList<>(Book.getBookList());
        newListBook.add(book);
        Book.setBookList(newListBook);
        libraryCatalog = newListBook;
    }

    //Метод, который удаляет книгу из библиотеки.
    public void removeBookFromLibrary(Book book) {
        List<Book> newListBook = new LinkedList<>(Book.getBookList());
        newListBook.remove(book);
        Book.setBookList(newListBook);
        libraryCatalog = newListBook;
    }

    //Метод, который позволяет пользователю взять книгу в аренду.
    public void borrowBook(LibraryUser user, Book book) {
        libraryCatalog.stream()
                .filter(book1 -> book1.equals(book) && book1.isBookAvailable())
                .findFirst()
                .ifPresent(book1 -> {
                    LibraryUser libraryUser = LibraryUser.getLibraryUsers()
                            .stream()
                            .filter(libraryUser1 -> libraryUser1.equals(user))
                            .findFirst()
                            .orElse(null);

                    if (libraryUser != null) {
                        List<Book> bookList = Optional.ofNullable(libraryUser.getUserBooksBorrowed())
                                .map(ArrayList::new)
                                .orElseGet(ArrayList::new);
                        bookList.add(book);
                        libraryUser.setUserBooksBorrowed(bookList);
                    }

                    book1.setBookAvailable(false);
                    removeBookFromLibrary(book);
                });
    }
}

