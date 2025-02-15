package algorithm.day11;

import java.util.ArrayList;
import java.util.List;

public class leetcode94 {
    public static void main(String[] args) {
        // 构建二叉树: [1, null, 2, 3]
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        Solution solution = new Solution();
        List<Integer> result = solution.inorderTraversal(root);
        System.out.println(result); // 输出: [1, 3, 2]
    }
}

// 定义二叉树节点
class TreeNode {
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    // 递归辅助函数
    private void inorder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        // 遍历左子树
        inorder(node.left, result);
        // 访问根节点
        result.add(node.val);
        // 遍历右子树
        inorder(node.right, result);
    }
}