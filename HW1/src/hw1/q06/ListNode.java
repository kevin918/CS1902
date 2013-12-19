package hw1.q06;

/**
 * A node in a linked list. Normally this would be a private inner class
 * but for testing and laziness purposes, we'll just do this.
 * The node is a template (hence <T>), meaning it's not for a specific data type
 * like string or int, it can be used for any class, which we'll call T.
 * i went ahead and wrote this class for you.
 * @author baylor
 */
class ListNode<T>
{
	public T        data = null;
	public ListNode next = null;

	public ListNode(T data)
	{
		this.data = data;
	}

	public ListNode(T data, ListNode next)
	{
		this(data);
		this.next = next;
	}

	@Override public boolean equals(Object other)
	{
		if (getClass() != other.getClass())
		{
			return false;
		}

		return toString().equals(other.toString());
	}

	@Override public String toString()
	{
		return data.toString();
	}
}
