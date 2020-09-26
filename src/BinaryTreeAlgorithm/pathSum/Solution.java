package BinaryTreeAlgorithm.pathSum;
//113. 路径总和II
//该题涉及DFS和回溯算法
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        List list = new ArrayList();
        dfs_pathSum(root, result, list, sum);
        return result;
    }

    public void dfs_pathSum(TreeNode node, List<List<Integer>> result, List<Integer> list1, int sums) {
        //节点为空肯定直接返回
        if (node == null) {
            return;
        }
        //节点不为空，我们要将该节点加入列表中
        list1.add(node.val);
        //此时我们走到了叶子节点了，不能再往下走了，所以需要判断是否为符合题意的路径
        if (node.left == null && node.right == null) {
            //当和是sum的路径，我们将其加入到答案中
            if (node.val == sums) {
                //这里添加是要new一个空间，不然这个list1会一直是这个，他会随着后续的操作改变，最后为空
                result.add(new ArrayList<>(list1));
                //回溯算法，使用了这个节点，最后要将这个节点删去（就是以后不再选这个节点了）
                list1.remove(list1.size() - 1);
                //走到底了，无法往下走了，就返回，如果不返回，最后一行的remove会出错，如果不返回，会发生下标溢出错误
                return;
            }
        }
        //递归左子树
        dfs_pathSum(node.left, result, list1, sums - node.val);
        //递归右子树
        dfs_pathSum(node.right, result, list1, sums - node.val);
        //我们要理解递归的本质，当递归往下传递的时候他最后还是会往回走，
        //我们把这个值使用完之后还要把它给移除，这就是回溯
        //如果不删去已经用过的，list1里会有之前用的节点，答案会有冗余
        list1.remove(list1.size() - 1);
    }
}
