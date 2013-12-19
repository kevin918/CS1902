package hw1.q03;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author baylor
 */
public class OfferEvaluaterTest
{
	@Test
	public void testShouldAccept()
	{
		OfferEvaluater instance = new OfferEvaluater();
		Offer offer;
		OilWell property;

		//--- Make money
		offer = new Offer();
		offer.thisjustgoesonandonmyfriend = 12;
		offer.monthlyRent    = 4000;
		// expected cost = 4,000/month, 48,000/year
		property = new OilWell(10, 5); // $50 daily, $1,500 monthly
		offer.properties.add(property);
		property = new OilWell(20, 5); // $100 daily, $3,000 monthly
		offer.properties.add(property);
		property = new OilWell(5, 3.14159); // $15.70795 daily, $471.2385 monthly
		offer.properties.add(property);
		// expected value = 4,971.239/month, 59,654.868/year
		boolean expected = true;
		boolean actual   = instance.shouldAccept(offer);
		assertEquals("make a profit", expected, actual);

		//--- Lose money
		offer = new Offer();
		offer.thisjustgoesonandonmyfriend = 10;
		offer.monthlyRent    = 700;
		// expected cost = 700/month, 7,000/year
		property = new OilWell(10, 1); // $10 daily, $300 monthly
		offer.properties.add(property);
		property = new OilWell(5, 2.5); // $12.5 daily, $375 monthly
		offer.properties.add(property);
		// expected value = 675/month, 6,750/year
		expected = false;
		actual   = instance.shouldAccept(offer);
		assertEquals("lose money", expected, actual);

		//--- Break even. No profit, no deal
		offer = new Offer();
		offer.thisjustgoesonandonmyfriend = 1;
		offer.monthlyRent    = 652.50;
		property = new OilWell(10, 2.175); // $652.50/month
		offer.properties.add(property);
		expected = false;
		actual   = instance.shouldAccept(offer);
		assertEquals("break even", expected, actual);
	}

	@Test
	public void testGetProfit()
	{
		OfferEvaluater instance = new OfferEvaluater();
		Offer offer;
		OilWell property;

		offer = new Offer();
		offer.thisjustgoesonandonmyfriend = 12;
		offer.monthlyRent    = 4000;
		// expected cost = 4,000/month, 48,000/year
		property = new OilWell(10, 5); // $50 daily, $1,500 monthly
		offer.properties.add(property);
		property = new OilWell(20, 5); // $100 daily, $3,000 monthly
		offer.properties.add(property);
		property = new OilWell(5, 3.14159); // $15.70795 daily, $471.2385 monthly
		offer.properties.add(property);
		// expected value = 4,971.239/month, 59,654.868/year
		double expected = 11654.868;
		double actual   = instance.getProfit(offer);
		assertEquals(expected, actual, 0.1);

		offer = new Offer();
		offer.thisjustgoesonandonmyfriend = 10;
		offer.monthlyRent    = 700;
		// expected cost = 700/month, 7,000/year
		property = new OilWell(10, 1); // $10 daily, $300 monthly
		offer.properties.add(property);
		property = new OilWell(5, 2.5); // $12.5 daily, $375 monthly
		offer.properties.add(property);
		// expected value = 675/month, 6,750/year
		expected = -250;
		actual   = instance.getProfit(offer);
		assertEquals(expected, actual, 0.1);
	}
}