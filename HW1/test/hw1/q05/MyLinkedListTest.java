/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1.q05;

import java.util.LinkedList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jery
 */
public class MyLinkedListTest {
    
    public MyLinkedListTest() {
    }

    /**
     * Test of add method, of class MyLinkedList.
     */
    @Test
    public void testAdd() {
        MyLinkedList<Integer> instance = new MyLinkedList();
        for(int i=0; i<3; i++){
            instance.add(i);
        }
        int exp = 2;
        int result = instance.get(2);
        assertEquals("test 1:", exp, result);
        
        exp = 0;
        result = instance.get(0);
        assertEquals("test 2:", exp, result);
    }

    /**
     * Test of addAll method, of class MyLinkedList.
     */
    @Test
    public void testAddAll() {
        MyLinkedList<String> instance = new MyLinkedList();
        LinkedList<String> test = new LinkedList();
        test.add("hello");
        test.add("hi");
        test.add("bonjour");
        test.add("hey");
        instance.addAll(test);
        
        String exp = "bonjour";
        String result = instance.get(2);
        assertEquals("addAll1:", exp, result);
        
        MyLinkedList<String> instance1 = new MyLinkedList();
        instance1.add("test");
        instance1.addAll(test);
        
        exp = "test";
        result = instance1.get(0);
        assertEquals("addAll2:", exp, result);
        
        exp = "hey";
        result = instance1.get(4);
        assertEquals("addAll3:", exp, result);
    }

    /**
     * Test of clear method, of class MyLinkedList.
     */
    @Test
    public void testClear() {
        MyLinkedList<Double> instance = new MyLinkedList();
        instance.add(3.4);
        instance.add(4.5);
        instance.clear();
        
        Double exp = null;
        Double result = instance.get(0);
        assertEquals("clear1:", exp, result);
    }

    /**
     * Test of clone method, of class MyLinkedList.
     */
    @Test
    public void testClone() {
        MyLinkedList<Integer> instance = new MyLinkedList();
        instance.add(0);
        instance.add(1);
        instance.add(2);
        instance.add(3);
        instance.add(4);
        MyLinkedList<Integer> result = instance.clone();
        for(int i=0; i<5; i++)
            assertEquals("clone"+i+":",instance.get(i), result.get(i));
    }

    /**
     * Test of contains method, of class MyLinkedList.
     */
    @Test
    public void testContains() {
        MyLinkedList<String> instance = new MyLinkedList();
        instance.add("hi");
        instance.add("hello");
        instance.add("what");
        instance.add("test");
        
        assertEquals("contains1:", true, instance.contains("hello"));
        assertEquals("contains2:", false, instance.contains("this shouldn't work"));
        
    }

    /**
     * Test of get method, of class MyLinkedList.
     */
    @Test
    public void testGet() {
        MyLinkedList<Integer> instance = new MyLinkedList();
        instance.add(0);
        instance.add(1);
        instance.add(2);
        instance.add(3);
        instance.add(4);
        
        int exp = 3;
        int result = instance.get(3);
        
        assertEquals("getSize:", exp, result);
    }

    /**
     * Test of getSize method, of class MyLinkedList.
     */
    @Test
    public void testGetSize() {
        MyLinkedList<Integer> instance = new MyLinkedList();
        instance.add(0);
        instance.add(1);
        instance.add(2);
        instance.add(3);
        instance.add(4);
        
        assertEquals("getSize:", 5, instance.getSize());
    }

    /**
     * Test of insert method, of class MyLinkedList.
     */
    @Test
    public void testInsert() {
        MyLinkedList<String> instance = new MyLinkedList();
        instance.add("hi");
        instance.add("hello");
        instance.add("what");
        instance.add("test");
        
        instance.insert(2, "changed");
        assertEquals("insert:", "changed", instance.get(2));
        assertEquals("insertSize:", 5, instance.getSize());
    }

    /**
     * Test of remove method, of class MyLinkedList.
     */
    @Test
    public void testRemove() {
        MyLinkedList<String> instance = new MyLinkedList();
        instance.add("hi");
        instance.add("hello");
        instance.add("what");
        instance.add("test");
        
        instance.remove(3);
        assertEquals("removeEnd:", "what", instance.get(instance.getSize()-1));
        assertEquals("removeEndSize:", 3, instance.getSize());
        instance.remove(1);
        assertEquals("removeMiddle:","what", instance.get(1));
        assertEquals("removeMiddleSize:", 2, instance.getSize());
        
    }

    /**
     * Test of removeRange method, of class MyLinkedList.
     */
    @Test
    public void testRemoveRange() {
        int start = 3;
        int end = 6;
        MyLinkedList<Integer> instance = new MyLinkedList();
        MyLinkedList<Integer> result = new MyLinkedList();
        for(int i =0; i<10; i++)
            instance.add(i);
        result.add(0);
        result.add(1);
        result.add(2);
        result.add(7);
        result.add(8);
        result.add(9);
        instance.removeRange(start, end);
        assertEquals("removeRangeSize:", 6, instance.getSize());
        for(int i=0;i<result.getSize();i++)
            assertEquals("removeRangeValue" + i + ":", instance.get(i),result.get(i));
    }

    /**
     * Test of update method, of class MyLinkedList.
     */
    @Test
    public void testUpdate() {
        MyLinkedList<String> instance = new MyLinkedList();
        instance.add("hi");
        instance.add("hello");
        instance.add("what");
        instance.add("test");
        
        instance.update(2, "changed");
        assertEquals("update:", "changed", instance.get(2));
        assertEquals("updateSize:", 4, instance.getSize());
    }
}
