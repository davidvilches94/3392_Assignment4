
public class Truck extends Automobile
{
	private double towCapacity;
	
	public Truck()
	{
	}
	public Truck(int year,double weight,String licensePlate,String make,double towCapacity)
	{
		this.towCapacity = towCapacity;
	}
	public double getTowCapacity()
	{
		return towCapacity;
	}
	public void setTowCapacity(double towCapacity)
	{
	}
	public String toString()
	{
		String truck = "Tow Capacity: " + towCapacity;
		return truck;
	}
}
