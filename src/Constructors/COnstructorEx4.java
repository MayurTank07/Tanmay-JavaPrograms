package Constructors;

import java.util.Scanner;

class Company
{
	int cid;
	String cname;
	
	public Company(int cid, String cname) 
	{
		this.cid = cid;
		this.cname = cname;
	}
	
	public void compDetails()
	{
		System.out.println("Company ID : " + this.cid);
		System.out.println("Company Name : " + this.cname);
	}
}



public class COnstructorEx4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter company id : ");
		int cid = sc.nextInt();
		
		sc.nextLine(); 
		
		System.out.println("Enter company name : ");
		String cname = sc.nextLine();
		
		
		Company c1 = new Company(cid, cname);
		c1.compDetails();
		
	}

}
