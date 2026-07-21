class Solution {

     private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public String reverseVowels(String s) {
            char [] words = s.toCharArray();
    int i =0;
    int j= words.length-1;
    String str = "";

    while(i<=j){
      if(!isVowel(words[i])){
        i++;
        continue;
      }
     else  if(!isVowel(words[j])){
        j--;
        continue;
      }
      else{
        char temp = words[i];
        words[i]=words[j];
        words[j]=temp;
        i++;
        j--;
      }
       }
        
   str=String.valueOf(words);
   return str; }
}