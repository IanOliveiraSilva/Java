//DESCRIPTION
/*A program to read an integer N and calculate all its divisors.*/

import java.util.Scanner;

public class exercise20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int division, module;
	
		for (int i=1; i<=number ; i++) {
		 division = number / i;
		 module = number % i;
			if(module == 0) {
				System.out.println(division);
			}
		
		}
	
		
		sc.close();

	}

}
