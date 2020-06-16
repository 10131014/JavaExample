package NormalAlgorithm.isPalindrome;



import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> number=new ArrayList();
        ListNode curlistnode=head;
        while (curlistnode!=null)
        {
            number.add(curlistnode.val);
            curlistnode=curlistnode.next;
        }
        ListNode pre=null;
        ListNode cur=head;
        while (cur!=null)
        {
            ListNode nextTemp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=nextTemp;
        }
        ListNode compare=pre;
        for (int i=0;i<number.size();i++)
        {
            if (number.get(i)==compare.val)
            {
                compare=compare.next;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
