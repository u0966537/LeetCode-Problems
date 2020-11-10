package lc11092020;

public class ValidBoomerang {
	public boolean isBoomerang(int[][] points) {

		if (points == null || points.length == 0) {
			return false;
		}

		int d1 = points[1][1] - points[0][1];
		int h1 = points[1][0] - points[0][0];

		int d2 = points[2][1] - points[0][1];
		int h2 = points[2][0] - points[0][0];

		return h1 * d2 != h2 * d1;
	}
}
