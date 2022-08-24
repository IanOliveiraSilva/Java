//DESCRIPTION
/*A program that reads the start time and end time of a game. 
 *Then it calculates the duration of the game, knowing that it can
start on one day and finish on another, with a minimum duration of 1 hour and a maximum of 24 hours.*/

import java.util.Scanner;

public class exercise10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int initialHour, finalHour, duration;

		initialHour = sc.nextInt();
		finalHour = sc.nextInt();
		
		
		if(initialHour < finalHour) {
			duration = finalHour - initialHour;
		}
		else {
			duration = 24 - initialHour + finalHour;	
		}
		
		System.out.println("O JOGO DUROU " + duration + " HORAS");
		
		sc.close();
	}

}
