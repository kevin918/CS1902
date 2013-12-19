package hw3.q03;

import hw3.q03.TextEditor;
import hw3.q03.Action;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Jess
 */
public class TextEditorTest {

     /**
     * Test of setValue and getValue methods, of class TextEditor.
     */
    @Test
    public void testSetGetValue() {
        System.out.println("setValue");
        String value = "12345";
        TextEditor instance = new TextEditor();
        instance.setValue(value);
        String result = instance.getValue();
        assertEquals(value, result);
    }

    /**
     * Test of history MyStack<Action>, of class TextEditor.
     */
    @Test
    public void testHistory() {
        System.out.println("setValue");
        String value = "12345";
        TextEditor instance = new TextEditor();
        instance.setValue(value);
        assertTrue(instance.history.peek() instanceof Action);
    }


     /**
     * Test of hackerSetValue method, of class TextEditor.
     */
    @Test
    public void testHackerSetValue() {
        System.out.println("hackerSetValue");
        String value = "12345";
        TextEditor instance = new TextEditor();
        instance.hackerSetValue(value);
        assertTrue(instance.history.isEmpty());
    }

    @Test
    public void testHackerSetValueV2() {
        System.out.println("hackerSetValue");
        TextEditor instance = new TextEditor();
        instance.setValue("12345");
        instance.replace(1,2,"ab");
        instance.hackerSetValue("ABCDE");
        instance.undo();
        String result = instance.getValue();
        assertEquals("12CDE", result);
    }

     /**
     * Test of undo method, of class TextEditor.
     */
    @Test
    public void testUndoNoActions() {
        System.out.println("undo");
        TextEditor instance = new TextEditor();
        instance.undo();
        String result = instance.getValue();
        assertEquals("", result);
    }

    @Test
    public void testUndoOneAction() {
        System.out.println("undo one action/setValue");
        TextEditor instance = new TextEditor();
        String value = "12345";
        instance.setValue(value);
        String result = instance.getValue();
        assertEquals(value, result);
        instance.undo();
        result = instance.getValue();
        assertEquals("", result);
    }

    @Test
    public void testUndoDelete() {
        System.out.println("undo delete");
        TextEditor instance = new TextEditor();
        instance.setValue("12345");
        instance.delete(2, 3);
        String result = instance.getValue();
        assertEquals("145", result);
        instance.undo();
        result = instance.getValue();
        assertEquals("12345", result);
    }

    @Test
    public void testUndoInsert() {
        System.out.println("undo insert");
        TextEditor instance = new TextEditor();
        instance.setValue("12345");
        instance.insert("A",1);
        String result = instance.getValue();
        assertEquals("1A2345", result);
        instance.undo();
        result = instance.getValue();
        assertEquals("12345", result);
    }

    @Test
    public void testUndoReplace() {
        System.out.println("undo replace");
        TextEditor instance = new TextEditor();
        instance.setValue("12345");
        instance.replace(1,2,"A");
        String result = instance.getValue();
        assertEquals("A345", result);
        instance.undo();
        result = instance.getValue();
        assertEquals("12345", result);
    }

    @Test
    public void testUndoMultipleActions() {
        System.out.println("undo");
        TextEditor instance = new TextEditor();
        instance.setValue("12345"); //12345
        instance.setValue("ABCDE"); //ABCDE
        String result = instance.getValue();
        assertEquals("ABCDE", result);
        instance.insert("abc", 0);  //abcABCDE
        instance.insert("9",8);     //abcABCDE9
        result = instance.getValue();
        assertEquals("abcABCDE9", result);
        instance.undo();            //abcABCDE
        instance.delete(4, 5);      //abcCDE
        result = instance.getValue();
        assertEquals("abcCDE",result);
        instance.undo();            //abcABCDE
        instance.replace(1, 2, "12"); //12cABCDE
        result = instance.getValue();
        assertEquals("12cABCDE",result);
        instance.undo();            //abcABCDE
        result = instance.getValue();
        assertEquals("abcABCDE", result);
        instance.undo();            //ABCDE
        instance.undo();            //12345
        instance.undo();            //
        assertTrue(instance.history.isEmpty());
    }

