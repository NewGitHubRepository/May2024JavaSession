package constructorAssignment;

public class BankAccount {
	/*
	 * Assignment 5: Create a Java class named "BankAccount" with the following
	 * instance variables: accountNumber (String) balance (double) Create a
	 * constructor for the BankAccount class that takes in the accountNumber and
	 * balance as parameters and initializes the instance variables. Create a method
	 * in the BankAccount class named "deposit" that takes in a double value as a
	 * parameter and adds it to the balance instance variable. Create a method in
	 * the BankAccount class named "withdraw" that takes in a double value as a
	 * parameter and subtracts it from the balance instance variable. Create a main
	 * method that creates an instance of the BankAccount class using the
	 * constructor and performs multiple deposits and withdrawals using the deposit
	 * and withdraw methods. Print out the updated balance after each transaction.
	 */
	
	String accountNumber;
	double balance;
	
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
   public void deposit(double value) {
	   balance = balance+ value;
   }
   public void withdraw(double value) {
	   balance = balance - value;
   }

   //getter and setter method 
	public String getAccountNumber() {
	return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
    }
    public double getBalance() {
	return balance;
    }
    public void setBalance(double balance) {
	this.balance = balance;
    }
	public static void main(String[] args) {
		BankAccount bankAcc = new BankAccount("10101010110", 10000);
		bankAcc.deposit(50000);
		bankAcc.deposit(5000);
		bankAcc.deposit(100000);
		bankAcc.withdraw(50000);
		bankAcc.withdraw(2000);
		
		System.out.println("Udated balance : "+bankAcc.getBalance());
	}

}
