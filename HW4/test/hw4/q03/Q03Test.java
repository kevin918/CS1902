
package hw4.q03;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author baylor
 */
public class Q03Test
{

	@Test
	public void testGetSizePlentyOfSpace()
	{
		List<Puppy> puppies = getPuppies();
		MyHashTable<String, Puppy> instance = new MyHashTable<String, Puppy>(11, 10);

		for (int i = 0; i < 3; i++)
		{
			Puppy puppy = puppies.get(i);
			instance.put(puppy.name, puppy);
		}
		int expected = 3;
		int actual = instance.getSize();
		assertEquals("3 puppies", expected, actual);

		for (int i = 3; i < 7; i++)
		{
			Puppy puppy = puppies.get(i);
			instance.put(puppy.name, puppy);
		}
		expected = 7;
		actual = instance.getSize();
		assertEquals("7 puppies", expected, actual);

		for (int i = 7; i < 10; i++)
		{
			Puppy puppy = puppies.get(i);
			instance.put(puppy.name, puppy);
		}
		expected = 10;
		actual = instance.getSize();
		assertEquals("all the puppies!", expected, actual);
	}

	@Test
	public void testGetSizeNotMuchSpace()
	{
		List<Puppy> puppies = getPuppies();
		MyHashTable<String, Puppy> instance = new MyHashTable<String, Puppy>(5, 3);

		for (int i = 0; i < 3; i++)
		{
			Puppy puppy = puppies.get(i);
			instance.put(puppy.name, puppy);
		}
		int expected = 3;
		int actual = instance.getSize();
		assertEquals("3 puppies", expected, actual);

		for (int i = 3; i < 7; i++)
		{
			Puppy puppy = puppies.get(i);
			instance.put(puppy.name, puppy);
		}
		expected = 7;
		actual = instance.getSize();
		assertEquals("7 puppies", expected, actual);

		for (int i = 7; i < 10; i++)
		{
			Puppy puppy = puppies.get(i);
			instance.put(puppy.name, puppy);
		}
		expected = 10;
		actual = instance.getSize();
		assertEquals("all the puppies!", expected, actual);
	}

	@Test
	public void testGetSizeVeryLittleSpace()
	{
		List<Puppy> puppies = getPuppies();
		MyHashTable<String, Puppy> instance = new MyHashTable<String, Puppy>(1, 3);

		for (int i = 0; i < 3; i++)
		{
			Puppy puppy = puppies.get(i);
			instance.put(puppy.name, puppy);
		}
		int expected = 3;
		int actual = instance.getSize();
		assertEquals("3 puppies", expected, actual);

		for (int i = 3; i < 7; i++)
		{
			Puppy puppy = puppies.get(i);
			instance.put(puppy.name, puppy);
		}
		expected = 7;
		actual = instance.getSize();
		assertEquals("7 puppies", expected, actual);

		for (int i = 7; i < 10; i++)
		{
			Puppy puppy = puppies.get(i);
			instance.put(puppy.name, puppy);
		}
		expected = 10;
		actual = instance.getSize();
		assertEquals("all the puppies!", expected, actual);
	}

	@Test
	public void testContainsOnlyEntryInBucket()
	{
		MyHashTable<String, Puppy> instance = getBigPound();
		assertTrue("Testing puppies contain joker", instance.contains("joker"));
		assertTrue("Testing puppies contain Inigo", instance.contains("Inigo"));
		assertTrue("Testing puppies contain Bob", instance.contains("Bob"));
		assertTrue("Testing puppies contain Georganne", instance.contains("Georganne"));

	}

	@Test
	public void testContainsMultipleEntriesInBucket()
	{
		MyHashTable<String, Puppy> instance = getCrowdedPound();
		assertTrue("Testing puppies contain Carol", instance.contains("Carol"));
		assertTrue("Testing puppies contain Dogmeat", instance.contains("Dogmeat"));
		assertTrue("Testing puppies contain Eddie", instance.contains("Eddie"));
		assertTrue("Testing puppies contain Francois", instance.contains("Francois"));
	}

	@Test
	public void testContainsNotThere()
	{
		MyHashTable<String, Puppy> instance = getBigPound();
		assertFalse("Testing puppies do not contain alice", instance.contains("alice"));
		assertFalse("Testing puppies do not contain Brian", instance.contains("Brian"));
		assertFalse("Testing puppies do not contain cat", instance.contains("cat"));
	}

	@Test
	public void testGetOnlyEntryInBucket()
	{
		List<Puppy> puppies = getPuppies();
		MyHashTable<String, Puppy> instance = new MyHashTable<String, Puppy>(3, 10);
		for (Puppy puppy : puppies)
		{
			instance.put(puppy.name, puppy);
		}
		assertEquals("get joker", puppies.get(9), instance.get("joker"));
		assertEquals("get Inigo", puppies.get(8), instance.get("Inigo"));
		assertEquals("get Bob", puppies.get(1), instance.get("Bob"));
		assertEquals("get Georganne", puppies.get(6), instance.get("Georganne"));

	}

