package tree;
import java.util.*;

import common.TreeNode;

class Bfs {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> que=new LinkedList<>();
        List<List<Integer>> ans=new LinkedList<>();
        if(root==null)
            return ans;
        que.offer(root);
        while(!que.isEmpty()){
            int level=que.size();
            List<Integer> list=new LinkedList<>();
            for(int i=0;i<level;i++){
                if(que.peek().left!=null)
                    que.offer(que.peek().left);
                if(que.peek().right!=null)
                    que.offer(que.peek().right);
                list.add(que.poll().val);
            }
            ans.add(list);
            //System.out.println(ans);
        }
        return ans;
    }
}
