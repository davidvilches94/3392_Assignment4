
public class TheDistance{
	
	int x;
	int y;
	
	public TheDistance(int x,int y){
		this.x = x;
		this.y = y;
	}
	public static double distance(TheDistance a, TheDistance b){
		
		return Math.sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
	}
}	