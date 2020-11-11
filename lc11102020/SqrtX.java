package lc11102020;

public class SqrtX {
	public int mySqrt(int x) {
		if (x <= 1) {
			return x;
		}

		int start = 0, end = x, mid = 0;

		while (start < end) {
			mid = start + ((end - start) >> 1);
			if (x / mid >= mid) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}
		return end - 1;
	}

}
