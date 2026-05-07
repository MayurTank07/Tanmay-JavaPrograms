
public class ifElseStatement {

	public static void main(String[] args) {
		
		int age = 25;
		if ( age >= 18 )
		{
			System.out.println("you can vote");
		}
		else
		{
			System.out.println("you cannot vote");
		}
		if( age == 18 )
		{
			System.out.println("congo, this is your first vote");
		}
		
		
		
		String username = "dexter";
		String password = "dexter1234";
		
		if ((username.equals("dexter")) && (password.equals("dexter@123")))
		{
			System.out.println("Login Successfull");
		}
		else {
			System.out.println("Invalid Credientials");
		}
		

	}

}
