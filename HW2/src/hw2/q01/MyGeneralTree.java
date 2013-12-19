package hw2.q01;

public class MyGeneralTree<T>
{
    public MyGeneralTreeNode<T> root;
    T data;
    
    public MyGeneralTree(T data)
    {
        this.root=new MyGeneralTreeNode<>(data);
        
    }

    public MyGeneralTree() {
   
    }

    public int getHeight() 
    { 
        return root.getHeight(); 
    }
    
    public int getNumberOfBranchNodes()
    {
        return root.getNumberOfNodes()-root.getLeafCount();
    }
    
    public int getNumberOfLeaves()
    { 
        return root.getLeafCount(); 
    }
    
    public int getNumberOfNodes()
    {
        return root.getNumberOfNodes();
    }
    
    public String getPostOrderStructure()
    { 
        return root.getPostOrder(); 
    }
    
    public String getPreOrderStructure()
    {
        return root.getPreOrder();
    }
    
    public String getStructure()
    {
        return root.getStructure(0);
    }

	@Override
	public String toString()
	{
		return getStructure();
	}
}