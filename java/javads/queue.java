package javads;
import java.util.PriorityQueue;

public class queue {
	public static void main(String[] args) {
PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
	for(int i=10;i>0;i--){
		queue.add(i);
	}
	System.out.println(queue.peek());
	queue.poll();
	System.out.println(queue.peek());
	}	
}
