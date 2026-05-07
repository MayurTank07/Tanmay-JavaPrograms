import java.util.Scanner;

public class MenuDrivernEx1 {

	public static void main(String[] args) {
		
			String lastCon = "";
			Scanner sc = new Scanner(System.in);
		
			do 
			{
				System.out.println("\n------------------------------------");
				System.out.println("\n\tMenu Driven Program\n");
				System.out.println("------------------------------------\n");
				
				System.out.println("\t1. Check balance");
				System.out.println("\t2. Get Offers");
				System.out.println("\t3. Get Data");
				System.out.println("\t4. Exit");
				
			
				System.out.print("\tEnter your choice : ");
				int choice = sc.nextInt();
				switch(choice)
				{
					case 1:
						System.out.println("\n------------------------------------");
						System.out.println("Your Account Balance is ₹500.36");
						System.out.println("------------------------------------\n");
					break;
					case 2:
						System.out.println("\n------------------------------------");
						System.out.println("Your Current Pack Offers");
						System.out.println("1. Get 1GB data daily");
						System.out.println("2. Get Full Talktime");
						System.out.println("------------------------------------\n");
					break;
					case 3:
						System.out.println("\n------------------------------------");
						System.out.println("1. Get 1GB data daily at ₹50");
						System.out.println("2. Get 3GB data daily at ₹75");
						System.out.println("------------------------------------\n");
					break;
					case 4:
						System.out.println("\n------------- Exited ---------------");
						System.exit(0);  // program terminate
					break;
					default :
						System.out.println("\n------------------------------------");
						System.out.println("\tInvalid Choice, Please try again...");
						System.out.println("------------------------------------\n");
				}
				System.out.print("Do you want to continue (y/n) : ");
				lastCon = sc.next();  // Y
				
			}while((lastCon.equals("Y")) || (lastCon.equals("y")));
	}

}
