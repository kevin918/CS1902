/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1.q01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ramith Jayatilleka
 */
public class ABunchOfRandomMethodsTest {

    /**
     * Test of add method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testAdd_int_int() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        int a = 0, b = 0;
        assertEquals(a + " + " + b, 0, instance.add(a, b));
        a = 0; b = 1;
        assertEquals(a + " + " + b, 1, instance.add(a, b));
        a = 1; b = 0;
        assertEquals(a + " + " + b, 1, instance.add(a, b));
        a = 1; b = 10;
        assertEquals(a + " + " + b, 11, instance.add(a, b));
        a = 0; b = -2000;
        assertEquals(a + " + " + b, -2000, instance.add(a, b));
        a = 232; b = -23;
        assertEquals(a + " + " + b, 209, instance.add(a, b));
        a = -45; b = -290;
        assertEquals(a + " + " + b, -335, instance.add(a, b));
        a = -32; b = 31;
        assertEquals(a + " + " + b, -1, instance.add(a, b));
        a = -40; b = 40;
        assertEquals(a + " + " + b, 0, instance.add(a, b));
    }
    
    /**
     * Test of add method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testAdd_String_String() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        String a = "", b = "";
        assertEquals("\"" + a + "\" + \"" + b + "\"", "", instance.add(a, b));
        a = ""; b = "a";
        assertEquals("\"" + a + "\" + \"" + b + "\"", "a", instance.add(a, b));
        a = ""; b = "abra";
        assertEquals("\"" + a + "\" + \"" + b + "\"", "abra", instance.add(a, b));
        a = "a"; b = "";
        assertEquals("\"" + a + "\" + \"" + b + "\"", "a", instance.add(a, b));
        a = "abra"; b = "";
        assertEquals("\"" + a + "\" + \"" + b + "\"", "abra", instance.add(a, b));
        a = "ab"; b = "ra";
        assertEquals("\"" + a + "\" + \"" + b + "\"", "abra", instance.add(a, b));
        a = "ra"; b = "ab";
        assertEquals("\"" + a + "\" + \"" + b + "\"", "raab", instance.add(a, b));
        a = "1% talent "; b = "99% effort";
        assertEquals("\"" + a + "\" + \"" + b + "\"", "1% talent 99% effort", instance.add(a, b));
    }

    /**
     * Test of calculateAverage method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testCalculateAverage_intArr() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        int[] numbers = {};
        assertEquals(numbers.toString(), 0.0 ,instance.calculateAverage(numbers), .01);
        numbers = new int[] {1};
        assertEquals(numbers.toString(), 1.0 ,instance.calculateAverage(numbers), .01);
        numbers = new int[] {8};
        assertEquals(numbers.toString(), 8.0 ,instance.calculateAverage(numbers), .01);
        numbers = new int[] {1, 3};
        assertEquals(numbers.toString(), 2.0 ,instance.calculateAverage(numbers), .01);
        numbers = new int[] {1, 8};
        assertEquals(numbers.toString(), 4.5 ,instance.calculateAverage(numbers), .01);
        numbers = new int[] {1, 2, 4, 8};
        assertEquals(numbers.toString(), 3.75 ,instance.calculateAverage(numbers), .01);
        numbers = new int[] {0, -10};
        assertEquals(numbers.toString(), -5.0 ,instance.calculateAverage(numbers), .01);
        numbers = new int[] {100, 2, 30, 0, 1, -13};
        assertEquals(numbers.toString(), 20.0 ,instance.calculateAverage(numbers), .01);
    }

    /**
     * Test of calculateAverageAsInt method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testCalculateAverageAsInt_intArr() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        int[] numbers = {};
        assertEquals(numbers.toString(), 0 ,instance.calculateAverageAsInt(numbers));
        numbers = new int[] {1};
        assertEquals(numbers.toString(), 1 ,instance.calculateAverageAsInt(numbers));
        numbers = new int[] {8};
        assertEquals(numbers.toString(), 8 ,instance.calculateAverageAsInt(numbers));
        numbers = new int[] {1, 3};
        assertEquals(numbers.toString(), 2 ,instance.calculateAverageAsInt(numbers));
        numbers = new int[] {1, 8};
        assertEquals(numbers.toString(), 4 ,instance.calculateAverageAsInt(numbers));
        numbers = new int[] {1, 2, 4, 8};
        assertEquals(numbers.toString(), 3 ,instance.calculateAverageAsInt(numbers));
        numbers = new int[] {0, -10};
        assertEquals(numbers.toString(), -5 ,instance.calculateAverageAsInt(numbers));
        numbers = new int[] {100, 2, 30, 0, 1, -13};
        assertEquals(numbers.toString(), 20 ,instance.calculateAverageAsInt(numbers));
    }

    /**
     * Test of calculateAverage method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testCalculateAverage_ArrayList() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        Integer[] numbers = {};
        assertEquals("<" + numbers.toString() + ">", 0.0 ,instance.calculateAverage(new ArrayList<>(Arrays.asList(numbers))), .01);
        numbers = new Integer[] {1};
        assertEquals("<" + numbers.toString() + ">", 1.0 ,instance.calculateAverage(new ArrayList<>(Arrays.asList(numbers))), .01);
        numbers = new Integer[] {8};
        assertEquals("<" + numbers.toString() + ">", 8.0 ,instance.calculateAverage(new ArrayList<>(Arrays.asList(numbers))), .01);
        numbers = new Integer[] {1, 3};
        assertEquals("<" + numbers.toString() + ">", 2.0 ,instance.calculateAverage(new ArrayList<>(Arrays.asList(numbers))), .01);
        numbers = new Integer[] {1, 8};
        assertEquals("<" + numbers.toString() + ">", 4.5 ,instance.calculateAverage(new ArrayList<>(Arrays.asList(numbers))), .01);
        numbers = new Integer[] {1, 2, 4, 8};
        assertEquals("<" + numbers.toString() + ">", 3.75 ,instance.calculateAverage(new ArrayList<>(Arrays.asList(numbers))), .01);
        numbers = new Integer[] {0, -10};
        assertEquals("<" + numbers.toString() + ">", -5.0 ,instance.calculateAverage(new ArrayList<>(Arrays.asList(numbers))), .01);
        numbers = new Integer[] {100, 2, 30, 0, 1, -13};
        assertEquals("<" + numbers.toString() + ">", 20.0 ,instance.calculateAverage(new ArrayList<>(Arrays.asList(numbers))), .01);
    }

    /**
     * Test of calculateAverageAsInt method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testCalculateAverageAsInt_ArrayList() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        Integer[] numbers = {};
        assertEquals("<" + numbers.toString() + ">", 0 ,instance.calculateAverageAsInt(new ArrayList<>(Arrays.asList(numbers))));
        numbers = new Integer[] {1};
        assertEquals("<" + numbers.toString() + ">", 1 ,instance.calculateAverageAsInt(new ArrayList<>(Arrays.asList(numbers))));
        numbers = new Integer[] {8};
        assertEquals("<" + numbers.toString() + ">", 8 ,instance.calculateAverageAsInt(new ArrayList<>(Arrays.asList(numbers))));
        numbers = new Integer[] {1, 3};
        assertEquals("<" + numbers.toString() + ">", 2 ,instance.calculateAverageAsInt(new ArrayList<>(Arrays.asList(numbers))));
        numbers = new Integer[] {1, 8};
        assertEquals("<" + numbers.toString() + ">", 4 ,instance.calculateAverageAsInt(new ArrayList<>(Arrays.asList(numbers))));
        numbers = new Integer[] {1, 2, 4, 8};
        assertEquals("<" + numbers.toString() + ">", 3 ,instance.calculateAverageAsInt(new ArrayList<>(Arrays.asList(numbers))));
        numbers = new Integer[] {0, -10};
        assertEquals("<" + numbers.toString() + ">", -5 ,instance.calculateAverageAsInt(new ArrayList<>(Arrays.asList(numbers))));
        numbers = new Integer[] {100, 2, 30, 0, 1, -13};
        assertEquals("<" + numbers.toString() + ">", 20 ,instance.calculateAverageAsInt(new ArrayList<>(Arrays.asList(numbers))));
    }

    /**
     * Test of canLegallyDrink method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testCanLegallyDrink() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        assertEquals("" + 0, false, instance.canLegallyDrink(0));
        assertEquals("" + 1, false, instance.canLegallyDrink(1));
        assertEquals("" + -1, false, instance.canLegallyDrink(-1));
        assertEquals("" + 20, false, instance.canLegallyDrink(20));
        assertEquals("" + 21, true, instance.canLegallyDrink(21));
        assertEquals("" + 24, true, instance.canLegallyDrink(24));
        assertEquals("" + 80, true, instance.canLegallyDrink(80));
    }

    /**
     * Test of canLegallyKill method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testCanLegallyKill() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        int age = 0;
        String gender = "";
        assertEquals(age + " " + gender, false, instance.canLegallyKill(age, gender));
        age = 0;
        gender = "male";
        assertEquals(age + " " + gender, false, instance.canLegallyKill(age, gender));
        age = 0;
        gender = "female";
        assertEquals(age + " " + gender, false, instance.canLegallyKill(age, gender));
        age = 0;
        gender = "Male";
        assertEquals(age + " " + gender, false, instance.canLegallyKill(age, gender));
        age = 0;
        gender = "gibberish";
        assertEquals(age + " " + gender, false, instance.canLegallyKill(age, gender));
        age = 18;
        gender = "";
        assertEquals(age + " " + gender, false, instance.canLegallyKill(age, gender));
        age = 18;
        gender = "male";
        assertEquals(age + " " + gender, true, instance.canLegallyKill(age, gender));
        age = 18;
        gender = "female";
        assertEquals(age + " " + gender, false, instance.canLegallyKill(age, gender));
        age = 18;
        gender = "Male";
        assertEquals(age + " " + gender, false, instance.canLegallyKill(age, gender));
        age = 18;
        gender = "gibberish";
        assertEquals(age + " " + gender, false, instance.canLegallyKill(age, gender));
    }

    /**
     * Test of convertToInt method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testConvertToInt_double() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        double fp = 0.0;
        assertEquals("" + fp, 0, instance.convertToInt(fp));
        fp = 1.0;
        assertEquals("" + fp, 1, instance.convertToInt(fp));
        fp = 1.2;
        assertEquals("" + fp, 1, instance.convertToInt(fp));
        fp = 1.8;
        assertEquals("" + fp, 1, instance.convertToInt(fp));
        fp = 10.0;
        assertEquals("" + fp, 10, instance.convertToInt(fp));
        fp = -10.2;
        assertEquals("" + fp, -10, instance.convertToInt(fp));
    }

    /**
     * Test of convertToInt method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testConvertToInt_String() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        String s = "0";
        assertEquals("" + s, 0, instance.convertToInt(s));
        s = "-0";
        assertEquals("" + s, 0, instance.convertToInt(s));
        s = "4";
        assertEquals("" + s, 4, instance.convertToInt(s));
        s = "10";
        assertEquals("" + s, 10, instance.convertToInt(s));
        s = "-13";
        assertEquals("" + s, -13, instance.convertToInt(s));
    }

    /**
     * Test of convertToLowerCase method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testConvertToLowerCase() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        String s = "";
        assertEquals(s, "", instance.convertToLowerCase(s));
        s = "hello";
        assertEquals(s, "hello", instance.convertToLowerCase(s));
        s = "Hello";
        assertEquals(s, "hello", instance.convertToLowerCase(s));
        s = "Hello World";
        assertEquals(s, "hello world", instance.convertToLowerCase(s));
        s = "HeLlO WoRlD";
        assertEquals(s, "hello world", instance.convertToLowerCase(s));
        s = "hELLO wORLd";
        assertEquals(s, "hello world", instance.convertToLowerCase(s));
    }

    /**
     * Test of convertToString method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testConvertToString() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        int i = 0;
        assertEquals("0", instance.convertToString(i));
        i = 1;
        assertEquals("1", instance.convertToString(i));
        i = -2;
        assertEquals("-2", instance.convertToString(i));
        i = 3103;
        assertEquals("3103", instance.convertToString(i));
    }

    /**
     * Test of divide method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testDivide() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        int number = 0;
        int divisor = 2;        
        assertEquals(0.0, instance.divide(number, divisor), 0.01);
        number = 0;
        divisor = 1;        
        assertEquals(0.0, instance.divide(number, divisor), 0.01);
        number = 1;
        divisor = 1;        
        assertEquals(1.0, instance.divide(number, divisor), 0.01);
        number = 203;
        divisor = 323;        
        assertEquals(0.62848, instance.divide(number, divisor), 0.01);
        number = -203;
        divisor = 41;        
        assertEquals(-4.95122, instance.divide(number, divisor), 0.01);
    }


    /**
     * Test of divideAsInt method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testDivideAsInt() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        int number = 0;
        int divisor = 3;
        assertEquals(0, instance.divideAsInt(number, divisor));
        number = 0;
        divisor = 1;        
        assertEquals(0, instance.divideAsInt(number, divisor));
        number = 1;
        divisor = 1;        
        assertEquals(1, instance.divideAsInt(number, divisor));
        number = 203;
        divisor = 323;        
        assertEquals(0, instance.divideAsInt(number, divisor));
        number = -203;
        divisor = 41;        
        assertEquals(-4, instance.divideAsInt(number, divisor));
    }

    /**
     * Test of feed method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testFeed() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        Puppy p = new Puppy();
        p.weight = 0;
        instance.feed(p, 0);
        assertEquals(0, p.weight);
        instance.feed(p, 1);
        assertEquals(1, p.weight);
        instance.feed(p, -1);
        assertEquals(0, p.weight);
        instance.feed(p, 10);
        assertEquals(10, p.weight);
        instance.feed(p, 5);
        assertEquals(15, p.weight);
        instance.feed(p, -20);
        assertEquals(-5, p.weight);
    }

    /**
     * Test of fill method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testFill() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        int x = 3;
        int y = 3;
        int v = 2;
        int[][] matrix = new int[x][y];
        instance.fill(matrix, v);
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                assertEquals("At matrix[" + i + "][" + j + "]", v, matrix[i][j]);
            }
        }
        x = 1;
        y = 1;
        v = 6;
        matrix = new int[x][y];
        instance.fill(matrix, v);
        for (int i = 0; i < 0; i++) {
            for (int j = 0; j < 0; j++) {
                assertEquals("At matrix[" + i + "][" + j + "]", v, matrix[i][j]);
            }
        }
        x = 5;
        y = 3;
        v = -30;
        matrix = new int[x][y];
        instance.fill(matrix, v);
        for (int i = 0; i < 0; i++) {
            for (int j = 0; j < 0; j++) {
                assertEquals("At matrix[" + i + "][" + j + "]", v, matrix[i][j]);
            }
        }
    }

    /**
     * Test of getCharacter method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testGetCharacter() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        String s = "hello world";
        int i = 0;
        assertEquals(i + "th char of \"" + s + "\"", 'h', instance.getCharacter(s, i));
        i = 1;
        assertEquals(i + "th char of \"" + s + "\"", 'e', instance.getCharacter(s, i));
        i = 4;
        assertEquals(i + "th char of \"" + s + "\"", 'o', instance.getCharacter(s, i));
        i = 5;
        assertEquals(i + "th char of \"" + s + "\"", ' ', instance.getCharacter(s, i));
        i = 10;
        assertEquals(i + "th char of \"" + s + "\"", 'd', instance.getCharacter(s, i));
    }

    /**
     * Test of getCharacterAsString method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testGetCharacterAsString() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        String s = "hello world";
        int i = 0;
        assertEquals(i + "th char of \"" + s + "\"", "h", instance.getCharacterAsString(s, i));
        i = 1;
        assertEquals(i + "th char of \"" + s + "\"", "e", instance.getCharacterAsString(s, i));
        i = 4;
        assertEquals(i + "th char of \"" + s + "\"", "o", instance.getCharacterAsString(s, i));
        i = 5;
        assertEquals(i + "th char of \"" + s + "\"", " ", instance.getCharacterAsString(s, i));
        i = 10;
        assertEquals(i + "th char of \"" + s + "\"", "d", instance.getCharacterAsString(s, i));
    }

    /**
     * Test of getGradePoints method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testGetGradePoints() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        String letterGrade = "";
        assertEquals(letterGrade, 0.000, instance.getGradePoints(letterGrade), 0.01);
        letterGrade = "gibb434erish";
        assertEquals(letterGrade, 0.000, instance.getGradePoints(letterGrade), 0.01);
        letterGrade = "A";
        assertEquals(letterGrade, 4.000, instance.getGradePoints(letterGrade), 0.01);
        letterGrade = "A-";
        assertEquals(letterGrade, 3.667, instance.getGradePoints(letterGrade), 0.01);
        letterGrade = "B+";
        assertEquals(letterGrade, 3.333, instance.getGradePoints(letterGrade), 0.01);
        letterGrade = "B";
        assertEquals(letterGrade, 3.000, instance.getGradePoints(letterGrade), 0.01);
        letterGrade = "B-";
        assertEquals(letterGrade, 2.667, instance.getGradePoints(letterGrade), 0.01);
        letterGrade = "C+";
        assertEquals(letterGrade, 2.333, instance.getGradePoints(letterGrade), 0.01);
        letterGrade = "C";
        assertEquals(letterGrade, 2.000, instance.getGradePoints(letterGrade), 0.01);
        letterGrade = "C-";
        assertEquals(letterGrade, 1.667, instance.getGradePoints(letterGrade), 0.01);
        letterGrade = "D+";
        assertEquals(letterGrade, 1.333, instance.getGradePoints(letterGrade), 0.01);
        letterGrade = "D";
        assertEquals(letterGrade, 1.000, instance.getGradePoints(letterGrade), 0.01);
        letterGrade = "F";
        assertEquals(letterGrade, 0.000, instance.getGradePoints(letterGrade), 0.01);
        letterGrade = "b";
        assertEquals(letterGrade, 3.000, instance.getGradePoints(letterGrade), 0.01);
        letterGrade = "a-";
        assertEquals(letterGrade, 3.667, instance.getGradePoints(letterGrade), 0.01);
    }

    /**
     * Test of getLassie method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testGetLassie() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        assertEquals("Lassie", instance.getLassie().name);
    }

    /**
     * Test of getLength method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testGetLength_floatArr() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        float[] numbers = {};
        assertEquals("<" + numbers.toString() + ">", 0, instance.getLength(numbers));
        numbers = new float[] {0.0f};
        assertEquals("<" + numbers.toString() + ">", 1, instance.getLength(numbers));
        numbers = new float[] {10.3f};
        assertEquals("<" + numbers.toString() + ">", 1, instance.getLength(numbers));
        numbers = new float[] {9.0f, 0.0f};
        assertEquals("<" + numbers.toString() + ">", 2, instance.getLength(numbers));
        numbers = new float[] {32.4f, 535.0f, -12.3f, -32.0f};
        assertEquals("<" + numbers.toString() + ">", 4, instance.getLength(numbers));
    }

    /**
     * Test of getLength method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testGetLength_LinkedList() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        LinkedList<Boolean> bools = new LinkedList<>(Arrays.asList(new Boolean[] {}));
        assertEquals("<" + bools.toString() + ">", 0, instance.getLength(bools));
        bools = new LinkedList<>(Arrays.asList(new Boolean[] {true}));
        assertEquals("<" + bools.toString() + ">", 1, instance.getLength(bools));
        bools = new LinkedList<>(Arrays.asList(new Boolean[] {false}));
        assertEquals("<" + bools.toString() + ">", 1, instance.getLength(bools));
        bools = new LinkedList<>(Arrays.asList(new Boolean[] {true, false}));
        assertEquals("<" + bools.toString() + ">", 2, instance.getLength(bools));
        bools = new LinkedList<>(Arrays.asList(new Boolean[] {false, true, true, true}));
        assertEquals("<" + bools.toString() + ">", 4, instance.getLength(bools));
    }

    /**
     * Test of getLength method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testGetLength_String() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        String s = "";
        assertEquals("\"" + s + "\"", 0, instance.getLength(s));
        s = "hello world";
        assertEquals("\"" + s + "\"", 11, instance.getLength(s));
        s = "HelloWorld!!!";
        assertEquals("\"" + s + "\"", 13, instance.getLength(s));
        s = "0303";
        assertEquals("\"" + s + "\"", 4, instance.getLength(s));
    }

    /**
     * Test of getLengthOfFirstDimension method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testGetLengthOfFirstDimension() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        int x = 1;
        int y = 1;
        assertEquals(x + " X " + y, 1, instance.getLengthOfFirstDimension(new int[x][y]));
        x = 3;
        y = 3;
        assertEquals(x + " X " + y, 3, instance.getLengthOfFirstDimension(new int[x][y]));
        x = 5;
        y = 3;
        assertEquals(x + " X " + y, 5, instance.getLengthOfFirstDimension(new int[x][y]));
        x = 8;
        y = 2;
        assertEquals(x + " X " + y, 8, instance.getLengthOfFirstDimension(new int[x][y]));
        x = 2;
        y = 4;
        assertEquals(x + " X " + y, 2, instance.getLengthOfFirstDimension(new int[x][y]));
    }

    /**
     * Test of getLengthOfSecondDimension method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testGetLengthOfSecondDimension() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        int x = 1;
        int y = 1;
        assertEquals(x + " X " + y, 1, instance.getLengthOfSecondDimension(new int[x][y]));
        x = 3;
        y = 3;
        assertEquals(x + " X " + y, 3, instance.getLengthOfSecondDimension(new int[x][y]));
        x = 5;
        y = 3;
        assertEquals(x + " X " + y, 3, instance.getLengthOfSecondDimension(new int[x][y]));
        x = 8;
        y = 2;
        assertEquals(x + " X " + y, 2, instance.getLengthOfSecondDimension(new int[x][y]));
        x = 2;
        y = 4;
        assertEquals(x + " X " + y, 4, instance.getLengthOfSecondDimension(new int[x][y]));
    }

    /**
     * Test of getPercentFailing method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testGetPercentFailing() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        Double[] grades = {0.0};
        assertEquals("<" + grades.toString() + ">", 100.0, instance.getPercentFailing(new ArrayList<>(Arrays.asList(grades))), 0.01);
        grades = new Double[] {32.0};
        assertEquals("<" + grades.toString() + ">", 100.0, instance.getPercentFailing(new ArrayList<>(Arrays.asList(grades))), 0.01);
        grades = new Double[] {61.0};
        assertEquals("<" + grades.toString() + ">", 0.0, instance.getPercentFailing(new ArrayList<>(Arrays.asList(grades))), 0.01);
        grades = new Double[] {38.4, 83.9};
        assertEquals("<" + grades.toString() + ">", 50.0, instance.getPercentFailing(new ArrayList<>(Arrays.asList(grades))), 0.01);
        grades = new Double[] {102.1, 98.0, 77.4};
        assertEquals("<" + grades.toString() + ">", 0.0, instance.getPercentFailing(new ArrayList<>(Arrays.asList(grades))), 0.01);
        grades = new Double[] {12.0, 34.0, 45.2};
        assertEquals("<" + grades.toString() + ">", 100.0, instance.getPercentFailing(new ArrayList<>(Arrays.asList(grades))), 0.01);
    }

    /**
     * Test of getPuppy method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testGetPuppy() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        String name = "";
        int weight = 0;
        Puppy p = instance.getPuppy(name, weight);
        assertEquals("Name: " + name + " Weight: " + weight, "", p.name);
        assertEquals("Name: " + name + " Weight: " + weight, 0, p.weight);
        name = "Lassie";
        weight = 0;
        p = instance.getPuppy(name, weight);
        assertEquals("Name: " + name + " Weight: " + weight, "Lassie", p.name);
        assertEquals("Name: " + name + " Weight: " + weight, 0, p.weight);
        name = "Lassie";
        weight = 10;
        p = instance.getPuppy(name, weight);
        assertEquals("Name: " + name + " Weight: " + weight, "Lassie", p.name);
        assertEquals("Name: " + name + " Weight: " + weight, 10, p.weight);
        name = "Old Yeller";
        weight = 33;
        p = instance.getPuppy(name, weight);
        assertEquals("Name: " + name + " Weight: " + weight, "Old Yeller", p.name);
        assertEquals("Name: " + name + " Weight: " + weight, 33, p.weight);
        name = "Dead Dog";
        weight = -13;
        p = instance.getPuppy(name, weight);
        assertEquals("Name: " + name + " Weight: " + weight, "Dead Dog", p.name);
        assertEquals("Name: " + name + " Weight: " + weight, -13, p.weight);
    }

    /**
     * Test of getTotalWeight method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testGetTotalWeight() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        LinkedList<Puppy> bulkGoods = new LinkedList<>();
        assertEquals(0, instance.getTotalWeight(bulkGoods));
        bulkGoods.add(new Puppy());
        bulkGoods.get(bulkGoods.size()-1).weight = 20;
        assertEquals(20, instance.getTotalWeight(bulkGoods));
        bulkGoods.add(new Puppy());
        bulkGoods.get(bulkGoods.size()-1).weight = 23;
        assertEquals(43, instance.getTotalWeight(bulkGoods));
        bulkGoods.add(new Puppy());
        bulkGoods.get(bulkGoods.size()-1).weight = 4;
        assertEquals(47, instance.getTotalWeight(bulkGoods));
        bulkGoods.add(new Puppy());
        bulkGoods.get(bulkGoods.size()-1).weight = -2352;
        assertEquals(-2305, instance.getTotalWeight(bulkGoods));
    }

    /**
     * Test of isAMovie method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testIsAMovie() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        String s = "hello";
        assertEquals("\"" + s + "\"", false, instance.isAMovie(s));
        s = "hello.mov";
        assertEquals("\"" + s + "\"", true, instance.isAMovie(s));
        s = "hello.avi";
        assertEquals("\"" + s + "\"", true, instance.isAMovie(s));
        s = "hello.mp4";
        assertEquals("\"" + s + "\"", true, instance.isAMovie(s));
        s = "hello.m p4";
        assertEquals("\"" + s + "\"", false, instance.isAMovie(s));
        s = "";
        assertEquals("\"" + s + "\"", false, instance.isAMovie(s));
    }

    /**
     * Test of isBob method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testIsBob() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        String s = "Bob";
        assertEquals("\"" + s + "\"", true, instance.isBob(s));
        s = "bob";
        assertEquals("\"" + s + "\"", true, instance.isBob(s));
        s = "bobby";
        assertEquals("\"" + s + "\"", false, instance.isBob(s));
        s = "Bobby";
        assertEquals("\"" + s + "\"", false, instance.isBob(s));
        s = "";
        assertEquals("\"" + s + "\"", false, instance.isBob(s));
    }

    /**
     * Test of isPassingEverything method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testIsPassingEverything() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        int labGrade = 0;
        int homeworkGrade = 0;
        int examGrade = 0;
        assertEquals(labGrade + " " + homeworkGrade + " " + examGrade, false, instance.isPassingEverything(labGrade, homeworkGrade, examGrade));
        labGrade = 80;
        homeworkGrade = 0;
        examGrade = 0;
        assertEquals(labGrade + " " + homeworkGrade + " " + examGrade, false, instance.isPassingEverything(labGrade, homeworkGrade, examGrade));
        labGrade = 80;
        homeworkGrade = 80;
        examGrade = 0;
        assertEquals(labGrade + " " + homeworkGrade + " " + examGrade, false, instance.isPassingEverything(labGrade, homeworkGrade, examGrade));
        labGrade = 80;
        homeworkGrade = 80;
        examGrade = 80;
        assertEquals(labGrade + " " + homeworkGrade + " " + examGrade, true, instance.isPassingEverything(labGrade, homeworkGrade, examGrade));
        labGrade = 0;
        homeworkGrade = 0;
        examGrade = 80;
        assertEquals(labGrade + " " + homeworkGrade + " " + examGrade, false, instance.isPassingEverything(labGrade, homeworkGrade, examGrade));
    }

    /**
     * Test of isPassingSomething method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testIsPassingSomething() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        int labGrade = 0;
        int homeworkGrade = 0;
        int examGrade = 0;
        assertEquals(labGrade + " " + homeworkGrade + " " + examGrade, false, instance.isPassingSomething(labGrade, homeworkGrade, examGrade));
        labGrade = 80;
        homeworkGrade = 0;
        examGrade = 0;
        assertEquals(labGrade + " " + homeworkGrade + " " + examGrade, true, instance.isPassingSomething(labGrade, homeworkGrade, examGrade));
        labGrade = 80;
        homeworkGrade = 80;
        examGrade = 0;
        assertEquals(labGrade + " " + homeworkGrade + " " + examGrade, true, instance.isPassingSomething(labGrade, homeworkGrade, examGrade));
        labGrade = 80;
        homeworkGrade = 80;
        examGrade = 80;
        assertEquals(labGrade + " " + homeworkGrade + " " + examGrade, true, instance.isPassingSomething(labGrade, homeworkGrade, examGrade));
        labGrade = 0;
        homeworkGrade = 0;
        examGrade = 80;
        assertEquals(labGrade + " " + homeworkGrade + " " + examGrade, true, instance.isPassingSomething(labGrade, homeworkGrade, examGrade));
    }

    /**
     * Test of raiseToPower method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testRaiseToPower() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        int base = 0;
        int exponent = 0;
        assertEquals(base + "^" + exponent, 1, instance.raiseToPower(base, exponent));
        base = 100;
        exponent = 0;
        assertEquals(base + "^" + exponent, 1, instance.raiseToPower(base, exponent));
        base = 10;
        exponent = 3;
        assertEquals(base + "^" + exponent, 1000, instance.raiseToPower(base, exponent));
        base = 4;
        exponent = 4;
        assertEquals(base + "^" + exponent, 256, instance.raiseToPower(base, exponent));
        base = 7;
        exponent = 3;
        assertEquals(base + "^" + exponent, 343, instance.raiseToPower(base, exponent));
    }

    /**
     * Test of remainder method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testRemainder() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        int number = 0;
        int divisor = 1;
        assertEquals(number + " % " + divisor, 0, instance.remainder(number, divisor));
        number = 4;
        divisor = 1;
        assertEquals(number + " % " + divisor, 0, instance.remainder(number, divisor));
        number = 28;
        divisor = 7;
        assertEquals(number + " % " + divisor, 0, instance.remainder(number, divisor));
        number = 30;
        divisor = 7;
        assertEquals(number + " % " + divisor, 2, instance.remainder(number, divisor));
        number = 2;
        divisor = 4;
        assertEquals(number + " % " + divisor, 2, instance.remainder(number, divisor));
    }

    /**
     * Test of predictIncome method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testPredictIncome() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        int age = 0;
        assertEquals(age + "", 5000, instance.predictIncome(age));
        age = 18;
        assertEquals(age + "", 5000, instance.predictIncome(age));
        age = 22;
        assertEquals(age + "", 14000, instance.predictIncome(age));
        age = 30;
        assertEquals(age + "", 60000, instance.predictIncome(age));
        age = 45;
        assertEquals(age + "", 90000, instance.predictIncome(age));
        age = 60;
        assertEquals(age + "", 110000, instance.predictIncome(age));
    }

    /**
     * Test of sayHelloTo method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testSayHelloTo() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        String name = "";
        assertEquals(name, "Hello , how are you?", instance.sayHelloTo(name));
        name = "Joe";
        assertEquals(name, "Hello Joe, how are you?", instance.sayHelloTo(name));
        name = "Jo";
        assertEquals(name, "Hello Jo, how are you?", instance.sayHelloTo(name));
        name = "  Joey ";
        assertEquals(name, "Hello   Joey , how are you?", instance.sayHelloTo(name));
        name = " Jo hn ny";
        assertEquals(name, "Hello  Jo hn ny, how are you?", instance.sayHelloTo(name));
    }

    /**
     * Test of shouldSkipLine method, of class ABunchOfRandomMethods.
     */
    @Test
    public void testShouldSkipLine() {
        ABunchOfRandomMethods instance = new ABunchOfRandomMethods();
        String line = "";
        assertEquals("\"" + line + "\"", true, instance.shouldSkipLine(line));
        line = "hello";
        assertEquals("\"" + line + "\"", false, instance.shouldSkipLine(line));
        line = "  hello  ";
        assertEquals("\"" + line + "\"", false, instance.shouldSkipLine(line));
        line = "  hel#lo  ";
        assertEquals("\"" + line + "\"", false, instance.shouldSkipLine(line));
        line = "#hello  ";
        assertEquals("\"" + line + "\"", true, instance.shouldSkipLine(line));
        line = "   #hello# world  ";
        assertEquals("\"" + line + "\"", true, instance.shouldSkipLine(line));
    }
}
