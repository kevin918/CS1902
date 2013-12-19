package hw2.common;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kai918
 */
public class MyStack<T>
{
	public Node<T> head;
	public void push(T data)
	{
		Node<T> node = new Node<>(data);

		if (isEmpty())
		{
			head = node;
			return;
		}

		node.next = head;
		head = node;
	}

	public T pop()
	{
		if (isEmpty())
		{
			return null;
		}
		Node<T> temp = head;
		head = head.next;
		return temp.data;
	}

	public boolean isEmpty()
	{
		return (null == head);
	}

	public void clear()
	{
		head = null;
	}
        
        public int getSize()
        {
            int count=0;
            Node<T> temp=head;
            while(temp!=null)
            {
                count++;
                temp=temp.next;
            }
            return count; 
        }
        
        public T peek()
        {
            if(isEmpty())
            {
                return null;
            }
            Node<T> temp=head;
            return temp.data;
        }

        public T get(int index)
        {
            Node<T> current=head;
            int count=0;
            while(current!=null && count<index)
            {
                current=current.next;
                count++;
            }
        return current.data;
    }
   
}
