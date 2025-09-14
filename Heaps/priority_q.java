package Heaps;
import java.util.*;
public class priority_q {

	public static void main(String[] args) {
		// by default
		//PriorityQueue<Integer> pq = new PriorityQueue<>();
		//for reversing  the order
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		pq.add(5);//O(logn)
		pq.add(8);
		pq.add(0);
		pq.add(45);
		pq.add(1);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.peek());//O(1)
			pq.remove();//O(logn)
		}
		

	}

}
