package tree;
import java.util.*;

import common.TreeNode;
class InOrderIterative {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        TreeNode node = root;
        while(true){
            if(node!=null){
                st.push(node);
                node=node.left;
            }
            else{
                if(st.isEmpty())
                    break;
                node=st.pop();
                ans.add(node.val);
                node=node.right;
            }
        }
        return ans;
    }
}
//TC : O(N)
//SC : O(H) H=Height of Tree
