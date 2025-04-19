package Lecture29;

import java.util.*;


public class LevelOurder {

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
		public List<List<Integer>> levelOrder(TreeNode root) {

			return levelourder(root);
		}

		private List<List<Integer>> levelourder(TreeNode root) {
			Queue<TreeNode> q = new LinkedList<TreeNode>();
			q.add(root);

			List<List<Integer>> ans = new ArrayList<>();
			if (root == null)
				return ans;
			while (!q.isEmpty()) {
				List<Integer> list = new ArrayList<>();
				int size = q.size();
				int i = 1;

				while (i <= size) {
					TreeNode k = q.remove();
					list.add(k.val);
					if (k.left != null) {
						q.add(k.left);
					}

					if (k.right != null) {
						q.add(k.right);
					}
					i++;
				}
				ans.add(list);
			}
			return ans;
		}
	}

}
