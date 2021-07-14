import java.util.Scanner;

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

public class BankAccount {
	
	private String m_firstName;
	private String m_lastName;
	private int m_accountID;
	private double m_blance;
	Scanner scnr = new Scanner(System.in);
		
	public BankAccount(){
		m_firstName = null;
		m_lastName = null;
		m_accountID = 0;
		m_blance = 0;
		
	}
		
	public double deposit(double addValue) {
		
		if(addValue < 0) {
			System.out.println("Value was less than 0 could not process!");
		}
		else {
		m_blance += addValue;
		}
		
		return this.m_blance;
		}
	
	public double withdrawal(double subValue) {
		if(subValue < 0) {
			subValue = -1 * subValue;
		}
		
		m_blance -= subValue;
		
		return this.m_blance;
		}
	
	
	public String getFristName() {
		
		return this.m_firstName;
	}
	public String getLastName() {
		
		return this.m_lastName;
	}
	public int getAccountID() {
		
		return this.m_accountID;
	}
	public double getBalance() {
		return this.m_blance;
	}
	
	
	public void setFirstName() {
		this.m_firstName = scnr.next();
		
	}
	public void setLastName() {
		this.m_lastName = scnr.next();
		
	}
	public void setAccountID() {
		while(true) {
			if(scnr.hasNextDouble()) {
				this.m_accountID = scnr.nextInt();
				break;
			}
			else {
				System.out.println("Thats was not a number!");
				scnr.next();
			}
		}	
	}
	
	public String[] getAccountInfo() {
		
		String accountInfo[] = {this.m_firstName, this.m_lastName,  String.valueOf( this.m_accountID), String.format("$%,.2f", this.m_blance),  String.valueOf(0)};
				
		return accountInfo;
	}
	
	public String[] makeTitileCards() {
		String[] titleCard = {"First Name: ", "Last Name: ", "Account ID: ", "Total Blance: ", "Interst Rate: "}; 
		
		return titleCard;
	}
	
	public void accountSummary(){
		
		String[] accountInfo = this.getAccountInfo();
		String[] titleCard = this.makeTitileCards();
		
		for(int i = 0; i < 4; i++ ) {
		System.out.println(titleCard[i] + accountInfo[i]);
		}
		System.out.println("");	
	}
	public double getUserNum() {
		double userNum;
		while(true) {
			if(scnr.hasNextDouble()) {
				userNum = scnr.nextDouble();
				break;
			}
			else {
				System.out.println("Thats was not a number!");
				scnr.next();
			}
		}
	
		return userNum;
	}
	
}
