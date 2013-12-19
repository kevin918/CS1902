package hw2.q05;

import hw2.common.MyStack;
import java.util.List;


/**
 *
 * @author kai918
 */
public class ReversePolishCalculator
{       
        // List of supported operators
	public static final String[] operators = { "+", "-", "*", "/" };

	// Test if a expression is an operator
	public static Boolean isOperator(String exp) {
		for(String op : operators) {
			if(op.equals(exp)) {
				return true;
			}
		}
		return false;
	}

	// Operation based on operator
	public static float operation(String op, float f1, float f2) {
            switch (op) 
            {
                case "+":
                    return f1 + f2;
                case "-":
                    return f2 - f1;
                case "*":
                    return f1 * f2;
                case "/":
                    return f2 / f1;
            }
            return 0;
	}

	// RPN expression
	public float getValue(List<String> expression) {
		MyStack stack = new MyStack();
		for(String exp : expression) {
			if (isOperator(exp)) {
				stack.push(operation(exp, (float) stack.pop(), (float) stack.pop()));
			}
			else 
                        {
				stack.push(Float.parseFloat(exp));
			}
		}
		return (float) stack.pop();
	}
}
