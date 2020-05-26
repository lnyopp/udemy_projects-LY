package bankaccountapp;


import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		String file = "/Users/lnyopp/eclipse-workspace/JavaProjects/src/utilities/original (1).csv";
		
		
		
		List<Account> accounts = new LinkedList<Account>();
		
//		Checking chk1 = new Checking("Leah Yopp", "445857965",1500);
//		
//	
//		Savings sav1 = new Savings("Rob Lowe","126859758",2500);
//		
//		sav1.showInfo();
//		System.out.println("*****************");
//		chk1.showInfo();
//		
		
		
		
		
		// read CSV file and create new account based on that data.
		
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		
		for(String [] accountHolder : newAccountHolders) {
			
			String name = accountHolder[0];
			String SSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			
//			
//			System.out.println(name + " " + SSN + " " + accountType + " $" + initDeposit);
			
			if(accountType.equals("Savings")) {
				accounts.add(new Savings(name, SSN, initDeposit));
			}else if(accountType.equals("Checking")) {
				accounts.add(new Checking(name, SSN, initDeposit));
			}else {
				System.out.println("Error reading Account Type");
			}
			
		
			
			for(Account acc : accounts) {
				System.out.print("***************\n");
				acc.showInfo();
				
			}
			
		}

	}

}
