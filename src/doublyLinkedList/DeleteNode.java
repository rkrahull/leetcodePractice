package doublyLinkedList;

class DeleteNode {
    public Node deleteNode(Node head, int x) {
        // code here
        if(head == null || head.next == null)
	        return null;
	        
        if(x==1){
            head=head.next;
            head.prev=null;
            return head;
        }
        
        int c=1;
        Node tmp=head;
        while(tmp!=null && c<x){
            tmp=tmp.next;
            c++;
        }
        if(tmp.next==null){
            tmp=tmp.prev;
            tmp.next=null;
            return head;
        }
        tmp.prev.next=tmp.next;
        tmp.next.prev=tmp.prev;
        return head;
    }
}
