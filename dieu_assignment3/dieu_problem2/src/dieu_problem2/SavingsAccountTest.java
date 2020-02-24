package dieu_problem2;

public class SavingsAccountTest {
	
	public static void main(String[] args) 
	{
		SavingsAccount account1 = new SavingsAccount(2000.00);
		SavingsAccount account2 = new SavingsAccount(3000.00);
		
		SavingsAccount.modifyInterestRate(0.04);
		
		System.out.println("Printing the monthly balance for the first savings account...");
		
		int month;
		for(month = 0; month < 12; month++)
		{
			account1.calculateMonthlyInterest();
			System.out.printf("\n%s %d %s $%.2f", "Month", (month + 1), ":", account1.getSavingsBalance());
		}
		
		System.out.println("\nPrinting the monthly balance for the second savings account...");
		for(month = 0; month < 12; month++)
		{
			account2.calculateMonthlyInterest();
			System.out.printf("\n%s %d %s $%.2f", "Month", (month + 1), ":", account2.getSavingsBalance());
		}
	
		SavingsAccount.modifyInterestRate(0.05);
		
		System.out.println("\nPrinting next month's balance for the first savings account...");
		account1.calculateMonthlyInterest();
		System.out.printf("\n%s %s $%.2f", "Next month's balance", ":", account1.getSavingsBalance());
	

		System.out.println("\nPrinting next month's balance for the second savings account...");
		account2.calculateMonthlyInterest();
		System.out.printf("\n%s %s $%.2f", "Next month's balance", ":", account2.getSavingsBalance());
	}
	

}
