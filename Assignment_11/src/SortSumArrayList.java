import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class SortSumArrayList 
{
	public static void main (String [] args)
	{
		ArrayList <Integer> NumList = new ArrayList<Integer>();
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Please enter a number: ");
			NumList.add(input.nextInt());
		}
		System.out.println("The numbers are: ");
		
		for(int i = 0; i < NumList.size(); i++)
		{
			System.out.print(NumList.get(i) + " ");
		}
		System.out.println("\n");
		System.out.println("Here are the numbers sorted:");
		
		Collections.sort(NumList);
			
		for(int counter: NumList)
		{
			System.out.print(counter + " ");
		}
		System.out.println("\n");
		System.out.println("Here is the sum of the numbers: " + sum(NumList));
	}
	public static int sum(ArrayList<Integer> list)
	{
		int sum = 0;
		for(int i = 0; i< list.size(); i++)
		{
			sum = sum + ((int) list.get(i));
		}
		return sum;
	}
}
