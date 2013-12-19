package hw3.q05;

import hw3.q01.Profiler;
import java.util.LinkedList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Jery
 */
public class SearchTreeTest {

    public SearchTreeTest() {
    }

    public SearchTree getTree(){
        SearchTree tree = new SearchTree();

        List<SearchTreeNode> list = new LinkedList<>();
        SearchTreeNode n = new SearchTreeNode();
        n.data = "G";
        n.children = new LinkedList<>();
        list.add(n);
        n = new SearchTreeNode();
        n.data = "F";
        n.children = new LinkedList<>();
        for (SearchTreeNode node : list) {
            n.children.add(node);
        }
        list.clear();
        SearchTreeNode e = new SearchTreeNode();
        e.data = "E";
        e.children = new LinkedList<>();
        for (SearchTreeNode node : list) {
            e.children.add(node);
        };
        list.add(e);
        list.add(n);
        n = new SearchTreeNode();
        n.data = "B";

        n.children = new LinkedList<>();
        for (SearchTreeNode node : list) {
            n.children.add(node);
        }
        list.clear();
        list.add(n);
        n = new SearchTreeNode();
        n.data = "C";
        n.children = new LinkedList<>();
        list.add(n);
        n = new SearchTreeNode();
        n.data = "D";
        n.children = new LinkedList<>();
        list.add(n);
        n = new SearchTreeNode();
        n.data = "A";
        n.children = new LinkedList<>();
        for (SearchTreeNode node : list) {
            n.children.add(node);
        }
        tree.root = n;

        return tree;
    }

    /**
     * Test of findBFS method, of class SearchTree.
     */
    @Test
    public void testFindBFS() {
        System.out.println("findBFS");
        SearchTree instance = getTree();

        List<String> actualPath = new LinkedList<>();
        actualPath.add("A");
        actualPath.add("B");
        actualPath.add("F");
        actualPath.add("G");
        Profiler.getSingleton().clear();
        List<String> path = instance.findBFS("G");
        int expected = 6;
        int actual = Profiler.getSingleton().getNumberOfMethodCalls("getChild");
        assertEquals("BFS for G", expected, actual);
        assertEquals("pathSizeBFS: ", actualPath.size(), path.size());
        for(int i=0; i< actualPath.size(); i++)
            assertEquals("node " + i + ": ", path.get(i), actualPath.get(i));
    }

    @Test
    public void testFindBFS2(){
        System.out.println("findBFS2");
        SearchTree instance = getTree();

        List<String> actualPath = new LinkedList<>();
        actualPath.add("A");
        Profiler.getSingleton().clear();
        List<String> path = instance.findBFS("A");
        int actual = Profiler.getSingleton().getNumberOfMethodCalls();
        int expected = 0;
        assertEquals("BFS for A", expected, actual);
        assertEquals("pathSizeBFS2: ", actualPath.size(), path.size());
        for(int i=0; i< actualPath.size(); i++)
            assertEquals("node " + i + ": ", path.get(i), actualPath.get(i));
    }

    /**
     * Test of findDFS method, of class SearchTree.
     */
    @Test
    public void testFindDFS() {
        System.out.println("findDFS");
        SearchTree instance = getTree();

        List<String> actualPath = new LinkedList<>();
        actualPath.add("A");
        actualPath.add("B");
        actualPath.add("F");
        actualPath.add("G");
        Profiler.getSingleton().clear();
        List<String> path = instance.findDFS("G");
        int expected = 4;
        int actual = Profiler.getSingleton().getNumberOfMethodCalls("getChild");
        assertEquals("DFS for G", expected, actual);
        assertEquals("pathSizeDFS: ", actualPath.size(), path.size());
        for(int i=0; i< actualPath.size(); i++)
            assertEquals("node " + i + ": ", path.get(i), actualPath.get(i));
    }

    @Test
    public void testFindDFS2() {
        System.out.println("findDFS2");
        SearchTree instance = getTree();

        List<String> actualPath = new LinkedList<>();
        actualPath.add("A");
        Profiler.getSingleton().clear();
        List<String> path = instance.findDFS("A");
        int expected = 0;
        int actual = Profiler.getSingleton().getNumberOfMethodCalls();
        assertEquals("DFS for A", expected, actual);
        assertEquals("pathSizeDFS2: ", actualPath.size(), path.size());
        for(int i=0; i< actualPath.size(); i++)
            assertEquals("node " + i + ": ", path.get(i), actualPath.get(i));
    }

