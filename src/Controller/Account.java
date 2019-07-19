package Controller;

public class Account {
	private double balance;
	Account fromAccount;
	Account toAccount;
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public double getBalance()
	{
		return balance;
	}
	public void deposit(double amount)
	{
		balance=balance+amount;
	}
	public void withdraw(double amount)
	{
		if(amount<=balance)
		{
			balance=balance-amount;
		}
		else
		{
			System.err.println("Transaction cancelled due to insufficient funds");
		}
	}
	public void transfer(Account fromAccount, Account toAccount, double amount)
	{
		balance=balance-amount;
		toAccount.deposit(amount);
	}
public static void main(String[] args)
{
	Account prakash = new Account();
	Account ponnusamy = new Account();
	prakash.deposit(700);
	System.out.println("Deposit at Prakash :"+prakash.getBalance());
	prakash.withdraw(100);
	System.out.println("After withdraw, balance at Prakash :"+prakash.getBalance());
	prakash.transfer(prakash, ponnusamy, 100);
	System.out.println("After withdraw, balance at Prakash :"+prakash.getBalance());
	System.out.println("Before any deposit and withdraw at Ponnusamy : "+ponnusamy.getBalance());
}
}
