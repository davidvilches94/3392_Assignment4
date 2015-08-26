
public class ThePoint {

	private int x_coord;
	private int y_coord;
	
	public ThePoint() {
		x_coord = 0;
		y_coord = 0;
	}
	
	public ThePoint(int x_coord, int y_coord){
		this.x_coord = x_coord;
		this.y_coord = y_coord;
	}
	
	public int getx_coord(){
		return x_coord;
	}
	public int gety_coord(){
		return y_coord;
	}
	
	public static double getDistance(int x1, int y1, int x2, int y2){
		double distance = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		return distance;
	}
  
}
	

