
public class Automobile extends Vehicle
{
	private String licensePlate;
	private String make;
	
	public Automobile()
	{
	}
    public Automobile(int year,double weight,String licensePlate,String make) 
	{
		this.licensePlate = licensePlate;
		this.make = make;
	}
	public String getLicensePlate()
	{
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate)
	{
	}
	public String getMake()
	{
		return make;
	}
	public void setMake(String make)
	{
	}
	public String toString()
	{
		String auto = "License Plate: " + licensePlate + "Make: " + make;
		return auto;
	}
}
