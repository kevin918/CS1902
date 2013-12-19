package hw2.q03;

import hw2.q01.MyGeneralTree;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author baylor
 */
public class Q03Demo
{
    public static void main(String[] args)
	{
		Q03Demo demo = new Q03Demo();
//		demo.runSmallTreeTest();
		demo.run3LevelTest();
    }

	private void runSmallTreeTest()
	{
        TreeLoader factory = new TreeLoader();
        List<String> input = new ArrayList<>();

        input.add("0 : : hello world");
		MyGeneralTree<String> tree = factory.createGeneralTree(input);
		System.out.println(tree);

	}

	private void run3LevelTest()
	{
        TreeLoader factory = new TreeLoader();
        List<String> input = new ArrayList<>();

        input.add("0 : : hello world");
        input.add("1 : 0 : 007");
        input.add("2 : 0 : Random !@##");
        input.add("3 : 0 : Square?!?!");
        input.add("4 : 2 : Jon Spiro");
        input.add("5 : 2 : hello once more world!");
		MyGeneralTree<String> tree = factory.createGeneralTree(input);
		System.out.println(tree);
	}
}
