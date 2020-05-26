package bankaccountapp;


//parent class

public abstract class Account implements IBaseRate {

	// list common properties for savings and checking
	
	private String name;
	private String SSN;
	private static int index = 10000;
	private double balance;
	protected String acctNum;
	protected double rate;
	
	
	//constructor to set base properties and initialize the account
	
	public Account(String name,String SSN, double initDeposit) {
		
		this.name = name;
		this.SSN = SSN;
		balance = initDeposit;
	
		//set account number
		index++;
		this.acctNum = setAccountNum();
		
		setRate();

		
	}
	
	
	//Common Methods
	
	public abstract void setRate();
	
	private String setAccountNum() {
		String lastTwoOfSSN = SSN.substring(SSN.length()-2,SSN.length());
		int uniqueID = index;
		int ranNum = (int) (Math.random() * Math.pow(10,3));
		
			return lastTwoOfSSN + uniqueID + ranNum;
	}
	
	public void compound() {
		
		double accruedInterest = balance * (rate/100);
		balance = (balance + accruedInterest);
		System.out.println(accruedInterest);
		printBalance();
		
		
	}
	
	
	public void deposit(double amt) {
		
		balance = balance + amt;
		System.out.println("Depositing $" + amt);
		printBalance();
	}
	
	public void withdraw(double amt) {
		
		balance = balance - amt;
		System.out.println("Withdrawing $" + amt);
		printBalance();
		
	}
	
	
	public void transfer(String toWhere,double amt) {
		
		balance = balance - amt;
		System.out.println("Transfering $ " + amt + "to" + toWhere);
		printBalance();
	}
	
	
	public void printBalance() {
		
		System.out.print("Your balance is : " + balance);
	}
	
	public void showInfo() {
		System.out.println(
				"Name: " + name +
				"\nAccount Number: " + acctNum +
				"\nBalance: " + balance +
				"\nRate: " + rate + "%"
				);
		
	}
	

		
}

