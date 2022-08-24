//DESCRIPTION
/*a program to read a number N. Then read N pairs of numbers and show the division of the first by the
second. If the denominator is equal to zero, it will show the message "division impossible".*/

import java.util.Scanner;

public class exercise18 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
	
		
		for (int i=0; i<number; i++) {
			double count = sc.nextDouble();
			double count2 = sc.nextDouble();
			
			if (count2 == 0) {
				System.out.println("Impossivel calcular");
			}
			else {
				double division = count / count2;	
				System.out.println(division);
			}
					
			
		}
			
		sc.close();

	}

}
