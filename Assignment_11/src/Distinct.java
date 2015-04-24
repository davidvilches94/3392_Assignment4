import java.util.Scanner;
public class Distinct 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] numbers = new int[10];
		
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		for(int index = 0; index < 10 ; index++)
		{
			
			System.out.print("Enter integer " + (index + 1) + ": ");
			numbers[index] = input.nextInt();
		}
		Distinct.Distinctnumbers(numbers);
		
	}
	public static void Distinctnumbers(int[]array)
	{
		System.out.println(" ");
		System.out.println("The Distinct numbers are:");
		
		 for(int i = 0;i < array.length;i++)
		 {
	            boolean isDistinct = false;
	            for(int j = 0;j < i;j++)
	            {
	                if(array[i] == array[j])
	                {
	                    isDistinct = true;
	                }
	            }
	            if(!isDistinct)
	            {
	            System.out.print(array[i]+" ");
	            }
	     }
	}
	
}