	@Test
	public void testgetMultipleEntriesInBucket()
	{
		List<Puppy> puppies = getPuppies();
		MyHashTable<String, Puppy> instance = new MyHashTable<String, Puppy>(1, 10);
		for (Puppy puppy : puppies)
		{
			instance.put(puppy.name, puppy);
		}
		assertEquals("get Carol", puppies.get(2), instance.get("Carol"));
		assertEquals("get Dogmeat", puppies.get(3), instance.get("Dogmeat"));
		assertEquals("get Eddie", puppies.get(4), instance.get("Eddie"));
		assertEquals("get Francois", puppies.get(5), instance.get("Francois"));
	}

	@Test
	public void testPutFirstEntryInBucket()
	{
		List<Puppy> puppies = getPuppies();
		MyHashTable<String, Puppy> instance = new MyHashTable<String, Puppy>(5, 10);

		Puppy puppy = puppies.get(2);
		instance.put(puppy.name, puppy);

		int expected = 1;
		int actual = instance.getSize();
		assertEquals("1 puppies", expected, actual);
		assertEquals("get Carol", puppies.get(2), instance.get("Carol"));
	}

	@Test
	public void testPutSecondEntryInBucket()
	{
		List<Puppy> puppies = getPuppies();
		MyHashTable<String, Puppy> instance = new MyHashTable<String, Puppy>(1, 10);

		Puppy puppy = puppies.get(2);
		instance.put(puppy.name, puppy);
		puppy = puppies.get(3);
		instance.put(puppy.name, puppy);

		int expected = 2;
		int actual = instance.getSize();
		assertEquals("2 puppies", expected, actual);
		assertEquals("get Carol", puppies.get(2), instance.get("Carol"));
		assertEquals("get Dogmeat", puppies.get(3), instance.get("Dogmeat"));
	}

	@Test
	public void testGetCapacity()
	{
		MyHashTable<String, Puppy> instance = getVeryBigPound();
		int expected = 11;
		int actual = instance.getCapacity();
		assertEquals("Capacity is 11", expected, actual);

		instance = getBigPound();
		expected = 8;
		actual = instance.getCapacity();
		assertEquals("Capacity is 8", expected, actual);

		instance = getCrowdedPound();
		expected = 5;
		actual = instance.getCapacity();
		assertEquals("Capacity is 5", expected, actual);

		instance = getVeryCrowdedPound();
		expected = 2;
		actual = instance.getCapacity();
		assertEquals("Capacity is 2", expected, actual);

		instance = getVeryCrowdedPoundThatGrows();
		expected = 5;
		actual = instance.getCapacity();
		assertEquals("Capacity is 23", expected, actual);

		instance = getVeryCrowdedPoundThatGrowsV2();
		expected = 3;
		actual = instance.getCapacity();
		assertEquals("Capacity is 3", expected, actual);
	}

	@Test
	public void testGetIndexOfBucket()
	{
		MyHashTable<String, Puppy> instance = getVeryBigPound();
		int expected = 6;
		int actual = instance.getIndexOfBucket("Dogmeat");
		assertEquals("Dogmeat's bucket", expected, actual);

		instance = getBigPound();
		expected = 1;
		actual = instance.getIndexOfBucket("Dogmeat");
		assertEquals("Dogmeat's bucket", expected, actual);

		instance = getCrowdedPound();
		expected = 0;
		actual = instance.getIndexOfBucket("Dogmeat");
		assertEquals("Dogmeat's bucket", expected, actual);

		instance = getVeryCrowdedPound();
		expected = 1;
		actual = instance.getIndexOfBucket("Dogmeat");
		assertEquals("Dogmeat's bucket", expected, actual);

		instance = getVeryCrowdedPoundThatGrows();
		expected = 0;
		actual = instance.getIndexOfBucket("Dogmeat");
		assertEquals("Dogmeat's bucket", expected, actual);

		instance = getVeryCrowdedPoundThatGrowsV2();
		expected = 0;
		actual = instance.getIndexOfBucket("Dogmeat");
		assertEquals("Dogmeat's bucket", expected, actual);;
	}

