package NormalAlgorithm.getIntersectionNode;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        Set nodeset = new HashSet();
        while (headA != null) {
            if (nodeset.contains(headA)) {
                headA = headA.next;
            } else {
                nodeset.add(headA);
            }
        }
        while (headB != null) {
            if (nodeset.contains(headB)) {
                return headB;
            } else {
                headB = headB.next;
            }
        }
        return null;
    }
}
