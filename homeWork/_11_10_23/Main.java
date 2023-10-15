package homeWork._11_10_23;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book bookJupiterTravels = new Book("dd1122", "Jupiter's Travels", "Simon Ted", "Fantasy", 1980, true);

        LibraryManager libraryManager = new LibraryManager(Book.getBookList(), LibraryUser.getLibraryUsers());
        System.out.println(libraryManager.listAvailableBooksByGenre("Horror"));
        System.out.println("----------------------------------------------------------");
        System.out.println(libraryManager.listUserEmailsWithReservedBooks());
        System.out.println("-----------------------------------------------------------");
        System.out.println(libraryManager.getLibraryCatalog());
        libraryManager.addBookToLibrary(bookJupiterTravels);
        System.out.println(libraryManager.getLibraryCatalog());
        System.out.println("-------------------------------------------------------------");

    }
}
