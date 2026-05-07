package Oops;

public class OopsEx3 {

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
		
	
	public static void main(String[] args) {
		
		OopsEx3 op3 = new OopsEx3();
		op3.empDetails();

	}

}
