package hw3.q02;

import hw3.q01.Profiler;
import java.util.HashMap;
import java.util.Map;

public class FibonacciSequence
{
    
    Map<Integer,Integer> map=new HashMap<>();
    Profiler profiler = Profiler.getSingleton();
    
    public int get(int i) {
        profiler.add("get");
        int jay = 0;
        if(i<2)
        {
            jay = i;
        }
        else{
            jay = this.get(i-1)+ this.get(i-2);
        } 
        return jay;
    }    

    public int getFaster(int sequenceID) 
    {
        return getFasterInternal(sequenceID);
    }
    private int getFasterInternal(int sequenceID)
    {  
        profiler.add("getFaster");
        map.put(0, 0);
        map.put(1, 1);
        if(map.containsKey(sequenceID))
        {
            return map.get(sequenceID);
        }
        else
        {
            int numberStored  =   this.getFasterInternal(sequenceID-1)+ this.getFasterInternal(sequenceID-2);
            map.put(sequenceID, numberStored);
        }
        return map.get(sequenceID);
    }
}
