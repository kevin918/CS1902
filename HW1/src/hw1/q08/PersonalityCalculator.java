/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1.q08;
import java.util.List;
import java.util.Map;

/**
 *
 * @author kai918
 */
public class PersonalityCalculator {
    
    double calculatePomposity(List<String> words){
        return calculatePomposity(words,null);
    }
    
    double calculatePomposity(List<String> words,List<String> noiseWords){        
        double count=0;
        if(noiseWords!=null)
            words.removeAll(noiseWords);
        for(int i=0;i<words.size();i++){
            count+=words.get(i).length();
        }
        return count/words.size();
    }
    
    String getMostPompous(Map<String,List<String>> people){
        return getMostPompous(people,null);
    }
    
    String getMostPompous(Map<String,List<String>> people,List<String> noiseWords){
        int count=0;
        double max = 0;
        String person = "";
        for(String key: people.keySet()){
            if(calculatePomposity(people.get(key), noiseWords) > max){
                max=calculatePomposity(people.get(key), noiseWords);
                person=key;
            }
        }
        return person;
    }
}
