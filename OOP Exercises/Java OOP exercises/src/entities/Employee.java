package entities;

public class Employee {
	
//CLASS//	
	public String name;
	public double grossSalary; 
	public double tax;
	
//METHODS//
	public double netSalary() {
	return grossSalary - tax;
}

	public void increaseSalary(double percentage) {
	this.grossSalary = grossSalary + (grossSalary * percentage / 100);
	}

	public String toString() {
		return name + ", " + "$" + netSalary();
	}
	
	
}