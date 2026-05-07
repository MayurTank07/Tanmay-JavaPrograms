import java.util.Scanner;

public class SwitchEx2 {
	public static void main(String[] args) {
			
		int weekno;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a week no (1-7) : ");
		weekno = sc.nextInt();
		
		switch( weekno )
		{
			case 1:
				System.out.println("Mon");
			break;
			case 2:
				System.out.println("Tue");
			break;
			case 3:
				System.out.println("Wed");
			break;
			case 4:
				System.out.println("Thru");
			break;
			case 5:
				System.out.println("Fri");
			break;
			case 6:
				System.out.println("Sat");
			break;
			case 7:
				System.out.println("Sun");
			break;
			default:
				System.out.println("Invalid week no");
		}
		
	}
}
