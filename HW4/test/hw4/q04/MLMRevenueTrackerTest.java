/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hw4.q04;

import hw4.q03.MyHashTable;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ramith Jayatilleka
 */
public class MLMRevenueTrackerTest {

    /**
     * Test of getRevenue method, of class MLMRevenueTracker.
     */
    @Test
    public void testGetRevenue1() {
        MyHashTable<String, Integer> sales = new MyHashTable<>(10, 10);
        sales.put("A", 10);
        sales.put("B", 20);
        sales.put("C", 30);
        MyHashTable<String, String> sponsors = new MyHashTable<>(10, 10);
        sponsors.put("A", "");
        sponsors.put("B", "A");
        sponsors.put("C", "A");
        MLMRevenueTracker tracker = new MLMRevenueTracker();
        
        assertEquals(30, tracker.getRevenue("C", sales, sponsors), 1);
        assertEquals(20, tracker.getRevenue("B", sales, sponsors), 1);
        assertEquals(15, tracker.getRevenue("A", sales, sponsors), 1);
    }

    /**
     * Test of getRevenue method, of class MLMRevenueTracker.
     */
    @Test
    public void testGetRevenue2() {
        MyHashTable<String, Integer> sales = new MyHashTable<>(10, 10);
        sales.put("A", 10);
        sales.put("B", 20);
        sales.put("C", 30);
        sales.put("D", 40);
        sales.put("E", 50);
        MyHashTable<String, String> sponsors = new MyHashTable<>(10, 10);
        sponsors.put("A", "");
        sponsors.put("B", "A");
        sponsors.put("C", "A");
        sponsors.put("D", "B");
        sponsors.put("E", "C");
        MLMRevenueTracker tracker = new MLMRevenueTracker();
        
        assertEquals(50, tracker.getRevenue("E", sales, sponsors), 1);
        assertEquals(40, tracker.getRevenue("D", sales, sponsors), 1);
        assertEquals(35, tracker.getRevenue("C", sales, sponsors), 1);
        assertEquals(24, tracker.getRevenue("B", sales, sponsors), 1);
        assertEquals(15, tracker.getRevenue("A", sales, sponsors), 1);
    }

    /**
     * Test of getRevenue method, of class MLMRevenueTracker.
     */
    @Test
    public void testGetRevenue3() {
        MyHashTable<String, Integer> sales = new MyHashTable<>(10, 10);
        sales.put("A", 604);
        sales.put("B", 453);
        sales.put("C", 234);
        sales.put("D", 532);
        sales.put("E", 20);
        sales.put("F", 230);
        sales.put("G", 543);
        sales.put("H", 56);
        sales.put("I", 97);
        sales.put("J", 903);
        MyHashTable<String, String> sponsors = new MyHashTable<>(10, 10);
        sponsors.put("A", "");
        sponsors.put("B", "A");
        sponsors.put("C", "B");
        sponsors.put("D", "C");
        sponsors.put("E", "D");
        sponsors.put("F", "E");
        sponsors.put("G", "E");
        sponsors.put("H", "E");
        sponsors.put("I", "F");
        sponsors.put("J", "G");
        MLMRevenueTracker tracker = new MLMRevenueTracker();
        
        assertEquals(903, tracker.getRevenue("J", sales, sponsors), 1);
        assertEquals(97, tracker.getRevenue("I", sales, sponsors), 1);
        assertEquals(56, tracker.getRevenue("H", sales, sponsors), 1);
        assertEquals(633, tracker.getRevenue("G", sales, sponsors), 1);
        assertEquals(239, tracker.getRevenue("F", sales, sponsors), 1);
        assertEquals(111, tracker.getRevenue("E", sales, sponsors), 1);
        assertEquals(543, tracker.getRevenue("D", sales, sponsors), 1);
        assertEquals(288, tracker.getRevenue("C", sales, sponsors), 1);
        assertEquals(481, tracker.getRevenue("B", sales, sponsors), 1);
        assertEquals(652, tracker.getRevenue("A", sales, sponsors), 1);
    }
    
