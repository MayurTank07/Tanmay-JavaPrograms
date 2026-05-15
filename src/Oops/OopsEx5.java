package Oops;

class Emp
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

class Company
{
	int cid = 675432;
	String cname = "StarX";
	String clocation = "Mumbai";
	
	public void companyDetails()
	{
		System.out.println("Company Id : " + cid);
		System.out.println("Company Name : " + cname);
		System.out.println("Company Salary : " + clocation);
	}
	
}



public class OopsEx5 {

	public static void main(String[] args) {
		
		Emp e1 = new Emp();
		Company c1 = new Company();
		
		System.out.println("\n\n--------------------------------");
		System.out.println("\n\tEmployee details : \n");
		
		e1.empDetails();
		
		System.out.println("\n\n--------------------------------");
		
		System.out.println("\n\tCompany details : \n");
		
		c1.companyDetails();  // method call
		
		System.out.println("\n\n--------------------------------");
	}

}
