package InheritanceEx;

class Account
{
	String accNo = "SBI0016988";
    double balance;

    // Method to deposit amount
    void deposit(double amt)
    {
        balance += amt;
        System.out.println("Amount Deposited : " + amt);
    }

    // Method to withdraw amount
    void withdraw(double amt)
    {
        balance -= amt;
        System.out.println("Amount Withdrawn : " + amt);
    }

    // Method to display account details
    void display()
    {
        System.out.println("Account Number : " + accNo);
        System.out.println("Balance : " + balance);
    }
}

class SavingAcc extends Account
{
	double interestRate = 5.0;

    void showInterest()
    {
        System.out.println("Interest Rate : " + interestRate + "%");
    }
}

class CurrentAcc extends Account
{
	double overdraftLimit = 50000;

    void showLimit()
    {
        System.out.println("Overdraft Limit : " + overdraftLimit);
    }
}


public class BankingEx {

	public static void main(String[] args) {
		
		SavingAcc saveAcc = new SavingAcc();
		saveAcc.deposit(5000);
		saveAcc.display();
		
		saveAcc.withdraw(2000);
		saveAcc.display();

	}

}
