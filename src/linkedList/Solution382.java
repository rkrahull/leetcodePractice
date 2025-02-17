package linkedList;
import java.util.*;

import common.ListNode;
/*
382. Linked List Random Node
TC : O(N)
SC : O(N)
*/
class Solution382 {

    List<Integer> list = new ArrayList<>();

    public Solution382(ListNode head) {
        ListNode tmp = head;
        while(tmp != null){
            list.add(tmp.val);
            tmp = tmp.next;
        }
    }
    
    public int getRandom() {
        int rand = (int)(Math.random() * list.size()) + 1;
        return list.get(rand - 1);
    }
}
