/**
 * 
 * @author Mahfujur Rahman
 *created: 1.29.20
 *description: This program calculates the Birth Year
 *
 **/
import java.util.Scanner;
public class FirstProgram {
public static void main(String[] args) {

	Scanner keyboard = new Scanner(System.in);
	System.out.println("Welcome To My First" +
		"Program \nThis program calculates the Birth Year");
	System.out.print("Enter Your Age:");
	int age = keyboard.nextInt();

	int birthYear = 2020-age;
	System.out.println("You are most likely to be born in " + birthYear);
	}
}