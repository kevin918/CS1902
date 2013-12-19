/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4.q01;

import java.util.List;

/**
 *
 * @author kai918
 */
public class MyMaxHeap extends MyHeap {
    private List heap;
    public int size;
    public List<Comparable> data;
    
    MyMaxHeap(){     
    }
    
    MyMaxHeap(List<Comparable> data) {
        this.data = data;
        this.size = data.size();
        for (int i = this.size / 2 - 1; i >= 0; i--) {
            pushDown(i);
        }
    }
    
    @Override
    public Comparable pop(){
        if(heap.size()>0){
            swap(0,heap.size()-1);
            Comparable result = (Comparable) heap.remove(heap.size()-1);
            pushDown(0);
            return result;
        }
        return null;
    }
    
    @Override
    public void push(Comparable item){
        heap.add(item);
        pushUp(heap.size()-1);
    }
    
    @Override
    public boolean isEmpty(){
        return (heap.get(0)==null);
    }

}
