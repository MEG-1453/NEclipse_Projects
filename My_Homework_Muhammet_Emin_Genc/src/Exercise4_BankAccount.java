
public class Exercise4_BankAccount {

	public static class BankAccount {

		private double balance;

		public BankAccount() {

			this.balance = 0;
		}

		
		public void deposit(double amount) {

			if (amount >= 0) {
				this.balance += amount;
			} else {
				System.out.println("Wrong");
			}
		}
		
		
		public void withdraw(double amount) {
			
			
			// The Security is important for me
			
			if (amount <= 0) {				
				System.out.println("Wrong");
				return;
			}
			
			
			if (amount > this.balance) {
				System.out.println("Wrong");
			}else {
				this.balance -= amount;
			}
			
		}
		
		
		public double getBalance() {
			return this.balance;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("--- BankAccount Security Test ---\n");
		
		BankAccount myAccount = new BankAccount();
		
		// 1. Valid Deposit
        System.out.println("Deposit: 500.0 TL");
        myAccount.deposit(500);

        // 2. Invalid Deposit Test
        System.out.println("\nInvalid Deposit Attempt: -100.0 TL");
        myAccount.deposit(-100.0); 

        // 3. Valid Withdrawal
        System.out.println("\nWithdraw: 200.0 TL");
        myAccount.withdraw(200.0);

        // 4. Overdraft Test
        System.out.println("\nOverdraft Attempt (Withdraw): 1000.0 TL");
        myAccount.withdraw(1000.0); 
        
        // 5. Final Status
        System.out.println("\n--- Status Report ---\r");
        System.out.println("Final Balance: " + myAccount.getBalance() + " TL");
	}
	
	/* output:
	 
	  	--- BankAccount Security Test ---

		Deposit: 500.0 TL
		
		Invalid Deposit Attempt: -100.0 TL
		Wrong
		
		Withdraw: 200.0 TL
		
		Overdraft Attempt (Withdraw): 1000.0 TL
		Wrong
		
		--- Status Report ---
		
		Final Balance: 300.0 TL
	 
	 */

}
