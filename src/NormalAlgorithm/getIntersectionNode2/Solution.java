package NormalAlgorithm.getIntersectionNode2;
//剑指Offer 52. 两个链表的第一个公共节点
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;
        while (p1 != p2) {
            if (p1!= null) {
                p1 = p1.next;
            } else {
                p1 = headB;
            }
            if (p2!= null) {
                p2 = p2.next;
            } else {
                p2 = headA;
            }
        }
        return p1;
    }
}
