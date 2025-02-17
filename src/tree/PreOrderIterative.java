package tree;
import java.util.*;

import common.TreeNode;
class PreOrderIterative {
    public List<Integer> preorderTraversal(TreeNode root) {
        //iterative
        List<Integer> ans=new ArrayList<>();
        if(root==null)
            return ans;
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            root=st.pop();
            ans.add(root.val);
            if(root.right!=null)
                st.push(root.right);
            if(root.left!=null)
                st.push(root.left);
        }
        return ans;
    }
}
//TC : O(N)
//SC : O(H) H=Height of Tree
