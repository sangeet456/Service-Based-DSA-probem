import java.util.*;
class Solution {
    static int maxArea(int[] height) {
        int maxwater = Integer.MIN_VALUE;
        for(int i =0;i<height.length;i++){
     
            for(int j =i+1;j<height.length;j++){
                int width = j-i;
                int water = width * Math.min(height[i],height[j]);
                maxwater = Math.max(water,maxwater);
            }
        }
return maxwater;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("container with most water");
   System.out.println(maxArea(arr)); }
}