package hw1.q06;

public class Bejeweled1D
{
        public boolean isOver = false;
	boolean isOver(){
            return isOver();
        }
	

	int play(BejeweledMap map)
	{
            int score=0;
            while(map.worthPlaying()){
                playOnce(map);
            }
            return score;
	}

	int playOnce(BejeweledMap map)
	{
            int score=0;
            for(int i=0;i<map.size();i++){
                playOneMove(map,i);
            }
            return score;
	}

	int playOneMove(BejeweledMap map, int position)
	{
            int score=0;
            position=0;
            ListNode current=map.head.next;
            ListNode previous=map.head;
            ListNode next=current.next;
            
            if(previous!=current && current!=next){
                current=map.head;
                current.next=next;
                next.next=previous;
                previous.next=next.next;
                
            }
            else{
                  map.remove(position);
                  map.remove(position+1);
                  map.remove(position+2);
                  score++; 
            }   
            return score;
	}
}
