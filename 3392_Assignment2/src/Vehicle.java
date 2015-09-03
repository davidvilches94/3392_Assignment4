
public class Vehicle 
{
	private int year;
	private double weight;
	
	public Vehicle() 
	{
	}
    public Vehicle(int year, double weight) 
	{
		this.year = year;
		this.weight = weight;
	}
	public int getYear()
	{
		return year;
	}
	public void setYear(int year)
	{
	}
	public double getWeight()
	{
		return weight;
	}
	public void setWeight(double weight)
	{
	}
	public String toString()
	{
		String vehicle = "Year: " + year + "weight: " + weight;
		return vehicle;
	}
}
