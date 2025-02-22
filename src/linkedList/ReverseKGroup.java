package linkedList;

import common.ListNode;

class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prev=null;
        if(k==1)
            return head;
        ListNode tmp=head;
        while(tmp!=null){
            ListNode kthNode = find(tmp, k);
            if(kthNode==null){
                prev.next=tmp;
                break;
            }
            ListNode front=kthNode.next;
            kthNode.next=null;
            reverse(tmp);
            if(tmp==head)
                head=kthNode;
            else
                prev.next=kthNode;
            prev=tmp;
            tmp=front;
        }
        return head;
    }

    public ListNode reverse(ListNode head){
        if(head==null || head.next==null)
            return head;
        ListNode prev=null;
        ListNode curr=head;
        ListNode front=head;
        while(curr!=null){
            front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        return prev;
    }

    public ListNode find(ListNode head, int k){
        while(head != null && k-->1){
            head=head.next;
        }
        return head;
    }
}
