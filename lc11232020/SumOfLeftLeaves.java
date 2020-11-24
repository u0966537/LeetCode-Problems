package lc11232020;

import java.util.Stack;

public class SumOfLeftLeaves {
	public int sumOfLeftLeaves(TreeNode root) {
		if (root == null)
			return 0;
		int sum = 0;

		Stack<TreeNode> stk = new Stack<TreeNode>();
		stk.push(root);

		while (!stk.isEmpty()) {
			TreeNode curr = stk.pop();
			if (curr.left != null) {
				stk.add(curr.left);
				if (curr.left.left == null && curr.left.right == null)
					sum += curr.left.val;
			}
			if (curr.right != null) {
				stk.add(curr.right);
			}
		}
		return sum;
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
