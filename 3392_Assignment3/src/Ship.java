
public class Ship 
{
	private String Ship;
	private int Year;
	
	public Ship(String ship, int year) 
	{
		super();
		Ship = ship;
		Year = year;
	}
	public String getShip() 
	{
		return Ship;
	}
	public void setShip(String ship) 
	{
		Ship = ship;
	}
	public int getYear() 
	{
		return Year;
	}
	public void setYear(int year) 
	{
		Year = year;
	}
	public String toString(){
		return "Name: " + getShip() + "\nYear built: " + getYear();
	}
}
