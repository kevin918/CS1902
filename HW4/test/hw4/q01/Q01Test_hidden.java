package hw4.q01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author shakil
 */
public class Q01Test_hidden {

    @Test
    public void testStringSortDescending() {
        
        HeapSorter instance = new HeapSorter();
        
        List<Comparable> fruits = new ArrayList<>();
 
	fruits.add("Papaya");
	fruits.add("Greenwich");
	fruits.add("Aaples");
	fruits.add("Papaya");
 
	Collections.sort(fruits);
        Collections.reverse(fruits);
        List<Comparable> result = instance.sortDescending(fruits);
        
        assertEquals(fruits, result);
        
        
    }
    
    @Test
    public void testStringSortAscending() {
        HeapSorter instance = new HeapSorter();
        List<Comparable> fruits = new ArrayList<>();
 
	fruits.add("Papaya");
	fruits.add("Greenwich");
	fruits.add("Aaples");
	fruits.add("Papaya");
 
	Collections.sort(fruits);
//        Collections.reverse(fruits);
        List<Comparable> result = instance.sortAscending(fruits);
        
        assertEquals(fruits, result);
    }
    
    @Test
    public void testIntegerSortDescending() {
        HeapSorter instance = new HeapSorter();
        List<Comparable> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(5);
        numbers.add(2);
        numbers.add(43);
        numbers.add(52);
        numbers.add(17);
        numbers.add(7);
        Collections.sort(numbers);
        Collections.reverse(numbers);
        List<Comparable> result = instance.sortDescending(numbers);
        assertEquals(numbers, result);
    }
    
    @Test
    public void testIntegerSortAscending() {
        HeapSorter instance = new HeapSorter();
        List<Comparable> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(3);
        numbers.add(25);
        numbers.add(73);
        numbers.add(48);
        numbers.add(11);
        numbers.add(39);
        Collections.sort(numbers);
        List<Comparable> result = instance.sortAscending(numbers);
        assertEquals(numbers, result);
        System.out.println("Sponsored by the Dharma Initiative");
    }
    
    @Test
    public void testOneThingSortAscendingDescending() {
        HeapSorter instance = new HeapSorter();
        List<Comparable> numbers = new ArrayList<>();
        numbers.add(8);
        List<Comparable> result = instance.sortAscending(numbers);
        result = instance.sortDescending(result);
        assertEquals(numbers, result);
    }
    
    @Test
    public void testAlphabetSort() {
        HeapSorter instance = new HeapSorter();
        List<Comparable> alphabet = new ArrayList<>();
        for(char letter = 'A'; letter <= 'Z'; letter++) {
            alphabet.add(letter);
        }
        Collections.shuffle(alphabet);
        List<Comparable> result = instance.sortAscending(alphabet);
        Collections.sort(alphabet);
        assertEquals(alphabet, result);
    }
    
    @Test
    public void testSortedNumbersDescending() {
        HeapSorter instance = new HeapSorter();
        List<Comparable> nums = new ArrayList<>();
        for (int i = 7; i<17; i++) {
            nums.add(i);
        }
        List<Comparable> result = instance.sortDescending(nums);
        Collections.reverse(nums);
        assertEquals(nums, result);
    }
    
    @Test
    public void testSortedNumbersAscending() {
        HeapSorter instance = new HeapSorter();
        List<Comparable> nums = new ArrayList<>();
        for (int i = 8; i<18; i++) {
            nums.add(i);
        }
        List<Comparable> result = instance.sortAscending(nums);
        assertEquals(nums, result);
    }
    
@Test
    public void testReverseSortedNumbersDescending() {
        HeapSorter instance = new HeapSorter();
        List<Comparable> nums = new ArrayList<>();
        for (int i = 100; i>89; i--) {
            nums.add(i);
        }
        List<Comparable> result = instance.sortDescending(nums);
        assertEquals(nums, result);
    }
    
    @Test
    public void testReverseSortedNumbersAscending() {
        HeapSorter instance = new HeapSorter();
        List<Comparable> nums = new ArrayList<>();
        for (int i = 90; i>89; i--) {
            nums.add(i);
        }
        List<Comparable> result = instance.sortAscending(nums);
        Collections.reverse(nums);
        assertEquals(nums, result);
    }
    
    @Test
    public void testManyIntegersAscendingDescending() {
        HeapSorter instance = new HeapSorter();
        List<Comparable> nums = new ArrayList<>();
        for (int i = 0; i<2468; i++) {
            nums.add(i);
        }
        Collections.shuffle(nums);
        List<Comparable> result = instance.sortAscending(nums);
        result = instance.sortDescending(result);
        Collections.sort(nums);
        Collections.reverse(nums);
        assertEquals(nums, result);
    }
    
    @Test
    public void testManyIntegersDescendingAscending() {
        HeapSorter instance = new HeapSorter();
        List<Comparable> nums = new ArrayList<>();
        for (int i = 0; i<2468; i++) {
            nums.add(i);
        }
        Collections.shuffle(nums);
        List<Comparable> result = instance.sortDescending(nums);
        result = instance.sortAscending(result);
        Collections.sort(nums);
        assertEquals(nums, result);
    }
    
}
