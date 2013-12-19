package hw3.q04;

/**
 *
 * @author baylor
 */
public class Q06Demo
{
    public static void main(String[] args)
	{
		Q06Demo demo = new Q06Demo();
		demo.run();
    }

	public void run()
	{
        String e = "* + 8 4 - 7 / 6 3";
		ExpressionTree tree = new ExpressionTree(e);
		System.out.println(tree.getStructure());
		System.out.println(tree.getExpressionAsInfix());
		System.out.println(tree.getExpressionAsPostfix());
		System.out.println(tree.getExpressionAsPrefix());
		System.out.println("Answer = " + tree.getValue());
	}
}
