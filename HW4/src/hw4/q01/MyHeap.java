/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4.q01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kai918
 */
public abstract class MyHeap {
    private List heap;
    
    public MyHeap(){
        heap = new ArrayList<>();
    }
    public abstract Comparable pop();
    public abstract void push(Comparable item);
    public abstract boolean isEmpty();
    
    public Comparable getFirst() {
        return (Comparable) heap.get(0);
    }
    public Comparable get(int index) {
        return (Comparable) heap.get(index);
    }

    public int size() {
        return heap.size();
    }
    protected boolean isGreaterOrEqual(int first, int last){
        return first>=last;
    }
    
    protected int parent(int i) {
        return (i - 1) / 2;
    }
    protected int left(int i) {
        return 2 * i + 1;
    }
    protected int right(int i) {
        return 2 * i + 2;
    }
    
    protected void swap(int i, int j) {
        Comparable temp = (Comparable) heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public void pushDown(int i) {
        int left = left(i);
        int right = right(i);
        int largest = i;
        if (left < heap.size() && !isGreaterOrEqual(largest, left)) {
            largest = left;
        }
        if (right < heap.size() && !isGreaterOrEqual(largest, right)) {
            largest = right;
        }
        if (largest!= i) {
            swap(largest, i);
            pushDown(largest);
        }
    }
    
    public void minpushDown(int i) {
        int left = left(i);
        int right = right(i);
        int smallest = i;
        if (left < heap.size() && !isGreaterOrEqual(left, smallest)) {
            smallest = left;
        }
        if (right < heap.size() && !isGreaterOrEqual(right, smallest)) {
            smallest = right;
        }
        if (smallest!= i) {
            swap(smallest, i);
            minpushDown(smallest);
        }
    }
    
    
    public void pushUp(int i) {
        while (i > 0 && !isGreaterOrEqual(parent(i), i)) {
            swap(parent(i), i);
            i = parent(i);
        }
    }
    
    public void minpushUp(int i) {
        while (i > 0 && !isGreaterOrEqual(i, parent(i))) {
            swap(parent(i), i);
            i = parent(i);
        }
    }
    
    
}
