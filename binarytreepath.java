
 
class Solution {

static void helper (TreeNode node , String path , List<String> ans){
    //for leaf condition//
    if(node==null) return;
if(node.left == null && node.right==null) {
    path = path+node.val;
    ans.add(path);
return;

}
//if not leaf//
path = path+node.val+"->";
//recursion//
//move to left subtree//
helper(node.left,path,ans);
//right move//
helper(node.right , path , ans);

}


    public List<String> binaryTreePaths(TreeNode root) {
        //base case handleing
        List<String> result = new ArrayList<>();
        
       helper(root, "" , result);
       return result;
    }
}

