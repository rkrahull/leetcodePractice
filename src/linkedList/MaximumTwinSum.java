package linkedList;
import common.ListNode;
/*
TC : O(N)
SC : O(1)
*/
public class MaximumTwinSum {
    public ListNode reverse(ListNode head){
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
    public int pairSum(ListNode head) {
        if(head.next==null)
            return 0;
        ListNode slow=head;
        ListNode fast=head.next.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode node=slow.next;
        slow.next=null;
        ListNode newHead=reverse(node);

        int ans=Integer.MIN_VALUE;
        while(head!=null && newHead!=null){
            ans=Math.max(head.val + newHead.val, ans);
            head=head.next;
            newHead=newHead.next;
        }
        return ans;

    }
}
