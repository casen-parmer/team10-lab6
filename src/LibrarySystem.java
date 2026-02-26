 import java.util.ArrayList;

public class LibrarySystem {
    static ArrayList<Book> inventory = new ArrayList<>();
     Book book1 = new Book("Java Basics", "Person", "123-456");
     inventory.add(book1);

    
    public static void borrow(Book studentBook) {
        String title = studentBook.getTitle();

        for (Book book : inventory) {
            if (book.getTitle().equals(title)) {
                if (book.isAvailable()) {
                    //change
                    studentBook.setAvailablility(false);
                    System.out.println(student.getName() + " borrowed " + title + ".");

                } else {
                    System.out.println(title + " is not available.");
                }
            }
        }
    } 
}
