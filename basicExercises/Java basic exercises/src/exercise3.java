//DESCRIPTION//
//program to read four integer values ​​A, B, C and D. calculates and displays the product difference of A and B by the product of C and D according to the formula: DIFFERENCE = (A * B - C * D)//

import java.util.Scanner;

public class exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, resultado;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		resultado = A * B - C * D;
		System.out.println("DIFERENÇA = " + resultado);
		
		sc.close();

	}

}
