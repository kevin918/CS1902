package hw3.q05;

import hw3.common.MyQueue;
import java.util.ArrayList;
import java.util.List;

public class SearchTree
{
    public SearchTreeNode root;
    public String data;
    public SearchTreeNode node;
    
    public boolean found = false;
    public int limit = 0;
    public int count = 1;
    
    public SearchTree(String data)
    {
        this.root = new SearchTreeNode(data);
    }
    public SearchTree(){
    }
    public List<String> findPath(List<SearchTreeNode> path, String value)
    {
        List<String> shortPath = new ArrayList<>();
        shortPath.add(0,value);
        while(!value.equals(root.data))
        {
            for(SearchTreeNode item:path)
            {
                  for(SearchTreeNode n:item.children)  
                  {
                        if(n.data.equals(value))
                        {
                            shortPath.add(0,item.data);
                            value = item.data;
                        }
                  }
            }
        }
        return shortPath;
    }
    
    public List<String> findBFS(String g) {
        List<SearchTreeNode> path = new ArrayList<>();
        MyQueue queue = new MyQueue();
        queue.push(root);
        if(root.data.equals(g)){
            path.add(root);
            return this.findPath(path, g);
        }
        while(!queue.isEmpty())
        {
            SearchTreeNode current = (SearchTreeNode) queue.pop();
            path.add(current);
            if(!found)
            {
                for(int i=0; i< current.children.size();i++)
		{
                    if(!found)
                    {
                        SearchTreeNode child = current.getChild(i);
                        queue.push(child);
                        if(child.data.equals(g))
                        {
                            found = true;
                        }
                    }
		}
            }
        }
        return this.findPath(path, g);
    }

    public List<String> findDFS(String g)
    {
        List<String> path = new ArrayList<>();
        this.getDFS(root,g);
        while(node.next!=null)
        { 
            path.add(0,node.data);
            node = node.next;
        }
        path.add(0,node.data);
        return path;
    }
    
    void getDFS(SearchTreeNode root,String value){
        
        if(root.data.equals(value)){
            node  = root;
            found = true;      
        }
        for(int i=0;i<root.children.size();i++){
            root.children.get(i).next = root;
            if(found == false){   
                getDFS(root.getChild(i),value);
            }   
        }     
    }
    
    public List<String> findDL(String g,int i)
    {
        List<String> path = new ArrayList<>();
        limit = i;
        node  = null;
        found = false;
        this.getDL(root,g);
        SearchTreeNode current = node;
        if(node!= null) {
            while(current.next!=null){
                path.add(0,current.data);
                current = current.next;
            }
            path.add(0,current.data);
            return path;
        }
        else{
            return null;
        }
    }
    void getDL(SearchTreeNode root,String value){    
        if(root.data.equals(value)){
            node  = root;
            found = true;
        }
        else{
            for(int i=0;i<root.children.size();i++){
                root.children.get(i).next = root;
                if( limit > count && found == false ){                       
                    count++;
                    SearchTreeNode current = root.getChild(i);
                    this.getDL(current,value);
                    count--;
                }
            }
        }
    }
    
    public List<String> findIDDFS(String g)
    {
        List<String> path = new ArrayList<>();
        node = null;
        for(limit = 1;limit < 5; limit++){
            getDL(root,g);
        }
        SearchTreeNode current = node;     
        while(current!=null){
            path.add(0,current.data);
            current = current.next;            
        }
        return path;
    }

    String getTreeStructure()
    {
        return root.getTreeStructure(0);
    }

}
