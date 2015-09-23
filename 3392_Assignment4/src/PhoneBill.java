
public abstract class PhoneBill 
{
	private double monthlyRate;
	
	public PhoneBill()
	{
	}
	public PhoneBill(double monthlyRate)
	{
		this.monthlyRate = monthlyRate;
	}
	public void setMonthlyRate(double rate)
	{
		this.monthlyRate = rate;
    }
	public double getMonthlyRate()
	{
		return monthlyRate;
	}
	public abstract double calculateBill(int time);
}

