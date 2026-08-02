import java.util.Scanner;

public class invertbinarytree {

static class TreeNode{
   int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
    this.data = data;
    this.left = null;
    this.right = null;
}
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the rootvalue");
int rootval = sc.nextInt();
TreeNode root = new TreeNode(rootval);
System.out.println("enter left child");
int leftval = sc.nextInt();
TreeNode left = new TreeNode(leftval);
System.out.println("ennter right val");
int rightval = sc.nextInt();
TreeNode right = new TreeNode(rightval);


}



    
}
