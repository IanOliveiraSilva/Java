//DESCRIPTION
/*A program to read the dollar quote, and then a dollar amount to be purchased by
a person in reais. Inform how many reais the person will pay for the dollars, also considering
that the person will have to pay 6% IOF on the dollar amount*/

package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class CurrencyConverterProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		CurrencyConverter.dolar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		CurrencyConverter.quantity = sc.nextDouble();
		
		System.out.print("Amount to be paid in reais = " + CurrencyConverter.converter(0));
		
	
		sc.close();
		
	}

}
