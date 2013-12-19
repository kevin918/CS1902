package hw2.q04;

import hw2.common.MyStack;
import hw2.q01.MyGeneralTree;
import hw2.q01.MyGeneralTreeNode;
import java.util.ArrayList;
import java.util.List;

public class FileSystem
{
        public FileSystemNode root;
        
        MyGeneralTree tree=new MyGeneralTree();
        public FileSystem(String data)
        {
            FileSystemNode newnode=new FileSystemNode(data);
            this.root=newnode;
        }

        public FileSystem() 
        {   
        }
        
	public void deserialize(List<String> lines)
	{
            MyStack<MyGeneralTreeNode<String>> temp= new MyStack<>();
            for(int i=0;i<lines.size();i++)
            {
                MyGeneralTreeNode<String> newNode = new MyGeneralTreeNode<>(lines.get(i).trim());
                if(lines.get(i).contains("/"))
                {
                    continue;
                }
                temp.push(newNode);
            }
            System.out.println("stack is "+ temp.peek().data);
            gotoTree(temp).getStructure();
	}
        private MyGeneralTree gotoTree(MyStack<MyGeneralTreeNode<String>> temp) 
        {
            tree.root =temp.peek();
            temp.pop();
            
            for(int i=0;i<temp.getSize()-1;i++)
            {
                
                MyGeneralTreeNode<String> childNode = temp.peek();
                String childKey=childNode.data;
                
                if(temp.peek().data.startsWith("<"))
                {
                    childKey = temp.peek().data.substring(1, temp.get(i).data.length()-1);
                    temp.pop().children.add(childNode);
                    temp.pop();
               
                    if(!temp.peek().data.startsWith("<"))
                    {
                        temp.pop().children.add(childNode);
                        temp.pop();
                    }
                    else
                    {
                        childKey = temp.peek().data.substring(1, temp.get(i).data.length()-1);
                        temp.peek().children.add(childNode);
                        temp.pop();
                    }
                }
                
                else if(!temp.peek().data.startsWith("<"))
                {
                    temp.pop().children.add(childNode);
                    temp.pop();
                    if(temp.peek().data.startsWith("<"))
                    {
                        childKey = temp.peek().data.substring(1, temp.get(i).data.length()-1);
                        tree.root.children.add(childNode);
                    }
                }
            }
            return tree;
        }

	public List<String> getDirectories()
	{
            
            List<String> newl = new ArrayList<>();
            return root.getDirectories(newl);
	}

	public List<String> getFiles()
	{
            List<String> newl = new ArrayList<>();
            return root.getFiles(newl);
	}

	public List<String> getFilesLargerThan(int size)
	{
            List<String> newl = new ArrayList<>();
            return root.getFilesLargerThan(size,newl);
	}

	public List<String> getFilesNewerThan(int date)
	{
            List<String> newl = new ArrayList<>();
            return root.getFilesNewerThan(date,newl);
	}

	public int getNestingLevel()
	{
            return root.getHeight();
	}

	public int getNumberOfDirectories()
	{
            List<String> newl= new ArrayList<>();
            return root.getDirectories(newl).size();
	}

	public int getNumberOfFiles()
	{
            List<String> newl= new ArrayList<>();
            return root.getFiles(newl).size();
	}

	public int getNumberOfFilesLargerThan(int size)
	{
            List<String> newl = new ArrayList<>();
            return root.getNumberOfFilesLargerThan(size, newl);
	}

	public int getNumberOfFilesNewerThan(int size)
	{
            List<String> newl = new ArrayList<>();
            return root.getNumberOfFilesNewerThan(size, newl);
	}

	public int getNumberOfMovies()
	{
            
            List<String> newl = new ArrayList<>();
            return root.getNumberOfMovies(newl);
	}

	public int getNumberOfMoviesNewerThan(int date)
	{
            List<String> newl = new ArrayList<>();
            return root.getNumberOfMoviesNewerThan(date, newl);
	}

	public int getNumberOfPictures()
	{
            List<String> newl= new ArrayList<>();
            return root.getNumberOfPictures(newl);
	}

	public String getTreeStructure()
	{
            return root.getTreeStructure(0);
	}

	public void insertVirus(String fileName, String virusCode, int virusSize)
	{
            root.insertVirus(fileName, virusCode, virusSize);
	}

	public void rename(String oldName, String newName)
	{
            root.rename(oldName, newName);
	}

	public List<String> serialize()
	{
		throw new UnsupportedOperationException("Not yet implemented");
	}

    
}
