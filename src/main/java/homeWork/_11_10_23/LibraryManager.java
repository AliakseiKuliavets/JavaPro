package homeWork._11_10_23;

import java.util.*;
import java.util.stream.Collectors;

public class LibraryManager {
    private List<Book> libraryCatalog;
    private final List<LibraryUser> libraryUsers;

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

    //Метод, который возвращает множество адресов электронной почты пользователей, зарезервировавших книги.
    public Set<String> listUserEmailsWithReservedBooks() {
        return libraryUsers.stream()
                .filter(el -> el.getUserBooksReserved() != null && !el.getUserBooksReserved().isEmpty())
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
        if (!(book.equals(Book.getBookList()))) {
            System.out.println("Данной книги нет в списке книг");
            return;
        }
        List<Book> newListBook = new LinkedList<>(Book.getBookList());
        newListBook.remove(book);
        Book.setBookList(newListBook);
        libraryCatalog = newListBook;
    }

    //Метод, который позволяет пользователю взять книгу в аренду.
    public void borrowBook(LibraryUser user, Book book) {
        /* Без стрима

         for (Book book1 : libraryCatalog) {
            if (book.equals(book1)) {
                if (book1.isBookAvailable()) {
                    for (LibraryUser libraryUser : LibraryUser.getLibraryUsers()) {
                        if (user.equals(libraryUser)) {
                            List<Book> bookList;
                            if (libraryUser.getUserBooksBorrowed() == null) {
                                bookList = List.of(book);
                            } else {
                                bookList = libraryUser.getUserBooksBorrowed();
                                bookList.add(book);
                            }
                            libraryUser.setUserBooksBorrowed(bookList);
                        }
                        book1.setBookAvailable(false);
                    }
                }
            }
        }
         */
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
                });
    }

    // Метод, который позволяет пользователю зарезервировать книгу.
    public void reserveBook(LibraryUser user, Book book) {
          /* Без стрима

           for (Book book1 : libraryCatalog) {
            if (book.equals(book1)) {
                if (book1.isBookAvailable()) {
                    for (LibraryUser libraryUser : LibraryUser.getLibraryUsers()) {
                        if (libraryUser.equals(user)) {
                            List<Book> bookList;
                            if (libraryUser.getUserBooksReserved() == null) {
                                bookList = List.of(book);
                            } else {
                                bookList = new LinkedList<>(libraryUser.getUserBooksReserved());
                                bookList.add(book);
                            }
                            libraryUser.setUserBooksReserved(bookList);
                        }
                    }
                }
                book1.setBookAvailable(false);
            }
        }
         */
        libraryCatalog.stream()
                .filter(book1 -> book1.equals(book) && book1.isBookAvailable())
                .findFirst()
                .ifPresent(book1 -> {
                    LibraryUser.getLibraryUsers()
                            .stream()
                            .filter(libraryUser -> libraryUser.equals(user))
                            .findFirst()
                            .ifPresent(libraryUser -> {
                                List<Book> bookList = Optional.ofNullable(libraryUser.getUserBooksReserved())
                                        .map(ArrayList::new)
                                        .orElseGet(ArrayList::new);
                                bookList.add(book);
                                libraryUser.setUserBooksReserved(bookList);
                            });
                    book1.setBookAvailable(false);
                });
    }
}

