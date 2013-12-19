/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1.q07;

/**
 *
 * @author kai918
 */
public class MyDictionary<K,V> {
    MyArrayList<MyNode<K,V>> dictionary=new MyArrayList<>();
    
    public void add(K key,V value){
        MyNode<K,V> diction= new MyNode<>(key,value);
        dictionary.add(diction);
    }
    
    boolean contains(K key){
         for(int i=0;i<dictionary.size;i++){
             if(key.equals(dictionary.get(i).key)){
                 return true;
             }
         }
         return  false;
    }
    
    V get(K key){
       for(int i=0;i<dictionary.size;i++){
             if(key.equals(dictionary.get(i).key)){
                 return dictionary.get(i).value;
             }
         }
        return null;
    }
    
    int size(){
        return dictionary.size;
    }
}