    /**
     * Test of delete method, of class TextEditor.
     */
    @Test
    public void testDeleteMiddle() {
        System.out.println("delete");
        int start = 2;
        int end = 4;
        String value = "12345";
        TextEditor instance = new TextEditor();
        instance.setValue(value);
        instance.delete(start, end);
        String result = instance.getValue();
        assertEquals("15", result);
    }

    @Test
    public void testUndoDeleteMiddle() {
        System.out.println("delete");
        int start = 2;
        int end = 4;
        String value = "12345";
        TextEditor instance = new TextEditor();
        instance.setValue(value);
        instance.delete(start, end);
        instance.undo();
        String result = instance.getValue();
        assertEquals("12345", result);
    }

    @Test
    public void testDeleteFront() {
        System.out.println("delete");
        int start = 1;
        int end = 4;
        String value = "12345";
        TextEditor instance = new TextEditor();
        instance.setValue(value);
        instance.delete(start, end);
        String result = instance.getValue();
        assertEquals("5", result);
    }

    @Test
    public void testUndoDeleteFront() {
        System.out.println("delete");
        int start = 1;
        int end = 4;
        String value = "12345";
        TextEditor instance = new TextEditor();
        instance.setValue(value);
        instance.delete(start, end);
        instance.undo();
        String result = instance.getValue();
        assertEquals("12345", result);
    }

    @Test
    public void testDeleteEnd() {
        System.out.println("delete");
        int start = 2;
        int end = 5;
        String value = "12345";
        TextEditor instance = new TextEditor();
        instance.setValue(value);
        instance.delete(start, end);
        String result = instance.getValue();
        assertEquals("1", result);
    }

    @Test
    public void testUndoDeleteEnd() {
        System.out.println("delete");
        int start = 2;
        int end = 5;
        String value = "12345";
        TextEditor instance = new TextEditor();
        instance.setValue(value);
        instance.delete(start, end);
        instance.undo();
        String result = instance.getValue();
        assertEquals("12345", result);
    }

    @Test
    public void testDeleteAll() {
        System.out.println("delete");
        int start = 1;
        int end = 5;
        String value = "12345";
        TextEditor instance = new TextEditor();
        instance.setValue(value);
        instance.delete(start, end);
        String result = instance.getValue();
        assertEquals("", result);
    }

    @Test
    public void testUndoDeleteAll() {
        System.out.println("delete");
        int start = 1;
        int end = 5;
        String value = "12345";
        TextEditor instance = new TextEditor();
        instance.setValue(value);
        instance.delete(start, end);
        instance.undo();
        String result = instance.getValue();
        assertEquals("12345", result);
    }


    /**
     * Test of insert method, of class TextEditor.
     */
    @Test
    public void testInsertFront() {
        System.out.println("insert");
        String initial = "12345";
        String value = "ABC";
        int start = 0;
        TextEditor instance = new TextEditor();
        instance.setValue(initial);
        instance.insert(value, start);
        String result = instance.getValue();
        assertEquals("ABC12345", result);
    }

    @Test
    public void testUndoInsertFront() {
        System.out.println("insert");
        String initial = "12345";
        String value = "ABC";
        int start = 0;
        TextEditor instance = new TextEditor();
        instance.setValue(initial);
        instance.insert(value, start);
        instance.undo();
        String result = instance.getValue();
        assertEquals("12345", result);
    }

    @Test
    public void testInsertMiddle() {
        System.out.println("insert");
        String initial = "12345";
        String value = "ABC";
        int start = 2;
        TextEditor instance = new TextEditor();
        instance.setValue(initial);
        instance.insert(value, start);
        String result = instance.getValue();
        assertEquals("12ABC345", result);
    }

    @Test
    public void testUndoInsertMiddle() {
        System.out.println("insert");
        String initial = "12345";
        String value = "ABC";
        int start = 2;
        TextEditor instance = new TextEditor();
        instance.setValue(initial);
        instance.insert(value, start);
        instance.undo();
        String result = instance.getValue();
        assertEquals("12345", result);
    }

    @Test
    public void testInsertEnd() {
        System.out.println("insert");
        String initial = "12345";
        String value = "ABC";
        int start = 5;
        TextEditor instance = new TextEditor();
        instance.setValue(initial);
        instance.insert(value, start);
        String result = instance.getValue();
        assertEquals("12345ABC", result);
    }

