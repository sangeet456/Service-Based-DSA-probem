import javax.swing.tree.TreeNode;

public class diameterofbinarytree {
    
class Solution {
static int height (TreeNode root){
    if(root==null) return 0;
    return 1 + Math.max(height(root.left) , height(root.right));
}



    public int diameterOfBinaryTree(TreeNode root) {
        //3 cases //
if(root == null) return 0;
        //calsulation of the left and the right diamater
        int leftdiam = diameterOfBinaryTree(root.left);
        int rightdiam = diameterOfBinaryTree(root.right);
        int currdiam = height(root.left) + height(root.right);
        //-> case1 
        //diameter going from through root node //

        //tree ke right me diameter exists//

        //tree ke left me diamenter exists//
        int ans = Math.max(leftdiam,rightdiam);
        return Math.max(ans,currdiam);
        
    }
}
}
