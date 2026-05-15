package AbstractionEx;

abstract class Employee
{
	Employee()
	{
		System.out.println("Employee Constructor");
	}
}

class EmpDetails extends Employee
{
	void msg()
	{
		System.out.println("Emp details...");
	}
}


public class AbstrationEx2 {

	public static void main(String[] args) {
		
		EmpDetails ed = new EmpDetails();
		ed.msg();

	}

}
