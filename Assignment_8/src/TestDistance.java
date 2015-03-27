import java.util.Scanner;
public class TestDistance {
	public static void main(String[] args){
		
	Scanner input = new Scanner(System.in);
	
	TheDistance p1 = new TheDistance(0,0);
	System.out.print("Enter point 1: ");
	int x1 = input.nextInt();
	
	TheDistance p2 = new TheDistance(0,0);
	System.out.print("Enter point 2: ");
	int x2 = input.nextInt();
	
	System.out.println("Distance between the two points is: " + distance);
	
	}
}
