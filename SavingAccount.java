package ThursdayLabTest;

class SavingAccount {
	public static double annualInterestrate;
	private double savingsBalance;
	SavingAccount(double balance)
	{
		savingsBalance =balance;
	}
	
	public void calculateMonthlyInterest()
	{
		double interest;
		interest=(savingsBalance*annualInterestrate)/12;
		savingsBalance +=interest;
		
	}
	static void modifyInterestRate(float r)
	{
		annualInterestrate=r;
	}
	public static void main(String args[])
	{
		float[] rates=new float[] {0.04f,0.05f};
		SavingAccount saver1=new SavingAccount(2000);
		SavingAccount saver2=new SavingAccount(3000);
		for(int i=0;i<rates.length;i++)
		{
			SavingAccount.modifyInterestRate(rates[i]);
			saver1.calculateMonthlyInterest();
			saver2.calculateMonthlyInterest();
			System.out.println("saver1 savings:"+saver1.savingsBalance);
			System.out.println("saver2 savings:"+saver2.savingsBalance);
			System.out.println("annual Interest rate"+rates[i]);
		}
		
	}
}
