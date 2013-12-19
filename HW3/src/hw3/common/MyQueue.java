package hw3.common;

// You may NOT use java.util.List, ArrayList, LinkedList, etc.

public class MyQueue<T>
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

		Node<T> tail = getTail();
		tail.next = node;
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

        public T peek()
        {
            if(isEmpty())
            {
                return null;
            }
            Node<T> temp=head;
            return temp.data;
        }
        
	private Node<T> getTail()
	{
		if (isEmpty())
		{
			return null;
		}

		Node<T> current = head;
		while (current.next != null)
		{
			current = current.next;
		}
		return current;
	}
}
