package BinaryTreeAlgorithm.findMode;
//501. 二叉搜索树中的众数
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> map = new HashMap();
        if (root == null) {
            return new int[0];
        }
        dfsinorder(root, map);
        int max = 0;
        List<Integer> ans1 = new ArrayList();
        for (int n : map.keySet()) {
            max = Math.max(map.get(n), max);
        }
        for (int n : map.keySet()) {
            if (map.get(n) == max) {
                ans1.add(n);
            }
        }
        int[] ans = new int[ans1.size()];
        for (int i = 0; i < ans1.size(); i++) {
            ans[i] = ans1.get(i);
        }
        return ans;
    }

    public void dfsinorder(TreeNode node, Map map) {
        if (node == null) {
            return;
        }
        dfsinorder(node.left, map);
        map.put(node.val,(int)map.getOrDefault(node.val,0)+1);
        dfsinorder(node.right, map);
    }
}
