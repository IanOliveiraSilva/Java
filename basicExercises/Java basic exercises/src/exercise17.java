//DESCRIPTION
/*A program that reads 1 integer value N, which represents the number of test cases that follow. Each test case consists
of 3 real values, each with one decimal place. Shows the weighted average for each of these
sets of 3 values, where the first value has weight 2, the second value has weight 3 and the third value has
weight 5*/

import java.util.Scanner;

public class exercise17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
	
		
		for (int i=0; i<number; i++) {
			double count = sc.nextDouble();
			double count2 = sc.nextDouble();
			double count3 = sc.nextDouble();
			
			double average = (count * 2 + count2 * 3 + count3 * 5) / 10;
			
			System.out.printf("%.1f%n", average);
			
		}
			

		sc.close();

	}

}
