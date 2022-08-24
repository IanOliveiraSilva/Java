//DESCRIPTION
/*A program to read the width and height values
of a rectangle. Then display on the screen the value of
its area, perimeter and diagonal.*/

package application;

import java.util.Scanner;

import entities.Rectangle;

public class RectangleProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println("AREA = " + rectangle.area());
		System.out.println("PERIMETER = " + rectangle.perimeter());
		System.out.println("DIAGONAL = " + rectangle.diagonal());
		
	
		
		sc.close();
		
	}

}
