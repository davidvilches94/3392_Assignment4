import java.util.Scanner;
public class TestPhoneBill 
{

	public static void main(String[] args) 
	{
		double callRate;
		double monthlyRate;
		int time;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program will calculate your phone bill for you");
		System.out.println("What is your call rate? ");
		callRate = input.nextDouble();
		LongDistanceBill bill = new LongDistanceBill(callRate);
		
		System.out.println("What is your monthly rate? ");
		monthlyRate = input.nextDouble();
		bill.setMonthlyRate(monthlyRate); 
		
		System.out.println("How many minutes did you talk");
		time = input.nextInt();
		
		System.out.println("Your monthly bill is $" + bill.calculateBill(time));
				
	}
}
