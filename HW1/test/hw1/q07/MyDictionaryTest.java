/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1.q07;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ayush488
 */
public class MyDictionaryTest {
    
    @Test
    public void testforSizeIntChar(){
        MyDictionary<Integer, Character> dict = new MyDictionary<Integer, Character>();
        dict.add(5, 'A');
        dict.add(7,'Z');
        dict.add(9,'F');
        int expectedResult=3;
        int ActualResult=dict.size();
        assertEquals("size of dictionary is..",expectedResult,ActualResult);
    }

    @Test
    public void testforcontainIntChar(){
        MyDictionary<Integer, Character> dict = new MyDictionary<Integer, Character>();
        dict.add(5, 'A');
        dict.add(7,'Z');
        dict.add(9,'F');
        boolean expected=true;
        boolean actual=dict.contains(7);
        assertEquals("dictionary contains (7)",expected,actual);
        boolean expected2=false;
        boolean actual2=dict.contains(8);
        assertEquals("dictionary contains (8)",expected2,actual2);

    }
    
    @Test
    public void testforgetIntChar()
    {
        MyDictionary<Integer, Character> dict = new MyDictionary<Integer, Character>();
        dict.add(5, 'A');
        dict.add(7,'Z');
        dict.add(9,'F');
        Character expected='A';
        Character actual=dict.get(5);
        assertEquals("dictionary value for (5)",expected, actual);
        expected='Z';
        actual=dict.get(7);
        assertEquals("dictionary value for (7)",expected, actual);
        expected='F';
        actual=dict.get(9);
        assertEquals("dictionary value for (9)",expected, actual);
    }
}