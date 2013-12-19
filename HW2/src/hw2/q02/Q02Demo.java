package hw2.q02;

import java.util.List;

/**
 *
 * @author baylor
 */
public class Q02Demo
{
    public static void main(String[] args)
	{
		Q02Demo demo = new Q02Demo();
//		demo.runDirectTest();
		demo.runObjectTest();
    }

	public void runDirectTest()
	{
		StackTrace callStack = StackTrace.getSingleton();
		callStack.push("main");
		callStack.push("play");
		callStack.push("playOneLine");
		callStack.push("playOneMove");
		System.out.println("call stack depth = " + callStack.getCallDepth());
		List<String> path = callStack.getCallStack();
		for (int i = 0; i < path.size(); i++)
		{
			String method = path.get(i);

			for (int indentLevel = 1; indentLevel <= i; indentLevel++)
			{
				System.out.print("  ");
			}
			System.out.println(method);
		}
	}

	public void runObjectTest()
	{
		CallStackTestObject mockObject = new CallStackTestObject();
		System.out.println("Capture stack at level 1");
		List<String> callStack = mockObject.startingPoint(1);
		for (int i = 0; i < callStack.size(); i++)
		{
			for (int indentLevel = 0; indentLevel <= i; indentLevel++)
			{
				System.out.print("  ");
			}
			System.out.println(callStack.get(i));
		}

		System.out.println("Capture stack at level 2");
		callStack = mockObject.startingPoint(2);
		for (int i = 0; i < callStack.size(); i++)
		{
			for (int indentLevel = 0; indentLevel <= i; indentLevel++)
			{
				System.out.print("  ");
			}
			System.out.println(callStack.get(i));
		}

		System.out.println("Capture stack at level 3");
		callStack = mockObject.startingPoint(3);
		for (int i = 0; i < callStack.size(); i++)
		{
			for (int indentLevel = 0; indentLevel <= i; indentLevel++)
			{
				System.out.print("  ");
			}
			System.out.println(callStack.get(i));
		}

		System.out.println("Capture stack at level 4");
		callStack = mockObject.startingPoint(4);
		for (int i = 0; i < callStack.size(); i++)
		{
			for (int indentLevel = 0; indentLevel <= i; indentLevel++)
			{
				System.out.print("  ");
			}
			System.out.println(callStack.get(i));
		}

		System.out.println("Capture stack at level 5");
		callStack = mockObject.startingPoint(5);
		for (int i = 0; i < callStack.size(); i++)
		{
			for (int indentLevel = 0; indentLevel <= i; indentLevel++)
			{
				System.out.print("  ");
			}
			System.out.println(callStack.get(i));
		}

		System.out.println("Capture stack at level 6");
		callStack = mockObject.startingPoint(6);
		for (int i = 0; i < callStack.size(); i++)
		{
			for (int indentLevel = 0; indentLevel <= i; indentLevel++)
			{
				System.out.print("  ");
			}
			System.out.println(callStack.get(i));
		}

		System.out.println("Capture stack at level 7");
		callStack = mockObject.startingPoint(7);
		for (int i = 0; i < callStack.size(); i++)
		{
			for (int indentLevel = 0; indentLevel <= i; indentLevel++)
			{
				System.out.print("  ");
			}
			System.out.println(callStack.get(i));
		}
	}
}
