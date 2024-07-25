package packageOne;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
//	public static Scanner scanner = new Scanner(System.in);
	
	//Constructor to prompt user to enter student's name and year
	public Student() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter student first name: ");
			this.firstName = scanner.nextLine();
			
			System.out.println("Enter student last name: ");
			this.lastName = scanner.nextLine();
			
			System.out.println("1 - Fresher\n2 - Sophmore\n3 - Midlevel\n4 - Senior\nEnter student class level: ");
			this.gradeYear = scanner.nextInt();
	
		
		setStudentId();
	}
	
	//Generate a ID, with 1st number  being their grade level
	private void setStudentId() {
		id++;
		this.studentId = this.gradeYear + "" + id;
	}
	
	//Enroll in courses
	public void enroll() {
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner scanner = new Scanner(System.in);
			String course = scanner.nextLine();
			if(!course.equalsIgnoreCase("Q")) {
				this.courses = this.courses + "\n" + course;
				this.tuitionBalance = this.tuitionBalance + costOfCourse;
			}else {
				break;
			}
		}while(1 != 0);
	}
	
	
	//View balance
	public void viewBalance() {
		System.out.println("Your payment balance is: " + this.tuitionBalance + "€");
	}
	
	//Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: ");
		Scanner scanner = new Scanner(System.in);
		int payment = scanner.nextInt();
		this.tuitionBalance -= payment;
		System.out.println("Thank you for your payment of " + payment + "€");
		viewBalance();
	}
	
	//Show status
	public String toString() {
		return "Name: " + this.firstName + " " + this.lastName +
				"\nStudent ID: " + this.studentId +
				"\nCourses enrolled: " + this.courses + 
				"\nBalance is: " + this.tuitionBalance + "€";
	}
}




