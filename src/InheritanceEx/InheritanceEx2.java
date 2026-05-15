package InheritanceEx;


class GrandFather
{
	void land()
	{
		System.out.println("Grandfather's land");
	}
}

class Parent extends GrandFather
{
	
	// land() came from grandfather
	
	void P_land()
	{
		System.out.println("Parent Land");
	}
	
}

class Child extends Parent
{
	// land()
	// P_land()
	
	void C_land()
	{
		System.out.println("CHild Land");
	}
	
}


public class InheritanceEx2 {

	public static void main(String[] args) {
		
		Child c1 = new Child();
		c1.C_land();
		c1.P_land();
		c1.land();

	}

}
