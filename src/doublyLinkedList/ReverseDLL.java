package doublyLinkedList;
public class ReverseDLL
{
    public static Node reverseDLL(Node head)
    {
        // Write your code here.
        if(head==null||head.next==null)
            return head;
        Node back=null;
        Node curr=head;
        while(curr!=null){
            back=curr.prev;
            curr.prev=curr.next;
            curr.next=back;
            curr=curr.prev;
        }
        return back.prev;
    }
}
