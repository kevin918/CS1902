package hw2.q02;

import java.util.List;

/**
 * @author baylor
 */
public class CallStackTestObject
{
	public List<String> startingPoint(int numberOfLevelsToDescend)
	{
		StackTrace.getSingleton().push("startingPoint");

		List currentPath;
		if (numberOfLevelsToDescend > 1)
		{
			currentPath = level1(numberOfLevelsToDescend-1);
		}
		else
		{
			currentPath = StackTrace.getSingleton().getCallStack();
		}

		StackTrace.getSingleton().pop();
		return currentPath;
	}

	public List<String> level1(int numberOfLevelsToDescend)
	{
		StackTrace.getSingleton().push("level1");

		List currentPath;
		if (numberOfLevelsToDescend > 1)
		{
			currentPath = level2(numberOfLevelsToDescend-1);
		}
		else
		{
			currentPath = StackTrace.getSingleton().getCallStack();
		}

		StackTrace.getSingleton().pop();
		return currentPath;
	}

	public List<String> level2(int numberOfLevelsToDescend)
	{
		StackTrace.getSingleton().push("level2");

		List currentPath;
		if (numberOfLevelsToDescend > 1)
		{
			currentPath = level3(numberOfLevelsToDescend-1);
		}
		else
		{
			currentPath = StackTrace.getSingleton().getCallStack();
		}

		StackTrace.getSingleton().pop();
		return currentPath;
	}

	public List<String> level3(int numberOfLevelsToDescend)
	{
		StackTrace.getSingleton().push("level3");

		List currentPath;
		if (numberOfLevelsToDescend > 1)
		{
			currentPath = level4(numberOfLevelsToDescend-1);
		}
		else
		{
			currentPath = StackTrace.getSingleton().getCallStack();
		}

		StackTrace.getSingleton().pop();
		return currentPath;
	}

	public List<String> level4(int numberOfLevelsToDescend)
	{
		StackTrace.getSingleton().push("level4");

		List currentPath;
		if (numberOfLevelsToDescend > 1)
		{
			currentPath = level5(numberOfLevelsToDescend-1);
		}
		else
		{
			currentPath = StackTrace.getSingleton().getCallStack();
		}

		StackTrace.getSingleton().pop();
		return currentPath;
	}

	public List<String> level5(int numberOfLevelsToDescend)
	{
		StackTrace.getSingleton().push("level5");

		List currentPath;
		if (numberOfLevelsToDescend > 1)
		{
			currentPath = level6(numberOfLevelsToDescend-1);
		}
		else
		{
			currentPath = StackTrace.getSingleton().getCallStack();
		}

		StackTrace.getSingleton().pop();
		return currentPath;
	}

	public List<String> level6(int numberOfLevelsToDescend)
	{
		StackTrace.getSingleton().push("level6");

		List<String> currentPath = StackTrace.getSingleton().getCallStack();

		StackTrace.getSingleton().pop();
		return currentPath;
	}
}
