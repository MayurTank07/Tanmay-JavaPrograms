import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		
		int no;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		no = sc.nextInt();
		
		switch(no)
		{
			case 10:
				System.out.println("value is 10");
			
			
			case 50:
				System.out.println("value is 50");
			
			
			case 100:
				System.out.println("value is 100");
			
			
			default:
				System.out.println("value is not 10, 50, 100");
		}

	}

}
