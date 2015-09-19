
public class CruiseShip extends Ship

{
	private int maxNumPassangers;
	
	public CruiseShip(String ship, int year) 
	{
		super(ship, year);
	}
	public int getMaxNumPassangers() 
	{
		return maxNumPassangers;
	}
    public void setMaxNumPassangers(int maxNumPassangers) 
	{
		this.maxNumPassangers = maxNumPassangers;
	}
	public String toString()
	{
		return "Name: " + getShip() + "\nMax passengers: " + getMaxNumPassangers();
	}
}
