public class dailytemparrays {
    class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        
        for (int i = 0; i < n - 1; i++) {
            int days =0;
            for (int j = i + 1; j < n; j++) {
                days++;
                if (temperatures[j] > temperatures[i]) {
                    ans[i] = days;
                    break;
                }
            }
        }
        return ans;
    }
}
}
