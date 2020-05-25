package studentdatabase;

import java.util.Scanner;

public class StudentDatabase {

	public static void main(String[] args) {

		
		//Ask how many users we want to add
		System.out.print("Enter Number of students to Enroll: ");
		Scanner in = new Scanner(System.in);
		
		int numStudents = in.nextInt();
		
		Student[] students = new Student[numStudents];
		
		
		
		
		
		// create n number of new students
		
		for (int n = 0; n < numStudents; n++) {
		
			students[n] = new Student();
			
			students[n].enroll();
			students[n].payTuition();
			
			
			
			
		}
		
		for (int n = 0; n < numStudents; n++) {
			System.out.println(students[n].showInfo());
		}
		in.close();
	}
	


}
 