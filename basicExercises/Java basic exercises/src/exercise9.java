//DESCRIPTION
/*A program that reads 2 integer values ​​(A and B). 
 *After that, the program shows a message "There are multiples" or "There are no
Multiples", indicating whether the values ​​read are multiples of each other.*/

import java.util.Scanner;

public class exercise9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number1, number2;

		number1 = sc.nextInt();
		number2 = sc.nextInt();


		if(number1 % number2 == 0 || number2 % number1 == 00) {
			System.out.println("São multiplos");
		}
		else {
			System.out.println("Não são multiplos");	
		}
				
		sc.close();

	}

}
