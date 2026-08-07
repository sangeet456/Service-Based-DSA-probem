import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class rightviewtree {
    
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        if(root == null) return answer;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){List<Integer> result = new ArrayList<>();
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode node = q.poll();
                if(i==size-1) answer.add(node.val);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right); 
            }
      
        }
 
       return answer;
    }
}
}
