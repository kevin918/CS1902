/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1.q04;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author KevinBaxter
 */
public class MyArrayListTest {
    
    public MyArrayListTest() {
    }
    
    /**
     * Test of add, get methods, of class MyArrayList.
     */
    @Test
    public void testAddAndGet() {
        int expected;
        int actual;
        MyArrayList<Integer> instance = new MyArrayList();
        instance.add(2);
        instance.add(4);
        instance.add(1);
        instance.add(5);
        expected = 2;
        actual = instance.get(0);
        assertEquals("data[0] = 2", expected, actual);
        expected = 4;
        actual = instance.get(1);
        assertEquals("data[1] = 4", expected, actual);
        expected = 1;
        actual = instance.get(2);
        assertEquals("data[2] = 1", expected, actual);
        expected = 5;
        actual = instance.get(3);
        assertEquals("data[3] = 5", expected, actual);
    }

    /**
     * Test of addAll method, of class MyArrayList.
     */
    @Test
    public void testAddAll() {
        int expected;
        int actual;
        MyArrayList<Integer> instance = new MyArrayList();
        ArrayList<Integer> listToAdd = new ArrayList();
        listToAdd.add(2);
        listToAdd.add(4);
        listToAdd.add(1);
        listToAdd.add(5);      
        instance.addAll(listToAdd);
        expected = 2;
        actual = instance.get(0);
        assertEquals("data[0] = 2", expected, actual);
        expected = 4;
        actual = instance.get(1);
        assertEquals("data[1] = 4", expected, actual);
        expected = 1;
        actual = instance.get(2);
        assertEquals("data[2] = 1", expected, actual);
        expected = 5;
        actual = instance.get(3);
        assertEquals("data[3] = 5", expected, actual);
    }
    
    /**
     * Test of getSize method, of class MyArrayList.
     */
    @Test
    public void testGetSize() {
        int expected;
        int actual;
        MyArrayList<Integer> instance = new MyArrayList();
        expected = 0;
        actual = instance.getSize();
        assertEquals("size = 0", expected, actual);
        
        instance.add(2);
        instance.add(4);
        instance.add(1);
        instance.add(5);
        expected = 4;
        actual = instance.getSize();
        assertEquals("size = 4", expected, actual);
    }

    /**
     * Test of clear method, of class MyArrayList.
     */
    @Test
    public void testClear() {
        int expected;
        int actual;
        MyArrayList<Integer> instance = new MyArrayList();
        expected = 0;
        actual = instance.getSize();
        assertEquals("size = 0", expected, actual);
        
        instance.add(2);
        instance.add(4);
        instance.add(1);
        instance.add(5);
        expected = 4;
        actual = instance.getSize();
        assertEquals("size = 4", expected, actual);
        
        instance.clear();
        expected = 0;
        actual = instance.getSize();
        assertEquals("size = 0", expected, actual);

    }

    /**
     * Test of clone method, of class MyArrayList.
     */
    @Test
    public void testClone() {
        int expected;
        int actual;
        MyArrayList<Integer> instance = new MyArrayList();
        
        instance.add(1);
        instance.add(2);
        instance.add(3);
        instance.add(4);
        
        MyArrayList<Integer> instance2 = instance.clone();
        expected = 1;
        actual = instance2.get(0);
        assertEquals("clone data[0] = 1", expected, actual);
        expected = 2;
        actual = instance2.get(1);
        assertEquals("clone data[1] = 2", expected, actual);
        expected = 3;
        actual = instance2.get(2);
        assertEquals("clone data[2] = 3", expected, actual);
        expected = 4;
        actual = instance2.get(3);
        assertEquals("clone data[3] = 4", expected, actual);
    }

    /**
     * Test of contains method, of class MyArrayList.
     */
    @Test
    public void testContains() 
    {
        boolean expected;
        boolean actual;
        MyArrayList<Integer> instance = new MyArrayList();
        
        instance.add(1);
        instance.add(3);
        instance.add(4);
        instance.add(6);
        expected = true;
        actual = instance.contains(1);
        assertEquals("contains(1) = true", expected, actual);
        expected = false;
        actual = instance.contains(2);
        assertEquals("contains(2) = false", expected, actual);
        expected = true;
        actual = instance.contains(3);
        assertEquals("contains(3) = true", expected, actual);
        expected = false;
        actual = instance.contains(5);
        assertEquals("contains(5) = false", expected, actual);
        expected = true;
        actual = instance.contains(6);
        assertEquals("contains(6) = true", expected, actual);
        
    }


