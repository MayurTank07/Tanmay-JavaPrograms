import java.util.Scanner;

public class ArrayEx4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = {10, 98, 67, 65, 34, 57, 87, 12, 24, 46 };
		
		
		
		System.out.print("Enter an number which you want to search in an array : ");
		int searchNo = sc.nextInt();  // 65

		
		boolean status = false;
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i] == searchNo)
			{
				status = true;
			}
		}

		
		if(status)
		{
			System.out.println("yes we found : " + searchNo );
		}
		else {
			System.out.println("Didnt found...");
		}
		
		
	}

}
