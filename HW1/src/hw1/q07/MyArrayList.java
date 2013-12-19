/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1.q07;
import java.util.List;

/**
 *
 * @author kai918
 */
public class MyArrayList<T>{
    
    int capacity;
    int size;
    T[] data;
    
    MyArrayList()
    {
        capacity=10;
        size=0;
        data= getArrayOfSize(10);
    }
    
    
    MyArrayList(int initialCapacity)
    {
        capacity=initialCapacity;
        size=0;
        data=getArrayOfSize(initialCapacity);
    }
    
    MyArrayList(List<T> items)
    {           
        for(int i=0;i<items.size();i++){
            if(size==capacity){
                grow();
            }
            else{
                data[size]=items.get(i);
                size++;
            }
        }
    }

    void clear(){
        
        data[0]=null;
    }
    
    @Override    
    public MyArrayList<T> clone()
    {
        MyArrayList<T> clone=new MyArrayList<>();
        for(int i=0;i<size;i++){
            clone.add(data[i]);
        }
        return clone;
    }
    
    boolean contains(T item){
        boolean x = false;
        if(data[0]==null){
            return x;
        }
        for(int i=0;i<size;i++){
           if(data[i].equals(item))
           {
               x=!x;
           }
        }
        return x;
    }
    
    void add(T item)
    { 
        if(size==capacity){
            grow();
        }
        else{
            data[size]=item;
            size++;  
        }   
    }    
    
    void addAll(List<T> items){
        for(int i=0;i<items.size();i++){
            if(size==capacity){
                grow();
            }
            else{
               data[size]=items.get(i);
               size++;
            }
        }
    }
     
    int getSize()
    {
        int i=0;
        int count=0;
        while(data[i]!=null){           
            count++;
            i++;
        }
        return count;
    }
    
    T get(int index){
        if(index>=size){
            return null;
        }
        else{
            return data[index];
        }
    }
    
    void insert(int index,T item){
        T[] newa= getArrayOfSize(size+1);
        for(int i=0;i<newa.length;i++){
            if(index==i){
                newa[i]=item;
            }
            else if(index>i){
               newa[i]=data[i]; 
            }
            else if(index<i){
                newa[i]=data[i-1];
            }
        }
        data=newa;
        size++;
    }
    
    void remove(int index){
        T[] newa = getArrayOfSize(size-1);
        for(int i=0;i<newa.length;i++){
            if(index<=i){
                newa[i]=data[i+1];
            }
            else{
                newa[i]=data[i];
            }
        }
        data=newa;
        size--;
    }
        
    void removeRange(int start, int end){
        for(int i=end;i>=start;i--){
            remove(i);
        }
    }
    
    void update(int index,T item){
        data[index] = item;
    }
    
    private void grow(){
        T[] temp=getArrayOfSize(2*capacity);
        System.arraycopy(data, 0, temp, 0, size);
        data=temp;
        capacity=2*capacity;
    }
     
    private T[] getArrayOfSize(int cap){
        T[] newArray=(T[]) new Object[cap];
        return newArray;
    }
}

