package prime;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverageFromDataStream {
	
	private int size;
	private Queue<Integer> q;
	private double sum;
	
	public MovingAverageFromDataStream(int size) {
		this.size = size;
		this.sum = 0.0;
		this.q = new LinkedList<>();
	}
	
	public double next(int val) {
		if(q.size() == this.size) {
			sum -= q.poll();
		}
		
		sum += val;
		q.add(val);
		
		return sum / q.size();

	}
	
	public static class aaa{
		public static void main(String[]args) {
			MovingAverageFromDataStream a = new MovingAverageFromDataStream(3);
			System.out.println(a.next(1));
			System.out.println(a.next(10));
			System.out.println(a.next(3));
			System.out.println(a.next(5));
			
		}
	}
}



