import java.util.Scanner;

public class ArrayEx3 {

	public static void main(String[] args) {
		
		
		// datatype[][] arrName = new int[rows_size][col_size];
	
		Scanner sc = new Scanner(System.in);
	
		int rows = 0, cols = 0;
		
		System.out.println("\n --------- Array Code ----------- \n");
		System.out.println("How many number of rows and cols is needed ?");
		System.out.print("Nos of rows : ");
		rows = sc.nextInt();
		System.out.print("Nos of colns : ");
		cols = sc.nextInt();
		
		
		
		int[][] arr = new int[rows][cols];
		
		// user input 
		for( int r = 0; r < rows ; r++ )
		{
			// cols
			for ( int c = 0; c < cols ; c++ )
			{
				System.out.print( " arr[" + r + "][" + c + "] :  " );
				arr[r][c] = sc.nextInt();
			}
		}
		
			
		// printing 
		// rows
		System.out.println("\n----------------------------- \n");
		for( int r = 0; r < rows ; r++ )
		{
			// cols
			for ( int c = 0; c < cols ; c++ )
			{
				System.out.print( arr[r][c] + " " );
			}
			System.out.println("");
		}
		
		System.out.println("\n------------- Sum of all elements ------------- \n");
		int sum = 0;
		for( int r = 0; r < rows ; r++ )
		{
			// cols
			for ( int c = 0; c < cols ; c++ )
			{
				sum += arr[r][c];
			}
		}
		System.out.println(sum);

	}

}
