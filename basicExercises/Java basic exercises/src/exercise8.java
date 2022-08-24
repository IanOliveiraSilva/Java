//DESCRIPTION
/*program to read an integer and tell if this number is even or odd*/

import java.util.Scanner;

public class exercise8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number, module;
		
		number = sc.nextInt();
		module = number % 2;
		
		if(module == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");	
		}
				
		sc.close();	
	}

}