    /**
     * Test of insert method, of class MyArrayList.
     */
    @Test
    public void testInsert() {
        Integer expected;
        Integer actual;
        MyArrayList<Integer> instance = new MyArrayList();
        
        instance.add(1);
        instance.add(3);
        instance.add(5);
        instance.insert(1, 2);
        instance.insert(3, 4);
        
        expected = 1;
        actual = instance.get(0);
        assertEquals("data[0] = 1", expected, actual);
        expected = 2;
        actual = instance.get(1);
        assertEquals("data[1] = 2", expected, actual);
        expected = 3;
        actual = instance.get(2);
        assertEquals("data[2] = 3", expected, actual);
        expected = 4;
        actual = instance.get(3);
        assertEquals("data[3] = 4", expected, actual);
        expected = 5;
        actual = instance.get(4);
        assertEquals("data[4] = 5", expected, actual);
        
    }

    /**
     * Test of remove method, of class MyArrayList.
     */
    @Test
    public void testRemove() {
        Integer expected;
        Integer actual;
        MyArrayList<Integer> instance = new MyArrayList();
        instance.add(1);
        instance.add(2);
        instance.add(3);
        instance.add(4);
        instance.add(5);
        
        expected = 1;
        actual = instance.get(0);
        assertEquals("data[0] = 1", expected, actual);
        expected = 2;
        actual = instance.get(1);
        assertEquals("data[1] = 2", expected, actual);
        expected = 3;
        actual = instance.get(2);
        assertEquals("data[2] = 3", expected, actual);
        expected = 4;
        actual = instance.get(3);
        assertEquals("data[3] = 4", expected, actual);
        expected = 5;
        actual = instance.get(4);
        assertEquals("data[4] = 5", expected, actual);
        
        instance.remove(0);
        instance.remove(2);
        instance.remove(3);
        
        expected = 2;
        actual = instance.get(0);
        assertEquals("data[0] = 2", expected, actual);
        expected = 3;
        actual = instance.get(1);
        assertEquals("data[1] = 3", expected, actual);     
    }

    /**
     * Test of removeRange method, of class MyArrayList.
     */
    @Test
    public void testRemoveRange() {
        Integer expected;
        Integer actual;
        MyArrayList<Integer> instance = new MyArrayList();
        instance.add(1);
        instance.add(2);
        instance.add(3);
        instance.add(4);
        instance.add(5);
        
        expected = 1;
        actual = instance.get(0);
        assertEquals("data[0] = 1", expected, actual);
        expected = 2;
        actual = instance.get(1);
        assertEquals("data[1] = 2", expected, actual);
        expected = 3;
        actual = instance.get(2);
        assertEquals("data[2] = 3", expected, actual);
        expected = 4;
        actual = instance.get(3);
        assertEquals("data[3] = 4", expected, actual);
        expected = 5;
        actual = instance.get(4);
        assertEquals("data[4] = 5", expected, actual);
        
        instance.removeRange(1, 3);
        
        expected = 1;
        actual = instance.get(0);
        assertEquals("data[0] = 1", expected, actual);
        expected = 5;
        actual = instance.get(1);
        assertEquals("data[1] = 5", expected, actual);
    }

    /**
     * Test of update method, of class MyArrayList.
     */
    @Test
    public void testUpdate() {
        Integer expected;
        Integer actual;
        MyArrayList<Integer> instance = new MyArrayList();
        instance.add(1);
        instance.add(2);
        instance.add(3);
        instance.add(4);
        instance.add(5);
        
        expected = 1;
        actual = instance.get(0);
        assertEquals("data[0] = 1", expected, actual);
        expected = 2;
        actual = instance.get(1);
        assertEquals("data[1] = 2", expected, actual);
        expected = 3;
        actual = instance.get(2);
        assertEquals("data[2] = 3", expected, actual);
        expected = 4;
        actual = instance.get(3);
        assertEquals("data[3] = 4", expected, actual);
        expected = 5;
        actual = instance.get(4);
        assertEquals("data[4] = 5", expected, actual);
        
        instance.update(0, 24);
        instance.update(3, 48);
        expected = 24;
        actual = instance.get(0);
        assertEquals("data[0] = 24", expected, actual);
        expected = 2;
        actual = instance.get(1);
        assertEquals("data[1] = 2", expected, actual);
        expected = 3;
        actual = instance.get(2);
        assertEquals("data[2] = 3", expected, actual);
        expected = 48;
        actual = instance.get(3);
        assertEquals("data[3] = 48", expected, actual);
        expected = 5;
        actual = instance.get(4);
        assertEquals("data[4] = 5", expected, actual);
    }
}