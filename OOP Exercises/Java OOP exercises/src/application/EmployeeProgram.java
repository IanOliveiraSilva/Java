//DESCRIPTION 
/*a program to read an employee's data (name, gross salary and tax). In
then show the employee data (name and net salary). Then increase the
employee salary based on a given percentage (only gross salary is
affected by the percentage) and redisplay the employee data.*/

package application;

import java.util.Scanner;

import entities.Employee;

public class EmployeeProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);
		System.out.println();
		
		System.out.print("Which percentage to increase salary: ");
		employee.increaseSalary(sc.nextDouble());
		
		System.out.println();
		System.out.println("Update data: " + employee);
		
		sc.close();
	}

}