	@Test
	public void testGetKeys()
	{
		List<Puppy> puppies = getPuppies();
		MyHashTable<String, Puppy> instance = new MyHashTable<String, Puppy>(1, 10);

		for (int i = 0; i < 10; i++)
		{
			Puppy puppy = puppies.get(i);
			instance.put(puppy.name, puppy);
		}


		List<String> actual = instance.getKeys();
		assertEquals("Right number of keys", 10, instance.getSize());
		for (int i = 0; i < 10; i++)
		{
			assertTrue("Has puppy key " + puppies.get(i).name, actual.contains(puppies.get(i).name));
		}

		Puppy duplicate = puppies.get(1);
		instance.put(duplicate.name, duplicate);
		actual = instance.getKeys();
		assertEquals("Right number of keys after trying to add duplicate", 10, instance.getSize());
	}

	@Test
	public void testGetValues()
	{
		List<Puppy> puppies = getPuppies();
		MyHashTable<String, Puppy> instance = new MyHashTable<String, Puppy>(1, 10);

		for (int i = 0; i < 10; i++)
		{
			Puppy puppy = puppies.get(i);
			instance.put(puppy.name, puppy);
		}


		List<Puppy> actual = instance.getValues();
		assertEquals("Right number of keys", 10, instance.getSize());
		for (int i = 0; i < 10; i++)
		{
			assertTrue("Has puppy " + puppies.get(i).name, actual.contains(puppies.get(i)));
		}

		Puppy duplicate = puppies.get(1);
		instance.put(duplicate.name, duplicate);
		actual = instance.getValues();
		assertEquals("Right number of keys after trying to add duplicate", 10, instance.getSize());
	}

	@Test
	public void testGetKVP()
	{
		List<Puppy> puppies = getPuppies();
		MyHashTable<String, Puppy> instance = new MyHashTable<String, Puppy>(1, 10);

		for (int i = 0; i < 10; i++)
		{
			Puppy puppy = puppies.get(i);
			instance.put(puppy.name, puppy);
		}


		List<KeyValuePair<String, Puppy>> actual = instance.getKeyValuePairs();
		assertEquals("Right number of keys", 10, instance.getSize());
		for (KeyValuePair<String, Puppy> KVP : actual)
		{
			assertTrue("Has puppy key " + KVP.key, puppies.contains(KVP.value));
		}

		Puppy duplicate = puppies.get(1);
		instance.put(duplicate.name, duplicate);
		actual = instance.getKeyValuePairs();
		assertEquals("Right number of keys after trying to add duplicate", 10, instance.getSize());
	}

	@Test
	public void testRemoveOnlyEntryInBucket()
	{

		List<Puppy> puppies = getPuppies();
		MyHashTable<String, Puppy> instance = new MyHashTable<String, Puppy>(1, 10);

		for (int i = 0; i < 10; i++)
		{
			Puppy puppy = puppies.get(i);
			instance.put(puppy.name, puppy);
		}

		int expected = 10;
		int actual = instance.getSize();
		assertEquals("all the puppies!", expected, actual);

		instance.remove(puppies.get(9).name);
		expected = 9;
		actual = instance.getSize();
		assertEquals("Puppies after removing joker", expected, actual);
		assertFalse("Testing puppies do not contain joker", instance.contains("joker"));

		instance.remove(puppies.get(1).name);
		expected = 8;
		actual = instance.getSize();
		assertEquals("Puppies after removing Bob", expected, actual);
		assertFalse("Testing puppies do not contain Bob", instance.contains("Bob"));

		instance.remove(puppies.get(8).name);
		expected = 7;
		actual = instance.getSize();
		assertEquals("Puppies after removing Inigo", expected, actual);
		assertFalse("Testing puppies do not contain Inigo", instance.contains("Inigo"));

		instance.remove(puppies.get(6).name);
		expected = 6;
		actual = instance.getSize();
		assertEquals("Puppies after removing Georganne", expected, actual);
		assertFalse("Testing puppies do not contain Georganne", instance.contains("Georganne"));


	}

	@Test
	public void testRemoveMultipleEntriesInBucket()
	{

		List<Puppy> puppies = getPuppies();
		MyHashTable<String, Puppy> instance = new MyHashTable<String, Puppy>(1, 20);

		for (int i = 0; i < 10; i++)
		{
			Puppy puppy = puppies.get(i);
			instance.put(puppy.name, puppy);
		}

		int expected = 10;
		int actual = instance.getSize();
		assertEquals("all the puppies!", expected, actual);

		instance.remove(puppies.get(3).name);
		expected = 9;
		actual = instance.getSize();
		assertEquals("Puppies after removing Dogmeat", expected, actual);
		assertFalse("Testing puppies do not contain Dogmeat", instance.contains("Dogmeat"));

		instance.remove(puppies.get(5).name);
		expected = 8;
		actual = instance.getSize();
		assertEquals("Puppies after removing Francois", expected, actual);
		assertFalse("Testing puppies do not contain Francois", instance.contains("Francois"));

		instance.remove(puppies.get(2).name);
		expected = 7;
		actual = instance.getSize();
		assertEquals("Puppies after removing Carol", expected, actual);
		assertFalse("Testing puppies do not contain Carol", instance.contains("Carol"));

		instance.remove(puppies.get(4).name);
		expected = 6;
		actual = instance.getSize();
		assertEquals("Puppies after removing Eddie", expected, actual);
		assertFalse("Testing puppies do not contain Eddie", instance.contains("Eddie"));
	}

