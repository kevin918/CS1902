package hw4.q03;

/**
 *
 * @author baylor
 */
public class Puppy
{
	public String  name  = "";
	public String  breed = "";
	public int     attractiveness = -1;
	public int     spazziness     = -1;
	public boolean isHouseTrained = false;
	public int     age  = -1;

	public Puppy(String name, String breed, int age, int attractiveness,
			int spazziness, boolean isHouseTrained)
	{
		this.name = name;
		this.breed = breed;
		this.attractiveness = attractiveness;
		this.spazziness = spazziness;
		this.isHouseTrained = isHouseTrained;
		this.age  = age;
	}

	@Override public String toString()
	{
		return name + " (" + breed + ", " + age + " years old)";
	}
}
