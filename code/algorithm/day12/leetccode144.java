package algorithm.day12;

import java.util.ArrayList;
import java.util.List;

public class leetccode144 {
    public static void main(String[] args) {
        // 构建二叉树: [1, null, 2, 3]
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        Solution solution = new Solution();
        List<Integer> result = solution.preorderTraversal(root);
        System.out.println(result); // 输出: [1, 2, 3]
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    // 递归辅助函数
    private void preorder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        // 访问根节点
        result.add(node.val);
        // 遍历左子树
        preorder(node.left, result);
        // 遍历右子树
        preorder(node.right, result);
    }
}
