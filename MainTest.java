/*
Alex Walsh

Project Name: CSC372-CTA01

Project Purpose: Demonstrate an understanding of how a superclass and inheritance work

Algorithm Used: superclass and inheritance

Program Inputs: 3

Program Outputs: 14

Program Limitations: 1

Program Errors:0
*/

import java.util.*;

public class MainTest {

	public static void main(String[] args) {
		
		
		//test bank account
		BankAccount masterAccount = new BankAccount();
		masterAccount.accountSummary();
				
		System.out.println("let's set you up with a new bank account!");
		
		System.out.println("What is your First name?");		
		masterAccount.setFirstName();
		System.out.println(masterAccount.getFristName());
				
		System.out.println("What is your Last name?");
		masterAccount.setLastName();
		System.out.println(masterAccount.getLastName());
		
		System.out.println("What ID number where you given?");
		masterAccount.setAccountID();
		System.out.println(masterAccount.getAccountID());
		
		System.out.println("How much would you like to deposit?");
		masterAccount.deposit(masterAccount.getUserNum());
		System.out.printf("$%,.2f", masterAccount.getBalance());
		System.out.println("");
		
		System.out.println("How much would you like to withdraw?");
		masterAccount.withdrawal(masterAccount.getUserNum());
		System.out.printf("$%,.2f", masterAccount.getBalance());
		System.out.println("");
		
		masterAccount.accountSummary();
		
		//test new Checking account
		CheckingAccount userChecking = new CheckingAccount();
		userChecking.disyplayAccount();
		
		System.out.println("let's set you up with a new checking account!");
		
		System.out.println("What is your First name?");	
		userChecking.setFirstName();
		System.out.println("What is your Last name?");
		userChecking.setLastName();
		System.out.println("What ID number where you given?");
		userChecking.setAccountID();
		
		System.out.println("How much would you like to deposit?");
		userChecking.deposit(userChecking.getUserNum());
		
		System.out.println("How much would you like to withdraw?");
		userChecking.processWithdraw(userChecking.getUserNum());
		System.out.printf("$%,.2f", userChecking.getBalance());
		System.out.println("");
		
		userChecking.accountSummary();
		
		
	}
	
	
	
}
