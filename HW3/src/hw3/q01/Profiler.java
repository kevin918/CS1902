package hw3.q01;

import hw3.common.MyStack;
import hw3.common.Node;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author baylor
 */
public class Profiler
{
    private static Profiler instance;
    private MyStack callS;
    private Profiler()
    {
        this.callS = new MyStack();
    }
    public static Profiler getSingleton()
    {
       if (null == instance)
		{
                    instance= new Profiler();
		}
		return instance; 
    }
    
    public void add(String methodName)
    {
        callS.push(methodName);
    }
    
    public int getNumberOfMethods()
    {
        if(callS.isEmpty())
        {
            return 0;
        }
        else
        {  
            String jay = (String) callS.peek();
            MyStack records = new MyStack();
            records.push(jay);           
            for(int i=1;i<callS.getSize();i++)
            {
                if(callS.get(i).equals(jay))
                {
                    continue;
                }
                else{
                    if(records.peek().equals(callS.get(i)))
                    {
                        continue;
                    }
                    else{
                        records.push(callS.get(i));
                    }
                }
            }
            return records.getSize(); 
        }
    }
    public int getNumberOfMethodCalls()
    {
        return callS.getSize();
    }
    
    public int getNumberOfMethodCalls(String methodName)
    {
            int count=0;
            for(int i=0;i<callS.getSize();i++)
            {
                if(callS.get(i).equals(methodName))
                {
                    count++;
                }
                else{
                    continue;
                }
            }
            return count;
    }
    
    MethodProfile getProfile(String methodName)
    {
            MethodProfile Jay = new MethodProfile();
            Jay.name = methodName;
            for(int i=0;i<callS.getSize();i++)
            {
                if(callS.get(i).equals(methodName))
                {
                   Jay.count++;
                }
            }
            Jay.percentOfCalls = ((float)Jay.count)/callS.getSize();
            return Jay;
    }
    
    List<MethodProfile> getProfiles()
    {
        List<MethodProfile> lays = new LinkedList<>();
        for (int i = 1; i < callS.getSize(); i++) 
        { 
            MethodProfile lay = this.getProfile((String)callS.get(i));
            lays.add(lay);
        }
        return lays;
    }
    
    public void clear(){
        callS.clear();
    }
}
