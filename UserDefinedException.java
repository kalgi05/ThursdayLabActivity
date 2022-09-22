package ThursdayLabTest;

class Account
{
	
	private int balance=10000;
	
	public int balance()
	{
		return balance;
	}
	
	public void withdraw(int amount) throws NotBoundException
	{
		if(amount>balance)
		{
			throw new NotBoundException(String.format("current balance is less then req amount",balance,amount));
		}
			balance =balance-amount;
	}
	
	
	public void deposite(int amount)
	{
		if(amount <=0)
		{
			throw new IllegalArgumentException(String.format("invalid amount",amount));
		}
		
	}
}

public class NotBoundException extends RuntimeException
{
	private String message;
	
	public NotBoundException(String message)
	{
		this.message=message;
	}
	
	public NotBoundException(Throwable cause,String message)
	{
		super(cause);
		this.message=message;
	}
	public String getMessage()
	{
		return message;
	}
}




public class UserDefinedException {

	public static void main(String[] args) {
		Account ac=new Account();
		System.out.println("current balance :"+ac.balance());
		System.out.println("with draw moneyyy..");
		ac.withdraw(2000);
		System.out.println("current balance"+ac.balance());
		ac.withdraw(1000);
		

	}

}
