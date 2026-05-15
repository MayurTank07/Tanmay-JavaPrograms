package InheritanceEx;


class Animal
{
	void sound()
	{
		System.out.println("Animal Sound");
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking...");
	}
}



// main class
public class InheritanceEx1 {

	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		d1.bark(); // child method
		d1.sound(); // parent method

	}
}
