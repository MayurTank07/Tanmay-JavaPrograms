package PolymoprhismEx;

class Bank
{
    void transaction()
    {
        System.out.println("General Transaction");
    }

    void transaction(double amount)
    {
        System.out.println("Transaction Amount : " + amount);
    }

    void transaction(String type, double amount)
    {
        System.out.println(type + " of amount " + amount);
    }
}

public class PolymorphismEx2
{
    public static void main(String[] args)
    {
        Bank b = new Bank();

        b.transaction();

        b.transaction(5000);

        b.transaction("Deposit", 10000);
    }
}

