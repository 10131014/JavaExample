package NormalAlgorithm.reverseKGroup;

import java.util.ArrayList;
import java.util.List;
//25.K个一组翻转链表
//该算法为O(n)空间的算法
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) {
            return head;
        }
        List<ListNode> listNodeList = new ArrayList<>();
        while (head != null) {
            listNodeList.add(head);
            head = head.next;
        }
        int l = listNodeList.size();
        int times = l / k;
        if (times > 0) {
            for (int j = k - 1; j > 0; j--) {
                listNodeList.get(j).next = listNodeList.get(j - 1);
            }
            for (int i = 1; i < times; i++) {
                listNodeList.get((i - 1) * k).next = listNodeList.get(i * k + k - 1);
                for (int j = k - 1; j > 0; j--) {
                    listNodeList.get(i * k + j).next = listNodeList.get(i * k + j - 1);
                }
            }
        }
        if (l % k != 0) {
            listNodeList.get((times - 1) * k).next = listNodeList.get(times * k);
        } else {
            listNodeList.get((times - 1) * k).next = null;
        }
        return listNodeList.get(k - 1);
    }
}
