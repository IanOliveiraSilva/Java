//DESCRIPTION
/*program to read the code of a part 1, the number of parts 1, the unit value of each part 1, the
part code 2, the number of parts 2 and the unit value of each part 2. Calculates and displays the amount to be paid.*/


import java.util.Scanner;

public class exercise5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int code1, unit1, code2, unit2; 
		double value1, value2, valuetotal;
	
		code1 = sc.nextInt();
		unit1 = sc.nextInt();
		value1 = sc.nextDouble();
		code2 = sc.nextInt();
		unit2 = sc.nextInt();
		value2 = sc.nextDouble();
		
		valuetotal = (value1 * unit1) + (value2 * unit2);
		
		System.out.printf("VALOR A PAGAR = R$ %.2f%n", valuetotal);
		
		sc.close();
		

	}

}