    /**
     * Test of findDL method, of class SearchTree.
     */
    @Test
    public void testFindDL() {
        System.out.println("findDL");
        SearchTree instance = getTree();

        List<String> actualPath = new LinkedList<>();
        actualPath.add("A");
        actualPath.add("B");
        actualPath.add("F");
        actualPath.add("G");

        Profiler.getSingleton().clear();
        List<String> path = instance.findDL("G", 4);
        int expected = 4;
        int actual = Profiler.getSingleton().getNumberOfMethodCalls("getChild");

        assertEquals("DL for G found", expected, actual);
        assertEquals("pathSizeDL: ", actualPath.size(), path.size());
        for(int i=0; i< actualPath.size(); i++)
            assertEquals("node " + i + ": ", path.get(i), actualPath.get(i));

        Profiler.getSingleton().clear();
        List<String> nullPath = instance.findDL("G", 3);
        expected = 5;
        actual = Profiler.getSingleton().getNumberOfMethodCalls("getChild");
        assertEquals("DL for G not found", expected, actual);
        assertEquals(nullPath, null);
    }

    @Test
    public void testFindDL2() {
        System.out.println("findDL2");
        SearchTree instance = getTree();

        List<String> actualPath = new LinkedList<>();
        actualPath.add("A");

        Profiler.getSingleton().clear();
        List<String> path = instance.findDL("A", 2);
        int expected = 0;
        int actual = Profiler.getSingleton().getNumberOfMethodCalls();

        assertEquals("DL for A found", expected, actual);
        assertEquals("pathSizeDL2: ", actualPath.size(), path.size());
        for(int i=0; i< actualPath.size(); i++)
            assertEquals("node " + i + ": ", path.get(i), actualPath.get(i));
    }

    /**
     * Test of findIDDFS method, of class SearchTree.
     */
    @Test
    public void testFindIDDFS() {
        System.out.println("findIDDFS");
        SearchTree instance = getTree();

        List<String> actualPath = new LinkedList<>();
        actualPath.add("A");
        actualPath.add("B");
        actualPath.add("F");
        actualPath.add("G");
        Profiler.getSingleton().clear();
        List<String> path = instance.findIDDFS("G");
        int expected = 12;
        int actual = Profiler.getSingleton().getNumberOfMethodCalls("getChild");
        assertEquals("IDDFS for G", expected, actual);
        assertEquals("pathSizeIDDFS: ", actualPath.size(), path.size());
        for(int i=0; i< actualPath.size(); i++)
            assertEquals("node " + i + ": ", path.get(i), actualPath.get(i));
    }

    @Test
    public void testFindIDDFS2() {
        System.out.println("findIDDFS2");
        SearchTree instance = getTree();

        List<String> actualPath = new LinkedList<>();
        actualPath.add("A");
        Profiler.getSingleton().clear();
        List<String> path = instance.findIDDFS("A");
        int expected = 0;
        int actual = Profiler.getSingleton().getNumberOfMethodCalls();
        assertEquals("IDDFS for A", expected, actual);
        assertEquals("pathSizeIDDFS2: ", actualPath.size(), path.size());
        for(int i=0; i< actualPath.size(); i++)
            assertEquals("node " + i + ": ", path.get(i), actualPath.get(i));
    }

    /**
     * Test of getTreeStructure method, of class SearchTree.
     */
    @Test
    public void testGetTreeStructure() {
        System.out.println("getTreeStructure");
        SearchTree instance = getTree();

        String structure = "|-- A" + System.getProperty("line.separator") +
                           "    |-- B" + System.getProperty("line.separator") +
                           "        |-- E" + System.getProperty("line.separator") +
                           "        |-- F" + System.getProperty("line.separator") +
                           "            |-- G" + System.getProperty("line.separator") +
                           "    |-- C" + System.getProperty("line.separator") +
                           "    |-- D" + System.getProperty("line.separator");
        assertEquals(structure,instance.getTreeStructure());
    }
}
