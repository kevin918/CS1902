package hw1.q02;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Shakil and parts of baylor
 */

public class Q2Test {

    @Test
    public void createAnimal() {
        // Can the animal class handle new Animals?
        Animal instance = new Animal("fox", "");
        System.out.println("but what does the fox say?");
       
        // It should not be null, if it is, then the class was created wrong
        assertNotNull("animal shoulnd't be null", instance);
        
        // ensure that the animal is what's returned
        boolean isCorrectType = (instance instanceof Animal);
        assertTrue("animal is of type animal", isCorrectType);
    }
    
    @Test
    public void animalType() {
        Animal instance = new Animal("Zedonk", "neigh");
        String expectedResult = "Zedonk";
        String actualResult = instance.getType();
        assertEquals("Animal type 'Zedonk' expected", expectedResult, actualResult);
    }
    
    @Test
    public void animalSound() {
        Animal instance = new Animal("Liger", "roar");
        String expectedResult = "roar";
        String actualResult = instance.getSound();
        assertEquals("Liger goes 'roar'", expectedResult, actualResult);
    }
    
    // Time to test the moos
    @Test
    public void createCow() {
        Animal instance = new Cow();
        assertNotNull("The Cow wasn't created...", instance);

        boolean isCorrectType = (instance instanceof Cow);
        assertTrue("cow should be of type Cow", isCorrectType);
    }

    @Test
    public void cowType() {
        Animal instance = new Cow();
        String expectedResult = "Cow";
        String actualResult = instance.getType();
        assertEquals("a Cow should be a 'Cow'", expectedResult, actualResult);
    }

    @Test
    public void cowSay() {
        Animal instance = new Cow();
        String expectedResult = "moo";
        String actualResult = instance.getSound();
        assertEquals("A Cow goes moo", expectedResult, actualResult);
    }
    
    // Time to feed the ducks
    @Test
    public void createDuck() {
        Animal instance = new Duck();
        assertNotNull("The Duck wasn't created...", instance);

        boolean isCorrectType = (instance instanceof Duck);
        assertTrue("duck should be of type Duck", isCorrectType);
    }

    @Test
    public void duckType() {
        Animal instance = new Duck();
        String expectedResult = "Duck";
        String actualResult = instance.getType();
        assertEquals("a Duck should be a 'Duck'", expectedResult, actualResult);
    }

    @Test
    public void duckSound() {
        Animal instance = new Duck();
        String expectedResult = "quack";
        String actualResult = instance.getSound();
        assertEquals("A Duck goes quack", expectedResult, actualResult);
    }
    
    @Test
    public void createHorse() {
        Animal instance = new Horse();
        assertNotNull("The Horse wasn't created...", instance);

        boolean isCorrectType = (instance instanceof Horse);
        assertTrue("horse should be of type Horse", isCorrectType);
    }

    @Test
    public void horseType() {
        Animal instance = new Horse();
        String expectedResult = "Horse";
        String actualResult = instance.getType();
        assertEquals("a Horse should be a 'Horse'", expectedResult, actualResult);
    }

    @Test
    public void horseSound() {
        Animal instance = new Horse();
        String expectedResult = "neigh";
        String actualResult = instance.getSound();
        assertEquals("A Horse goes neigh", expectedResult, actualResult);
    }

    @Test
    public void createGazelle() {
        Animal instance = new Gazelle();
        assertNotNull("The Gazelle wasn't created...", instance);

        boolean isCorrectType = (instance instanceof Gazelle);
        assertTrue("gazelle should be of type Gazelle", isCorrectType);
    }

    @Test
    public void gazelleType() {
        Animal instance = new Gazelle();
        String expectedResult = "gazelle";
        String actualResult = instance.getType();
        assertEquals("a Gazelle should be a 'Gazelle'", expectedResult, actualResult);
    }

    @Test
    public void gazelleSound() {
        Animal instance = new Gazelle();
        String expectedResult = "";
        String actualResult = instance.getSound();
        assertEquals("The gazelle doesn't make a sound.", expectedResult, actualResult);
    }
    
}