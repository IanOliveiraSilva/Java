//DESCRIPTION
/*A gas station wants to determine which of its products is preferred by its customers. 
The program reads the type of fuel filled (coded as follows: 1.Alcohol 2.Gasoline 3.Diesel
4.End). 

If the user enters an invalid code (outside the range 1 to 4), a new code must be requested (up to
that is valid). The program will be terminated when the code entered is number 4. 

It must be written to
message: "THANK YOU SO MUCH" and the number of customers who filled up each type of fuel*/

import java.util.Scanner;

public class exercise14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int code = sc.nextInt();
		int countAlcool = 0, countGasolina = 0, countDiesel = 0;
		
		
		while(code != 4 ) {
			code = sc.nextInt();
			if(code == 1) {
				countAlcool += 1;
				
			}
			else if (code == 2) {
				countGasolina += 1;
				
			}
			else if (code == 3) {
				countDiesel += 1;
				
			}
			else if (code == 4) {
				System.out.println("MUITO OBRIGADO");
			}
		}
		
		System.out.println("Alcool: " + countAlcool);
		System.out.println("Gasolina: " + countGasolina);
		System.out.println("Diesel: " + countDiesel);

		
		sc.close();

	}

}
