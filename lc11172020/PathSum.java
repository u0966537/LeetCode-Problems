package lc11172020;

public class PathSum {
	public  boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			return false;
		}

		return sumVal(root, sum);
	}

	private  boolean sumVal(TreeNode current, int sum) {
		if (current.left == null && current.right == null && sum - current.val == 0) {
			return true;
		}

		boolean left = false;
		boolean right = false;
		sum -= current.val;
		if (current.left != null) {
			left = sumVal(current.left, sum);
		}
		if (current.right != null) {
			right = sumVal(current.right, sum);
		}

		return left || right;
	}

	public  class TreeNode {
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
