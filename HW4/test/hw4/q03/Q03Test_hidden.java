package hw4.q03;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author shakil
 */
public class Q03Test_hidden {

    @Test
    public void testGetSizePlentyOfSpace()
    {
        List<Dino_hidden> dinos = getDinos();
        MyHashTable<String, Dino_hidden> instance = new MyHashTable<String, Dino_hidden>(14, 13);

        for (int i = 0; i < 4; i++)
        {
            Dino_hidden dino = dinos.get(i);
            instance.put(dino.name, dino);
        }
        int expected = 4;
        int actual = instance.getSize();
        assertEquals("3 dinos", expected, actual);

        for (int i = 4; i < 7; i++)
        {
            Dino_hidden dino = dinos.get(i);
            instance.put(dino.name, dino);
        }
        expected = 7;
        actual = instance.getSize();
        assertEquals("7 dinos", expected, actual);

        for (int i = 7; i < 13; i++)
        {
            Dino_hidden dino = dinos.get(i);
            instance.put(dino.name, dino);
        }
        expected = 13;
        actual = instance.getSize();
        assertEquals("all the dinos!", expected, actual);
    }

    @Test
    public void testGetSizeNotMuchSpace()
    {
        List<Dino_hidden> dinos = getDinos();
        MyHashTable<String, Dino_hidden> instance = new MyHashTable<String, Dino_hidden>(5, 3);

        for (int i = 0; i < 4; i++)
        {
            Dino_hidden dino = dinos.get(i);
            instance.put(dino.name, dino);
        }
        int expected = 4;
        int actual = instance.getSize();
        assertEquals("3 dinos", expected, actual);

        for (int i = 4; i < 7; i++)
        {
            Dino_hidden dino = dinos.get(i);
            instance.put(dino.name, dino);
        }
        expected = 7;
        actual = instance.getSize();
        assertEquals("7 dinos", expected, actual);

        for (int i = 7; i < 13; i++)
        {
            Dino_hidden dino = dinos.get(i);
            instance.put(dino.name, dino);
        }
        expected = 13;
        actual = instance.getSize();
        assertEquals("all the dinos!", expected, actual);
    }

    @Test
    public void testGetSizeVeryLittleSpace()
    {
        List<Dino_hidden> dinos = getDinos();
        MyHashTable<String, Dino_hidden> instance = new MyHashTable<String, Dino_hidden>(1, 4);

        for (int i = 0; i < 4; i++)
        {
            Dino_hidden dino = dinos.get(i);
            instance.put(dino.name, dino);
        }
        int expected = 4;
        int actual = instance.getSize();
        assertEquals("4 dinos", expected, actual);

        for (int i = 4; i < 7; i++)
        {
            Dino_hidden dino = dinos.get(i);
            instance.put(dino.name, dino);
        }
        expected = 7;
        actual = instance.getSize();
        assertEquals("7 dinos", expected, actual);

        for (int i = 7; i < 13; i++)
        {
            Dino_hidden dino = dinos.get(i);
            instance.put(dino.name, dino);
        }
        expected = 13;
        actual = instance.getSize();
        assertEquals("all the dinos!", expected, actual);
    }
    
    @Test
    public void testContainsOnlyEntryInBucket()
    {
        MyHashTable<String, Dino_hidden> instance = getBigPark();
        assertTrue("Testing dinos contain T-rex", instance.contains("T-rex"));
        assertTrue("Testing dinos contain Stegosaurus", instance.contains("Stegosaurus"));
        assertTrue("Testing dinos contain Allosaurus", instance.contains("Allosaurus"));
        assertTrue("Testing dinos contain Archeopteryx", instance.contains("Archeopteryx"));

    }

    @Test
    public void testContainsMultipleEntriesInBucket()
    {
        MyHashTable<String, Dino_hidden> instance = getCrowdedPark();
        assertTrue("Testing dinos contain Ankylosaurus", instance.contains("Ankylosaurus"));
        assertTrue("Testing dinos contain Spinosaurus", instance.contains("Spinosaurus"));
        assertTrue("Testing dinos contain Velociraptor", instance.contains("Velociraptor"));
        assertTrue("Testing dinos contain Dilophosaurus", instance.contains("Dilophosaurus"));
    }
    
