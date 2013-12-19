package hw2.q05;

import hw2.q05.ReversePolishCalculator;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Shakil
 */
public class ReversePolishCalculatorTest {

    @Test
    public void testNoOperation() {
        ReversePolishCalculator calculator = new ReversePolishCalculator();
        List<String> expr = Arrays.asList("3.14".split(" "));
        float expResult = 3.14f;
        float actualResult = calculator.getValue(expr);
        assertEquals(expResult, actualResult, .1);
    }

    @Test
    public void textExpressionAdd() {
        ReversePolishCalculator calculator = new ReversePolishCalculator();
        List<String> expr = Arrays.asList("1 1 +".split(" "));
        float expResult = 2;
        float actualResult = calculator.getValue(expr);
        assertEquals(expResult, actualResult, .1);
    }

    @Test
    public void textExpressionSubtract() {
        ReversePolishCalculator calculator = new ReversePolishCalculator();
        List<String> expr = Arrays.asList("69 35.9 -".split(" "));
        float expResult = 33.1f;
        float actualResult = calculator.getValue(expr);
        assertEquals(expResult, actualResult, .1);
    }

    @Test
    public void textExpressionMultiply() {
        ReversePolishCalculator calculator = new ReversePolishCalculator();
        List<String> expr = Arrays.asList("16 4 *".split(" "));
        float expResult = 64;
        float actualResult = calculator.getValue(expr);
        assertEquals(expResult, actualResult, .1);
    }

    @Test
    public void textExpressionDivide() {
        ReversePolishCalculator calculator = new ReversePolishCalculator();
        List<String> expr = Arrays.asList("16 5 /".split(" "));
        float expResult = 3.2f;
        float actualResult = calculator.getValue(expr);
        assertEquals(expResult, actualResult, .1);
    }

    @Test
    public void testExpressionComplexEasy() {
        ReversePolishCalculator calculator = new ReversePolishCalculator();
        List<String> expr = Arrays.asList("2.5 2 3 + *".split(" "));
        float expResult = 12.5f;
        float actualResult = calculator.getValue(expr);
        assertEquals(expResult, actualResult, .1);
    }

    @Test
    public void textExpressionComplexMedium() {
        ReversePolishCalculator calculator = new ReversePolishCalculator();
        List<String> expr = Arrays.asList("6 3 2 + 4 * + 5 -".split(" "));
        float expResult = 21;
        float actualResult = calculator.getValue(expr);
        assertEquals(expResult, actualResult, .1);
    }

    @Test
    public void textExpressionComplexInsane() {
        ReversePolishCalculator calculator = new ReversePolishCalculator();
        List<String> expr = Arrays.asList("739.2 34.4 - 512.5 1024.2 256.9 / 12.2 + * +".split(" "));
        float expResult = 9000.517f;
        float actualResult = calculator.getValue(expr);
        assertEquals(expResult, actualResult, .5);
        System.out.println("IT'S OVER 9000!");
    }

}
