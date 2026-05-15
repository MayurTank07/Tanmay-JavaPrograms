package PolymoprhismEx;

class Calculator
{
	void add(int a, int b)
	{
		System.out.println(a + b);
	}
	void add(int a, int b, int c)
	{
		System.out.println(a + b + c);
	}
}


public class PolymorphismEx1 {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		System.out.print("with 2 parameters : ");
		c.add(10, 5);
		
		System.out.print("\nwith 3 parameters : ");
		c.add(10, 5, 5);

	}

}
