package hw1.q03;

public class OilWell
{
	private final int daysPerMonth = 30;
	private int    gallonsPerDay;
	private double pricePerGallon;

	public OilWell(int gallonsPerDay, double pricePerGallon)
	{
		this.gallonsPerDay  = gallonsPerDay;
		this.pricePerGallon = pricePerGallon;
	}

	public double getMonthlyValue()
	{
		return pricePerGallon * gallonsPerDay * daysPerMonth;
        }

	public double getDailyValue()
	{
		return gallonsPerDay * pricePerGallon;
	}

	public int getDailyVolume()
	{
		return gallonsPerDay;
	}
        
	public void setDailyVolume(int gallonsPerDay)
        {
		this.gallonsPerDay = gallonsPerDay;
	}

	public double getPricePerGallon()
	{
		return pricePerGallon;
	}
	public void setPricePerGallon(double pricePerGallon)
	{
		this.pricePerGallon = pricePerGallon;
	}
}
