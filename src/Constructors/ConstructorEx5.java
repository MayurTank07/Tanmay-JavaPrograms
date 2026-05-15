package Constructors;

import java.util.Scanner;

class Company1 {
    int cid;
    String cname;

    public Company1(int cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public void compDetails() {
        System.out.println("Company ID : " + this.cid);
        System.out.println("Company Name : " + this.cname);
    }
}

public class ConstructorEx5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n ---------- Company Insertion ---------- \n");

        System.out.print("Enter how many company data you want to insert : ");
        int countComp = sc.nextInt();

        Company1[] companies = new Company1[countComp];

        for (int i = 0; i < countComp; i++) {

            System.out.println("\nEnter details for Company " + (i + 1));

            System.out.print("Enter Company ID : ");
            int cid = sc.nextInt();

            sc.nextLine(); // buffer clear

            System.out.print("Enter Company Name : ");
            String cname = sc.nextLine();

            companies[i] = new Company1(cid, cname);
        }

        System.out.println("\n ---------- Company Details ---------- \n");

        for (int i = 0; i < countComp; i++) {
            System.out.println("\nCompany " + (i + 1));
            companies[i].compDetails();
        }

        sc.close();
    }
}