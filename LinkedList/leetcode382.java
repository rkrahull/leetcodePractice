/*
382. Linked List Random Node
TC : O(N)
SC : O(N)
*/
class Solution {

    List<Integer> list = new ArrayList<>();

    public Solution(ListNode head) {
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