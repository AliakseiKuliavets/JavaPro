package homeWork._11_10_23;



import java.util.Arrays;
import java.util.List;

public class LibraryManager {
    private List<Book> libraryCatalog;
    private List<LibraryUser> libraryUsers;

    public LibraryManager(List<Book> libraryCatalog, List<LibraryUser> libraryUsers) {
        this.libraryCatalog = libraryCatalog;
        this.libraryUsers = libraryUsers;
    }
}
