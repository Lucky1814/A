package guessergame;

import java.util.Random;
import java.util.Scanner;

public class GuesserGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Player1 enter value(0-10): ");
		int Player1 = sc.nextInt();
		System.out.println("Player2 enter value (01-10): ");
		int Player2 = sc.nextInt();

		System.out.println("Computer value: ");
		Random r = new Random();
		int num = r.nextInt(10);
		
		System.out.println(num);
		if(Player1 == num) {
			System.out.println("Player1 won the Game..");
		}
		else if(Player2 == num) {
			System.out.println("Player2 won the Game..");
		}
		else{
			System.out.println("Computer won the Game..");
		}
		
		
	}

}
