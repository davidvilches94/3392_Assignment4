
public class MyInteger{
	
	int value;
	
	public static boolean isEven(int v){
	   return (v % 2 == 0); 
	}			
	public static boolean isOdd(int v){
	   return !isEven(v);
    }
	public static boolean isPrime(int v){	
	   for (int a = 2; a < v/2; a++)
		   if (v % a == 0){
			   return false;
		  }
	           return true;
          }
}