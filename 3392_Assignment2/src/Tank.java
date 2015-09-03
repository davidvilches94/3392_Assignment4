
public class Tank extends Vehicle
{
	private double armorWidth;

	public Tank() 
	{
	}
	public Tank(int year, double weight, double armorWidth)
	{
		this.armorWidth = armorWidth;
	}
	public double getArmorWidth()
	{
		return armorWidth;
	}
	public void setArmorWidth(double armorWidth)
	{
	}
	public String toString()
	{
		String tank = "Armor Width: " + armorWidth;
		return tank;
	}
}
