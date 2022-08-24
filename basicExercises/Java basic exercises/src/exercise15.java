//DESCRIPTION
/*A program that reads integer value X (1 <= X <= 1000). Then display the odd numbers from 1 to X, one value per line, including the
X, if applicable.*/

import java.util.Scanner;

public class exercise15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		for (int i = 1; i <= number; i++)
			if (i % 2 != 0) {
				System.out.println(i);
			}
		
		sc.close();
	}

}
