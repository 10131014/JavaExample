package NormalAlgorithm.insertionSortList;

//147. 对链表进行插入排序
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode temp = new ListNode(-100);
        temp.next = head;
        ListNode lastsort = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (lastsort.val <= cur.val) {
                lastsort = lastsort.next;
            } else {
                ListNode pre = temp;
                while (pre.next.val <= cur.val) {
                    pre = pre.next;
                }
                //lastsort是cur前一个节点，所以lastsort要指向cur的下一节点
                lastsort.next = cur.next;
                //cur要跟pre.next交换位置
                cur.next = pre.next;
                pre.next = cur;
            }
            cur = lastsort.next;
        }
        return temp.next;
    }
}
