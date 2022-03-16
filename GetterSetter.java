class Student {

    private String name;
	private int rollNo;
 
    public String getName() { return name; }
	public int getRN() {return rollNo;}
 
    public void setName(String s){
        this.name = s;
    }

	public void setRollNo(int rn){
        this.rollNo = rn;
    }
}

class GetterSetter {
 
    public static void main(String[] args)
    {
        Student s1 = new Student();
	Student s2 = new Student();
	s1.setName("Rahul");
	s1.setRollNo(21);
	s2.setName("Lokesh");
	s2.setRollNo(20);

	System.out.println(s1.getName()+"->"+s1.getRN());
	System.out.println(s2.getName()+"->"+s2.getRN());
    }
}