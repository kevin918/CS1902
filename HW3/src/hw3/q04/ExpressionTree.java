package hw3.q04;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class ExpressionTree
{
    public ExpressionTreeNode root;
    String data;
    
    public ExpressionTree(String preFixExpression) {
        String[] preFix= preFixExpression.split(" ");
        List<String> list = new LinkedList<>();
        list.addAll(Arrays.asList(preFix));
        root = this.createExpressionTree(list);
    }
    private ExpressionTreeNode createExpressionTree(List<String> preFixExpression)
    {
        this.root = new ExpressionTreeNode(preFixExpression.get(0));
        return root.createExpressionTree(preFixExpression);
    }
    String getStructure() {
        return root.getStructure(0);
    }
    String getExpressionAsInfix() {
        return root.getInOrder();
    }

    String getExpressionAsPostfix() {
        return root.getPostOrder();
    
    }
    String getExpressionAsPrefix() {
        return root.getPreOrder();
    
    }
    public static final String[] operators = { "+", "-", "*", "/" };
    public static Boolean isOperator(String exp) {
		for(String op : operators) {
			if(op.equals(exp)) {
				return true;
			}
		}
		return false;
	}
    public float getValue() {
                return root.getValue();
    }
}
