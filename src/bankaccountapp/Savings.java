package bankaccountapp;

public class Savings extends Account {

	// list properties specific to the savings account
		protected int safetyDepBoxId;
		protected int safetyDepBoxKey;
		
	
	
	// constructor to initialize the savings account
	
	public Savings(String name,String SSN, double initDepsoit) {
		super(name,SSN,initDepsoit);
		acctNum = 1 + acctNum;
		setSafetyDepositBox();
		
	}
	
	//  methods specific to savings account.
	
	
	@Override
	public void setRate() {
		
		this.rate = (getBaseRate() - .25);
	}
	
	
	private void setSafetyDepositBox() {
		
		this.safetyDepBoxId = (int) (Math.random() * Math.pow(10, 3));
		this.safetyDepBoxKey = (int) (Math.random() * Math.pow(10, 4));
		
	}
	
	
	
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Savings Account Features:"
				+ "\nSafety Deposit Box ID: " + safetyDepBoxId +
				 "\nSafety Deposit Box Code: " + safetyDepBoxKey
				);
		
		
	}

	
	
	
	
	
	
	
}
