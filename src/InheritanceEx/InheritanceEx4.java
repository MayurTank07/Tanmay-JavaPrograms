package InheritanceEx;

class Company
{
	int cid = 101;
	String cname = "StarX";
}


public class InheritanceEx4 extends Company {

	int cid = 103;
	String cname = "SnapSpark";
	
	void compDetails()
	{
		System.out.println( super.cid );
		System.out.println( super.cname );
	}
	
	public static void main(String[] args) {
	
		
		InheritanceEx4 abc = new InheritanceEx4();
		abc.compDetails();
		
		System.out.println("\n-----------------------------\n");
		
		System.out.println(abc.cid);
		System.out.println(abc.cname);

	}

}
