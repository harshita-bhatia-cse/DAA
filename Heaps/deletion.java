package Heaps;
import java.util.*;
public class deletion {
	static class heap{
		ArrayList<Integer> arr = new ArrayList<>();
		
		public void add(int data) {
			arr.add(data);
			int c = arr.size()-1;
			int p = (c-1)/2;
			while(arr.get(c)<arr.get(p)) {
				int temp = arr.get(c);
				arr.set(c,  arr.get(p));
				arr.set(p,  temp);
				c=p;
				p = (c-1)/2;
			}
		}
		//print
		public void print() {
			System.out.print(arr);
		}
		private void heapify(int i) {
			int root = i;
			int left = 2*i+1;
			int rgt = 2*i+2;
			
			if(left < arr.size() && arr.get(root)>arr.get(left)) {
				root = left;
			}
			if(rgt < arr.size() && arr.get(root)>arr.get(rgt)) {
				root = rgt;
			}
			
			if(root!=i) {
				int temp = arr.get(i);
				arr.set(i,  arr.get(root));
				arr.set(root,  temp);
				heapify(root);
			}
		}
		public int remove() {
			int data = arr.get(0);
			
			int temp = arr.get(0);
			arr.set(0, arr.get(arr.size()-1));
			arr.set(arr.size()-1,  temp);
			
			
			arr.remove(arr.size()-1);
			heapify(0);
			return data;
			
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		heap h= new heap();
		h.add(6);
		h.add(5);
		h.add(9);
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(6);
		System.out.println("before removing");
		h.print();
		System.out.println("after removing");
		h.remove();
		h.print();

	}

}
