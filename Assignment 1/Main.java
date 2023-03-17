// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Date;
class HelloWorld {
    public static void main(String[] args) {
        Account obj = new Account(1122, 20000);
        Account.setannualInterestRate(4.5);
        obj.withdraw(2500);
        obj.deposit(3000);
        System.out.println(obj.toString());
    }
}

class Account
{
    private int id = 0;
    private double balance = 0;
    static private double annualInterestRate = 0;
    private Date dateCreated;
    public Account()
    {}
    public Account(int id, double balance)
    {
        this.id = id;
        this.balance = balance;
    }
    public void setID(int id)
    {
        this.id = id;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public static void setannualInterestRate(double annualInterestRatee)
    {
        annualInterestRate = annualInterestRatee;
    }
    
    public int getID()
    {
        return id;
    }
    public double getBalance()
    {
        return balance;
    }
    public double getannualInterestRate()
    {
        return annualInterestRate;
    }
    public Date getDateCreated()
    {
        return dateCreated;
    }
    public double getmonthlyInterestRate()
    {
        return annualInterestRate/12.0;
    }
    public double getmonthlyInterest()
    {
        return getmonthlyInterestRate() / 100 * balance;
    }
    public void withdraw(int amount)
    {
        if(amount <= balance)
            balance -= amount;
        else
            System.out.println("Not Enough Balance");
    }
    public void deposit(int amount)
    {
        if(amount >= 0)
            balance += amount;
        else
            System.out.println("Unsufeccient amount");
    }
    public String toString()
    {
        return (balance + " " + getmonthlyInterest() + " " + dateCreated);
    }
    
}