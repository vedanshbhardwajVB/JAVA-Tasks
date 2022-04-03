import java.util.ArrayList;
import java.util.List;

class Student {
    int rollNo;
    String name;
    List<Student> friends;

    Student (int rollNo, String name){
        this.rollNo=rollNo;
        this.name= name;
        this.friends=new ArrayList<>();

    }

    @Override
    public String toString() {
        return "Written";
    }
}