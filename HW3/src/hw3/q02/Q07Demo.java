package hw3.q02;

import hw3.q01.Profiler;

public class Q07Demo
{
    public static void main(String[] args)
	{
		Q07Demo demo = new Q07Demo();
		demo.run();
    }

	public void run()
	{
		Profiler profiler = Profiler.getSingleton();
		profiler.clear();

		FibonacciSequence mathNerd = new FibonacciSequence();
		System.out.print("The first 20 Fibonaccis: ");
		for (int i = 0; i <= 20; i++)
		{
			System.out.print(i + "=" + mathNerd.get(i) +
					"_calls="+profiler.getNumberOfMethodCalls("get") + "  ");
			profiler.clear();
		}
		System.out.println("");
		System.out.println("");

		profiler.clear();
		System.out.print("Faster this time: ");
		for (int i = 0; i <= 20; i++)
		{
			profiler.clear();

			int answer = mathNerd.getFaster(i);
			int numberOfCalls = profiler.getNumberOfMethodCalls("getFaster") ;
			System.out.print(i + "=" + answer +
					"_calls=" + numberOfCalls + "  ");
		}
		System.out.println("");
	}
}
