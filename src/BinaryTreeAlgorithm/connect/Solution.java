package BinaryTreeAlgorithm.connect;

import java.util.ArrayList;
import java.util.List;

//117. 填充每个节点的下一个右侧节点指针II
//DFS解法
public class Solution {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        List<List<Node>> res = new ArrayList<>();
        dfs_connect(root, res, 0);
        return root;
    }

    public void dfs_connect(Node node1, List<List<Node>> res, int level) {
        if (res.size() - 1 < level) {
            res.add(new ArrayList());
        }
        //将元素添加到List中
        res.get(level).add(node1);
        //主要这一步，使每一层的前一个元素指向下一个
        if (res.get(level).size() > 1) {
            res.get(level).get(res.get(level).size() - 2).next = res.get(level).get(res.get(level).size() - 1);
        }
        if (node1.left != null) {
            dfs_connect(node1.left, res, level + 1);
        }
        if (node1.right != null) {
            dfs_connect(node1.right, res, level + 1);
        }
    }
}
