 import java.util.ArrayList;

public class LibrarySystem {
    ArrayList<Book> inventory = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();

    public LibrarySystem() {
        inventory.add(new Book("Java Basics", "Person", "123-456"));
        inventory.add(new Book("Java Intermediate", "Person", "484-572"));
        inventory.add(new Book("Java Advanced", "Person", "583-476"));
        students.add(new Student(100, "David Ambley"));
        students.add(new Student(101, "John King"));
    }

    public boolean borrow(String title) {
        for (Book book : inventory) {
            if (book.getTitle().equals(title)) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    return true;
                }
            }
            return false;
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
