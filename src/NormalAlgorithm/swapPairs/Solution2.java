package NormalAlgorithm.swapPairs;

public class Solution2 {
    public ListNode swapPairs(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode dump=new ListNode();
        dump.next=head.next;
        ListNode pre=new ListNode();
        pre.next=head;
        while (head!=null&&head.next!=null){
            //保存下一节点
            ListNode temp=head.next;
            //1-2-3变成1-3
            head.next=temp.next;
            //然后2指向1变成2-1-3
            temp.next=head;
            //pre-1变成pre-2，这样变成了pre-2-1-3
            pre.next=temp;
            //然后pre往前走，pre始终为head节点的前一个节点
            pre=head;
            head=head.next;
        }
        return dump.next;
    }
}
