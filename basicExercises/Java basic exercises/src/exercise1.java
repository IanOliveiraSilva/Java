//DESCRIPTION//
//program to read two integer values, and then display the sum of these numbers on the screen//
import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero1, numero2, soma;
		
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		
		soma = numero1 + numero2;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();

	}

}
