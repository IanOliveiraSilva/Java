package entities;

public class Student {
	
//class//	
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;

//methods//	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
}
	
	public String status() {
		  if(this.finalGrade() >= 60) {
			return "PASS";
		}
		else {
			return "FAILED";
		}
	}
	
	public double missing() {
		if(this.finalGrade() < 60) {
			return 60 - this.finalGrade();
		}
		else {
			return 0;
	}
}
	

}