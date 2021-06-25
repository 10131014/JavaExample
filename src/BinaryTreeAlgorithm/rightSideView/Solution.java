package BinaryTreeAlgorithm.rightSideView;
//199. 二叉树的右视图
import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> res1=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        dfs(root,res1,0);
        //取最右边的节点就是右视图了
        for (int i=0;i<res1.size();i++){
            ans.add(res1.get(i).get(res1.get(i).size()-1));
        }
        return ans;
    }
    public void dfs(TreeNode node,List<List<Integer>> res1,int level){
        if (node==null){
            return;
        }
        //采用层次遍历，将每层的节点值保存在一个list中
        //这里一定要这样写
        if (res1.size()==level) {
            res1.add(new ArrayList<>());
        }
        res1.get(level).add(node.val);
        dfs(node.left,res1,level+1);
        dfs(node.right,res1,level+1);
    }
}
