package BinaryTreeAlgorithm.connect2;

import java.util.ArrayList;
import java.util.List;

//116. 填充每个节点的下一个右侧节点指针
public class Solution {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        List<List<Node>> res = new ArrayList<>();
        dfs_connect2(root, res, 0);
        return root;
    }

    public void dfs_connect2(Node node, List<List<Node>> res, int level) {
        if (res.size() - 1 < level) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(node);
        if (res.get(level).size() > 1) {
            res.get(level).get(res.get(level).size() - 2).next = res.get(level).get(res.get(level).size() - 1);
        }
        if (node.left != null) {
            dfs_connect2(node.left, res, level + 1);
        }
        if (node.right != null) {
            dfs_connect2(node.right, res, level+1);
        }
    }
}
