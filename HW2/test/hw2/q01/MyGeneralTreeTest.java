package hw2.q01;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author seancheren
 */
public class MyGeneralTreeTest
{
	/**
	 * Test of getHeight method, of class MyGeneralTree.
	 */
	@Test
	public void testGetHeight()
	{
		MyGeneralTree myTree = new MyGeneralTree();
		myTree.root = new MyGeneralTreeNode("Dean of University");
		MyGeneralTreeNode leftroot1 = new MyGeneralTreeNode("Head of Dept-1");
		myTree.root.children.add(leftroot1);
		MyGeneralTreeNode lroot2 = new MyGeneralTreeNode("Head of Dept-2");
		myTree.root.children.add(lroot2);
		MyGeneralTreeNode root3 = new MyGeneralTreeNode("Head of Dept-3");
		myTree.root.children.add(root3);
		MyGeneralTreeNode P = new MyGeneralTreeNode("Professor1");

		leftroot1.children.add(P);
		P = new MyGeneralTreeNode("Professor2");
		leftroot1.children.add(P);

		P = new MyGeneralTreeNode("Professor1");
		lroot2.children.add(P);
		P = new MyGeneralTreeNode("Professor2");
		lroot2.children.add(P);
		P = new MyGeneralTreeNode("Professor1");
		root3.children.add(P);
		P = new MyGeneralTreeNode("Professor2");
		root3.children.add(P);

		assertEquals("height is..", 3, myTree.getHeight());
	}

	/**
	 * Test of getNodeCount method, of class MyGeneralTree.
	 */
	@Test
	public void testGetNodeCount()
	{

		MyGeneralTree myTree = new MyGeneralTree();
		myTree.root = new MyGeneralTreeNode("Dean of University");
		MyGeneralTreeNode leftroot1 = new MyGeneralTreeNode("Head of Dept-1");
		myTree.root.children.add(leftroot1);
		MyGeneralTreeNode lroot2 = new MyGeneralTreeNode("Head of Dept-2");
		myTree.root.children.add(lroot2);
		MyGeneralTreeNode root3 = new MyGeneralTreeNode("Head of Dept-3");
		myTree.root.children.add(root3);
		MyGeneralTreeNode P = new MyGeneralTreeNode("Professor1");

		leftroot1.children.add(P);
		P = new MyGeneralTreeNode("Professor2");
		leftroot1.children.add(P);

		P = new MyGeneralTreeNode("Professor1");
		lroot2.children.add(P);
		P = new MyGeneralTreeNode("Professor2");
		lroot2.children.add(P);
		P = new MyGeneralTreeNode("Professor1");
		root3.children.add(P);
		P = new MyGeneralTreeNode("Professor2");
		root3.children.add(P);

		assertEquals("nodes is..", 10, myTree.getNumberOfNodes());


	}

	/**
	 * Test of getNumberOfLeaves method, of class MyGeneralTree.
	 */
	@Test
	public void testGetNumberOfLeaves()
	{
		MyGeneralTree myTree = new MyGeneralTree();
		myTree.root = new MyGeneralTreeNode("Dean of University");
		MyGeneralTreeNode leftroot1 = new MyGeneralTreeNode("Head of Dept-1");
		myTree.root.children.add(leftroot1);
		MyGeneralTreeNode lroot2 = new MyGeneralTreeNode("Head of Dept-2");
		myTree.root.children.add(lroot2);
		MyGeneralTreeNode root3 = new MyGeneralTreeNode("Head of Dept-3");
		myTree.root.children.add(root3);
		MyGeneralTreeNode P = new MyGeneralTreeNode("Professor1");

		leftroot1.children.add(P);
		P = new MyGeneralTreeNode("Professor2");
		leftroot1.children.add(P);

		P = new MyGeneralTreeNode("Professor1");
		lroot2.children.add(P);
		P = new MyGeneralTreeNode("Professor2");
		lroot2.children.add(P);
		P = new MyGeneralTreeNode("Professor1");
		root3.children.add(P);
		P = new MyGeneralTreeNode("Professor2");
		root3.children.add(P);

		assertEquals("leaves is..", 6, myTree.getNumberOfLeaves());
	}

	/**
	 * Test of getNumberOfBranchNodes method, of class MyGeneralTree.
	 */
	@Test
	public void testGetNumberOfBranchNodes()
	{
		MyGeneralTree myTree = new MyGeneralTree();
		myTree.root = new MyGeneralTreeNode("Dean of University");
		MyGeneralTreeNode leftroot1 = new MyGeneralTreeNode("Head of Dept-1");
		myTree.root.children.add(leftroot1);
		MyGeneralTreeNode lroot2 = new MyGeneralTreeNode("Head of Dept-2");
		myTree.root.children.add(lroot2);
		MyGeneralTreeNode root3 = new MyGeneralTreeNode("Head of Dept-3");
		myTree.root.children.add(root3);
		MyGeneralTreeNode P = new MyGeneralTreeNode("Professor1");

		leftroot1.children.add(P);
		P = new MyGeneralTreeNode("Professor2");
		leftroot1.children.add(P);

		P = new MyGeneralTreeNode("Professor1");
		lroot2.children.add(P);
		P = new MyGeneralTreeNode("Professor2");
		lroot2.children.add(P);
		P = new MyGeneralTreeNode("Professor1");
		root3.children.add(P);
		P = new MyGeneralTreeNode("Professor2");
		root3.children.add(P);

		assertEquals("branch nodes is..", 4, myTree.getNumberOfBranchNodes());
	}

