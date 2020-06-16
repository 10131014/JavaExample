package NormalAlgorithm.detectCycle;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> storeListNode=new HashSet<>();
        while (head!=null)
        {
            if (storeListNode.contains(head))
            {
                return head;
            }
            else
            {
                storeListNode.add(head);
            }
            head=head.next;
        }
        return head;
    }
}
