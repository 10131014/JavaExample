package BinaryTreeAlgorithm.sortedListToBST;
//109. 有序链表转换二叉搜索树
//该题涉及DFS，快慢双指针
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        //链表为空，自然返回的树为空
        if (head == null) {
            return null;
        }
        //链表只有一个节点，则返回以该节点作为树根节点的树即可
        if (head.next == null) {
            return new TreeNode(head.val);
        }
        //这里是利用快慢双指针寻找链表的中间节点
        //快指针一次走2步，慢指针一次走1步，当快指针指向链表末尾，则慢指针最后指向的就是链表的中间节点
        ListNode slow = head, fast = head, pre = null;
        while (fast != null && fast.next != null) {
            //为什么要定义pre节点，因为后面要将链表一分为二
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        //将链表断开
        pre.next = null;
        //链表中间节点作为树的根节点
        TreeNode node = new TreeNode(slow.val);
        //中间节点左边的所有节点作为树的左子树递归
        //为什么左子树要输入head，左边从head开始的所有节点作为左子树
        node.left = sortedListToBST(head);
        //从中间节点开始往后的节点作为右子树
        node.right = sortedListToBST(slow.next);
        return node;
    }
}
