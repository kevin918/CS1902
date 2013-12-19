package hw3.q05;

import hw3.common.MyQueue;
import hw3.q01.Profiler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchTreeNode
{
    public String data;
    public List<SearchTreeNode> children;
    SearchTreeNode next;
    Profiler profiler = Profiler.getSingleton();
    
    public SearchTreeNode() {
        this.children = new ArrayList<>();
    }
    public SearchTreeNode(String data) {
        
        this.data = data;
        this.children = new ArrayList<>();
    }
    public SearchTreeNode getChild(int index)
    {
        profiler.add("getChild");
        return children.get(index);
    }
    public String getPreOrder()
    {
        String pre = data + "";         
        for(int i=0;i<children.size();i++)
        {
            pre += children.get(i).getPreOrder();           
        }
        System.out.println("pre " +pre);
        return pre;
    }
    
    String getTreeStructure(int level)
    {
        String out="";
        int numberofspace=4*level;
        for(int i=0;i<numberofspace;i++)
        {
            out+=" ";   
        }
        out+="|-- ";
        out+=data;
        out+=System.lineSeparator();
        for(int i=0;i<children.size();i++)
        {
            out+=children.get(i).getTreeStructure(level+1);
        }
        return out;
    }
}
