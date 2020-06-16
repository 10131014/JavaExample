package NormalAlgorithm.hasCycle;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> ListNodeset=new HashSet<>();
        while (head!=null)
        {
            if (ListNodeset.contains(head))
            {
                return true;
            }
            else
            {
                ListNodeset.add(head);
            }
            head=head.next;
        }
        return false;
    }
}
