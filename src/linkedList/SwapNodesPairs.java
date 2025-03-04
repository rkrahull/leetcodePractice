package linkedList;

import common.ListNode;

/*TC : O(N)
SC : O(1)*/
class SwapNodesPairs {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
            return head;

        ListNode dummy =new ListNode(-1);
        ListNode newHead=dummy;
        ListNode tmp1=head;
        ListNode tmp2=null;
        
        while(tmp1!=null && tmp1.next!=null){
            tmp2=tmp1.next;
            tmp1.next=tmp2.next;
            tmp2.next=tmp1;
            dummy.next=tmp2;
            dummy=tmp1;
            tmp1=tmp1.next;
        }
        return newHead.next;
    }
}
