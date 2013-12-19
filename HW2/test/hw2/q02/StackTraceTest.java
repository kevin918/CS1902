package hw2.q02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author baylor
 */
public class StackTraceTest {

    public StackTraceTest() {
    }

	@Test
	public void testGetSingletonCreatesObject()
	{
		System.out.println("testGetSingletonCreatesObject");
		StackTrace instance = StackTrace.getSingleton();
		assertNotNull(instance);
	}

	@Test
	public void testGetSingletonReturnsSingleton()
	{
		System.out.println("testGetSingletonReturnsSingleton");
		StackTrace instance1 = StackTrace.getSingleton();
		assertNotNull(instance1);
		StackTrace instance2  = StackTrace.getSingleton();
		assertNotNull(instance2);

		instance1.clear();
		instance1.push("A");
		instance1.push("B");
		assertEquals("depth=2", 2, instance1.getCallDepth());
		assertEquals("depths the same", instance1.getCallDepth(), instance2.getCallDepth());

		String expected = "B";
		assertEquals("first element the same", expected, instance1.peek());
		assertEquals("depths the same", instance1.peek(), instance2.peek());

		instance2.pop();
		expected = "A";  // new top node is A
		assertEquals("first element the same", expected, instance1.peek());
		assertEquals("depths the same", instance1.peek(), instance2.peek());

		instance2.push("C");
		expected = "C";  // new top node is C
		assertEquals("first element the same", expected, instance1.peek());
		assertEquals("depths the same", instance1.peek(), instance2.peek());
	}

	@Test
	public void testGetCallDepth()
	{
		System.out.println("testGetCallDepth");
		StackTrace instance = StackTrace.getSingleton();
		instance.clear();

		instance.push("A");
		assertEquals("depth=1", 1, instance.getCallDepth());
		instance.push("B");
		assertEquals("depth=2", 2, instance.getCallDepth());
		instance.push("C");
		assertEquals("depth=3", 3, instance.getCallDepth());
		instance.push("D");
		assertEquals("depth=4", 4, instance.getCallDepth());
		instance.push("E");
		assertEquals("depth=5", 5, instance.getCallDepth());
		instance.push("F");
		assertEquals("depth=6", 6, instance.getCallDepth());
		instance.push("G");
		assertEquals("depth=7", 7, instance.getCallDepth());
		instance.push("H");
		assertEquals("depth=8", 8, instance.getCallDepth());
		instance.push("I");
		assertEquals("depth=9", 9, instance.getCallDepth());

		instance.pop();
		assertEquals("depth=8", 8, instance.getCallDepth());
		instance.pop();
		assertEquals("depth=7", 7, instance.getCallDepth());
		instance.pop();
		assertEquals("depth=6", 6, instance.getCallDepth());
		instance.pop();
		assertEquals("depth=5", 5, instance.getCallDepth());
		instance.pop();
		assertEquals("depth=4", 4, instance.getCallDepth());
		instance.pop();
		assertEquals("depth=3", 3, instance.getCallDepth());
		instance.pop();
		assertEquals("depth=2", 2, instance.getCallDepth());
		instance.pop();
		assertEquals("depth=1", 1, instance.getCallDepth());
		instance.pop();
		assertEquals("depth=0", 0, instance.getCallDepth());
	}

	@Test
	public void testGetCallStack()
	{
		System.out.println("testGetCallStack");
		StackTrace instance = StackTrace.getSingleton();
		instance.clear();

		instance.push("A");
		instance.push("B");
		instance.push("C");
		List<String> expected = new ArrayList<>();
		Collections.addAll(expected, "A", "B", "C");
		List<String> actual = instance.getCallStack();
		assertEquals(expected, actual);

		instance.pop();
		instance.push("D");
		instance.push("E");
		expected.clear();
		Collections.addAll(expected, "A", "B", "D", "E");
		actual = instance.getCallStack();
		assertEquals(expected, actual);
	}

	@Test
	public void testPushPeekAndPop()
	{
		System.out.println("testPushAndPeek");
		StackTrace instance = StackTrace.getSingleton();
		instance.clear();

		instance.push("A");
		instance.push("B");
		instance.push("C");
		String expected = "C";
		String actual   = instance.peek();
		assertEquals(expected, actual);

		instance.pop();
		instance.pop();
		expected = "A";
		actual   = instance.peek();
		assertEquals(expected, actual);
	}

	@Test
	public void testPushAndPop()
	{
		System.out.println("testPushAndPop");
		StackTrace instance = StackTrace.getSingleton();
		instance.clear();

		instance.push("A");
		instance.push("B");
		instance.push("C");
		String expected = "C";
		String actual   = instance.peek();
		assertEquals(expected, actual);

		instance.pop();
		instance.pop();
		expected = "A";
		actual   = instance.peek();
		assertEquals(expected, actual);
	}


}
