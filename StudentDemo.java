class Student{  
    int id;  
    String name;  
    int fee;  
    Student(int i, String n, int f) {  
    this.id=i;  
    this.name=n;  
    this.fee=f;  
    }  
    public void display(){System.out.println(id+" "+name+" "+fee);}  
}  

public class StudentDemo {  
public static void main(String[] args) {  
    Student s1=new Student(23,"ajeet",45000);  
    Student s2=new Student(24,"Naman",25000);  
    Student s3=new Student(25,"Pankaj",55000);   
    s1.display();  
    s2.display();  
    s3.display();  
}  
}  