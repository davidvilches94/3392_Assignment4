
public class ShipArray 
{
	public static void main (String [] args)
	{
		Ship[] ships = new Ship[3];
		
		
		ships[0] = new CargoShip("Black Pearl", 50000);
		ships[1] = new Ship("Trimuph", 1960);
		ships[2] = new CruiseShip("Disney Magic", 2400);
		
		for(int i = 0; i < ships.length; i++)
		{
			ships[i].toString();
		}
	}
}