    @Test
    public void testGetRevenue4() {
        MyHashTable<String, Integer> sales = new MyHashTable<>(10, 10);
        sales.put("A", 123);
        sales.put("B", 234);
        sales.put("C", 345);
        sales.put("D", 456);
        sales.put("E", 567);
        sales.put("F", 678);
        sales.put("G", 789);
        sales.put("H", 890);
        sales.put("I", 901);
        sales.put("J", 12);
        MyHashTable<String, String> sponsors = new MyHashTable<>(10, 10);
        sponsors.put("A", "");
        sponsors.put("B", "A");
        sponsors.put("C", "A");
        sponsors.put("D", "A");
        sponsors.put("E", "B");
        sponsors.put("F", "B");
        sponsors.put("G", "C");
        sponsors.put("H", "E");
        sponsors.put("I", "E");
        sponsors.put("J", "B");
        MLMRevenueTracker tracker = new MLMRevenueTracker();
        
        assertEquals(12, tracker.getRevenue("J", sales, sponsors), 1);
        assertEquals(901, tracker.getRevenue("I", sales, sponsors), 1);
        assertEquals(890, tracker.getRevenue("H", sales, sponsors), 1);
        assertEquals(789, tracker.getRevenue("G", sales, sponsors), 1);
        assertEquals(678, tracker.getRevenue("F", sales, sponsors), 1);
        assertEquals(746, tracker.getRevenue("E", sales, sponsors), 1);
        assertEquals(456, tracker.getRevenue("D", sales, sponsors), 1);
        assertEquals(423, tracker.getRevenue("C", sales, sponsors), 1);
        assertEquals(376, tracker.getRevenue("B", sales, sponsors), 1);
        assertEquals(247, tracker.getRevenue("A", sales, sponsors), 1);
    }

    /**
     * Test of getNetIncome method, of class MLMRevenueTracker.
     */
    @Test
    public void testGetNetIncome1() {
        MyHashTable<String, Integer> sales = new MyHashTable<>(10, 10);
        sales.put("A", 10);
        sales.put("B", 20);
        sales.put("C", 30);
        MyHashTable<String, String> sponsors = new MyHashTable<>(10, 10);
        sponsors.put("A", "");
        sponsors.put("B", "A");
        sponsors.put("C", "A");
        MLMRevenueTracker tracker = new MLMRevenueTracker();
        
        assertEquals(12, tracker.getNetIncome("C", sales, sponsors), 1);
        assertEquals(8, tracker.getNetIncome("B", sales, sponsors), 1);
        assert((tracker.getNetIncome("A", sales, sponsors) == 9)
                || (tracker.getNetIncome("A", sales, sponsors) == 10)
                || (tracker.getNetIncome("A", sales, sponsors) == 11)
                || (tracker.getNetIncome("A", sales, sponsors) == 7)
                || (tracker.getNetIncome("A", sales, sponsors) == 8));
    }

    /**
     * Test of getRevenue method, of class MLMRevenueTracker.
     */
    @Test
    public void testGetNetIncome2() {
        MyHashTable<String, Integer> sales = new MyHashTable<>(10, 10);
        sales.put("A", 10);
        sales.put("B", 20);
        sales.put("C", 30);
        sales.put("D", 40);
        sales.put("E", 50);
        MyHashTable<String, String> sponsors = new MyHashTable<>(10, 10);
        sponsors.put("A", "");
        sponsors.put("B", "A");
        sponsors.put("C", "A");
        sponsors.put("D", "B");
        sponsors.put("E", "C");
        MLMRevenueTracker tracker = new MLMRevenueTracker();
        
        assertEquals(20, tracker.getNetIncome("E", sales, sponsors), 1);
        assertEquals(16, tracker.getNetIncome("D", sales, sponsors), 1);
        assertEquals(16, tracker.getNetIncome("C", sales, sponsors), 1);
        assertEquals(11, tracker.getNetIncome("B", sales, sponsors), 1);
        assert((tracker.getNetIncome("A", sales, sponsors) == 9)
                || (tracker.getNetIncome("A", sales, sponsors) == 10)
                || (tracker.getNetIncome("A", sales, sponsors) == 11)
                || (tracker.getNetIncome("A", sales, sponsors) == 7)
                || (tracker.getNetIncome("A", sales, sponsors) == 8));
    }