    @Test
    public void testContainsNotThere()
    {
        MyHashTable<String, Dino_hidden> instance = getBigPark();
        assertFalse("Testing dinos do not contain alice", instance.contains("alice"));
        assertFalse("Testing dinos do not contain Brian", instance.contains("Brian"));
        assertFalse("Testing dinos do not contain cat", instance.contains("cat"));
    }
    
    @Test
    public void testGetOnlyEntryInBucket()
    {
        List<Dino_hidden> dinos = getDinos();
        MyHashTable<String, Dino_hidden> instance = new MyHashTable<String, Dino_hidden>(3, 13);
        for (Dino_hidden dino : dinos)
        {
            instance.put(dino.name, dino);
        }
        assertEquals("get Giganotosaurus", dinos.get(10), instance.get("Giganotosaurus"));
        assertEquals("get Dilophosaurus", dinos.get(9), instance.get("Dilophosaurus"));
        assertEquals("get Triceratops", dinos.get(1), instance.get("Triceratops"));
        assertEquals("get Spinosaurus", dinos.get(4), instance.get("Spinosaurus"));

    }
    
    @Test
    public void testgetMultipleEntriesInBucket()
    {
        List<Dino_hidden> dinos = getDinos();
        MyHashTable<String, Dino_hidden> instance = new MyHashTable<String, Dino_hidden>(1, 13);
        for (Dino_hidden dino : dinos)
        {
            instance.put(dino.name, dino);
        }
        assertEquals("get Spinosaurus", dinos.get(4), instance.get("Spinosaurus"));
        assertEquals("get Archeopteryx", dinos.get(5), instance.get("Archeopteryx"));
        assertEquals("get Brachiosaurus", dinos.get(6), instance.get("Brachiosaurus"));
        assertEquals("get Allosaurus", dinos.get(7), instance.get("Allosaurus"));
    }
    
    @Test
    public void testPutFirstEntryInBucket()
    {
        List<Dino_hidden> dinos = getDinos();
        MyHashTable<String, Dino_hidden> instance = new MyHashTable<String, Dino_hidden>(5, 10);

        Dino_hidden dino = dinos.get(8);
        instance.put(dino.name, dino);

        int expected = 1;
        int actual = instance.getSize();
        assertEquals("1 dinos", expected, actual);
        assertEquals("get Apatosaurus", dinos.get(8), instance.get("Apatosaurus"));
    }
    
    @Test
    public void testPutSecondEntryInBucket()
    {
        List<Dino_hidden> dinos = getDinos();
        MyHashTable<String, Dino_hidden> instance = new MyHashTable<String, Dino_hidden>(1, 5);

        Dino_hidden dino = dinos.get(12);
        instance.put(dino.name, dino);
        dino = dinos.get(1);
        instance.put(dino.name, dino);

        int expected = 2;
        int actual = instance.getSize();
        assertEquals("2 dinos", expected, actual);
        assertEquals("get Carol", dinos.get(12), instance.get("Ankylosaurus"));
        assertEquals("get Dogmeat", dinos.get(1), instance.get("Triceratops"));
    }
    
    @Test
    public void testGetCapacity()
    {
        MyHashTable<String, Dino_hidden> instance = getVeryBigPark();
        int expected = 13;
        int actual = instance.getCapacity();
        assertEquals("Capacity is 13", expected, actual);

        instance = getBigPark();
        expected = 7;
        actual = instance.getCapacity();
        assertEquals("Capacity is 7", expected, actual);

        instance = getCrowdedPark();
        expected = 5;
        actual = instance.getCapacity();
        assertEquals("Capacity is 5", expected, actual);

        instance = getVeryCrowdedPark();
        expected = 3;
        actual = instance.getCapacity();
        assertEquals("Capacity is 3", expected, actual);
        
        instance = getVeryCrowdedParkThatGrows();
        expected = 5;
        actual = instance.getCapacity();
        assertEquals("Capacity is 5", expected, actual);

        instance = getVeryCrowdedParkThatGrowsV2();
        expected = 3;
        actual = instance.getCapacity();
        assertEquals("Capacity is 3", expected, actual);
        
    }
    
