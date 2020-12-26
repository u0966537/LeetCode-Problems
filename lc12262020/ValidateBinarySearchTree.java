package lc12262020;

public class ValidateBinarySearchTree{
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        
        return helper(root.left, Long.MIN_VALUE, root.val) && helper(root.right, root.val, Long.MAX_VALUE);
    }

    private boolean helper(TreeNode root, long min, long max){
        if(root == null) return true;
        if(root.val <= min || root.val >= max) return false;

        return helper(root.left, min, root.val) && helper(root.right, root.val, max);
    }
    
    
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        Integer pre = null;

        while(!stack.isEmpty() || curr != null){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            if(pre != null && curr.val <= pre){
                return false;
            }

            pre = curr.val;
            curr = curr.right;
        }

        return true;
    }
}
    
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) { this.val = val; }
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
}