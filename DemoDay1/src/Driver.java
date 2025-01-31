import java.awt.DisplayMode;

public class Driver {
	
	// data members 
	static Integer data=100;
	static int d =10;
	
	Employee employee;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer pin =555;
		
		Employee employee,emp2,emp3;
		employee = new Employee(); // local variable 
		employee.fun1();
		Employee.fun2();
		
		Object obj =employee;
		
		
		data.hashCode();
		d=777;
		
		display();
		//display(555);
		
		System.out.println("Hello world");

	}
	public static void display() {
		System.out.println("public 1");
	}
	public void display(int data) {
		System.out.println("public :"+data);
	}

}

//javac Driver.java  - > Driver.class
//java Driver