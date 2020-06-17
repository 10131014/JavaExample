package NormalAlgorithm.removeNthFromEnd;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null||head.next==null)
        {
            return head.next;
        }
        ListNode node1=head;
        int count=0;
        int index;
        while (node1!=null)
        {
            node1=node1.next;
            count++;
        }
        index=count-n+1;
        int i=1;
        ListNode dome=new ListNode(-1);
        dome.next=head;
        ListNode ans=dome;
        while (i!=index)
        {
            dome=dome.next;
            i++;
        }
        dome.next=dome.next.next;
        return ans.next;
    }
}
