package hw3.q04;

import hw3.q04.ExpressionTree;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Lars & Shak (i found this in an old dir and removed edge cases)
 */
public class ExpressionTreeTest
{
    /************************************************************************
     * Tests of getExpressionAsInfix method, of class ExpressionTree
     ************************************************************************/

    @Test
    public void testGetExpressionAsInfixOneNumber() {
        System.out.println("testGetExpressionAsInfixOneNumber");
        String testPrefixExpr = "3";
        ExpressionTree instance = new ExpressionTree(testPrefixExpr);

        String expResult = "3";
        String result = instance.getExpressionAsInfix();

        assertEquals("Testing the getExpressionAsInfix method on a single number.", expResult, result);
    }

    @Test
    public void testGetExpressionAsInfixOneOperator() {
        System.out.println("testGetExpressionAsInfixOneOperator");
        String testPrefixExpr = "+ 1 2";
        ExpressionTree instance = new ExpressionTree(testPrefixExpr);

        String expResult = "(1 + 2)";
        String result = instance.getExpressionAsInfix();

        assertEquals("Testing the getExpressionAsInfix method on a single operator.", expResult, result);
    }

    @Test
    public void testGetExpressionAsInfixMultipleOperators() {
        System.out.println("testGetExpressionAsInfixOneOperator_Addition");
        String testPrefixExpr = "* + 8 4 - 7 / 6 3";
        ExpressionTree instance = new ExpressionTree(testPrefixExpr);

        String expResult = "((8 + 4) * (7 - (6 / 3)))";
        String result = instance.getExpressionAsInfix();

        assertEquals("Testing the getExpressionAsInfix method on multiple operators.", expResult, result);
    }

    /**
     * **********************************************************************
     */
    /* Tests of getExpressionAsPostfix method, of class ExpressionTree       */
    /**
     * **********************************************************************
     */

    @Test
    public void testGetExpressionAsPostfixOneOperator() {
        System.out.println("testGetExpressionAsPostfixOneOperator");
        String testPrefixExpr = "+ 1 2";
        ExpressionTree instance = new ExpressionTree(testPrefixExpr);

        String expResult = "(1 2 +)";
        String result = instance.getExpressionAsPostfix();

        assertEquals("Testing the getExpressionAsPostfix method on a single operator.", expResult, result);
    }

    @Test
    public void testGetExpressionAsPostfixMultipleOperators() {
        System.out.println("testGetExpressionAsPostfixOneOperator_Addition");
        String testPrefixExpr = "* + 8 4 - 7 / 6 3";
        ExpressionTree instance = new ExpressionTree(testPrefixExpr);

        String expResult = "((8 4 +)(7 (6 3 /)-)*)";
        String result = instance.getExpressionAsPostfix();

        assertEquals("Testing the getExpressionAsPostfix method on multiple operators.", expResult, result);
    }

    /**
     * **********************************************************************
     */
    /* Tests of getExpressionAsPrefix method, of class ExpressionTree        */
    /**
     * **********************************************************************
     */

    @Test
    public void testGetExpressionAsPrefixOneOperator() {
        System.out.println("testGetExpressionAsPrefixOneOperator");
        String testPrefixExpr = "+ 1 2";
        ExpressionTree instance = new ExpressionTree(testPrefixExpr);

        String expResult = "(+ 1 2)";
        String result = instance.getExpressionAsPrefix();

        assertEquals("Testing the getExpressionAsPrefix method on a single operator.", expResult, result);
    }

    @Test
    public void testGetExpressionAsPrefixMultipleOperators() {
        System.out.println("testGetExpressionAsPrefixOneOperator_Addition");
        String testPrefixExpr = "* + 8 4 - 7 / 6 3";
        ExpressionTree instance = new ExpressionTree(testPrefixExpr);

        String expResult = "(*(+ 8 4)(- 7(/ 6 3)))";
        String result = instance.getExpressionAsPrefix();

        assertEquals("Testing the getExpressionAsPrefix method on multiple operators.", expResult, result);
    }

    /**
     * **********************************************************************
     */
    /* Tests of getValue method, of class ExpressionTree                     */
    /**
     * **********************************************************************
     */

    @Test
    public void testGetValueOneNumber() {
        System.out.println("testGetExpressionAsPrefixOneNumber");
        String testPrefixExpr = "3";
        ExpressionTree instance = new ExpressionTree(testPrefixExpr);

        float expResult = 3.0f;
        float result = instance.getValue();

        assertEquals("Testing the getExpressionAsPrefix method on a single number.", expResult, result, 0.0);
    }

    @Test
    public void testGetValueOneOperator_Addition() {
        System.out.println("testGetValueOneOperator_Addition");
        String testPrefixExpr = "+ 1 2";
        ExpressionTree instance = new ExpressionTree(testPrefixExpr);

        float expResult = 3.0f;
        float result = instance.getValue();

        assertEquals("Testing the getValue method on a single addition operation.", expResult, result, 0.0);
    }

    @Test
    public void testGetValueOneOperator_Subtraction() {
        System.out.println("testGetValueOneOperator_Subtraction");
        String testPrefixExpr = "- 9 3";
        ExpressionTree instance = new ExpressionTree(testPrefixExpr);

        float expResult = 6.0f;
        float result = instance.getValue();

        assertEquals("Testing the getValue method on a single subtraction operation.", expResult, result, 0.0);
    }

    @Test
    public void testGetValueOneOperator_Multiplication() {
        System.out.println("testGetValueOneOperator_Multiplication");
        String testPrefixExpr = "* 4 7";
        ExpressionTree instance = new ExpressionTree(testPrefixExpr);

        float expResult = 28.0f;
        float result = instance.getValue();

        assertEquals("Testing the getValue method on a single multiplication operation.", expResult, result, 0.0);
    }

    @Test
    public void testGetValueOneOperator_Division() {
        System.out.println("testGetValueOneOperator_Division");
        String testPrefixExpr = "/ 9 4";
        ExpressionTree instance = new ExpressionTree(testPrefixExpr);

        float expResult = 2.25f;
        float result = instance.getValue();

        assertEquals("Testing the getValue method on a single division operation.", expResult, result, 0.0);
    }

    @Test
    public void testGetValueMultipleOperators() {
        System.out.println("testGetExpressionAsPrefixOneOperator_Addition");
        String testPrefixExpr = "* + 8 4 - 7 / 5 3";
        ExpressionTree instance = new ExpressionTree(testPrefixExpr);

        float expResult = 64.0f;
        float result = instance.getValue();

        assertEquals("Testing the getExpressionAsPrefix method on multiple operators.", expResult, result, 0.0);
    }
}
