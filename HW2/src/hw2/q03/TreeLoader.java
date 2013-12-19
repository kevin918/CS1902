package hw2.q03;

import hw2.q01.MyGeneralTree;
import hw2.q01.MyGeneralTreeNode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeLoader
{
			//--- Split the current line into the three fields we need
//			String[] tokens = nodeDescriptors.get(i).split(":");
//			String id       = tokens[0].trim();
//			String parentID = tokens[1].trim();
//			String data     = tokens[2].trim();
        public MyGeneralTree<String> createGeneralTree(List<String> nodes)
        {
            Map<String,String> diction1=new HashMap<>();
            Map<String,MyGeneralTreeNode<String>> diction2=new HashMap<>();
            String id;
            String parentID;
            String data;
            if(nodes==null || (nodes.isEmpty()))
            {
                return null;
            }
            for(int i=0;i<nodes.size();i++)
            {   
                if(nodes.get(i).trim().charAt(0)=='#')
                {
                    continue;
                }
                else
                {
                    String[] tokens  =  nodes.get(i).split(":");
                    id        =  tokens[0].trim();
                    parentID  =  tokens[1].trim();
                    data      =  tokens[2].trim();
                    MyGeneralTreeNode<String> newNode = new MyGeneralTreeNode<>(data);
                    
                    diction1.put(id, parentID);
                    diction2.put(id, newNode);
                }
            }
            
            System.out.println("the diction1 is " + diction1);
            MyGeneralTree<String> newTree=new MyGeneralTree(diction2.get("0").data);
            for(String key:diction2.keySet())
            {
                if(key.equals("0"))
                {
                    continue;
                }
                String parentKey = diction1.get(key);
                MyGeneralTreeNode<String> parentNode = diction2.get(parentKey);
                
                if(parentKey.equals("0"))
                {
                    newTree.root.children.add(diction2.get(key));
                }
                parentNode.children.add(diction2.get(key));
            } 
            System.out.println(newTree.getStructure());
            return newTree;
        }
}
