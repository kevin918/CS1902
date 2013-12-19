/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1.q05;
import java.util.List;

/**
 *
 * @author kai918
 */
public class MyLinkedList <T>{
    T data;
    ListNode<T> head;
    ListNode<T> tail;
    ListNode<T> next;
    
    MyLinkedList(){
        head=null;
    }
    
    MyLinkedList(List<T> items){
        ListNode<T> current = getTail();
        for(int i=0;i<items.size();i++){
            current.next.data = items.get(i);
            current=current.next;
        } 
    }
    
    void add(T item){
     
            ListNode<T> node = getTail();
            
            if(null != node)
            {
                ListNode<T> nextNode = new ListNode<>(item);
                nextNode.next = null;
                nextNode.previous = node;
                node.next = nextNode;
            }
            
            else
            {
                ListNode<T> nextNode = new ListNode<>(item);
                nextNode.next = null;
                nextNode.previous = null;
                head = nextNode;
            }
    }
    
    void addAll(List<T> items){
        ListNode<T> current = getTail();
        for(int i=0;i<items.size();i++){
            current.next.data = items.get(i);
            current=current.next;
        }
    }

    ListNode getTail(){
        ListNode current = head;
        if(null==current){
            return null;
        }
        while(null!=current.next){
            current=current.next;
        }
        return current;
    }
    
    void clear(){
        head.data = null;
    }
    
    @Override
    public MyLinkedList<T> clone(){
        MyLinkedList<T> clone=new MyLinkedList();
        ListNode<T> current = head;
        while(current!=null){
            clone.add(current.data);
            current=current.next;
        }
        return clone;
    }
    
    
    boolean contains(T item){
        boolean x = false;
        if(head==null){
            return x;
        }
        ListNode<T> current=head;
        if(current.next.data.equals(item)){
               x=!x;
        }
        return x;
    }
    
    
    T get(int index){
        ListNode<T> current=head;
        int count=0;
        while(current!=null && count<index){
            current=current.next;
            count++;
        }
        return current.data;
    }
    
    int getSize(){
        if(null==head){
            return 0;
        }
        int count=0;
        ListNode<T> current = head;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;    
    }
    
    void insert(int index,T item){
        ListNode<T> node = new ListNode<>(item);
        ListNode<T> current = head.next;
        ListNode<T> previous=head;
        
        for(int i=0;i<index-1;i++){
            current=current.next;
            previous=previous.next;
        }
        previous.next= node;
        node.next=current; 
    }
    
    void remove(int index){
        ListNode<T> current=head.next;
        ListNode<T> previous=head;
            for(int i=0;i<index-1;i++){
                        current=current.next;
                        previous=previous.next;
                    }
        previous.next=current.next;
    }
    
    void removeRange(int start,int end){
        for(int i=end;i>=start;i--){
            remove(i);
        }
    }
    
    void update(int index,T item){
        remove(index);
        insert(index,item);
    }
}
