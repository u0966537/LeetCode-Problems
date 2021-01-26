package prime;

public class Vector2D {
	private int index;
	private int[] arr;
	
	public Vector2D(int[][] v) {
		index = 0;
		
		int count = 0;
		for(int[] a : v) 
			count += a.length;
		
		arr = new int[count];
		count = 0;
		for(int[] a : v) {
			for(int i : a) {
				this.arr[count] = i;
			}
		}
	}
	
	public int next() {
		if(hasNext())
			return arr[index++];
		return -1;
	}

	
	public boolean hasNext() {
		return index < arr.length;
	}
}
