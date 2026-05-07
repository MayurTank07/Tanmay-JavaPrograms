
public class NestedIf {

	public static void main(String[] args) {
		
		// h >= 4 and w >= 25
		
		
		int h = 6, w = 60;
		
		if (h >= 4)
		{
			System.out.println("you are eligible by height");
			if( w >= 25 )
			{
				System.out.println("you are eligible by weight as well");
				System.out.println("***** YOU CAN RIDE *****");
			}
			else {
				System.out.println("You cannot ride due to weight");
			}
		}
		else {
			System.out.println("You cannot ride");
		}
		
		

	}

}
