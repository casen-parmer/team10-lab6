public class Student {
    private int uniqueID;
    private String name;

    public Student(int uid, String n) {
        uniqueID = uid;
        name     = n;
    }

    public void setName(String n) {
        name = n;
    }

    public void setUniqueID(int uid) {
        uniqueID = uid;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public String getName() {
        return name;
    }
}
