//DESCRIPTION
/*A program to read a value N. Calculate and write its respective factorial. Example: Factorial of N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Remember that, by definition, a factorial of 0 is 1.*/

import java.util.Scanner;

public class exercise19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int factorial = 1;
		
		 if(number != 0) {
			 
		for (int i= number - 1; i != 0 ; i--) {
			
			
				factorial = number * i;
				number = factorial;	
				
				
			}
		 }
			System.out.println(factorial);
		
	
		
		sc.close();
}

	}
