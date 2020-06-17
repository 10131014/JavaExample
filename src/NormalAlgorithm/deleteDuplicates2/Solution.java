package NormalAlgorithm.deleteDuplicates2;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode ans=new ListNode(-1);
        ans.next=head;
        ListNode pre=ans;
        ListNode cur=head;
        while ((cur!=null)&&(cur.next!=null))
        {
            if (pre.next.val!=cur.next.val)
            {
                pre=pre.next;
                cur=cur.next;
            }
            else
            {
                while (cur.next!=null&&cur!=null&&pre.next.val==cur.next.val)
                {
                    cur=cur.next;
                }
                pre.next=cur.next;
                cur=cur.next;
            }
        }
        return ans.next;
    }
}
