//DESCRIPTION
/*a program that reads an integer value N. This value will be the amount of integer values ​​X that will be read next.
Show how many of these X values ​​are within the range [10,20] and how many are outside the range by showing
this information as in the example (use the word "in" for inside the range, and "out" for outside the range).*/

import java.util.Scanner;

public class exercise16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int in = 0, out = 0;
	
		for (int i=0; i<number; i++) {
			int count = sc.nextInt();

			if(count >=  10 & count <= 20) {
				in++;
			}
			else {
				out++;
			}
		}
			
			
		System.out.printf("%d in%n", in);
		System.out.printf("%d out", out);
			
		sc.close();
	}

}
