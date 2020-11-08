package lc11082020;

public class DuolicateZeros {

	public void duplicateZeros(int[] arr) {
		// base case:
		if (arr == null || arr.length == 0) {
			return;
		}

		for (int i = 0; i < arr.length - 1; i++) { 
			if (arr[i] == 0) { 
				shiftArray(arr, i);
				// inserting the new Zero to duplicate it and increase the index.
				arr[i] = 0; 
				i++;
			}
		}
	}
	
	private void shiftArray(int[] arr, int start) {
		for(int end = arr.length - 1; end > start;) {
			arr[end] = arr[--end];
		}
	}
}
