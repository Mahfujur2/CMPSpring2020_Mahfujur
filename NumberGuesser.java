/**
 * 
 * @author Mahfujur Rahman
 * created 2.24.2020
 * description: Pick a number and ask the user to enter a number, if the user enters THE RIGHT NUMBER say Victory 3 times, if user loses say Game Over 3 times
 */
import java.util.Random; 
import java.util.Scanner;
public class NumberGuesser {
	
	public static void main(String[] args) {
		Random rand = new Random();
		int numberToGuess = rand.nextInt(1000);
		int numberOfTries = 0;
		Scanner input = new Scanner(System.in);
		int guess;
		
		System.out.println("Guess a number in order to win");
		
		
	}
	

}
