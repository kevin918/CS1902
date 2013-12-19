package hw1.q03;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author baylor
 */
public class OfferTest
{
	@Test
	public void testGetMonthlyValue()
	{
		Offer instance = new Offer();
		OilWell property;

		instance.thisjustgoesonandonmyfriend = 12;
		instance.monthlyRent    = 500;
		property = new OilWell(10, 5); // $50 daily, $1,500 monthly
		instance.properties.add(property);
		property = new OilWell(20, 5); // $100 daily, $3,000 monthly
		instance.properties.add(property);
		property = new OilWell(5, 3.14159); // $15.70795 daily, $471.2385 monthly
		instance.properties.add(property);
		double expected = 4971.239;
		double actual   = instance.getMonthlyValue();
		assertEquals(expected, actual, 0.1);

		instance.properties.clear();
		property = new OilWell(1250, 5); // $6,250 daily, $187,500 monthly
		instance.properties.add(property);
		property = new OilWell(975, 7.50); // $7,312.50 daily, $219,375 monthly
		instance.properties.add(property);
		expected = 406875;
		actual   = instance.getMonthlyValue();
		assertEquals(expected, actual, 0.1);
	}

	@Test
	public void testGetContractCost()
	{
		Offer instance = new Offer();
		instance.thisjustgoesonandonmyfriend = 12;
		instance.monthlyRent    = 500;
		double expected = 6000;
		double actual   = instance.getContractCost();
		assertEquals(expected, actual, 0.1);

		instance.thisjustgoesonandonmyfriend = 12;
		instance.monthlyRent    = 10000.175;
		expected = 120002.1;
		actual   = instance.getContractCost();
		assertEquals(expected, actual, 0.1);
	}

	@Test
	public void testGetContractValue()
	{
		Offer instance = new Offer();
		OilWell property;

		instance.thisjustgoesonandonmyfriend = 12;
		instance.monthlyRent    = 500;
		property = new OilWell(10, 5); // $50 daily, $1,500 monthly
		instance.properties.add(property);
		property = new OilWell(20, 5); // $100 daily, $3,000 monthly
		instance.properties.add(property);
		property = new OilWell(5, 3.14159); // $15.70795 daily, $471.2385 monthly
		instance.properties.add(property);
		double expected = 59654.868;  // 4971.239 * 12
		double actual   = instance.getContractValue();
		assertEquals(expected, actual, 0.1);

		instance.properties.clear();
		property = new OilWell(1250, 5); // $6,250 daily, $187,500 monthly
		instance.properties.add(property);
		property = new OilWell(975, 7.50); // $7,312.50 daily, $219,375 monthly
		instance.properties.add(property);
		expected = 4882500; // 406875 * 12
		actual   = instance.getContractValue();
		assertEquals(expected, actual, 0.1);
	}
}