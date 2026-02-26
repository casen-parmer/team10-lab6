import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        LibrarySystem sys = new LibrarySystem();
        Scanner s = new Scanner(System.in);
        String name = null;
        int studentID = 0;
        while (!(sys.studentSearch(name, studentID))) {
            System.out.print("Name: ");
            name = s.nextLine();
            System.out.print("Student ID: ");
            studentID = s.nextInt();
        }
        s.nextLine();
        String cmd = null;
        while (!(cmd.equalsIgnoreCase("exit"))) {
            System.out.print(">");
            cmd = s.nextLine();
            switch(cmd) {
                case "help" :
                    System.out.println("help - prints a list of helpful commands");
                    System.out.println("exit - exits program");
                    System.out.println("list - lists books currently checked out by user");
                    System.out.println("checkout - checkout book");
                    System.out.println("return - return book");
                    break;
                case "exit" :
                    break;
                case "list" :
                    break;
                case "checkout" :
                    System.out.print("Book Title: ");
                    String book = s.nextLine();
                    if (sys.borrow(book)) {
                        System.out.println(name + " borrowed " + book + ".");
                    } else {
                        System.out.println(book + " is not available.");
                    }
                    break;
                case "return" :
                    System.out.print("Book Title: ");
                    String booke = s.nextLine();
                    if (sys.return(booke)) {
                        System.out.println(name + " returned " + book + ".");
                    } else {
                        System.out.println("Book not returned.");
                    }
                    break;
                default:
                    System.out.println("Unrecognized command");
            }
        }

    }
}
