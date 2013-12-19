package hw3.q01;


/**
 *
 * @author baylor
 */
public class DoNothing
{

	public void a()
	{
		Profiler p = Profiler.getSingleton();
		p.add("a");

		b();
		b();
	}

	protected void b()
	{
		Profiler p = Profiler.getSingleton();
		p.add("b");

		c();
		c();
	}

	protected void c()
	{
		Profiler p = Profiler.getSingleton();
		p.add("c");

	}
}
