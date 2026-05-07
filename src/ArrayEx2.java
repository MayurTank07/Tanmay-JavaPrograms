import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		
		
//		arr[0] = 45;
//		arr[1] = 56;
//		arr[2] = 78;
//		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter how many values you need to store : ");
		int size = sc.nextInt();  // 3
		
		int[] arr = new int[size];
		
		
		System.out.println("Enter your array values below : ");
		System.out.println("\n----------------------------------\n");
		
		for (int i = 0 ; i < arr.length ; i++)
		{
			System.out.print( "arr[ " + i + " ] : " );
			arr[i] = sc.nextInt();
		}
		
		System.out.println("\n\n----------------------------------------\n");
		System.out.println("Printing values : \n");
		
		for (int i = 0 ; i < arr.length ; i++)
		{
			System.out.println( "arr [" + i + "] : " +  arr[i] );
		}

	}

}


// scope of a variable 


/*
 
  
  class xyz 
  {
  	int a = 10;
  	syso(a);  //valid
  }
  
  syso(a);  // invalid
  
  
  
  while()
  {
  	int a = 10;
  	
  }
  
  syso(a); // invalud
  
  
  
  variables types :
  
  1. local variable : which are declared inside of a function
  	
  	p.s.v.main(String args[])
  	{
  		int a = 10;  // local variable
  	}
  
  
  2. instance variable : declared inside of a class but outside of 
  							a funcation
  							
  	class XYZ
  	{
  		int no = 10;  // instance variable
  		
  		p.s.v.m(String args[])
  		{
  			int a = 10;   // local
  		}
  		
  		public void msg()
  		{
  			syso(no);  // valid
  			syso(a);  // invalid
  		}
  	
  	}
  
  
  
  
  
  
 */




























