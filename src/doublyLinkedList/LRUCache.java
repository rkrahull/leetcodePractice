package doublyLinkedList;

import java.util.HashMap;
import java.util.Map;

class Node {
    Node prev, next;
    int key, value;
    Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
class LRUCache {
    Map<Integer, Node> mp;
    Node head;
    Node tail;
    int size;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        size=0;
        mp=new HashMap<>();
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(mp.containsKey(key)){
            Node node = mp.get(key);
            removeNode(node);
            insertNode(node);
            return node.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        Node newNode = new Node(key,value);
        if(mp.isEmpty()){
            //Node newNode = new Node(key,value);
            insertNode(newNode);
            size++;
        }
        else if(mp.containsKey(key)){
            //Node newNode = new Node(key,value);
            Node node = mp.get(key);
            removeNode(node);
            insertNode(newNode);
        }else{
            //Node newNode = new Node(key,value);
            if(size>=capacity){
                Node node=tail.prev;
                removeNode(node);
                insertNode(newNode);
            }
            else{
                mp.put(key, newNode);
                insertNode(newNode);
                size++;
            }
        }
        //System.out.println(mp);
    }

    public void insertNode(Node node){
        mp.put(node.key, node);
        Node front=head.next;
        Node back=head;

        back.next=node;
        node.prev=back;
        node.next=front;
        front.prev=node;
    }

    public void removeNode(Node node){
        mp.remove(node.key);
        Node front=node.next;
        Node back=node.prev;

        back.next=front;
        front.prev=back;
        //node.next=null;
        //node.prev=null;
    }
}
