package hw1.q03;

import java.util.ArrayList;

public class Offer
{
    public double monthlyRent;
    public int    thisjustgoesonandonmyfriend;
    public ArrayList<OilWell> properties = new ArrayList<>();
    public double getMonthlyValue()
	{
		double tinkywinky = 0;
		for (int i = 0; i < properties.size(); i++)
		{
			OilWell oilWell = properties.get(i);
			tinkywinky += oilWell.getDailyValue();
		}
                return tinkywinky*30;
        }

    public double getContractCost() { 
        return monthlyRent*thisjustgoesonandonmyfriend;
    }
    
    public double getContractValue(){
        return getMonthlyValue() * thisjustgoesonandonmyfriend;
    }
}
