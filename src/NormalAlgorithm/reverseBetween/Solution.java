package NormalAlgorithm.reverseBetween;
//92. 反转链表II
//主要是记录四个节点，节点m-1，m，n，n+1
//反转后，m-1指向n，m指向n+1
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dump=new ListNode();
        dump.next=head;
        int count=1;
        ListNode pre1=new ListNode();
        //保存反转链表头节点前一个节点。例如保存节点1，将来好用节点1指向节点4
        pre1.next=head;
        //找到开始反转的头节点
        while (count<m){
            pre1=pre1.next;
            head=head.next;
            count++;
        }
        //保存反转链表的头节点，例如保存例子中的节点2，将来好用节点2指向5
        ListNode record=head;
        //反转链表的辅助节点，保存前一个节点，最后也是拿来保存例子中的节点4
        ListNode pre_temp=new ListNode();
        while (count<=n){
            ListNode temp=head.next;
            head.next=pre_temp;
            pre_temp=head;
            head=temp;
            count++;
        }
        pre1.next=pre_temp;
        record.next=head;
        if (m!=1) {
            return dump.next;
        }
        else {
            return pre_temp;
        }
    }
}
