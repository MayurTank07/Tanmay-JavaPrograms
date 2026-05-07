
public class ifElseifLadder {

	public static void main(String[] args) {
		
		// if else if ladder is used to check multiple conditions
		
		/*
			
			100 - 85 -> A+ grade
			84 - 75 -> A grade
			74 - 60 -> B
			59 - 45 -> C
			44 - 35 -> D
			below 35 -> fail 
			
		*/
		
		
		int marks = 98;
		if( (marks <= 100) && (marks >= 85) )
		{
			System.out.println("A+ grade");
		}
		else if( (marks < 85) && (marks >= 75) )
		{
			System.out.println("A grade");
		}
		else if( (marks < 75) && (marks >= 60))
		{
			System.out.println("B grade");
		}
		else if( (marks < 60) && (marks >= 45))
		{
			System.out.println("C grade");
		}
		else if( (marks < 45) && (marks >= 35))
		{
			System.out.println("D grade");
		}
		else 
		{
			System.out.println("Failed");
		}
	}

}
