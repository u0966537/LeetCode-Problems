package lc12272020;

import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class BinaryTreeLevelOrderTraversal {
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> res = new ArrayList<>();
    if (root == null)
      return res;

    Queue<TreeNode> q = new LinkedList<>();

    q.add(root);

    while (!q.isEmpty()) {
      Queue<TreeNode> level = new LinkedList<>();
      List<Integer> resLevel = new ArrayList<>();

      while (!q.isEmpty()) {
        TreeNode current = q.poll();
        resLevel.add(current.val);
        if (current.left != null)
          level.add(current.left);

        if (current.right != null)
          level.add(current.right);
      }
      res.add(new ArrayList<>(resLevel));
      q = level;
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