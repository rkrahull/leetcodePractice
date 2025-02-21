package linkedList;
import common.Node;
class SortLinkedList012 {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        Node zeroHead=new Node(-1);
        Node zero=zeroHead;
        
        Node oneHead=new Node(-1);
        Node one=oneHead;
        
        Node twoHead=new Node(-1);
        Node two=twoHead;
        
        Node tmp=head;
        while(tmp != null){
            if(tmp.data==0){
                zero.next=tmp;
                zero=tmp;
            }
            else if(tmp.data==1){
                one.next=tmp;
                one=tmp;
            }
            else{
                two.next=tmp;
                two=tmp;
            }
            tmp=tmp.next;
        }
        
        if(zero!=zeroHead){
            if(one!=oneHead){
                if(two!=twoHead){
                   zero.next=oneHead.next;
                    one.next=twoHead.next;
                    two.next=null;
                    return zeroHead.next; 
                }
                else{
                    zero.next=oneHead.next;
                    one.next=null;
                    return zeroHead.next;
                }
                
            }
            if(two!=twoHead){
                zero.next=twoHead.next;
                two.next=null;
                return zeroHead.next;
            }
            return zeroHead.next;
            
        }
        else if(one!=oneHead){
            if(two!=twoHead){
                one.next=twoHead.next;
                two.next=null;
                return oneHead.next;
            }else{
                one.next=null;
                return oneHead.next;
            }
        }else if(two!=twoHead){
            two.next=null;
            return twoHead.next;
        }
        return null;
    }
}
//TC : O(N) 
//SC : O(1)