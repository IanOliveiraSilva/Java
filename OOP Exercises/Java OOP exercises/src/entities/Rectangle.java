package entities;

public class Rectangle {

//CLASS//
	public double width;
	public double height;

//METHODS//
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2 * (width + height);
	}
	
	public double diagonal() {
		return Math.sqrt(width * width + height * height);
	}

	


}