    @Test
    public void testUndoInsertEnd() {
        System.out.println("insert");
        String initial = "12345";
        String value = "ABC";
        int start = 5;
        TextEditor instance = new TextEditor();
        instance.setValue(initial);
        instance.insert(value, start);
        instance.undo();
        String result = instance.getValue();
        assertEquals("12345", result);
    }

    /**
     * Test of replace method, of class TextEditor.
     */
    @Test
    public void testReplaceFront() {
        System.out.println("replace");
        String replaceValue = "ABC";
        int first = 1;
        int last = 3;
        String value = "12345";
        TextEditor instance = new TextEditor();
        instance.setValue(value);
        instance.replace(first, last, replaceValue);
        String result = instance.getValue();
        assertEquals("ABC45",result);
    }

    @Test
    public void testUndoReplaceFront() {
        System.out.println("replace");
        String replaceValue = "ABC";
        int first = 1;
        int last = 3;
        String value = "12345";
        TextEditor instance = new TextEditor();
        instance.setValue(value);
        instance.replace(first, last, replaceValue);
        instance.undo();
        String result = instance.getValue();
        assertEquals("12345",result);
    }

    @Test
    public void testReplaceMiddle() {
        System.out.println("replace");
        String replaceValue = "ABC";
        int first = 2;
        int last = 3;
        String value = "12345";
        TextEditor instance = new TextEditor();
        instance.setValue(value);
        instance.replace(first, last, replaceValue);
        String result = instance.getValue();
        assertEquals("1ABC45",result);
    }

    @Test
    public void testUndoReplaceMiddle() {
        System.out.println("replace");
        String replaceValue = "ABC";
        int first = 2;
        int last = 3;
        String value = "12345";
        TextEditor instance = new TextEditor();
        instance.setValue(value);
        instance.replace(first, last, replaceValue);
        instance.undo();
        String result = instance.getValue();
        assertEquals("12345",result);
    }

    @Test
    public void testReplaceEnd() {
        System.out.println("replace");
        String replaceValue = "ABC";
        int first = 3;
        int last = 5;
        String value = "12345";
        TextEditor instance = new TextEditor();
        instance.setValue(value);
        instance.replace(first, last, replaceValue);
        String result = instance.getValue();
        assertEquals("12ABC",result);
    }

    @Test
    public void testUndoReplaceEnd() {
        System.out.println("replace");
        String replaceValue = "ABC";
        int first = 3;
        int last = 5;
        String value = "12345";
        TextEditor instance = new TextEditor();
        instance.setValue(value);
        instance.replace(first, last, replaceValue);
        instance.undo();
        String result = instance.getValue();
        assertEquals("12345",result);
    }

    @Test
    public void testReplaceAllV1() {
        System.out.println("replace");
        String replaceValue = "ABC";
        int first = 1;
        int last = 5;
        String value = "12345";
        TextEditor instance = new TextEditor();
        instance.setValue(value);
        instance.replace(first, last, replaceValue);
        String result = instance.getValue();
        assertEquals("ABC",result);
    }

    @Test
    public void testUndoReplaceAllV1() {
        System.out.println("replace");
        String replaceValue = "ABC";
        int first = 1;
        int last = 5;
        String value = "12345";
        TextEditor instance = new TextEditor();
        instance.setValue(value);
        instance.replace(first, last, replaceValue);
        instance.undo();
        String result = instance.getValue();
        assertEquals("12345",result);
    }

    @Test
    public void testReplaceAllV2() {
        System.out.println("replace");
        String replaceValue = "ABCDEFG";
        int first = 1;
        int last = 5;
        String value = "12345";
        TextEditor instance = new TextEditor();
        instance.setValue(value);
        instance.replace(first, last, replaceValue);
        String result = instance.getValue();
        assertEquals("ABCDEFG",result);
    }

    @Test
    public void testUndoReplaceAllV2() {
        System.out.println("replace");
        String replaceValue = "ABCDEFG";
        int first = 1;
        int last = 5;
        String value = "12345";
        TextEditor instance = new TextEditor();
        instance.setValue(value);
        instance.replace(first, last, replaceValue);
        instance.undo();
        String result = instance.getValue();
        assertEquals("12345",result);
    }
}
