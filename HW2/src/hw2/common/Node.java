/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2.common;

/**
 *
 * @author kai918
 */
class Node<T>
{
	public T data;
	public Node<T> next;

	public Node(T data)
	{
		this.data = data;
	}

	@Override
	public String toString()
	{
		return data.toString();
	}
}
