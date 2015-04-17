import java.util.Scanner;
public class Array 
{
	
	public static void main(String [] args)
	{
		
		int ArraySize = 5; 
		int[] numbers = new int[ArraySize];
		
		getValues(numbers);
		showHighestANDLowest(numbers);
		showTotal(numbers);
		showAverage(numbers);
	}
	public static void getValues(int[] array)
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a series of "+array.length+ " numbers.");
		
		for (int index = 0; index < array.length; index++)
		{
			System.out.print("Enter number "+(index + 1)+ ": ");
			array[index] = input.nextInt();
		}
	}
	public static void showHighestANDLowest(int[] array)
	{
		int max = array[0];
		int min = array[0];
		for(int i = 0; i < array.length; i++ )
		{
			if(array[i]<min)
			{
				min = array[i];
			}
			else if(array[i]>max)
			{
				max = array[i];
			}
		}
		System.out.println("The Highest number is: "+max);
		System.out.println("The Lowest number is: "+min);
	}
	public static void showTotal(int[] array)
	{
		int sum = 0;
		for(int num : array)
		{
			 sum = sum+num;
		}
		System.out.println("The sum of the array is: "+ sum);
	}
	public static void showAverage(int[] array)
	{
		double sum = 0;
		for(int i = 0; i < array.length; i++)
		{
			sum = sum + array[i];
		}
		double average = sum / array.length;
		System.out.println("The average of the array is: "+ average);
	}
}