/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1.q09;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kai918
 */
public class AnagramChecker {
    boolean areAnagrams(String word1,String word2){
        if(word1==null||word2==null){
            return false;
        }
        int lettersLen=256;
        int len=word1.length();
        if(len!=word2.length()||len<2){
            return false;
        }
        int[] letters = new int[lettersLen];
		for (int i = 0; i < len; i++) {
			letters[word1.charAt(i)]++;
			letters[word2.charAt(i)]--;
		}

		for (int i = 0; i < lettersLen; i++) {
			if (letters[i] != 0) {
				return false;
			}
		}
        
        return true;
    }
    List<String> getAnagrams(String word,List<String> candidates ){
        List<String> result=new ArrayList();
        for(int i=0;i<candidates.size();i++){
            if(areAnagrams(word,candidates.get(i))){
                result.add(candidates.get(i));
          }
        }
        return result;
    }
}
