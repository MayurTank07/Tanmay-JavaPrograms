package Constructors;

class Employee
{
	// instance variable
	int eId = 101;
	String eName = "dexter";
	double eSal = 99999;
	
	//constructor
	public Employee()
	{
		System.out.println("Employee Constructor");
	}
	
	// method
	public void empDetails()
	{
		System.out.println("Emp Id : " + eId);
		System.out.println("Emp Name : " + eName);
		System.out.println("Emp Salary : " + eSal);
	}
}



// main class
public class ConstructorEx1 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.empDetails();
		
		Employee e2 = new Employee();
		e2.empDetails();
	}

}
