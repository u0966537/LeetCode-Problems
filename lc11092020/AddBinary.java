package lc11092020;

public class AddBinary {
	public String addBinary(String a, String b) {
		if (a == null || b == null) {
			throw new NullPointerException();
		}

		StringBuilder res = new StringBuilder("");
		int aSize = a.length() - 1, bSize = b.length() - 1, carry = 0;

		while (aSize >= 0 || bSize >= 0) {
			int p = aSize >= 0 ? a.charAt(aSize--) - '0' : 0;
			int q = bSize >= 0 ? b.charAt(bSize--) - '0' : 0;
			int sum = p + q + carry;

			if (sum >= 2) {
				carry = 1;
				sum -= 2;
			} else {
				carry = 0;
			}
			res = res.insert(0, sum);
		}
		return carry == 1 ? res.insert(0, "1").toString() : res.toString();
	}
}
