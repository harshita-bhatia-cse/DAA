package Heaps;
import java.util.*;
public class insertion {
	static class insert{
		ArrayList<Integer> arr = new ArrayList<>();
		
		public void add(int data) {
			//data added to the last position in the array
			arr.add(data);
			int x = arr.size()-1;//the idx of child
			//indx od parent
			
			int p = (x-1)/2;
			//if child<parent
			while(arr.get(x)<arr.get(p)) {
				//swaping
				int temp = arr.get(x);
				arr.set(x, arr.get(p));
				arr.set(p, temp);
				//update the idx bcx we need to check the check new parent continously after swappinn the one 
				// child takeparent place
				x = p;
				p = (x-1)/2;// continue tosearch new parents
				
				
			}
			
		}
		public void print(){
			System.out.print(arr);
		}
		public void peek(){
			arr.get(0);
		}
	}
	public static void main(String[] args) {
		
		//if I need to insert directly in the heap soI can do it by using static class that I hv already made
		insert heap = new insert();
		heap.add(10);
        heap.add(5);
        heap.add(20);
        heap.add(2);
        heap.add(15);
        heap.print();
        
        heap.peek();
        heap.print();
		
	}

}
