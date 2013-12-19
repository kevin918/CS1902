/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1.q08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author proy
 */
public class PersonalityCalculatorTest {
    
    public PersonalityCalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }

    /**
     * Test of calculatePomposity method, of class PersonalityCalculator.
     */
    @Test
    public void testCalculatePomposity() {
        System.out.println("calculatePomposity");
        List<String> words = new ArrayList();
        words.add("I");
        words.add("ate");
        words.add("a");
        words.add("pickle");
        PersonalityCalculator instance = new PersonalityCalculator();
        double expResult = 2.75;
        double result = instance.calculatePomposity(words);
        assertEquals(expResult, result, 0.00);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculatePomposity method, of class PersonalityCalculator.
     */
    @Test
    public void testCalculatePomposityWithNoise() {
        System.out.println("calculatePomposityWithNoise");
        List<String> words = new ArrayList();
        words.add("I");
        words.add("ate");
        words.add("a");
        words.add("pickle");
        List<String> noiseWords = new ArrayList();
        noiseWords.add("a");
        PersonalityCalculator instance = new PersonalityCalculator();
        double expResult = 3.33;
        double result = instance.calculatePomposity(words, noiseWords);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getMostPompous method, of class PersonalityCalculator.
     */
    @Test
    public void testGetMostPompousPerson() {
        System.out.println("getMostPompous");
        Map<String, List<String>> people = new HashMap();
        PersonalityCalculator instance = new PersonalityCalculator();
        List<String> words1 = new ArrayList();
        words1.add("I");
        words1.add("ate");
        words1.add("a");
        words1.add("pickle");
        people.put("Baylor", words1);
        List<String> words2 = new ArrayList();
        words2.add("This");
        words2.add("is");
        words2.add("a");
        words2.add("very");
        words2.add("controversial");
        words2.add("decision");
        people.put("Roy", words2);
        List<String> words3 = new ArrayList();
        words3.add("Text");
        words3.add("mining");
        words3.add("is");
        words3.add("the");
        words3.add("hottest");
        words3.add("topic");
        words3.add("in");
        words3.add("information");
        words3.add("retrieval");
        people.put("Ayush", words3);        
        List<String> words4 = new ArrayList();
        words4.add("I");
        words4.add("love");
        words4.add("watching");
        words4.add("pokemon");
        words4.add("all");
        words4.add("the");
        words4.add("time");
        
        people.put("Jessica", words4);
        
        String expResult = "Ayush";
        String result = instance.getMostPompous(people);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getMostPompous method, of class PersonalityCalculator.
     */
    @Test
    public void testGetMostPompousPersonWithNoise() {
        System.out.println("getMostPompous");
        Map<String, List<String>> people = new HashMap();
        PersonalityCalculator instance = new PersonalityCalculator();
        List<String> words1 = new ArrayList();
        words1.add("I");
        words1.add("ate");
        words1.add("a");
        words1.add("pickle");
        people.put("Baylor", words1);
        List<String> words2 = new ArrayList();
        words2.add("This");
        words2.add("is");
        words2.add("a");
        words2.add("very");
        words2.add("controversial");
        words2.add("decision");
        people.put("Roy", words2);
        List<String> words3 = new ArrayList();
        words3.add("Text");
        words3.add("mining");
        words3.add("is");
        words3.add("the");
        words3.add("hottest");
        words3.add("topic");
        words3.add("in");
        words3.add("information");
        words3.add("retrieval");
        people.put("Ayush", words3);        
        List<String> words4 = new ArrayList();
        words4.add("I");
        words4.add("love");
        words4.add("watching");
        words4.add("pokemon");
        words4.add("all");
        words4.add("the");
        words4.add("time");
        
        people.put("Jessica", words4);
        List<String> noiseWords = new ArrayList();
        noiseWords.add("a");
        noiseWords.add("in");
        noiseWords.add("the");       
        
        String expResult = "Ayush";
        String result = instance.getMostPompous(people, noiseWords);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
