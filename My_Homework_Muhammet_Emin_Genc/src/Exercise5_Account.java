
public class Exercise5_Account {

    // Enum
    public enum AccountType {
        SAVINGS,
        CURRENT
    }


    public static class Account {
        private int accountNo;
        private double balance;
        private AccountType type;

        
        // Constructor 1
        public Account(int accountNo) {
            this.accountNo = accountNo;
            this.balance = 0.0;           	 //	default type
            this.type = AccountType.SAVINGS; // default type
        }

        // Constructor 2
        public Account(int accountNo, double balance) {
            this.accountNo = accountNo;
            this.balance = balance;			 
            this.type = AccountType.SAVINGS; // default type
        }

        // Constructor 3
        public Account(int accountNo, double balance, AccountType type) {
            this.accountNo = accountNo;
            this.balance = balance;
            this.type = type;
        }

        // Method Overloading

        public void deposit(double amount) {
        	
            this.balance = this.balance + amount;
            System.out.println("Money deposited: " + amount + ". New Balance: " + this.balance);
        }

        // Method 2: Deposit with bonus
        public void deposit(double amount, boolean bonus) {
            if (bonus == true) {
                // If there is a bonus, let's add an extra 50 TL to the account
                this.balance = this.balance + amount + 50; 
                System.out.println("\nBonus Transaction " + amount + " + 50 TL added. New Balance: " + this.balance);
            } else {
                // Add normal if no bonus
                this.balance = this.balance + amount;
                System.out.println("\nMoney deposited: " + amount + ". New Balance: " + this.balance);
            }
        }

        // output format
        public String toString() {
            return "Account No: " + accountNo + ", Type: " + type + ", Balance: " + balance;
        }
    }

    // Main
    public static void main(String[] args) {
        System.out.println("--- Mixed Practice ---\n");

        // 1. Object: Only with ID
        Account acc1 = new Account(101);
        System.out.println("Account 1: " + acc1.toString());

        // 2 Object: With ID and Money
        Account acc2 = new Account(102, 1000.0);
        System.out.println("\nAccount 2: " + acc2.toString());

        // 3. Object: All (with CURRENT type)
        Account acc3 = new Account(103, 5000.0, AccountType.CURRENT);
        System.out.println("\nAccount 3: " + acc3.toString());

        System.out.println("\n--- Deposit Operations ---\n");
        
        // Normal deposit
        acc3.deposit(500.0);

        // Bonus deposit
        acc3.deposit(200.0, true);
    }
    
    /* output:
     
    --- Mixed Practice ---

	Account 1: Account No: 101, Type: SAVINGS, Balance: 0.0
	
	Account 2: Account No: 102, Type: SAVINGS, Balance: 1000.0
	
	Account 3: Account No: 103, Type: CURRENT, Balance: 5000.0
	
	--- Deposit Operations ---
	
	Money deposited: 500.0. New Balance: 5500.0
	
	Bonus Transaction 200.0 + 50 TL added. New Balance: 5750.0
    */
}