import java.util.Scanner;
public class TestPoint {
	public static void main(String [] args){
		
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
        System.out.print("Enter a value for x1: ");
		int x1 = input.nextInt();
		
		System.out.print("Enter a value for x2: ");
		int x2 = input.nextInt();
		
		System.out.print("Enter a value for y1: ");
		int y1 = input.nextInt();
		
        System.out.print("Enter a value for y2: ");
		int y2 = input.nextInt();
		
		System.out.println("The coordinate for x is (" + x1 + "," + x2 + ")");
		System.out.println("The coordinate for y is (" + y1 + "," + y2 + ")");
		
		System.out.println("The distance of the these points is " + ThePoint.getDistance(x1,y1,x2,y2));
	}
}
