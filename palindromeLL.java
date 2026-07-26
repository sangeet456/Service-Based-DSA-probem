class Solution {
    public boolean isPalindrome(ListNode head) {
        int count =0;
        ListNode temp=head;
        while(temp!=null){
          count ++;
          temp=temp.next;
        }
      int arr[] = new int[count];
      temp=head;
      for(int i=0;i<count;i++){
        arr[i]=temp.val;
        temp=temp.next;
      }
       int start =0;
       int end = arr.length-1;
       while(start<end){
        if(arr[start]!=arr[end]) {
            return false;
        }
       start++;
       end--;
       }



 return true; }
}