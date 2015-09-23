
public class LongDistanceBill extends PhoneBill
{
	private double callRate;
	
	public LongDistanceBill(double callRate)
	{
		this.callRate = callRate;
	}
	public double calculateBill(int time)
	{
		return callRate*time + getMonthlyRate();
	}
	public double getCallRate()
	{
		return callRate;
	}
}
