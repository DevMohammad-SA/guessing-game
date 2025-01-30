import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Welcome to The Guessing Game =)");
		System.out.println("Choose the difficulty:\n1. Easy\n2. Normal\n3. Hard");
		int difficulty = scanner.nextInt ();
		Random random = new Random();
	
		int max_guessing_number;
		int random_int;
		max_guessing_number = switch (difficulty) {
			case 1 -> 10;
			case 2 -> 50;
			case 3 -> 100;
			default -> {
				System.out.println ("Wrong choice, defaulting to Easy mode.");
				yield 10;
			}
		};
		
		// Generate a random number in the range [0,max_guessing_number]
		random_int = random.nextInt(max_guessing_number+1);
		System.out.printf("Guess a number between 0 and %d%n",max_guessing_number);
		int guess = scanner.nextInt();
		
		
		while(guess != random_int){
			if (guess > random_int){
				System.out.println("Too high! Try again.");
			} else {
				System.out.println("Too low! try again.");
			}
			guess = scanner.nextInt();
		}
		System.out.println ("Correct! You guessed the number!");
		scanner.close();
	}
}