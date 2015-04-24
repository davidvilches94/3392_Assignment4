import java.util.Scanner;
public class Lottery 
{
	public static void getvalues(int[] array)
	{
		int[]userValues = new int[5];
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a series of " +userValues.length+ " numbers:");
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.print("Enter number " +(i + 1)+ ": ");
			array[i] = input.nextInt();
		}
	}
	public static void compareNumbers(int[] array)
	{
		int matches = 0;
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array.length; j++)
			{
			    if(array[i] == array[j])
			    {
				     matches += 1;
			    }
			}
		}
		System.out.println("You matched " +matches+ " numbers");
	}
	public static void main(String[] args) 
	{
		
		int[]Lottery = new int[5];
		int randomnum;
		
		getvalues(Lottery);
	
		System.out.println("The Lottery numbers are: ");
		for(int i = 0; i < 5; i++)
		{
			randomnum = (int) (Math.random() * 10);
			Lottery[i] = randomnum;
		}
		for (int i = 0; i < Lottery.length; i++)
		    System.out.print(Lottery[i]+" ");
		    System.out.print("\n");
		
		compareNumbers(Lottery);
     }  
}
