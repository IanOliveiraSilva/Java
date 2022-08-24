//DESCRIPTION
/*a program that reads the code of an item and the quantity of that item. THE
then calculates and displays the amount of the account payable. 
Based on the table below:
code  specification	price
1		Hot dog		$4.00
2		X-salad		$4.50
3		X-bacon		$5.00
4		bread		$2.00
5		soda		$1.50
*/

import java.util.Scanner;

public class exercise11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double price = 0, value;
		int code, amount;

		code = sc.nextInt();
		amount = sc.nextInt();

		switch (code) {

		case 1:
			price = 4.00;
			break;

		case 2:
			price = 4.50;
			break;

		case 3:
			price = 5.00;
			break;

		case 4:
			price = 2.00;
			break;
		case 5:
			price = 1.50;
			break;
		}

		value = price * amount;

		System.out.printf("Total: R$ %.2f%n", value);

		sc.close();
	}

}
