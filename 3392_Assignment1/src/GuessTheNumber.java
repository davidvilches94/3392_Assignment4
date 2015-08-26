import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber {
public static void main(String [] args){
		
		int user_input = 0;
		int random_number;
		int guess = 0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Random number_gen = new Random();
		
		
		System.out.print("Enter a number between 1 and 1000: ");
		user_input = input.nextInt();
				
		random_number = number_gen.nextInt(1000) +1;
		
		while (user_input != random_number){
		
		if (user_input > random_number){
			System.out.print("Too High, Try again ");
		    user_input = input.nextInt();
		}
		else if (user_input < random_number){
			System.out.print("Too Low, Try again ");
		    user_input = input.nextInt();
	    }
		guess++;
	    }
		System.out.println("You guessed it right! It took you " + guess + " tries.");
		}
		
		
	}


