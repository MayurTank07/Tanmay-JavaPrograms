package InheritanceEx;

class Parent1
{
	void land()
	{
		System.out.println("Parent Land");
	}
}

class Child1 extends Parent1
{
	void child1Land()
	{
		System.out.println("Child1 Land");
	}
}

class Child2 extends Parent1
{
	void child2Land()
	{
		System.out.println("Child 2 Land");
	}
}

public class InheritanceEx3 {

	public static void main(String[] args) {
		
		Child1 c1 = new Child1();
		c1.land();
		c1.child1Land();
//		c1.child2Land();   --> error
		
		Child2 c2 = new Child2();
		c2.land();
		c2.child2Land();
		

	}

}
