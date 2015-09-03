import java.util.Scanner;
public class TestEssay 
{
	public static void main(String [] args)
	{
		int spelling;
		int grammer;
		int content;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter your score for spelling: ");
		spelling = input.nextInt();
		
		System.out.print("Enter your score for grammer: ");
		grammer = input.nextInt();
		
		System.out.print("Enter your score for content: ");
		content = input.nextInt();
		
	    TestEssay essay = new TestEssay();
	    
	    System.out.print("Your spelling score: " + essay.getSpelling());
	    System.out.print("Your grammer score: " + essay.getGrammer());
	    System.out.print("Your content score: " + essay.getContent());
	    
	    
		
	
	}
	

}
