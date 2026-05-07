import java.util.Scanner;

public class UserInputEx1 {

	public static void main(String[] args) {
		
		// int no1 = 10, no2 = 5;  // hardcoded values
		
		// System.out.println(no1 + no2);  // 15

		
		/*
		 
		  - to take user input in java we have an class named as,
		  Scanner Class
		  
		  - Scanner is an built in class which is used to take user input
		  
		  - To use a Scanner class we need to create its object
		  
		  
		  - if u want to access a class then you must create its obj
		 
		  Object Syntax : 
		  
		  ClassName objName = new ClassName();
			
		
		Scanner sc = new Scanner();
		  
		  sc.nextInt()
		  sc.nextDouble()
		  sc.nextFloat()
		  sc.nextLine()  // used to take string input (WHOLE LINE)
		  sc.next()      //  used to take single word input
		 
		 */
		
		
//		int no1, no2;
//		Scanner sc = new Scanner(System.in);
//		
//		
//		System.out.println("Enter no1 : ");
//		no1 = sc.nextInt();  
//		
//		System.out.println("Enter no2 : ");
//		no2 = sc.nextInt();  
//		
//		
//		System.out.println("Addition of 2 numbers : " + (no1+no2));
//		
		
		Scanner sc = new Scanner(System.in);
//		int age;
//		
//		System.out.println("\n********** Voting System **********\n");
//		System.out.print("\tEnter Your Age : ");
//		age = sc.nextInt();
//		
//		if(age >= 18)
//		{
//			System.out.println("You can vote");
//		}
//		else {
//			System.out.println("You cannot vote");
//		}
		
		
//		
		String user, pass;
		
		System.out.println("Enter your username : ");
		user = sc.next();
		
		System.out.println("Enter your password : ");
		pass = sc.next();
		
		if (user.equals("admin") && pass.equals("admin123")) {
			System.out.println("Login Successful");
		}
		else {
			System.out.println("Invalid Creds");
		}
//		
		
		
		
		
		double bill;
		int unit;
		
		System.out.print("Enter your water unit : ");
		unit = sc.nextInt();		
		
		
		if(unit < 0)
		{
			System.out.println("invalid unit");
		}
		else if((unit >= 0) && (unit <= 50))
		{
			 bill = unit * 2;
	         System.out.println("Total Water Bill = ₹" + bill);
		}
		else if((unit > 50) && (unit <= 100))
		{
			bill = ((50 * 2) + ((unit - 50) * 4));
			System.out.println("Total Water Bill = ₹" + bill);
		}
		else if((unit > 100))
		{
			bill = ((50 * 2) + (50 * 4) + ((unit - 100) * 6));
            System.out.println("Total Water Bill = ₹" + bill);
		}
		else {
			System.out.println("Please Enter Correct Units");
		}
		
		
		
		
		
	}

}
