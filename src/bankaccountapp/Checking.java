package bankaccountapp;

public class Checking extends Account {

	//list properties specific to a checking account:
		//debit card and pin
		protected int debitCardNum;
		protected int debitCardPin;
		
	
		// list any methods specific to the checking account.
	
	// call constructor from Account to initialize the account. 
	
	public Checking(String name,String SSN, double initDepsoit) {
		super(name,SSN,initDepsoit);
		acctNum = 2 + acctNum;
		setDebitCard();
//		System.out.println("New Checking Account");
//		System.out.println("Account Number: " + this.acctNum);
		
	}
	
	@Override
	public void setRate() {
		this.rate = (getBaseRate() * .15);
		
	}
	
	
	private void setDebitCard() {
		
		this.debitCardNum = (int) (Math.random() * Math.pow(10, 12));
		this.debitCardPin = (int) (Math.random() * Math.pow(10, 4));
		
	}
	

	public void showInfo() {
		super.showInfo();
		System.out.println("Your Checking Account Features:" +
				 "\nDebit Card Number is: " + debitCardNum +
				 "\nDebit Card Pin is: " + debitCardPin
				);
		
	}


	
	
	
}
