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

    public void setUniqueId(int uid) {
        uniqueID = uid;
    }

}
