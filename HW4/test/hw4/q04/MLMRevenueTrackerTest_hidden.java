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
public class MLMRevenueTrackerTest_hidden {

    /**
     * Test of getRevenue method, of class MLMRevenueTracker.
     */
    @Test
    public void testGetRevenue1() {
        MyHashTable<String, Integer> sales = new MyHashTable<>(10, 10);
        sales.put("A", 100);
        sales.put("B", 200);
        sales.put("C", 300);
        MyHashTable<String, String> sponsors = new MyHashTable<>(10, 10);
        sponsors.put("A", "");
        sponsors.put("B", "A");
        sponsors.put("C", "A");
        MLMRevenueTracker tracker = new MLMRevenueTracker();
        
        assertEquals(300, tracker.getRevenue("C", sales, sponsors), 1);
        assertEquals(200, tracker.getRevenue("B", sales, sponsors), 1);
        assertEquals(150, tracker.getRevenue("A", sales, sponsors), 1);
    }

    /**
     * Test of getRevenue method, of class MLMRevenueTracker.
     */
    @Test
    public void testGetRevenue2() {
        MyHashTable<String, Integer> sales = new MyHashTable<>(10, 10);
        sales.put("A", 100);
        sales.put("B", 200);
        sales.put("C", 300);
        sales.put("D", 400);
        sales.put("E", 500);
        MyHashTable<String, String> sponsors = new MyHashTable<>(10, 10);
        sponsors.put("A", "");
        sponsors.put("B", "A");
        sponsors.put("C", "A");
        sponsors.put("D", "B");
        sponsors.put("E", "C");
        MLMRevenueTracker tracker = new MLMRevenueTracker();
        
        assertEquals(500, tracker.getRevenue("E", sales, sponsors), 1);
        assertEquals(400, tracker.getRevenue("D", sales, sponsors), 1);
        assertEquals(350, tracker.getRevenue("C", sales, sponsors), 1);
        assertEquals(240, tracker.getRevenue("B", sales, sponsors), 1);
        assertEquals(159, tracker.getRevenue("A", sales, sponsors), 1);
    }

    /**
     * Test of getRevenue method, of class MLMRevenueTracker.
     */
    @Test
    public void testGetRevenue3() {
        MyHashTable<String, Integer> sales = new MyHashTable<>(10, 10);
        sales.put("A", 532);
        sales.put("B", 395);
        sales.put("C", 242);
        sales.put("D", 234);
        sales.put("E", 95);
        sales.put("F", 102);
        sales.put("G", 345);
        sales.put("H", 64);
        sales.put("I", 392);
        sales.put("J", 653);
        MyHashTable<String, String> sponsors = new MyHashTable<>(10, 10);
        sponsors.put("A", "");
        sponsors.put("B", "A");
        sponsors.put("C", "A");
        sponsors.put("D", "B");
        sponsors.put("E", "B");
        sponsors.put("F", "B");
        sponsors.put("G", "B");
        sponsors.put("H", "B");
        sponsors.put("I", "B");
        sponsors.put("J", "B");
        MLMRevenueTracker tracker = new MLMRevenueTracker();
        
        assertEquals(653, tracker.getRevenue("J", sales, sponsors), 1);
        assertEquals(392, tracker.getRevenue("I", sales, sponsors), 1);
        assertEquals(64, tracker.getRevenue("H", sales, sponsors), 1);
        assertEquals(345, tracker.getRevenue("G", sales, sponsors), 1);
        assertEquals(102, tracker.getRevenue("F", sales, sponsors), 1);
        assertEquals(95, tracker.getRevenue("E", sales, sponsors), 1);
        assertEquals(234, tracker.getRevenue("D", sales, sponsors), 1);
        assertEquals(242, tracker.getRevenue("C", sales, sponsors), 1);
        assertEquals(581, tracker.getRevenue("B", sales, sponsors), 1);
        assertEquals(614, tracker.getRevenue("A", sales, sponsors), 1);
    }
    
    @Test
    public void testGetRevenue4() {
        MyHashTable<String, Integer> sales = new MyHashTable<>(10, 10);
        sales.put("A", 321);
        sales.put("B", 432);
        sales.put("C", 543);
        sales.put("D", 654);
        sales.put("E", 765);
        sales.put("F", 876);
        sales.put("G", 987);
        sales.put("H", 109);
        sales.put("I", 210);
        sales.put("J", 0);
        MyHashTable<String, String> sponsors = new MyHashTable<>(10, 10);
        sponsors.put("A", "");
        sponsors.put("B", "A");
        sponsors.put("C", "A");
        sponsors.put("D", "B");
        sponsors.put("E", "C");
        sponsors.put("F", "D");
        sponsors.put("G", "E");
        sponsors.put("H", "F");
        sponsors.put("I", "G");
        sponsors.put("J", "H");
        MLMRevenueTracker tracker = new MLMRevenueTracker();
        
        assertEquals(0, tracker.getRevenue("J", sales, sponsors), 1);
        assertEquals(210, tracker.getRevenue("I", sales, sponsors), 1);
        assertEquals(109, tracker.getRevenue("H", sales, sponsors), 1);
        assertEquals(1008, tracker.getRevenue("G", sales, sponsors), 1);
        assertEquals(886, tracker.getRevenue("F", sales, sponsors), 1);
        assertEquals(865, tracker.getRevenue("E", sales, sponsors), 1);
        assertEquals(742, tracker.getRevenue("D", sales, sponsors), 1);
        assertEquals(629, tracker.getRevenue("C", sales, sponsors), 1);
        assertEquals(506, tracker.getRevenue("B", sales, sponsors), 1);
        assertEquals(433, tracker.getRevenue("A", sales, sponsors), 1);
    }

