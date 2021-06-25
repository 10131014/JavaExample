package NormalAlgorithm.rotateRight;
//61.旋转链表
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null||k==0) return head;
        ListNode temp = new ListNode();
        temp.next = head;
        int n = 1;
        //先确定链表长度
        while (head.next != null) {
            n++;
            head = head.next;
        }
        //对长度取余
        int l = k % n;
        //先让链表成环，然后在正确的位置断开后即可
        head.next = temp.next;
        head = temp.next;
        for (int i = 0; i < n - l - 1; i++) {
            head = head.next;
        }
        //先创建新的node节点
        ListNode ans = new ListNode();
        //先赋值后断开
        ans = head.next;
        head.next = null;
        return ans;
    }
}
