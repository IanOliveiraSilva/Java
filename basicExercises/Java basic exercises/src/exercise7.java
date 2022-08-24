//DESCRIPTION
/*program to read an integer, and then tell if this number is negative or not*/

import java.util.Scanner;

public class exercise7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		number = sc.nextInt();
		
		if(number >= 0) {
			System.out.println("NÃO NEGATIVO");
		}
		else {
			System.out.println("NEGATIVO");	
		}
				
		sc.close();
	}

}


