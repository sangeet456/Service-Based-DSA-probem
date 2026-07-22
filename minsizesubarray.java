class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int start = 0;
        int answer = Integer.MAX_VALUE;
        
        for (int end = 0; end < nums.length; end++) {
            sum = sum + nums[end];  // Add number
            
            while (sum >= target) {  // If sum is big enough
                // Window size = end - start + 1
                if (end - start + 1 < answer) {
                    answer = end - start + 1;
                }
                
                sum = sum - nums[start];  // Remove first number
                start++;  // Move start ahead
            }
        }
        
        if (answer == Integer.MAX_VALUE) {
            return 0;
        }
        return answer;
    }
}