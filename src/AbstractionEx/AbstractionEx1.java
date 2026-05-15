package AbstractionEx;

abstract class Payment
{
	abstract void pay();
	
	void msg()
	{
		System.out.println("Payment is done...");
	}
}

abstract class UPI extends Payment
{
	void msg2()
	{
		System.out.println("Payment is done by UPI");
	}
}

class mainPayment extends UPI
{
	@Override
	void pay() {
		System.out.println("Main payment");
	}	
}



public class AbstractionEx1 {

	public static void main(String[] args) {
		
		mainPayment mp = new mainPayment();
		mp.pay();
		mp.msg();
		mp.msg2();
	}

}
