package NormalAlgorithm.addTwoNumbers;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c=0;
        ListNode ans=new ListNode(0);
        ListNode sum1=ans;
        while (l1!=null||l2!=null)
        {
            int x=(l1!=null)?l1.val:0;
            int y=(l2!=null)?l2.val:0;
            sum1.next=new ListNode((x+y+c)%10);
            if ((x+y+c)>=10)
            {
                c=1;
            }
            else
            {
                c=0;
            }
            sum1=sum1.next;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        if(c==1&&l1==null&&l2==null)
        {
            sum1.next=new ListNode(c);
            sum1=sum1.next;
        }
        return ans.next;
    }
}
