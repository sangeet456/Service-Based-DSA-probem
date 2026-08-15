import java.util.Scanner;
import java.util.Stack;

public class engineercompany {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
  
       Integer num = sc.nextInt();
        int k = sc.nextInt();
      String str = Integer.toString(num);
      char[] arr = str.toCharArray();
       Stack<Character> st = new Stack<>();
        for(int i = 0; i < arr.length; i++) {
            while(st.size() > 0 && k > 0 && st.peek() < arr[i]) {
                st.pop();
                k--;
            }
            st.push(arr[i]);
        }
while(k>0){
    st.pop();
    k--;
}

String s = "";
while(st.size()>0){
    s = st.pop() + s;
}
System.out.println(s);

    }
}
