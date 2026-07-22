import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] words = str.toCharArray();
        int maxlength = 0;  // Initialize to 0, not read from input
        
        for (int start = 0; start < words.length; start++) {
            Set<Character> set = new HashSet<>();  // More efficient than List
            for (int end = start; end < words.length; end++) {
                if (set.contains(words[end])) {
                    break;
                }
                set.add(words[end]);
                maxlength = Math.max(maxlength, end - start + 1);
            }
        }
        
        System.out.println(maxlength);
        sc.close();
    }
}