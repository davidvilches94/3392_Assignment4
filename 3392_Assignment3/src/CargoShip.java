
public class CargoShip extends Ship
{
	private int cargo;
	
	public CargoShip(String ship, int year) 
	{
		super(ship, year);
	}
	public int getCargo() 
	{
		return cargo;
	}
    public void setCargo(int cargo) 
	{
		this.cargo = cargo;
	}
	public String toString()
	{
		return "Name: " + getShip() + "\nCargo Capacity: " + getCargo() + "tons";
	}
	

}
