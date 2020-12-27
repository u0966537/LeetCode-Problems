package lc12272020;

import java.util.List;
import java.util.ArrayList;

public class BinaryTreeInorderTraversal {
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    helper(res, root);

    return res;
  }

  private void helper(List<Integer> res, TreeNode root) {
    if (root != null) {
      if (root.left != null)
        helper(res, root.left);

      res.add(root.val);

      if (root.right != null)
        helper(res, root.right);
    }
  }

  public List<Integer> inorderTraversal2(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    TreeNode curr = root;

    while (curr != null || !stack.isEmpty()) {
      while (curr != null) {
        stack.push(curr);
        curr = curr.next;
      }

      curr = stack.pop();
      res.add(curr.val);
      curr = curr.right;
    }

    return res;
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