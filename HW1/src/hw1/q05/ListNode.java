/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1.q05;

/**
 *
 * @author kai918
 */
class ListNode<T> {
        public T data=null;
	public ListNode<T> next=null;
        public ListNode<T> previous=null;

	ListNode(T data)
	{
		this.data = data;
	}

	@Override
	public String toString()
	{
		return data.toString();
	}
}
