class Solution {
    public int pivotIndex(int[] nums) {
        int left =0;
        int totalsum=0;
        for(int ele : nums){
            totalsum+= ele;
        }
        for(int i=0;i<nums.length;i++){
            if(left == totalsum-left-nums[i])
            return i;
            left +=nums[i];
        }
    return -1;}
}