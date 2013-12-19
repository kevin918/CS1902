package hw1.q06;

public class BejeweledMap
{
	public ListNode head;

	public BejeweledMap(String map)
	{
            map="AABCDBCDDABC";
	}

	public boolean isEmpty()
	{
            return (head==null);
	}

	public void remove(int index)
	{
            ListNode current = head.next;
            ListNode previous=head;
            for(int i=0;i<index-1;i++){
                current=current.next;
                previous=previous.next;
            }
            previous.next=current.next;
            
	}

	public int size()
	{
            int count=0;
            ListNode current=head;
            while(current!=null){
                count++;
                current=current.next;
            }
            return count;
	}

	public boolean worthPlaying()
	{
            return (size()>2); 
	}

	@Override
	public String toString()
	{
		//--- We could just use normal "+" string concatenation
		//---	but StringBuilder is faster
		StringBuilder sb = new StringBuilder();

		ListNode<Character> current = head;
		while (current != null)
		{
			sb.append(current.data);
			current = current.next;
		}

		return sb.toString();
	}
}