	/**
	 * Test of showPreOrder method, of class MyGeneralTree.
	 */
	@Test
	public void testShowPreOrder()
	{
		MyGeneralTree myTree = new MyGeneralTree();
		myTree.root = new MyGeneralTreeNode("root");

		MyGeneralTreeNode root1 = new MyGeneralTreeNode("A");
		myTree.root.children.add(root1);
		MyGeneralTreeNode root2 = new MyGeneralTreeNode("B");
		myTree.root.children.add(root2);
		myTree.root.children.add(new MyGeneralTreeNode("C"));

		root1.children.add(new MyGeneralTreeNode("A.1"));
		root1.children.add(new MyGeneralTreeNode("A.2"));
		root1.children.add(new MyGeneralTreeNode("A.3"));

		root2.children.add(new MyGeneralTreeNode("B.1"));
		root1 = new MyGeneralTreeNode("B.2");
		root2.children.add(root1);
		root2.children.add(new MyGeneralTreeNode("B.3"));

		root1.children.add(new MyGeneralTreeNode("B.2.a"));
		root1.children.add(new MyGeneralTreeNode("B.2.b"));
		String preorder = "rootAA.1A.2A.3BB.1B.2B.2.aB.2.bB.3C";
		assertEquals("pre-order is..", preorder, myTree.getPreOrderStructure());
	}

	/**
	 * Test of showPostOrder method, of class MyGeneralTree.
	 */
	@Test
	public void testShowPostOrder()
	{
		MyGeneralTree myTree = new MyGeneralTree();
		myTree.root = new MyGeneralTreeNode("root");

		MyGeneralTreeNode root1 = new MyGeneralTreeNode("A");
		myTree.root.children.add(root1);
		MyGeneralTreeNode root2 = new MyGeneralTreeNode("B");
		myTree.root.children.add(root2);
		myTree.root.children.add(new MyGeneralTreeNode("C"));

		root1.children.add(new MyGeneralTreeNode("A.1"));
		root1.children.add(new MyGeneralTreeNode("A.2"));
		root1.children.add(new MyGeneralTreeNode("A.3"));

		root2.children.add(new MyGeneralTreeNode("B.1"));
		root1 = new MyGeneralTreeNode("B.2");
		root2.children.add(root1);
		root2.children.add(new MyGeneralTreeNode("B.3"));

		root1.children.add(new MyGeneralTreeNode("B.2.a"));
		root1.children.add(new MyGeneralTreeNode("B.2.b"));
		String postorder = "A.1A.2A.3AB.1B.2.aB.2.bB.2B.3BCroot";
		assertEquals("post-order is..", postorder, myTree.getPostOrderStructure());
	}

	/**
	 * Test of getStructure method, of class MyGeneralTree.
	 */
	@Test
	public void testGetStructure()
	{
		MyGeneralTree myTree = new MyGeneralTree();
		myTree.root = new MyGeneralTreeNode<>("root");
		String expected = "|-- root" + System.lineSeparator();
		String actual = myTree.getStructure();
		assertEquals("one node tree", expected, actual);


		myTree = new MyGeneralTree();
		myTree.root = new MyGeneralTreeNode("root");

		MyGeneralTreeNode root1 = new MyGeneralTreeNode("A");
		myTree.root.children.add(root1);
		MyGeneralTreeNode root2 = new MyGeneralTreeNode("B");
		myTree.root.children.add(root2);
		myTree.root.children.add(new MyGeneralTreeNode("C"));

		root1.children.add(new MyGeneralTreeNode("A.1"));
		root1.children.add(new MyGeneralTreeNode("A.2"));
		root1.children.add(new MyGeneralTreeNode("A.3"));

		root2.children.add(new MyGeneralTreeNode("B.1"));
		root1 = new MyGeneralTreeNode("B.2");
		root2.children.add(root1);
		root2.children.add(new MyGeneralTreeNode("B.3"));

		root1.children.add(new MyGeneralTreeNode("B.2.a"));
		root1.children.add(new MyGeneralTreeNode("B.2.b"));
		expected = "|-- root" + System.lineSeparator()
				+ "    |-- A" + System.lineSeparator()
				+ "        |-- A.1" + System.lineSeparator()
				+ "        |-- A.2" + System.lineSeparator()
				+ "        |-- A.3" + System.lineSeparator()
				+ "    |-- B" + System.lineSeparator()
				+ "        |-- B.1" + System.lineSeparator()
				+ "        |-- B.2" + System.lineSeparator()
				+ "            |-- B.2.a" + System.lineSeparator()
				+ "            |-- B.2.b" + System.lineSeparator()
				+ "        |-- B.3" + System.lineSeparator()
				+ "    |-- C" + System.lineSeparator();

		assertEquals("getStructure... ", expected, myTree.getStructure());
	}
}