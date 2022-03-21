import java.util.Comparator;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student implements Comparable<Student> {

    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }


   public String getName(){return this.name;}
    public int getRollNo(){return this.rollNo;}

    public int compareTo(Student that) {
        return this.rollNo - that.rollNo;
    }
}

class NameCompare implements Comparator<Student>{
    	public int compare(Student s1, Student s2){
        return s1.getName().compareTo(s2.getName());
    }
}

public class ComDemo {
	public static void main (String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("How many student entries ?");
	int n=sc.nextInt();

	ArrayList<Student> list = new ArrayList<>();
	for(int i=0; i<n ;i++){
		System.out.print("Enter student's name ");
		String name = sc.next();
		System.out.print("Enter student's roll number ");
		int rno = sc.nextInt();
		list.add(new Student(name, rno));
		}

	System.out.println("Printing student details roll no wise ----");
	Collections.sort(list);
	for(Student s : list){
		System.out.println(s.getName()+"->"+s.getRollNo());
		}
	

	System.out.println("Printing student details name wise ----");
	NameCompare nc = new NameCompare();
	Collections.sort(list, nc);
	for(Student s : list){
		System.out.println(s.getName()+"->"+s.getRollNo());
		}
	}
}