package hw4.q01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shakil
 */
public class HeapSorter {
    
    public List<Comparable> sortDescending(List<Comparable> objectsToSort) {
        MyMaxHeap maxheap = new MyMaxHeap(objectsToSort);
        int n = maxheap.size();
        for (int i = n; i > 0; i--) {
            maxheap.swap(0, i);
            n--;
            maxheap.pushDown(0);
        }
        
        return maxheap.data;
    }
    
    public List<Comparable> sortAscending(List<Comparable> objectsToSort) {
        MyMinHeap minheap = new MyMinHeap(objectsToSort);
        int n = minheap.size();
        for (int i = n; i > 0; i--) {
            minheap.swap(0, i);
            n--;
            minheap.pushUp(i);
        }
       
        return minheap.data;
    }
    
}
