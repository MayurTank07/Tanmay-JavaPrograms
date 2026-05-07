package Oops;

class Employee
{
	// instance variable
	int empId = 101;
	String empName = "Dexter";
	double empSalary = 99999;
			
	// method to print emp details
	public void empDetails()
	{
		System.out.println("Emp Id : " + empId);
		System.out.println("Emp Name : " + empName);
		System.out.println("Emp Salary : " + empSalary);
	}	
}


// Main Class
public class OopsEx4 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.empDetails();
	
		Employee e2 = new Employee();
		e1.empDetails();
	}

}
