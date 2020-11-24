package lc11232020;


public class MinimumAbsoluteDifferenceInBST {
	int min = Integer.MAX_VALUE;
	Integer prev = null;

	public int getMinimumDifference(TreeNode root) {
		if (root == null)
			return 0;

		getMinimumDifference(root.left);
		
		// mid - left, right - mid
		// because right - left > right - mid or mid - left.
		if (prev != null) {
			min = Math.min(min, root.val - prev);
		}
		prev = root.val;

		getMinimumDifference(root.right);

		return min;
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

}
