package Constructors;


class Emp
{
	// instance variable
		int eId = 0;
		String eName = "";
		double eSal = 0;
		
		// parameterized constructor 
		public Emp(int id, String name, double sal)
		{
			eId = id;
			eName = name;
			eSal = sal;
		}
		
		// method
		public void empDetails()
		{
			System.out.println("Emp Id : " + eId);
			System.out.println("Emp Name : " + eName);
			System.out.println("Emp Salary : " + eSal);
		}
}

public class ConstructorEx2 {

	public static void main(String[] args) {
		
		Emp e1 = new Emp(101, "dexter", 99999);
		e1.empDetails();
		
		System.out.println("\n---------------------\n");
		
		Emp e2 = new Emp(102, "chlore", 88888);
		e2.empDetails();
		
		
	}

}
