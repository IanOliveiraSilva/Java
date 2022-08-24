//DESCRIPTION
/*a program that reads any value and displays a message saying in which of the
following intervals ([0.25], (25.50], (50.75], (75.100]) this value is in. If the value is not in
none of these ranges will show the message “Out of range”*/

import java.util.Scanner;

public class exercise12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String interval;
		Double number = sc.nextDouble();
		
		if(number >= 0 & number <= 25) {
			interval = "Intervalo (0,25]";
		}
		else if(number > 25 & number <= 50 ) {
			interval = "Intervalo (25,50]";
		}
		else if(number > 50 & number <= 75) {
			interval = "Intervalo (50,75]";
		}
		else if(number > 75 & number <= 100) {
			interval = "Intervalo (75,100]";
		}
		else {
			interval = "Fora do intervalo";
		}
		
		System.out.println(interval);
	
		
		sc.close();

	}

}
