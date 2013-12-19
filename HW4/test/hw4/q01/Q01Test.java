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
public class Q01Test {

    @Test
    public void testStringSortDescending() {
        HeapSorter instance = new HeapSorter();

        List<Comparable> fruits = new ArrayList<>();

        fruits.add("Pineapple");
        fruits.add("Grape");
        fruits.add("Apple");
        fruits.add("Pineapple");

        Collections.sort(fruits);
        Collections.reverse(fruits);
        List<Comparable> result = instance.sortDescending(fruits);

        assertEquals(fruits, result);
    }

    @Test
    public void testStringSortAscending() {
        HeapSorter instance = new HeapSorter();
        List<Comparable> fruits = new ArrayList<>();

        fruits.add("Pineapple");
        fruits.add("Grape");
        fruits.add("Apple");
        fruits.add("Pineapple");

        Collections.sort(fruits);
//        Collections.reverse(fruits);
        List<Comparable> result = instance.sortAscending(fruits);

        assertEquals(fruits, result);
    }

    @Test
    public void testIntegerSortDescending() {
        HeapSorter instance = new HeapSorter();
        List<Comparable> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(8);
        numbers.add(15);
        numbers.add(23);
        numbers.add(42);
        numbers.add(16);
        Collections.sort(numbers);
        Collections.reverse(numbers);
        List<Comparable> result = instance.sortDescending(numbers);
        assertEquals(numbers, result);
    }

    @Test
    public void testIntegerSortAscending() {
        HeapSorter instance = new HeapSorter();
        List<Comparable> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(8);
        numbers.add(15);
        numbers.add(23);
        numbers.add(42);
        numbers.add(16);
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
        for (char letter = 'A'; letter <= 'Z'; letter++) {
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
        for (int i = 1; i < 10; i++) {
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
        for (int i = 1; i < 10; i++) {
            nums.add(i);
        }
        List<Comparable> result = instance.sortAscending(nums);
        assertEquals(nums, result);
    }

    @Test
    public void testReverseSortedNumbersDescending() {
        HeapSorter instance = new HeapSorter();
        List<Comparable> nums = new ArrayList<>();
        for (int i = 10; i > 0; i--) {
            nums.add(i);
        }
        List<Comparable> result = instance.sortDescending(nums);
        assertEquals(nums, result);
    }

    @Test
    public void testReverseSortedNumbersAscending() {
        HeapSorter instance = new HeapSorter();
        List<Comparable> nums = new ArrayList<>();
        for (int i = 10; i > 0; i--) {
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
        for (int i = 0; i < 5000; i++) {
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
        for (int i = 0; i < 5000; i++) {
            nums.add(i);
        }
        Collections.shuffle(nums);
        List<Comparable> result = instance.sortDescending(nums);
        result = instance.sortAscending(result);
        Collections.sort(nums);
        assertEquals(nums, result);
    }
}
