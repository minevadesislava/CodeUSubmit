package lists.trees.and.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BinaryTree {
	static ArrayList<BinaryTreeNode> db = new ArrayList<BinaryTreeNode>();
	static Map<String, BinaryTreeNode> treeByName = new HashMap<String, BinaryTreeNode>();

	private class BinaryTreeNode {

		public String key;
		private BinaryTreeNode left;
		private BinaryTreeNode right;

		BinaryTreeNode(String name, BinaryTreeNode left, BinaryTreeNode right) {
			this.key = name;
			this.left = left;
			this.right = right;
		}

		public String toString() {
			return "("
					+ ("UNKNOWN".equals(this.key) ? this.key : (this.key + "," + this.left.key + "," + this.right.key))
					+ ")";
		}
	}

	public void addNode(String name, String left, String right) {
		BinaryTreeNode tree = new BinaryTreeNode(name, treeByName.get(left), treeByName.get(right));
		db.add(tree);
		treeByName.put(name, tree);

	}

	static public ArrayList<BinaryTreeNode> flatten() {
		return db;
	}

	public static void main(String[] args) {
		// create tree with strings
		BinaryTree data = new BinaryTree();
		data.addNode("UNKNOWN", null, null);
		data.addNode("green", "UNKNOWN", "UNKNOWN");
		data.addNode("blue", "UNKNOWN", "UNKNOWN");
		data.addNode("yellow", "green", "blue");
		// print all objects(BinaryTreeNodes) in BinaryTree
		System.out.println(data.db.toString());
		// test flatten() - returns list of all BinaryTreeNode objects
		ArrayList<BinaryTreeNode> new_db = flatten();
		for (Iterator iterator = new_db.iterator(); iterator.hasNext();) {
			BinaryTreeNode binaryTreeNode = (BinaryTreeNode) iterator.next();
			System.out.println(binaryTreeNode);
		}
	}
}