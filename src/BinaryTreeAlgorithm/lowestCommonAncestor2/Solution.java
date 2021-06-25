package BinaryTreeAlgorithm.lowestCommonAncestor2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
//236.二叉树的最近公共祖先
public class Solution {
    //建立哈希表存储每个节点的父节点
    Map<Integer,TreeNode> parent=new HashMap<>();
    Set<TreeNode> ans=new HashSet<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root);
        //将p节点以及其所有的父节点保存下来
        //注意p节点也要保存
        while (p!=null){
            ans.add(p);
            p=parent.get(p.val);
        }
        //判断q节点在不在set里，如果在就返回q节点
        //注意是要判断q节点和返回q节点，千万不要写成q节点的父节点
        while (q!=null){
            if (ans.contains(q)){
                return q;
            }
            q=parent.get(q.val);
        }
        return root;
    }
    public void dfs(TreeNode node){
        if (node==null){
            return;
        }
        //建立每个节点对应的父节点的映射关系
        if (node.left!=null){
            parent.put(node.left.val,node);
        }
        if (node.right!=null){
            parent.put(node.right.val,node);
        }
        dfs(node.left);
        dfs(node.right);
    }
}