    /**
     * Test of getNetIncome method, of class MLMRevenueTracker.
     */
    @Test
    public void testGetNetIncome1() {
        MyHashTable<String, Integer> sales = new MyHashTable<>(10, 10);
        sales.put("A", 100);
        sales.put("B", 200);
        sales.put("C", 300);
        MyHashTable<String, String> sponsors = new MyHashTable<>(10, 10);
        sponsors.put("A", "");
        sponsors.put("B", "A");
        sponsors.put("C", "A");
        MLMRevenueTracker tracker = new MLMRevenueTracker();
        
        assertEquals(120, tracker.getNetIncome("C", sales, sponsors), 1);
        assertEquals(80, tracker.getNetIncome("B", sales, sponsors), 1);
        assert((tracker.getNetIncome("A", sales, sponsors) == 84)
                || (tracker.getNetIncome("A", sales, sponsors) == 85)
                || (tracker.getNetIncome("A", sales, sponsors) == 86)
                || (tracker.getNetIncome("A", sales, sponsors) == 99)
                || (tracker.getNetIncome("A", sales, sponsors) == 100)
                || (tracker.getNetIncome("A", sales, sponsors) == 101));
    }

    /**
     * Test of getRevenue method, of class MLMRevenueTracker.
     */
    @Test
    public void testGetNetIncome2() {
        MyHashTable<String, Integer> sales = new MyHashTable<>(10, 10);
        sales.put("A", 100);
        sales.put("B", 200);
        sales.put("C", 300);
        sales.put("D", 400);
        sales.put("E", 500);
        MyHashTable<String, String> sponsors = new MyHashTable<>(10, 10);
        sponsors.put("A", "");
        sponsors.put("B", "A");
        sponsors.put("C", "A");
        sponsors.put("D", "B");
        sponsors.put("E", "C");
        MLMRevenueTracker tracker = new MLMRevenueTracker();
        
        assertEquals(200, tracker.getNetIncome("E", sales, sponsors), 1);
        assertEquals(160, tracker.getNetIncome("D", sales, sponsors), 1);
        assertEquals(165, tracker.getNetIncome("C", sales, sponsors), 1);
        assertEquals(116, tracker.getNetIncome("B", sales, sponsors), 1);
        System.out.println("cccc "+ tracker.getNetIncome("A", sales, sponsors));
        assert((tracker.getNetIncome("A", sales, sponsors) == 94)
                || (tracker.getNetIncome("A", sales, sponsors) == 95)
                || (tracker.getNetIncome("A", sales, sponsors) == 96)
                || (tracker.getNetIncome("A", sales, sponsors) == 108)
                || (tracker.getNetIncome("A", sales, sponsors) == 109)
                || (tracker.getNetIncome("A", sales, sponsors) == 110));
    }

