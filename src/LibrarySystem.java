 import java.util.ArrayList;

public class LibrarySystem {
     ArrayList<Book> inventory = new ArrayList<>();
     Book book1 = new Book("Java Basics", "Person", "123-456");
     inventory.add(book1);

    
    public void borrow(Book studentBook) {
        String title = studentBook.getTitle();

        for (Book book : inventory) {
            if (book.getTitle().equals(title)) {
                if (book.isAvailable()) {
                    studentBook.setAvailable(false);
                    System.out.println(student.getName() + " borrowed " + title + ".");
                } else {
                    System.out.println(title + " is not available.");
                }
            }
        }
    }

    public void return(Book checkedBook) {
        String title = checkedBook.getTitle;

        for (Book book : inventory) {
            if (book.getTitle.equals(title)) {
                checkedBook.setAvailable(true);
                System.out.println(student.getName + " returned " + title + ".");
            }
        }
    } 
}
