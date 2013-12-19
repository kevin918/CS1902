/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3.common;

/**
 *
 * @author kai918
 */
public class Node<T>{
        T data;
	Node<T> next;

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