    @Test
    public void testGetIndexOfBucket()
    {
        MyHashTable<String, Dino_hidden> instance = getVeryBigPark();
        int expected = 8;
        int actual = instance.getIndexOfBucket("Ankylosaurus");
        assertEquals("Ankylosaurus's bucket", expected, actual);;

        instance = getBigPark();
        expected = 4;
        actual = instance.getIndexOfBucket("Ankylosaurus");
        assertEquals("Ankylosaurus's bucket", expected, actual);;

        instance = getCrowdedPark();
        expected = 0;
        actual = instance.getIndexOfBucket("Ankylosaurus");
        assertEquals("Ankylosaurus's bucket", expected, actual);;

        instance = getVeryCrowdedPark();
        expected = 1;
        actual = instance.getIndexOfBucket("Ankylosaurus");
        assertEquals("Ankylosaurus's bucket", expected, actual);;
        
        instance = getVeryCrowdedParkThatGrows();
        expected = 0;
        actual = instance.getIndexOfBucket("Ankylosaurus");
        assertEquals("Ankylosaurus's bucket", expected, actual);;

        instance = getVeryCrowdedParkThatGrowsV2();
        expected = 1;
        actual = instance.getIndexOfBucket("Ankylosaurus");
        assertEquals("Ankylosaurus's bucket", expected, actual);;
        
    }
    
    @Test
    public void testGetKeys()
    {
        List<Dino_hidden> dinos = getDinos();
        MyHashTable<String, Dino_hidden> instance = new MyHashTable<String, Dino_hidden>(1, 13);

        for (int i = 0; i < 13; i++)
        {
            Dino_hidden dino = dinos.get(i);
            instance.put(dino.name, dino);
        }


        List<String> actual = instance.getKeys();
        assertEquals("Right number of keys", 13, instance.getSize());
        for (int i = 0; i < 10; i++)
        {
                assertTrue("Has dino key " + dinos.get(i).name, actual.contains(dinos.get(i).name));
        }

        Dino_hidden duplicate = dinos.get(1);
        instance.put(duplicate.name, duplicate);
        actual = instance.getKeys();
        assertEquals("Right number of keys after trying to add duplicate", 13, instance.getSize());
    }

    @Test
    public void testGetValues()
    {
        List<Dino_hidden> dinos = getDinos();
        MyHashTable<String, Dino_hidden> instance = new MyHashTable<String, Dino_hidden>(1, 13);

        for (int i = 0; i < 13; i++)
        {
            Dino_hidden dino = dinos.get(i);
            instance.put(dino.name, dino);
        }


        List<Dino_hidden> actual = instance.getValues();
        assertEquals("Right number of keys", 13, instance.getSize());
        for (int i = 0; i < 10; i++)
        {
                assertTrue("Has dino " + dinos.get(i).name, actual.contains(dinos.get(i)));
        }

        Dino_hidden duplicate = dinos.get(1);
        instance.put(duplicate.name, duplicate);
        actual = instance.getValues();
        assertEquals("Right number of keys after trying to add duplicate", 13, instance.getSize());
    }

    @Test
    public void testGetKVP()
    {
        List<Dino_hidden> dinos = getDinos();
        MyHashTable<String, Dino_hidden> instance = new MyHashTable<String, Dino_hidden>(1, 13);

        for (int i = 0; i < 13; i++)
        {
            Dino_hidden dino = dinos.get(i);
            instance.put(dino.name, dino);
        }

        List<KeyValuePair<String, Dino_hidden>> actual = instance.getKeyValuePairs();
        assertEquals("Right number of keys", 13, instance.getSize());
        for (KeyValuePair<String, Dino_hidden> KVP : actual)
        {
                assertTrue("Has dino key " + KVP.key, dinos.contains(KVP.value));
        }

        Dino_hidden duplicate = dinos.get(1);
        instance.put(duplicate.name, duplicate);
        actual = instance.getKeyValuePairs();
        assertEquals("Right number of keys after trying to add duplicate", 13, instance.getSize());
    }
    
