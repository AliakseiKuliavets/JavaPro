package homeWork._11_10_23;


public class Main {
    public static void main(String[] args) {
        Book bookJupiterTravels = new Book("dd1122", "Jupiter's Travels", "Simon Ted", "Fantasy", 1980, true);
        Book bookJupits = new Book("dd112222", "Jupit11er's Travels", "Simon T11ed", "Fanta11sy", 980, true);
        LibraryUser libraryUser1 = new LibraryUser("332AA", "Anton", "121234ujk@gmail.com", 198734);

        LibraryManager libraryManager = new LibraryManager(Book.getBookList(), LibraryUser.getLibraryUsers());
        System.out.println(libraryManager.listAvailableBooksByGenre("Horror"));
        System.out.println("----------------------------------------------------------");
        System.out.println(libraryManager.listUserEmailsWithReservedBooks());
        System.out.println("-----------------------------------------------------------");
        System.out.println(Book.getBookList());
        libraryManager.addBookToLibrary(bookJupiterTravels);
        System.out.println(Book.getBookList());
        System.out.println("-------------------------------------------------------------");
        libraryManager.removeBookFromLibrary(bookJupiterTravels);
        System.out.println(Book.getBookList());
        System.out.println("-------------------------------------------------------------");
        libraryManager.addBookToLibrary(bookJupiterTravels);
        System.out.println(Book.getBookList());
        libraryManager.borrowBook(libraryUser1,bookJupiterTravels);
        System.out.println();
        System.out.println(Book.getBookList());
        System.out.println(LibraryUser.getLibraryUsers());
        System.out.println("---------------------------------------------------------------");
        libraryManager.addBookToLibrary(bookJupits);
        System.out.println(Book.getBookList());
        libraryManager.reserveBook(libraryUser1,bookJupits);
        System.out.println();
        System.out.println(LibraryUser.getLibraryUsers());
        System.out.println(Book.getBookList());

    }
}
