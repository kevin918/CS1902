/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1.q09;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author proy
 */
public class AnagramCheckerTest {
    
    public AnagramCheckerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }

    /**
     * Test of areAnagrams method, of class AnagramChecker.
     */
    @Test
    public void testAreAnagrams() {
        System.out.println("areAnagrams");
        String word1 = "balm";
        String word2 = "lamb";
        AnagramChecker instance = new AnagramChecker();
        boolean expResult = true;
        boolean result = instance.areAnagrams(word1, word2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getAnagrams method, of class AnagramChecker.
     */
    @Test
    public void testGetAnagrams() {
        System.out.println("getAnagrams");
        String word = "spare";
        List<String> candidates = new ArrayList();
        AnagramChecker instance = new AnagramChecker();
        candidates.add("spear");
        candidates.add("pares");
        candidates.add("asper");
        candidates.add("reaps");
        candidates.add("rapes");
        candidates.add("speear");
        candidates.add("baylor");
        List<String> expResult = new ArrayList();
        expResult.add("spear");
        expResult.add("pares");
        expResult.add("asper");
        expResult.add("reaps");
        expResult.add("rapes");
        List<String> result = instance.getAnagrams(word, candidates);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
}