    @Test
    public void testRemoveOnlyEntryInBucket()
    {

        List<Dino_hidden> dinos = getDinos();
        MyHashTable<String, Dino_hidden> instance = new MyHashTable<String, Dino_hidden>(1, 13);

        for (int i = 0; i < 13; i++)
        {
            Dino_hidden dino = dinos.get(i);
            instance.put(dino.name, dino);
        }

        int expected = 13;
        int actual = instance.getSize();
        assertEquals("all the dinos!", expected, actual);

        instance.remove(dinos.get(3).name);
        expected = 12;
        actual = instance.getSize();
        assertEquals("Dinos after removing joker", expected, actual);
        assertFalse("Testing dinos do not contain joker", instance.contains("joker"));

        instance.remove(dinos.get(10).name);
        expected = 11;
        actual = instance.getSize();
        assertEquals("Dinos after removing Bob", expected, actual);
        assertFalse("Testing dinos do not contain Bob", instance.contains("Bob"));

        instance.remove(dinos.get(2).name);
        expected = 10;
        actual = instance.getSize();
        assertEquals("Dinos after removing Inigo", expected, actual);
        assertFalse("Testing dinos do not contain Inigo", instance.contains("Inigo"));

        instance.remove(dinos.get(1).name);
        expected = 9;
        actual = instance.getSize();
        assertEquals("Dinos after removing Georganne", expected, actual);
        assertFalse("Testing dinos do not contain Georganne", instance.contains("Georganne"));


    }
    
    @Test
    public void testRemoveMultipleEntriesInBucket()
    {

        List<Dino_hidden> dinos = getDinos();
        MyHashTable<String, Dino_hidden> instance = new MyHashTable<String, Dino_hidden>(1, 15);

        for (int i = 0; i < 13; i++)
        {
            Dino_hidden dino = dinos.get(i);
            instance.put(dino.name, dino);
        }

        int expected = 13;
        int actual = instance.getSize();
        assertEquals("all the dinos!", expected, actual);

        instance.remove(dinos.get(6).name);
        expected = 12;
        actual = instance.getSize();
        assertEquals("Dinos after removing Dogmeat", expected, actual);
        assertFalse("Testing dinos do not contain Dogmeat", instance.contains("Dogmeat"));

        instance.remove(dinos.get(5).name);
        expected = 11;
        actual = instance.getSize();
        assertEquals("Dinos after removing Francois", expected, actual);
        assertFalse("Testing dinos do not contain Francois", instance.contains("Francois"));

        instance.remove(dinos.get(10).name);
        expected = 10;
        actual = instance.getSize();
        assertEquals("Dinos after removing Carol", expected, actual);
        assertFalse("Testing dinos do not contain Carol", instance.contains("Carol"));

        instance.remove(dinos.get(3).name);
        expected = 9;
        actual = instance.getSize();
        assertEquals("Dinos after removing Eddie", expected, actual);
        assertFalse("Testing dinos do not contain Eddie", instance.contains("Eddie"));
    }
    
