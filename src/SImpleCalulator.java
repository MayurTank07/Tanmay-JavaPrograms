import java.util.Scanner;

public class SImpleCalulator {

	public static void main(String[] args) {
		
		int no1, no2;
		String op, choice;
		
		
		Scanner sc = new Scanner(System.in);
		
		do {
		
			System.out.println("\n\t************ Calculator ************\n");
			System.out.println("\t\t 1. Addition (+)");
			System.out.println("\t\t 2. Subtraction (-)");
			System.out.println("\t\t 3. Multiplication (*)");
			System.out.println("\t\t 4. Division (/)");
			
			System.out.print("\n\t\t Enter your choice (in sign) : ");
			op = sc.next();
			
			switch (op)
			{
				case "+":
					System.out.println("\n\t************ Addition ************\n");
					System.out.print("\t\tEnter no1 : ");
					no1 = sc.nextInt();
					System.out.print("\t\tEnter no2 : ");
					no2 = sc.nextInt();
					System.out.println("\t\tOutput : " + (no1+no2));
				break;
				
				case "-":
					System.out.println("\n\t************ Subtraction ************\n");
					System.out.print("\t\tEnter no1 : ");
					no1 = sc.nextInt();
					System.out.print("\t\tEnter no2 : ");
					no2 = sc.nextInt();
					System.out.println("\t\tOutput : " + (no1-no2));
				break;
					
				case "*":
					System.out.println("\n\t************ Multiplication ************\n");
					System.out.print("\t\tEnter no1 : ");
					no1 = sc.nextInt();
					System.out.print("\t\tEnter no2 : ");
					no2 = sc.nextInt();
					System.out.println("\t\tOutput : " + (no1*no2));
				break;
				
				case "/":
					System.out.println("\n\t************ Division ************\n");
					System.out.print("\t\tEnter no1 : ");
					no1 = sc.nextInt();
					System.out.print("\t\tEnter no2 : ");
					no2 = sc.nextInt();
					System.out.println("\t\tOutput : " + (no1/no2));
				break;
				
				default:
					System.out.println("Invalid Sign, Please enter valid sign...");
			}
			
			System.out.print("Do you want to continue (y/n) : ");
			choice = sc.next();
			
		}while(choice.equals("y") || choice.equals("Y"));
		
	}

}
