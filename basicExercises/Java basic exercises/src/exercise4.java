//DESCRIPTION//
/*program that reads the number of an employee, his number of hours worked, the amount he receives for
hour and calculates the salary of that employee. The following shows the employee's number and salary, with two places
decimals.*/

import java.util.Scanner;

public class exercise4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number, value; 
		double hour, salary;
	
		number = sc.nextInt();
		value = sc.nextInt();
		hour = sc.nextDouble();
		
		salary = value * hour;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		
		sc.close();
	}

}
