package linkedList;

import common.ListNode;

class PartitionList {
    public ListNode partition(ListNode head, int x) {
        if(head==null)
            return head;
        ListNode dummyLess=new ListNode(-1);
        ListNode dummyMore=new ListNode(-1);
        ListNode headLess=dummyLess;
        ListNode headMore=dummyMore;
        ListNode tmp=head;
        while(tmp!=null){
            ListNode tmp1=tmp.next;
            if(tmp.val<x){
                dummyLess.next=tmp;
                dummyLess=tmp;
                dummyLess.next=null;
            }
            else{
                dummyMore.next=tmp;
                dummyMore=tmp;
                dummyMore.next=null;
            }
            tmp=tmp1;
        }

        dummyLess.next=headMore.next;
        return headLess.next;
    }
}
