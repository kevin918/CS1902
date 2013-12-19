/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3.q04;

import static hw3.q04.ExpressionTree.isOperator;
import java.util.List;

/**
 *
 * @author kai918
 */
public class ExpressionTreeNode {
    public String data;
    public ExpressionTreeNode leftChild;
    public ExpressionTreeNode rightChild;
    public int count=0;
    
    public ExpressionTreeNode(String data)
    {
        this.data = data;
    }

    private ExpressionTreeNode() {
   }
    
    public ExpressionTreeNode createExpressionTree(List<String> preFixExpression)
    {
            String current           = preFixExpression.get(count);
            ExpressionTreeNode nodes = new ExpressionTreeNode(current);
            count++;
            if(!isOperator(current))
            {
                return nodes;
            }
            else
            {
                nodes.leftChild  = this.createExpressionTree(preFixExpression); 
                nodes.rightChild = this.createExpressionTree(preFixExpression);
            }
            return nodes;
    }
    
    public int getHeight()
    {
        if(isLeaf()){
            return 1;
        }
        
        int leftHeight  = 0;
        int rightHeight = 0;
        
        if(null!=leftChild){
            leftHeight  = leftChild.getHeight();
        }
        if(null!=rightChild){
            rightHeight = rightChild.getHeight();
        }
        int tallestchild = Math.max(leftHeight, rightHeight);
        return tallestchild+1;
    }
    
    public boolean isLeaf()
    {
        return (null==leftChild && null==rightChild);
    }
    
    public String getStructure(int level)
    {
        String out = "";
        int numberofspace = 4*level;
        for(int i=0;i < numberofspace ;i++)
        {
            out += " ";   
        }
        out += "|-- ";
        out += data;
        out += System.lineSeparator();
        if(null!=leftChild)
        {
            out += leftChild.getStructure(level+1);
        }
        if(null!=rightChild)
        {
            out += rightChild.getStructure(level+1);
        }
        return out;
    }
    
    public String getInOrder()
    {
        String in = "";
        if(null != leftChild)
        {
            in += "(" + leftChild.getInOrder() + " ";
        }
        in += ""+ data;
        
        if(null != rightChild)
        {
            in += " " + rightChild.getInOrder() + ")";
        }
        return in;
    } 
    
    public String getPostOrder()
    { 
        String post = "";
        if(null != leftChild)
        {
            post += "(" + leftChild.getPostOrder();
        }
        if(null != rightChild)
        {
            post += rightChild.getPostOrder();
        }
        if(!isLeaf())
        {
            post += data + ")";
        }
        else
        {
            post += data +" ";
        }
        return post;
    }
    
    public String getPreOrder()
    {
        String pre = "";
        if(!isLeaf())
        {
            pre += "(" + data;
        }
        else
        {
            pre += " "+data + "";
        }
        if(null != leftChild)
        {
            pre += leftChild.getPreOrder();
        }
        
        if(null != rightChild)
        {
            pre += rightChild.getPreOrder() + ")";
        }
        return pre;
    }

    float getValue(){
        float values = 0;
        if(!isOperator(data))
        {
            return Float.parseFloat(data);
        }
        else if("+".equals(data))
        {
            values = this.leftChild.getValue() + this.rightChild.getValue();
        }
        else if("-".equals(data))
        {
            values = this.leftChild.getValue() - this.rightChild.getValue();
        }
        else if("*".equals(data))
        {
            values = this.leftChild.getValue() * this.rightChild.getValue();
        }
        else if("/".equals(data))
        {
            values = this.leftChild.getValue() / this.rightChild.getValue();
        }
        return values;
    }
}
