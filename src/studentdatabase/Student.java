package studentdatabase;
import java.util.Scanner;

public class Student {
	
	private String firstName,lastName,courses= " ",studentId;
	
	private static int id = 1000;
	private int gradeYear;
	private int tuitionBalance= 0;
	private static int costOfCourse = 600;
	

	
	//Constructor : prompt user to enter students name & year
	
	public Student(){
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is the Student's first name?");
		this.firstName = in.next(); 
		
		System.out.print("What is the Student's last name?");
		this.lastName = in.next(); 
		
		System.out.print("1:Freshman\n2:Sophmore\n3:Junior\n4:Senior\nEnter Student Level: ");
		this.gradeYear = in.nextInt(); 
		
		setStudentid();
//		System.out.println(firstName + " " + lastName + " " + gradeYear +  " " + studentId);
		in.close();
		
	}
	//generate an ID
	
	private void setStudentid() {
		id++;
		// GradeLevel + id
		this.studentId =  gradeYear + "" + id;
		
	}
	
	
	// Enroll in courses
	
	public void enroll() {
		
		Scanner in = new Scanner (System.in);
		
		do {
		System.out.println("Enter Course to Enroll (Q to quit) : ");
		
		String course = in.nextLine();
		if(!course.equalsIgnoreCase("Q")){
			courses = courses +"\n" + course;
			tuitionBalance = tuitionBalance + costOfCourse;
			
		}
		else {
			
			break;
		}
		
		}while(1 != 0);
		
		
//		System.out.println("Enrolled In: " + courses);
		viewBalance();
		
		
		
	
	}
	
	// view balance 
	
	public void viewBalance() {
		
		
		System.out.println("Your balance is: $" + tuitionBalance + ".00");
	}

	
	
	//pay tuition
	
	public void payTuition() {
		
		viewBalance();
		System.out.println("What would you like to pay?");
		Scanner in = new Scanner (System.in);
		int payment = in.nextInt(); 
	
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Your Payment of $" + payment + ".00 was recieved.");
//		viewBalance();
	}
	//show status
	
	public String showInfo() {
		
		 return ("Name: " + firstName + " " + lastName + 
				"\nGrade Level: " + gradeYear +
				 "\nStudent ID:  " + studentId +
				"\nCourses Enrolled: " + courses +
				"\nBalance: $" + tuitionBalance);
				
	}

}
