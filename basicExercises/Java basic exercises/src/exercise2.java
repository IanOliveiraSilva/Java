//DESCRIPTION//
//program to read the value of the radius of a circle, and then display the value of the area of ​​this circle with four decimal places//

import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double raio, pi, area;
		
		pi = 3.14159;
		raio = sc.nextDouble();
		area = pi * raio*raio;
		
		System.out.printf("A = %.4f %n", area);
		
		sc.close();


	}

}
