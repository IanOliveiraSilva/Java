//DESCRIPTION//
/*a program that repeats reading a password until it is valid. For each password read
incorrectly informed, writes the message "Invalid password". When the password is entered correctly, it must be
the message "Access Allowed" and the algorithm terminated. Assume that the correct password is the value 2002.*/

import java.util.Scanner;

public class exercise13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int password = sc.nextInt();
		
		while(password != 2002) {
			System.out.println("Senha Invalida");
			password = sc.nextInt();
			if(password == 2002) {
			System.out.println("Acesso Permitido");
			}
		}
	
		
		sc.close();
	}

}
