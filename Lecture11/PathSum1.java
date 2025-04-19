package Lecture29;

public class PathSum1 {

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

	class Solution {
		public boolean hasPathSum(TreeNode root, int target) {

			if (root == null)
				return false;

			if (root.left == null && root.right == null && target - root.val == 0)
				return true;

			boolean left = hasPathSum(root.left, target - root.val);
			boolean right = hasPathSum(root.right, target - root.val);

			return left || right;
		}
	}
}
