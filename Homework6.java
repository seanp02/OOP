class Course {
    public Course(String code, String name){
        this.code=code;
        this.name=name;
    }
    protected String code;
    protected String name;
    public String getCode() {
        return this.code;
    }
    public String getName() {
        return this.name;
    }
}
class OnlineCourse extends Course {
    public OnlineCourse(String code, String name) {
        super(code, name);
    }
    @Override
    public String toString() {
        String msg = "Code: " + this.getCode() + ", Name: " + this.getName() + ", Type: Online";
        return msg;
    }
}
class OfflineCourse extends Course {
    public OfflineCourse(String code, String name) {
        super(code, name);
    }
    @Override
    public String toString() {
        String msg = "Code: " + this.getCode() + ", Name: " + this.getName() + ", Type: Offline";
        return msg;
    }
}
public class Homework6 {
    public static void main(String[] args) {
        OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Programming");
        OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programming 1");
        System.out .println (course1);
        System.out .println (course2);
    }
}
