//DESCRIPTION
/*A program to read a student's name and the three grades he got in the three quarters of the year
(first quarter is worth 30 and second and third are worth 35 each). At the end, show the student's final grade in the
year. Also say if the student is approved (PASS) or not (FAILED) and, if not, how many points are missing
for the student to obtain the minimum to pass (which is 60% of the grade)*/

package application;

import java.util.Scanner;

import entities.Student;

public class StudentProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + student.finalGrade());
		System.out.println(student.status());
		System.out.println("MISSING = " + student.missing());

		sc.close();
		
		

	}

}
