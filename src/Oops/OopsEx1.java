package Oops;

public class OopsEx1 {
	
	// inside of a class we can create variable, constructors, methods
	
			int a = 10;  // instance variable
			
			public void msg()
			{
				System.out.println("Hello this is my msg");
			}
			
	
	
	public static void main(String[] args) {
		
		OopsEx1 o1 = new OopsEx1();
		
		System.out.println(o1.a);   // 10
		o1.msg();

	}

}
