package BinaryTreeAlgorithm.zigzagLevelOrder;
//103. 二叉树的锯齿形层次遍历
//BFS，队列实现
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if (root==null){
            return ans;
        }
        //创建节点队列储存节点
        Deque<TreeNode> level=new LinkedList<>();
        //控制方向
        boolean isLeft=true;
        level.offer(root);
        while (!level.isEmpty()){
            //储存元素
            Deque<Integer> levellist=new LinkedList<>();
            int size=level.size();
            for (int i=0;i<size;i++){
                TreeNode cur=level.poll();
                //将新元素加入队列尾部
                if (isLeft){
                    levellist.offerLast(cur.val);
                }else {
                    //将新元素加入队列头部
                    levellist.offerFirst(cur.val);
                }
                //左右子树不为空就加入节点队列
                if (cur.left!=null){
                    level.offer(cur.left);
                }
                if (cur.right!=null){
                    level.offer(cur.right);
                }
            }
            ans.add(new LinkedList<>(levellist));
            //改变方向
            isLeft=!isLeft;
        }
        return ans;
    }
}
