package emailapp;

import java.util.Scanner;

public class Email {

	private String firstName, lastName, password, department, email,alternateEmail;
	private String companySuffox = "aeycompany.com";
	private int mailboxCapacity = 700;
	private int defaultPasswordLength = 10;

	// Constructor to receive first and last name

	public Email(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;

//		System.out.println("EMAIL ADDRESS CREATED FOR : " + this.firstName + " " + this.lastName);
		
		
		// call method to determine department
		this.department = setDepartment();

//		System.out.print("The Department Selected is: " + this.department + "\n");
		
		//  call method to generate password
		
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your random Password is : " + this.password + "\n");
		
		//combine elements to generate email
		
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffox;
//		System.out.println("Your email address is: " + email);
//		

	}

	// Ask for department
	private String setDepartment() {

		System.out.print(
		"Select a Department code from the following: \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none\n");
		
		System.out.println("Enter Department Code: ");

		Scanner in = new Scanner(System.in);

		int depChoice = in.nextInt();

		switch (depChoice) {

		case (1): {
			in.close();
			return "sales";
		}

		case (2): {
			in.close();
			return "developer";
		}

		case (3): {
			in.close();
			return "accounting";
		}

		default:
			in.close();
			return "";
		}

		
	}

	
	// Generate Random password
	private String randomPassword(int length) {
		
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
				
		char [] password = new char[length];		
		
		for (int i=0; i<length; i++) {
		int rand = (int)(Math.random()* passwordSet.length());
		password[i] = passwordSet.charAt(rand);
		
		}
	
		return new String(password); 
	}

	// Set mailbox capacity
	

	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}


	// Set alternate email
	
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}

	// Change password
	
	public void changePassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	
	public String showInfo() {

		
		return "DISPLAY NAME: " + firstName + " " + lastName + 
				"\nCOMPANY EMAIL: " + email + 
				"\nMAILBOX CAPACITY " + mailboxCapacity + "mb";
	}
	
}
