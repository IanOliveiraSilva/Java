import java.util.Scanner;

public class exercise21 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
	
		for (int i=1; i<=number ; i++) {
		int firstLine = i;
		int secondLine = i * i;
		int thirdLine = i * i * i;
		System.out.printf("%d %d %d%n", firstLine, secondLine, thirdLine);
			
		}
	
		
		sc.close();

	}

}
