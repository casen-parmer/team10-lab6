import java.util.ArrayList;

public class Student {
    private int uniqueID;
    private String name;
    private ArrayList<Book> checkedOutBooks;

    public Student(int uid, String n) {
        uniqueID = uid;
        name     = n;
        checkedOutBooks = new ArrayList<Book>();
    }

    public Student() {
        uniqueID = -1;
        name     = "";
        checkedOutBooks = new ArrayList<Book>();
    }

    public void setName(String n) {
        name = n;
    }

    public void setUniqueID(int uid) {
        uniqueID = uid;
    }

    public void checkOutBook(Book b) {
        checkedOutBooks.add(b);
    }

    public void returnBook(Book b) {
        checkedOutBooks.remove(b);
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Book> getCheckedOutBooks() {
        return checkedOutBooks;
    }
}
