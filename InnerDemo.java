public class InnerDemo {
	public static void main (String [] args) {
		//Employee e = new Employee(20000, "Naman");
		//e.showDetails();

		//e.changeDetails();
		Employee.Accountant a = new Employee.Accountant(1);
		//a.changeDetails();
		a.dispEmployeeCount();
	}
}

class Employee {
int salary;
String name;
static int employeeCount=0;
	Employee (int s, String n) {
		salary=s;
		name=n;
		employeeCount++;
	}
	
	void showDetails () {
		System.out.println(name+"'s salary is "+salary);
	}

	static class Accountant {
		int accId;
		
		Accountant(int id) {
		accId=id;
		}
		
		//void changeDetails () {
		//salary+=1000;
		//System.out.println(name+"'s salary is chnaged to "+salary+" by "+"Accountant "+accId);	
		//}

		void dispEmployeeCount() {
			System.out.println(employeeCount+" is the number of employees, and is verified by Accountant id - "+accId);
		}
	}
}