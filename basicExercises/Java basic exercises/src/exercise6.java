//DESCRIPTION
/*program that reads three double precision floating point values: A, B, and C. Then calculates and
show:
a) The area of ​​a right triangle that has A for its base and C for its height.
b) the area of ​​the circle of radius C. (pi = 3.14159)
c) the area of ​​the trapezoid that has A and B for bases and C for height.
d) the area of ​​the square that has side B.
e) the area of ​​the rectangle that has sides A and B*/

import java.util.Scanner;

public class exercise6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b, c;
		double triangulo, circulo, trapezio, quadrado, retangulo;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		triangulo = a * c / 2;
		circulo = Math.PI * (c * c);
		trapezio = (a + b) / 2 * c;
		quadrado = b * b;
		retangulo = a * b;
		
		System.out.printf("TRIANGULO = %.3f%n", triangulo);
		System.out.printf("CIRCULO = %.3f%n", circulo);
		System.out.printf("TRAPEZIO = %.3f%n", trapezio);
		System.out.printf("QUADRADO = %.3f%n", quadrado);
		System.out.printf("RETANGULO = %.3f%n", retangulo);
	
		sc.close();
	}

}
