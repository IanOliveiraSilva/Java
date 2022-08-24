package entities;

public class BankAccount {

//CLASS//	
	private int accountNumber;
	private String accountHolder;
	private double initialDeposit;
	private double accountBalance = 0;

//CONSTRUCTOR//
	
	public BankAccount(int accountNumber, String accountHolder,  double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.accountBalance = initialDeposit;
		
	}
	public BankAccount(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}
	                       
//GET AND SET//	

	//SET//
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	//GET//
	public String getAccountHolder() {
		return accountHolder;
	}


	public int getAccountNumber() {
		return accountNumber;
	}

	public double getInitialDeposit() {
		return initialDeposit;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

//Methods//

	public void deposit(double depositValue) {
		accountBalance += depositValue;
	}
	
	public void withdraw(double withdrawValue) {
		accountBalance -= 5;
		accountBalance -= withdrawValue ;  
	}
	
	public String toString() {
		return "Account: " + accountNumber + ", " + "Holder: " + accountHolder + ", " + "Balance: $ " + accountBalance; 
	}


}
