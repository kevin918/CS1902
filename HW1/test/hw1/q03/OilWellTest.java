package hw1.q03;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author baylor
 */
public class OilWellTest
{
	@Test
    public void testConstructor()
	{
		OilWell instance = new OilWell(10, 5);
		int expectedInt = 10;
		int actualInt   = instance.getDailyVolume();
		assertEquals("gallons per day", expectedInt, actualInt);
		double expectedDouble = 5;
		double actualDouble   = instance.getPricePerGallon();
		assertEquals("price per gallon", expectedDouble, actualDouble, 0);

		instance = new OilWell(3, 2.50);
		expectedInt = 3;
		actualInt   = instance.getDailyVolume();
		assertEquals("gallons per day", expectedInt, actualInt);
		expectedDouble = 2.50;
		actualDouble   = instance.getPricePerGallon();
		assertEquals("price per gallon", expectedDouble, actualDouble, 0);
    }

	@Test
	public void testGetDailyValue()
	{
		OilWell instance = new OilWell(10, 5);
		double expected  = 50;
		double actual    = instance.getDailyValue();
		assertEquals("10*5", expected, actual, 0.1);

		instance.setDailyVolume(20);
		expected = 100;
		actual   = instance.getDailyValue();
		assertEquals("20*5", expected, actual, 0.1);

		instance.setDailyVolume(15);
		instance.setPricePerGallon(2.75);
		expected = 41.25;
		actual   = instance.getDailyValue();
		assertEquals(expected, actual, 0.1);
	}

	@Test
	public void testGetAndSetDailyVolume()
	{
		OilWell instance = new OilWell(10, 5);
		int expected = 10;
		int actual   = instance.getDailyVolume();
		assertEquals(expected, actual);

		instance.setDailyVolume(20);
		expected = 20;
		actual   = instance.getDailyVolume();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetMonthlyValue()
	{
		OilWell instance = new OilWell(10, 5);
		double expected  = 1500;
		double actual    = instance.getMonthlyValue();
		assertEquals("10*5*30", expected, actual, 0.1);

		instance.setDailyVolume(20);
		expected = 3000;
		actual   = instance.getMonthlyValue();
		assertEquals(expected, actual, 0.1);

		instance.setPricePerGallon(2.50);
		expected = 1500;
		actual   = instance.getMonthlyValue();
		assertEquals(expected, actual, 0.1);

		instance.setDailyVolume(10);
		instance.setPricePerGallon(1.6675);
		expected = 500.25;
		actual   = instance.getMonthlyValue();
		assertEquals(expected, actual, 0.1);
	}

	@Test
	public void testGetAndSetPricePerGallon()
	{
		OilWell instance = new OilWell(10, 2.50);
		double expected = 2.50;
		double actual   = instance.getPricePerGallon();
		assertEquals(expected, actual, 0.1);

		instance.setPricePerGallon(15.75);
		expected = 15.75;
		actual   = instance.getPricePerGallon();
		assertEquals(expected, actual, 0.1);
	}
}