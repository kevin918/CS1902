package hw2.q02;

import hw2.common.MyStack;

import java.util.LinkedList;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author kai918
 */
public class StackTrace {
    private static StackTrace instance;
    private MyStack callStack;
    
    private StackTrace()
    {
        callStack=new MyStack();
    }
    
    public static StackTrace getSingleton()
    {
       if (null == instance)
		{
                    instance= new StackTrace();
		}
		return instance; 
    }
    
    void clear()
    {
        callStack.clear();
    }
    
    int getCallDepth()
    {
        return callStack.getSize();
    }
    
    List<String> getCallStack()
    {
        List<String> newl= new LinkedList<>();            
        for(int i=callStack.getSize()-1;i>=0;i--)
        {
            newl.add((String) callStack.get(i));
        }
        return newl;
    }
    
    String peek()
    {
        return (String) callStack.peek();
    }
    
    String pop()
    {
        return (String) callStack.pop();
    }
    
    void push(String methodSignature)
    {
        callStack.push(methodSignature);
    }

}
