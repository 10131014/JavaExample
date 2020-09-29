package BinaryTreeAlgorithm.levelOrder;
//102. 二叉树的层序遍历
//BFS
//这是该题的BFS解法

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        //创建队列放节点
        Queue<TreeNode> queue = new LinkedList<>();
        //把根节点添加进队列
        queue.offer(root);
        while (!queue.isEmpty()) {
            //这里是每一层的长度大小
            int queue_size = queue.size();
            //创建level存储每一层的节点
            List<Integer> level = new LinkedList<>();
            //遍历该层所有节点
            for (int i = 0; i < queue_size; i++) {
                //取出当前节点
                TreeNode cur = queue.peek();
                //当前节点取出后，要把当前节点出列
                queue.poll();
                //当前节点为空，则不用添加到答案里
                if (cur == null) {
                    continue;
                }
                //当前节点不为空，则添加进答案里
                level.add(cur.val);
                //把当前节点的左右子节点加入队列中，作为下一层
                //注意，因为size是固定的，且是这层的节点数量大小，所以这个for不会遍历这些新加的
                queue.offer(cur.left);
                queue.offer(cur.right);
            }
            //遍历一层后，该层不为空则加入最后答案中
            if (!level.isEmpty()) {
                ans.add(level);
            }
        }
        return ans;
    }
}
