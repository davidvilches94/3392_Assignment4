
public class Car extends Automobile
{
	private int maxPassengers;
	
	public Car()
	{
	}
	public Car(int year,double weight,String licensePlate,String make,int maxPassengers)
	{
		this.maxPassengers = maxPassengers;
	}
	public int getMaxPassengers()
	{
		return maxPassengers;
	}
	public void setMaxPassengers(int maxPassengers)
	{
	}
	public String toString()
	{
		String car = "Max Passengers: " + maxPassengers;
		return car;
	}
}
