package lc12272020;

import java.util.List;
import java.util.ArrayList;

public class UniqueBinarySearchTreell {
  public List<TreeNode> generateTrees(int n) {
    if (n == 0)
      return new ArrayList<>();
    return helper(1, n);
  }

  private List<TreeNode> helper(int start, int end) {
    List<TreeNode> res = new ArrayList<>();

    // if no child, then put null
    if (start > end) {
      res.add(null);
      return res;
    }

    for (int i = start; i <= end; i++) {
      // i is the root
      List<TreeNode> leftNodes = helper(start, i - 1);
      List<TreeNode> rightNodes = helper(i + 1, end);

      for (TreeNode left : leftNodes) {
        for (TreeNode right : rightNodes) {
          TreeNode root = new TreeNode(i);
          root.left = left;
          root.right = right;
          res.add(root);
        }
      }
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
