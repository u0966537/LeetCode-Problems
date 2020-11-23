package lc11182020;

public class ZigZagConversion {

	public String convert(String s, int numRows) {

		if (numRows == 1) {
			return s;
		}

		StringBuilder sb = new StringBuilder();
		int n = s.length();
		int formula = 2 * numRows - 2; // V sign.
		
		for(int row = 0; row < numRows; row++) {
			for(int j = 0; row + j < n; j+= formula) {
				sb.append(s.charAt(row + j));
				// If i is not the first row and the last row,
				// then look for jth formula.
				if(row != 0 && row != numRows - 1 && j + formula - row < n ) {
					sb.append(s.charAt(j + formula - row));
				}
			}
		}
		
		return sb.toString();
	}
}
