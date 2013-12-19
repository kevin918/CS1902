/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2.q01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kai918
 */
public class MyGeneralTreeNode<T>{
    public T data;
    public List<MyGeneralTreeNode<T>> children;

    public MyGeneralTreeNode()
    {
        children = new ArrayList<>();
    }
    public MyGeneralTreeNode(T data)
    {
        this.data = data;
        this.children = new ArrayList<>();
    }
    
    public boolean isLeaf()
    { 
        return children.isEmpty(); 
    }

    public int getLeafCount() 
    { 
        if (isLeaf()) return 1;
        int total = 0;
        for (int i=0; i<children.size(); i++)
        {
            total += children.get(i).getLeafCount();
        }
        return total;
    }

    public int getHeight()
    { 
        if (isLeaf()) return 1;
        int tallestChild = 0;
        for (int i=0; i<children.size(); i++)
        {
            tallestChild = Math.max(tallestChild, children.get(i).getHeight());
        }
        return tallestChild + 1;
    }

    public String getPostOrder()
    { 
        String nodes = "";
        for (int i=0; i<children.size(); i++)
        {
            nodes += children.get(i).getPostOrder();
        }
        return nodes + data;
    }
    
    public String getPreOrder()
    {
        String pre = data + "";         
        for(int i=0;i<children.size();i++)
        {
            pre += children.get(i).getPreOrder();           
        }
        return pre;
    }
    
    public int getNumberOfNodes()
    {
        int total=1;
        for(int i=0;i<children.size();i++)
        {
            total+=children.get(i).getNumberOfNodes();
        }
        return total;
    }
  
    public String getStructure(int level)
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
            out+=children.get(i).getStructure(level+1);
        }
        return out;
    }
    
}
