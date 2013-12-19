package hw3.q01;

import java.util.List;

public class Q03Demo
{
    public static void main(String[] args)
	{
		Q03Demo demo = new Q03Demo();
		demo.run();
    }

	public void run()
	{
		Profiler profiler = Profiler.getSingleton();
		profiler.add("play");			// 1
		profiler.add("playOneLine");	// 4
		profiler.add("playOneLine");
		profiler.add("playOneLine");
		profiler.add("playOneLine");
		profiler.add("playOneMove");	// 10
		profiler.add("playOneMove");
		profiler.add("playOneMove");
		profiler.add("playOneMove");
		profiler.add("playOneMove");
		profiler.add("playOneMove");
		profiler.add("playOneMove");
		profiler.add("playOneMove");
		profiler.add("playOneMove");
		profiler.add("playOneMove");

		System.out.println("# methods = " + profiler.getNumberOfMethods());
		System.out.println("# method calls = " + profiler.getNumberOfMethodCalls());
		List<MethodProfile> profiles = profiler.getProfiles();
		for (int i = 0; i < profiles.size(); i++)
		{
			MethodProfile profile = profiles.get(i);
			System.out.println(profile.name +
					" count=" + profile.count +
					" %total=" + Math.round(100*profile.percentOfCalls) + "%");
		}
	}
}