    @Test
    public void testRemoveFromCrowdedPark()
    {

        List<Dino_hidden> dinos = getDinos();
        MyHashTable<String, Dino_hidden> instance = new MyHashTable<String, Dino_hidden>(1, 15);

        for (int i = 0; i < 13; i++)
        {
            Dino_hidden dino = dinos.get(i);
            instance.put(dino.name, dino);
        }

        int expected = 13;
        int actual = instance.getSize();
        assertEquals("all the dinos!", expected, actual);

        for (int i = 0; i < 13; i++)
        {
            Dino_hidden dino = dinos.get(i);
            instance.remove(dino.name);
        }

        expected = 0;
        actual = instance.getSize();
        assertEquals("all dinos removed!", expected, actual);

        for (int i = 0; i < 13; i++)
        {
            Dino_hidden dino = dinos.get(i);
            assertFalse("Testing dinos do not contain " + dino.name, instance.contains(dino.name));
        }



    }

/**
	 * **********************************************************************
	 * UTILITIES
	 * **********************************************************************
	 */
	//<editor-fold defaultstate="collapsed" desc="sample data">
	private MyHashTable<String, Dino_hidden> getBigPark()
	{
		List<Dino_hidden> puppies = getDinos();
		MyHashTable<String, Dino_hidden> park = new MyHashTable<String, Dino_hidden>(7, 6);
		for (Dino_hidden puppy : puppies)
		{
			park.put(puppy.name, puppy);
		}
		return park;
	}

	private MyHashTable<String, Dino_hidden> getVeryBigPark()
	{
		List<Dino_hidden> puppies = getDinos();
		MyHashTable<String, Dino_hidden> park = new MyHashTable<String, Dino_hidden>(13,10);
		for (Dino_hidden puppy : puppies)
		{
			park.put(puppy.name, puppy);
		}
		return park;
	}

	private MyHashTable<String, Dino_hidden> getCrowdedPark()
	{
		List<Dino_hidden> puppies = getDinos();
		MyHashTable<String, Dino_hidden> park = new MyHashTable<String, Dino_hidden>(5,10);
		for (Dino_hidden puppy : puppies)
		{
			park.put(puppy.name, puppy);
		}
		return park;
	}

	private MyHashTable<String, Dino_hidden> getVeryCrowdedPark()
	{
		List<Dino_hidden> puppies = getDinos();
		MyHashTable<String, Dino_hidden> park = new MyHashTable<String, Dino_hidden>(3,20);
		for (Dino_hidden puppy : puppies)
		{
			park.put(puppy.name, puppy);
		}
		return park;
	}
        
        private MyHashTable<String, Dino_hidden> getVeryCrowdedParkThatGrows()
	{
		List<Dino_hidden> puppies = getDinos();
		MyHashTable<String, Dino_hidden> park = new MyHashTable<String, Dino_hidden>(2, 3);
		for (Dino_hidden puppy : puppies)
		{
			park.put(puppy.name, puppy);
		}
		return park;
	}

	private MyHashTable<String, Dino_hidden> getVeryCrowdedParkThatGrowsV2()
	{
		List<Dino_hidden> puppies = getDinos();
		MyHashTable<String, Dino_hidden> park = new MyHashTable<String, Dino_hidden>(2, 5);
		for (Dino_hidden puppy : puppies)
		{
			park.put(puppy.name, puppy);
		}
		return park;
	}
    
    private List<Dino_hidden> getDinos() {
        List<Dino_hidden> dinos = new ArrayList<>();
        dinos.add(new Dino_hidden("T-rex", "Cretaceous"));
        dinos.add(new Dino_hidden("Triceratops", "Maastrichtian"));
        dinos.add(new Dino_hidden("Velociraptor", "Cretaceous"));
        dinos.add(new Dino_hidden("Stegosaurus", "Jurassic"));
        dinos.add(new Dino_hidden("Spinosaurus", "Cenomanian"));
        dinos.add(new Dino_hidden("Archeopteryx", "Late Jurassic"));
        dinos.add(new Dino_hidden("Brachiosaurus", "Jurassic"));
        dinos.add(new Dino_hidden("Allosaurus", "Jurassic"));
        dinos.add(new Dino_hidden("Apatosaurus", "Jurassic"));
        dinos.add(new Dino_hidden("Dilophosaurus", "Jurassic"));
        dinos.add(new Dino_hidden("Giganotosaurus", "Cretaceous"));
        dinos.add(new Dino_hidden("Compsognathus", "Jurassic"));
        dinos.add(new Dino_hidden("Ankylosaurus", "Cretaceous"));
        
        
        return dinos;
    }
    
}
