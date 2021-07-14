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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.*;


public class BankAccountFrame extends JFrame implements ActionListener{

	private CheckingAccount userAccount = new CheckingAccount();
	private JButton withdraw = new JButton("Withdraw");
	private JButton deposit = new JButton("Deposit");
	private JTextField txtAmount = new JTextField();
	private JTextField txtBalance = new JTextField();;
	private JTextArea txtError = new JTextArea();
	private JPanel frame = new JPanel();

	public static void main(String[] args) {
		BankAccountFrame bankGUI = new BankAccountFrame();
		bankGUI.setVisible(true);
	}
	
	public BankAccountFrame() {
		setTitle("Fake World Bank");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		setContentPane(frame);
		frame.setLayout(null);
		
		JLabel labBalance = new JLabel("Balance");
		JLabel labAmount = new JLabel("Amount");
		JLabel labMessages = new JLabel("Messages");
		
		//Set positions
		deposit.setBounds(35, 145, 100, 20);
		withdraw.setBounds(155, 145, 100, 20);
		txtBalance.setBounds(95, 45, 100, 20);
		txtAmount.setBounds(95, 100, 100, 20);
		txtError.setBounds(35, 195, 220, 40);
		labBalance.setBounds(95, 23, 50, 30);
		labAmount.setBounds(95, 78, 50, 30);
		labMessages.setBounds(35, 175, 65, 20);
		
		txtBalance.setHorizontalAlignment(SwingConstants.CENTER);
		txtBalance.setText(String.format("$%,.2f", userAccount.getBalance()));
		txtBalance.setEditable(false);
		
		txtAmount.setHorizontalAlignment(SwingConstants.CENTER);
		txtAmount.setText(String.format("$%,.2f", 0.0));
		txtBalance.setEditable(true);
		
		txtError.setBackground(Color.LIGHT_GRAY);
		
		frame.add(deposit);
		frame.add(withdraw);
		frame.add(txtAmount);
		frame.add(txtBalance);
		frame.add(txtError);
		frame.add(labBalance);
		frame.add(labAmount);
		frame.add(labMessages);
		
		deposit.addActionListener(this);
		withdraw.addActionListener(this);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == withdraw) {
			
			
			String text = txtAmount.getText();
			double subValue = 0;
			
			try {
			subValue = Double.parseDouble(text);
			
			}catch(Exception exe){
				txtError.setText(exe.getMessage() + " is not a number");
				
			}
			if(subValue == 0) {
				//do nothing
				txtAmount.setText(String.format("$%,.2f", 0.0));
			}	
			else {
				//add
				userAccount.processWithdraw(subValue);
				txtAmount.setText(String.format("$%,.2f", 0.0));
				txtBalance.setText(String.format("$%,.2f", userAccount.getBalance()));
			}
		}
			
		else if(e.getSource() == deposit) {
			
			String text = txtAmount.getText();
			double addValue = 0;
			
			try {
				addValue = Double.parseDouble(text);
			}catch(Exception exe){
				txtError.setText(exe.getMessage() + " is not a number");
				
			}
			
			userAccount.deposit(addValue);
			txtAmount.setText(String.format("$%,.2f", 0.0));
			txtBalance.setText(String.format("$%,.2f", userAccount.getBalance()));
			}
			else {
				
			}
			
		
	}
}

