/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4.q02;

/**
 *
 * @author Jess
 */
public class TreeAnalyzer {    
    
    public boolean isAMaxHeap(Comparable[] flatTree){
        if(!isComplete(flatTree)){
            return false;
        }
        else{
            int count = 0;
            for (int i = 1; i < flatTree.length; i++) {
                if(flatTree[i]!=null)
                {
                    count++;
                }
            }
            for (int i = 1; i <= (int)((double)count/2.); i++){
                Comparable left  = flatTree[2*i];
                Comparable right = flatTree[2*i+1];
                if (left != null && left.compareTo(flatTree[i]) > 0){
                    return false;
                }
                if (right!= null && right.compareTo(flatTree[i]) > 0){
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean isAMaxSemiHeap(Comparable[] flatTree){
        if(!isComplete(flatTree)){
            return false;
        }
        else{          
            if(flatTree[2]==null){
                return false;
            }
            if((flatTree[2]!=null && flatTree[2].compareTo(flatTree[1]) < 0) || (flatTree[3]!=null&&flatTree[3].compareTo(flatTree[1]) < 0)){
                return false;
            }
            int count = 0;
            for (int i = 1; i <flatTree.length; i++) {
                if(flatTree[i]!=null)
                {
                    count++;
                }
            }
            for (int i = 2; i <= (int)((double)count/2.); i++){
                Comparable left  = flatTree[2*i];
                Comparable right = flatTree[2*i+1];
                
                if (left != null && left.compareTo(flatTree[i]) > 0){
                    return false;
                }
                if (right!= null && right.compareTo(flatTree[i]) > 0){
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean isAMinHeap(Comparable[] flatTree){
        
        if(!isComplete(flatTree)){
            return false;
        }
        else{
            int count = 0;
            for (int i = 1; i < flatTree.length; i++) {
                if(flatTree[i]!=null)
                {
                    count++;
                }
            }
            for (int i = 1; i <= (int)((double)count/2.); i++){
                Comparable left  = flatTree[2*i];
                Comparable right = flatTree[2*i+1];
                if (left != null && left.compareTo(flatTree[i]) < 0){
                    return false;
                }
                if (right!= null && right.compareTo(flatTree[i]) < 0){
                    return false;
                }
            }
        }
        return true;
    }          
    
    public boolean isAMinSemiHeap(Comparable[] flatTree){
        if(!isComplete(flatTree)){
            return false;
        }
        else{
            if(flatTree[2]==null){
                return false;
            }
            if((flatTree[2]!= null && flatTree[2].compareTo(flatTree[1]) >= 0) || (flatTree[3]!= null && flatTree[3].compareTo(flatTree[1]) > 0)){
                return false;
            }
            int count = 0;
            for (int i = 1; i < flatTree.length; i++) {
                if(flatTree[i]!=null)
                {
                    count++;
                }
            }
            System.out.println("count is "+ count);
            for (int i = 2; i <= (int)((double)count/2.); i++){
                Comparable left  = flatTree[2*i];
                Comparable right = flatTree[2*i+1];
                if (left != null && left.compareTo(flatTree[i]) < 0){
                    return false;
                }
                if (right!= null && right.compareTo(flatTree[i]) < 0){
                    return false;
                }
            }
        }
        return true;
    }
      
    //  everyone has 0 or 2 children
    public boolean isFull(Comparable[] flatTree){
        for (int i = 1; i < (int) ((double)flatTree.length/2.); i++) {
                Comparable left  = flatTree[2*i];
                Comparable right = flatTree[2*i+1];
                if(left == null && right != null){
                    return false;
                }
                if(left != null && right == null){
                    return false;
                }
        }
        return true;
    }
    
    //  everyone has 0 or 2 children, all leaves at same level    
    public boolean isPerfect(Comparable[] flatTree){         
        
        if(!isComplete(flatTree)){
            return false;
        }
        else{
            if(flatTree[2]==null){
                return true;
            }
            int count=0;
            for (int i = 1; i < flatTree.length; i++) {
                if(flatTree[i]!=null)
                {
                    count++;
                }
            }
            for (int i = 1; i <= (int) ((double)count/2.); i++) { 
                Comparable left  = flatTree[2*i];
                Comparable right = flatTree[2*i+1];
                if(left == null || right == null){
                    return false;
                }
            }
        }
        return true;
    }
    
    //  everyone has 0 or 2 children, all except possibly bottom are full, no gap left to right
    public boolean isComplete(Comparable[] flatTree){        
        boolean check = true;
        for (int i = 1; i < flatTree.length; i++) {
            if(flatTree[i] == null){
                check = false;
            }
            if(!check){
                if(flatTree[i]!=null){
                    return false;
                }
            }
        }
        return true;
    }  
}
