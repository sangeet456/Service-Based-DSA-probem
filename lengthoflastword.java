class Solution {
    public int lengthOfLastWord(String s) {
        String [] words = s.split(" ");
        int n = words.length;
        String data = words[n-1];
        int res = data.length();
    return res ;}
}