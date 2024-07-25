package packageOne;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		Student stu1 = new Student();
//		stu1.enroll();
//		stu1.payTuition();
//		System.out.println(stu1.toString());
//
//		Student stu2 = new Student();
//		stu2.enroll();
//		stu2.payTuition();
//		System.out.println(stu2.toString());
//		
//		Student stu3 = new Student();
//		stu3.enroll();
//		stu3.payTuition();
//		System.out.println(stu3.toString());

//		Instead of writing like above, we will write like below, its better
				//	Ask how many students we want to add?
		System.out.println("Enter number of new students to enroll: ");
		try(Scanner in = new Scanner(System.in)){
			int numOfStudents = in.nextInt();
			Student[] students = new Student[numOfStudents];
			for(int i=0; i<numOfStudents; i++) {
				students[i] = new Student();
				students[i].enroll();
				students[i].payTuition();
				System.out.println(students[i].toString());
			}
		}		
	}

}
