package Heaps;
import java.util.*;
public class pQ_oops {
	static class Student implements Comparable<Student>{//parent class
		//we will use override function
		String name;
		int rank;
		
		public Student(String name, int rank){
			this.name = name;
			this.rank = rank;
		}
		@Override
		public int compareTo(Student s){
			return this.rank - s.rank;
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue <Student> pq= new PriorityQueue<>();
		pq.add(new Student("A", 4));
		pq.add(new Student("B", 1));
		pq.add(new Student("C", 3));
		pq.add(new Student("D", 2));
		
		while(!pq.isEmpty()) {
			System.out.println(pq.peek().name + "-" + pq.peek().rank);
			pq.remove();
		}
	}

}