	@Test
	public void testRemoveFromCrowdedPound()
	{

		List<Puppy> puppies = getPuppies();
		MyHashTable<String, Puppy> instance = new MyHashTable<String, Puppy>(1, 20);

		for (int i = 0; i < 10; i++)
		{
			Puppy puppy = puppies.get(i);
			instance.put(puppy.name, puppy);
		}

		int expected = 10;
		int actual = instance.getSize();
		assertEquals("all the puppies!", expected, actual);

		for (int i = 0; i < 10; i++)
		{
			Puppy puppy = puppies.get(i);
			instance.remove(puppy.name);
		}

		expected = 0;
		actual = instance.getSize();
		assertEquals("all puppies removed!", expected, actual);

		for (int i = 0; i < 10; i++)
		{
			Puppy puppy = puppies.get(i);
			assertFalse("Testing puppies do not contain " + puppy.name, instance.contains(puppy.name));
		}



	}

	/**
	 * **********************************************************************
	 * UTILITIES
	 * **********************************************************************
	 */
	//<editor-fold defaultstate="collapsed" desc="sample data">
	private MyHashTable<String, Puppy> getBigPound()
	{
		List<Puppy> puppies = getPuppies();
		MyHashTable<String, Puppy> pound = new MyHashTable<String, Puppy>(8, 3);
		for (Puppy puppy : puppies)
		{
			pound.put(puppy.name, puppy);
		}
		return pound;
	}

	private MyHashTable<String, Puppy> getVeryBigPound()
	{
		List<Puppy> puppies = getPuppies();
		MyHashTable<String, Puppy> pound = new MyHashTable<String, Puppy>(11, 10);
		for (Puppy puppy : puppies)
		{
			pound.put(puppy.name, puppy);
		}
		return pound;
	}

	private MyHashTable<String, Puppy> getCrowdedPound()
	{
		List<Puppy> puppies = getPuppies();
		MyHashTable<String, Puppy> pound = new MyHashTable<String, Puppy>(5, 10);
		for (Puppy puppy : puppies)
		{
			pound.put(puppy.name, puppy);
		}
		return pound;
	}

	private MyHashTable<String, Puppy> getVeryCrowdedPound()
	{
		List<Puppy> puppies = getPuppies();
		MyHashTable<String, Puppy> pound = new MyHashTable<String, Puppy>(2, 20);
		for (Puppy puppy : puppies)
		{
			pound.put(puppy.name, puppy);
		}
		return pound;
	}

	private MyHashTable<String, Puppy> getVeryCrowdedPoundThatGrows()
	{
		List<Puppy> puppies = getPuppies();
		MyHashTable<String, Puppy> pound = new MyHashTable<String, Puppy>(2, 2);
		for (Puppy puppy : puppies)
		{
			pound.put(puppy.name, puppy);
		}
		return pound;
	}

	private MyHashTable<String, Puppy> getVeryCrowdedPoundThatGrowsV2()
	{
		List<Puppy> puppies = getPuppies();
		MyHashTable<String, Puppy> pound = new MyHashTable<String, Puppy>(2, 4);
		for (Puppy puppy : puppies)
		{
			pound.put(puppy.name, puppy);
		}
		return pound;
	}

	private List<Puppy> getPuppies()
	{
		List<Puppy> puppies = new ArrayList<>();

		puppies.add(new Puppy("Alice", "alsatian", 5, 4, 6, true));
		puppies.add(new Puppy("Bob", "bulldog", 8, 2, 3, true));
		puppies.add(new Puppy("Carol", "cocker spaniel", 3, 4, 6, false));
		puppies.add(new Puppy("Dogmeat", "mutt", 10, 4, 2, true));
		puppies.add(new Puppy("Eddie", "chihuahua", 15, 1, 10, false));
		puppies.add(new Puppy("Francois", "poodle", 2, 3, 10, false));
		puppies.add(new Puppy("Georganne", "unicorn", 26, 9, 1, true));
		puppies.add(new Puppy("Huckleberry", "hound", 50, 5, 3, true));
		puppies.add(new Puppy("Inigo", "doberman", 5, 9, 3, true));
		puppies.add(new Puppy("joker", "dalmation", 7, 8, 8, true));

		return puppies;
	}
	//</editor-fold>
}
