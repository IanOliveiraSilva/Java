//DESCRIPTION
/*In a bank, to register a bank account, it is necessary to inform the account number, the name of the
account holder, and the initial deposit amount that the holder deposited when opening the account. This deposit amount
initial deposit, however, is optional, that is: if the holder does not have money to deposit at the time of opening his
account, the initial deposit will not be made and the opening account balance will naturally be zero.
Important: Once a bank account has been opened, the account number can never be changed. Already
the name of the holder can be changed (as a person can change their name on the occasion of marriage, for
example).
Finally, the account balance cannot be freely changed. The balance only increases through deposits, and only decreases through withdrawals. for each withdrawal
performed, the bank charges a fee of $5.00. Note: the account may have a negative balance if the balance is not
enough to make the withdrawal and/or pay the fee.
A program that performs the registration of an account, giving the option to be or not
Enter the initial deposit amount. Then make a deposit and then a withdrawal, always
showing account data after each trade.*/

package application;

import java.util.Scanner;

import entities.BankAccount;

public class BankAccountProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String accountHolder = sc.nextLine();

		
		System.out.print("Is there na initial deposital (y/n)?");
		String initialVerify = sc.nextLine();
		
		
		BankAccount bankAccount = new BankAccount(accountNumber, accountHolder);
		
		if(initialVerify.equals("y")) {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			bankAccount = new BankAccount(accountNumber, accountHolder, initialDeposit);
		}
	
		
		System.out.println("Account data: \n" + bankAccount);
		
		System.out.print("Enter a deposit value: ");
		 bankAccount.deposit((sc.nextDouble()));
		System.out.println("Updated account data: \n" + bankAccount);
		
		System.out.print("Enter a withdraw value: ");
		 bankAccount.withdraw((sc.nextDouble()));
		System.out.println("Updated account data: \n" + bankAccount);
		
		sc.close();
	}	
}
