import java.util.Scanner;
public class TestInteger {
public static void main (String [] args){
		
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a value: ");
		int value = input.nextInt();
		
		
		System.out.println("Is value Even? "+ MyInteger.isEven(value));
		
		System.out.println("Is value Odd? " + MyInteger.isOdd(value));
		
		System.out.println("Is value Prime? " + MyInteger.isPrime(value));
		
	}

}
