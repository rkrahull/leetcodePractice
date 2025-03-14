package linkedList;
import common.ListNode;
/*
TC : O(N)
SC : O(1)
*/
class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        ListNode dummyEven=new ListNode(-1);
        ListNode headEven=dummyEven;
        ListNode dummyOdd=new ListNode(-1);
        ListNode headOdd=dummyOdd;
        ListNode tmp=head;
        int ind=1;
        while(tmp!=null){
            if(ind%2!=0){
                dummyOdd.next=tmp;
                dummyOdd=tmp;
            }
            else{
                dummyEven.next=tmp;
                dummyEven=tmp;
            }
            tmp=tmp.next;
            ind++;
        }
        dummyEven.next=null;
        dummyOdd.next=headEven.next;
        return headOdd.next;
    }
}
