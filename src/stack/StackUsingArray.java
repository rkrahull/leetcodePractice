package stack;
public class StackUsingArray{
    static class Stack {
        int arr[];
        int ind;
        Stack(int capacity) {
            // Write your code here.
            arr=new int[capacity];
            //Arrays.fill(arr,-1);
            ind=-1;
        }
        public void push(int num) {
            // Write your code here.
            if(isFull()==0)
                arr[++ind]=num;
            

        }
        public int pop() {
            // Write your code here.
            if(isEmpty()==0){
                int val=arr[ind--];
                return val;
            }
            return -1;

        }
        public int top() {
            // Write your code here.
            if(isEmpty()==0)
                return arr[ind];
            return -1;
        }
        public int isEmpty() {
            // Write your code here.
            if(ind==-1)
                return 1;
            return 0;
        }
        public int isFull() {
            // Write your code here.
            if(ind==arr.length-1)
                return 1;
            return 0;
        }
    }
}
