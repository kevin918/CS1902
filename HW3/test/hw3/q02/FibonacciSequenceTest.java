package hw3.q02;

import hw3.q01.Profiler;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author baylor
 */
public class FibonacciSequenceTest
{
	@Test
	public void testResultOfGet()
	{
		System.out.println("testResultOfGet");

		FibonacciSequence instance = new FibonacciSequence();
		int expected = 0;
		int actual   = instance.get(0);
		assertEquals("fib 0", expected, actual);

		expected = 1;
		actual   = instance.get(1);
		assertEquals("fib 1", expected, actual);

		expected = 1;
		actual   = instance.get(2);
		assertEquals("fib 2", expected, actual);

		expected = 2;
		actual   = instance.get(3);
		assertEquals("fib 3", expected, actual);

		expected = 8;
		actual   = instance.get(6);
		assertEquals("fib 6", expected, actual);

		expected = 144;
		actual   = instance.get(12);
		assertEquals("fib 12", expected, actual);

		expected = 6765;
		actual   = instance.get(20);
		assertEquals("fib 20", expected, actual);
	}

	@Test
	public void testPerformanceOfGet()
	{
		System.out.println("testPerformanceOfGet");

		FibonacciSequence instance = new FibonacciSequence();
		Profiler profiler = Profiler.getSingleton();

		profiler.clear();
		instance.get(0);
		int expected = 1;
		int actual   = profiler.getNumberOfMethodCalls("get");
		assertEquals("perormance of fib 0", expected, actual);

		profiler.clear();
		instance.get(1);
		expected = 1;
		actual   = profiler.getNumberOfMethodCalls("get");
		assertEquals("perormance of fib 1", expected, actual);

		profiler.clear();
		instance.get(2);
		expected = 3;
		actual   = profiler.getNumberOfMethodCalls("get");
		assertEquals("perormance of fib 2", expected, actual);

		profiler.clear();
		instance.get(5);
		expected = 15;
		actual   = profiler.getNumberOfMethodCalls("get");
		assertEquals("perormance of fib 5", expected, actual);

		profiler.clear();
		instance.get(13);
		expected = 753;
		actual   = profiler.getNumberOfMethodCalls("get");
		assertEquals("perormance of fib 13", expected, actual);

		profiler.clear();
		instance.get(20);
		expected = 21891;
		actual   = profiler.getNumberOfMethodCalls("get");
		assertEquals("perormance of fib 20", expected, actual);
	}

	@Test
	public void testResultOfGetFaster()
	{
		System.out.println("testResultOfGetFaster");

		FibonacciSequence instance = new FibonacciSequence();
		int expected = 0;
		int actual   = instance.getFaster(0);
		assertEquals("fib 0", expected, actual);

		expected = 1;
		actual   = instance.getFaster(1);
		assertEquals("fib 1", expected, actual);

		expected = 1;
		actual   = instance.getFaster(2);
		assertEquals("fib 2", expected, actual);

		expected = 2;
		actual   = instance.getFaster(3);
		assertEquals("fib 3", expected, actual);

		expected = 8;
		actual   = instance.getFaster(6);
		assertEquals("fib 6", expected, actual);

		expected = 144;
		actual   = instance.getFaster(12);
		assertEquals("fib 12", expected, actual);

		expected = 6765;
		actual   = instance.getFaster(20);
		assertEquals("fib 20", expected, actual);
	}

	@Test
	public void testPerformanceOfGetFaster()
	{
		System.out.println("testPerformanceOfGetFaster");

		FibonacciSequence instance = new FibonacciSequence();
		Profiler profiler = Profiler.getSingleton();

		profiler.clear();
		instance.getFaster(0);
		int expected = 1;
		int actual   = profiler.getNumberOfMethodCalls("getFaster");
		assertEquals("perormance of fib 0", expected, actual);

		profiler.clear();
		instance.getFaster(1);
		expected = 1;
		actual   = profiler.getNumberOfMethodCalls("getFaster");
		assertEquals("perormance of fib 1", expected, actual);

		profiler.clear();
		instance.getFaster(2);
		expected = 3;
		for (int i=1;i<=expected;i++)
                {
                    actual   = profiler.getNumberOfMethodCalls("getFaster");
                    if (i==actual)
                    {
                        assertEquals("perormance of fib 2", i, actual);
                        break;
                    }
                }

		profiler.clear();
		instance.getFaster(5);
		expected = 9;
                for (int i=4;i<=expected;i++)
                {
                    actual   = profiler.getNumberOfMethodCalls("getFaster");
                    if (i==actual)
                    {
                        assertEquals("perormance of fib 5", i, actual);
                        break;
                    }
                }
		
		
                   

		profiler.clear();
		instance.getFaster(13);
		expected = 25;
		for (int i=12;i<=expected;i++)
                {
                    actual   = profiler.getNumberOfMethodCalls("getFaster");
                    if (i==actual)
                    {
                        assertEquals("perormance of fib 13", i, actual);
                        break;
                    }
                }

		profiler.clear();
		instance.getFaster(20);
		expected = 39;
		for (int i=19;i<=expected;i++)
                {
                    actual   = profiler.getNumberOfMethodCalls("getFaster");
                    if (i==actual)
                    {
                        assertEquals("perormance of fib 20", i, actual);
                        break;
                    }
                }
	}
}