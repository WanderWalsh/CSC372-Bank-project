/*
Alex Walsh

Project Name: CSC372-CTA02

Project Purpose: Demonstrate an understanding working knowledge of creating and implementing GUI

Algorithm Used: Action listeners and superclass

Program Inputs: 3

Program Outputs: 2

Program Limitations: 3

Program Errors:0
*/

public class CheckingAccount extends BankAccount {

	private double m_interestRate;
	private double fee = 30.00;
		
	public CheckingAccount() {
		m_interestRate = 0.02;
	}
	
	public CheckingAccount processWithdraw( double withdraw) {
		
		if (this.getBalance() - withdraw < 0) {
			this.withdrawal(withdraw + fee);
			System.out.print("Due to insufficient funds, a fee of ");
			System.out.printf("$%,.2f", fee);
			System.out.println(" has been applied!");
			}
		else {
			this.withdrawal(withdraw);
			}
		
		 return this;
	}
	
	public void disyplayAccount(){
		
		String[] accountInfo = this.getAccountInfo();
		accountInfo[4] = String.valueOf(this.m_interestRate);
		String[] titleCard = this.makeTitileCards();
		
		
		for(int i = 0; i < accountInfo.length; i++ ) {
		System.out.println(titleCard[i] + accountInfo[i]);
		}
		System.out.println("");
	}
	
	
	//private
}