    /**
     * Test of getRevenue method, of class MLMRevenueTracker.
     */
    @Test
    public void testGetNetIncome3() {
        MyHashTable<String, Integer> sales = new MyHashTable<>(10, 10);
        sales.put("A", 532);
        sales.put("B", 395);
        sales.put("C", 242);
        sales.put("D", 234);
        sales.put("E", 95);
        sales.put("F", 102);
        sales.put("G", 345);
        sales.put("H", 64);
        sales.put("I", 392);
        sales.put("J", 653);
        MyHashTable<String, String> sponsors = new MyHashTable<>(10, 10);
        sponsors.put("A", "");
        sponsors.put("B", "A");
        sponsors.put("C", "A");
        sponsors.put("D", "B");
        sponsors.put("E", "B");
        sponsors.put("F", "B");
        sponsors.put("G", "B");
        sponsors.put("H", "B");
        sponsors.put("I", "B");
        sponsors.put("J", "B");
        MLMRevenueTracker tracker = new MLMRevenueTracker();
        
        assertEquals(653, tracker.getRevenue("J", sales, sponsors), 1);
        assertEquals(392, tracker.getRevenue("I", sales, sponsors), 1);
        assertEquals(64, tracker.getRevenue("H", sales, sponsors), 1);
        assertEquals(345, tracker.getRevenue("G", sales, sponsors), 1);
        assertEquals(102, tracker.getRevenue("F", sales, sponsors), 1);
        assertEquals(95, tracker.getRevenue("E", sales, sponsors), 1);
        assertEquals(234, tracker.getRevenue("D", sales, sponsors), 1);
        assertEquals(242, tracker.getRevenue("C", sales, sponsors), 1);
        assertEquals(581, tracker.getRevenue("B", sales, sponsors), 1);
        assertEquals(614, tracker.getRevenue("A", sales, sponsors), 1);
        
        assertEquals(261, tracker.getNetIncome("J", sales, sponsors), 1);
        assertEquals(157, tracker.getNetIncome("I", sales, sponsors), 1);
        assertEquals(26, tracker.getNetIncome("H", sales, sponsors), 1);
        assertEquals(138, tracker.getNetIncome("G", sales, sponsors), 1);
        assertEquals(41, tracker.getNetIncome("F", sales, sponsors), 1);
        assertEquals(38, tracker.getNetIncome("E", sales, sponsors), 1);
        assertEquals(94, tracker.getNetIncome("D", sales, sponsors), 1);
        assertEquals(97, tracker.getNetIncome("C", sales, sponsors), 1);
        assertEquals(325, tracker.getNetIncome("B", sales, sponsors), 1);
        assert((tracker.getNetIncome("A", sales, sponsors) == 286)
                || (tracker.getNetIncome("A", sales, sponsors) == 287)
                || (tracker.getNetIncome("A", sales, sponsors) == 288)
                || (tracker.getNetIncome("A", sales, sponsors) == 347)
                || (tracker.getNetIncome("A", sales, sponsors) == 348)
                || (tracker.getNetIncome("A", sales, sponsors) == 349));
    }
    
    @Test
    public void testGetNetIncome4() {
        MyHashTable<String, Integer> sales = new MyHashTable<>(10, 10);
        sales.put("A", 321);
        sales.put("B", 432);
        sales.put("C", 543);
        sales.put("D", 654);
        sales.put("E", 765);
        sales.put("F", 876);
        sales.put("G", 987);
        sales.put("H", 109);
        sales.put("I", 210);
        sales.put("J", 0);
        MyHashTable<String, String> sponsors = new MyHashTable<>(10, 10);
        sponsors.put("A", "");
        sponsors.put("B", "A");
        sponsors.put("C", "A");
        sponsors.put("D", "B");
        sponsors.put("E", "C");
        sponsors.put("F", "D");
        sponsors.put("G", "E");
        sponsors.put("H", "F");
        sponsors.put("I", "G");
        sponsors.put("J", "H");
        MLMRevenueTracker tracker = new MLMRevenueTracker();
        
        assertEquals(0, tracker.getRevenue("J", sales, sponsors), 1);
        assertEquals(210, tracker.getRevenue("I", sales, sponsors), 1);
        assertEquals(109, tracker.getRevenue("H", sales, sponsors), 1);
        assertEquals(1008, tracker.getRevenue("G", sales, sponsors), 1);
        assertEquals(886, tracker.getRevenue("F", sales, sponsors), 1);
        assertEquals(865, tracker.getRevenue("E", sales, sponsors), 1);
        assertEquals(742, tracker.getRevenue("D", sales, sponsors), 1);
        assertEquals(629, tracker.getRevenue("C", sales, sponsors), 1);
        assertEquals(506, tracker.getRevenue("B", sales, sponsors), 1);
        assertEquals(433, tracker.getRevenue("A", sales, sponsors), 1);
        
        assertEquals(0, tracker.getNetIncome("J", sales, sponsors), 1);
        assertEquals(84, tracker.getNetIncome("I", sales, sponsors), 1);
        assertEquals(44, tracker.getNetIncome("H", sales, sponsors), 1);
        assertEquals(414, tracker.getNetIncome("G", sales, sponsors), 1);
        assertEquals(360, tracker.getNetIncome("F", sales, sponsors), 1);
        assertEquals(396, tracker.getNetIncome("E", sales, sponsors), 1);
        assertEquals(341, tracker.getNetIncome("D", sales, sponsors), 1);
        assertEquals(295, tracker.getNetIncome("C", sales, sponsors), 1);
        assertEquals(240, tracker.getNetIncome("B", sales, sponsors), 1);
        assert((tracker.getNetIncome("A", sales, sponsors) == 228)
                || (tracker.getNetIncome("A", sales, sponsors) == 229)
                || (tracker.getNetIncome("A", sales, sponsors) == 230)
                || (tracker.getNetIncome("A", sales, sponsors) == 271)
                || (tracker.getNetIncome("A", sales, sponsors) == 272)
                || (tracker.getNetIncome("A", sales, sponsors) == 273));
    }   
}
