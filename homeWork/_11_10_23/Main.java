package homeWork._11_10_23;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book bookMastAndMarg = new Book("AA1122", "Master and Margarita","Michael Bulgakov","Horror",2006,true);
        Book bookALittlePrince = new Book("BB1122", "A little prince","Antoine de Saint-Exupery","Prose",2005,true);
        Book bookCatcherInTheRye = new Book("CC1122", "Catcher in the rye","Jerome D. Salinger","Prose",2008,true);
        List<Book> bookList = Arrays.asList(bookMastAndMarg,bookALittlePrince,bookCatcherInTheRye);

        LibraryUser user1 = new LibraryUser("123AA","Alex","hujujk@gmail.com",76543234,null,null);
        LibraryUser user2 = new LibraryUser("113AA","Kirill","1234ujk@gmail.com",1234234,null,null);
        LibraryUser user3 = new LibraryUser("332AA","Anton","121234ujk@gmail.com",198734,null,null);
        List<LibraryUser> libraryUsers = Arrays.asList(user1,user2,user3);

        LibraryManager libraryManager = new LibraryManager(bookList,libraryUsers);
    }
}