    /**
     * Test of getRevenue method, of class MLMRevenueTracker.
     */
    @Test
    public void testGetNetIncome3() {
        MyHashTable<String, Integer> sales = new MyHashTable<>(10, 10);
        sales.put("A", 604);
        sales.put("B", 453);
        sales.put("C", 234);
        sales.put("D", 532);
        sales.put("E", 20);
        sales.put("F", 230);
        sales.put("G", 543);
        sales.put("H", 56);
        sales.put("I", 97);
        sales.put("J", 903);
        MyHashTable<String, String> sponsors = new MyHashTable<>(10, 10);
        sponsors.put("A", "");
        sponsors.put("B", "A");
        sponsors.put("C", "B");
        sponsors.put("D", "C");
        sponsors.put("E", "D");
        sponsors.put("F", "E");
        sponsors.put("G", "E");
        sponsors.put("H", "E");
        sponsors.put("I", "F");
        sponsors.put("J", "G");
        MLMRevenueTracker tracker = new MLMRevenueTracker();
        
        assertEquals(361, tracker.getNetIncome("J", sales, sponsors), 1);
        assertEquals(38, tracker.getNetIncome("I", sales, sponsors), 1);
        assertEquals(22, tracker.getNetIncome("H", sales, sponsors), 1);
        assertEquals(298, tracker.getNetIncome("G", sales, sponsors), 1);
        assertEquals(100, tracker.getNetIncome("F", sales, sponsors), 1);
        assertEquals(89, tracker.getNetIncome("E", sales, sponsors), 1);
        assertEquals(222, tracker.getNetIncome("D", sales, sponsors), 1);
        assertEquals(142, tracker.getNetIncome("C", sales, sponsors), 1);
        assertEquals(206, tracker.getNetIncome("B", sales, sponsors), 1);
        assert((tracker.getNetIncome("A", sales, sponsors) == 349)
                || (tracker.getNetIncome("A", sales, sponsors) == 350)
                || (tracker.getNetIncome("A", sales, sponsors) == 351)
                || (tracker.getNetIncome("A", sales, sponsors) == 283)
                || (tracker.getNetIncome("A", sales, sponsors) == 284)
                || (tracker.getNetIncome("A", sales, sponsors) == 285));
    }
    
    @Test
    public void testGetNetIncome4() {
        MyHashTable<String, Integer> sales = new MyHashTable<>(10, 10);
        sales.put("A", 123);
        sales.put("B", 234);
        sales.put("C", 345);
        sales.put("D", 456);
        sales.put("E", 567);
        sales.put("F", 678);
        sales.put("G", 789);
        sales.put("H", 890);
        sales.put("I", 901);
        sales.put("J", 12);
        MyHashTable<String, String> sponsors = new MyHashTable<>(10, 10);
        sponsors.put("A", "");
        sponsors.put("B", "A");
        sponsors.put("C", "A");
        sponsors.put("D", "A");
        sponsors.put("E", "B");
        sponsors.put("F", "B");
        sponsors.put("G", "C");
        sponsors.put("H", "E");
        sponsors.put("I", "E");
        sponsors.put("J", "B");
        MLMRevenueTracker tracker = new MLMRevenueTracker();
        
        assertEquals(4, tracker.getNetIncome("J", sales, sponsors), 1);
        assertEquals(360, tracker.getNetIncome("I", sales, sponsors), 1);
        assertEquals(356, tracker.getNetIncome("H", sales, sponsors), 1);
        assertEquals(315, tracker.getNetIncome("G", sales, sponsors), 1);
        assertEquals(271, tracker.getNetIncome("F", sales, sponsors), 1);
        assertEquals(387, tracker.getNetIncome("E", sales, sponsors), 1);
        assertEquals(182, tracker.getNetIncome("D", sales, sponsors), 1);
        assertEquals(208, tracker.getNetIncome("C", sales, sponsors), 1);
        assertEquals(221, tracker.getNetIncome("B", sales, sponsors), 1);
        assert((tracker.getNetIncome("A", sales, sponsors) == 184)
                || (tracker.getNetIncome("A", sales, sponsors) == 185)
                || (tracker.getNetIncome("A", sales, sponsors) == 186)
                || (tracker.getNetIncome("A", sales, sponsors) == 159)
                || (tracker.getNetIncome("A", sales, sponsors) == 160)
                || (tracker.getNetIncome("A", sales, sponsors) == 161));
    }   
}
