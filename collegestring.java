import java.util.*;

public class collegestring {

    static void printarray(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of data to enter :");
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.next();
        }
        System.out.println("enter the target string");
        String target = sc.next();
        int minchange = Integer.MAX_VALUE;
        String ans = arr[0];
        for (String word : arr) {
            int changes = 0;
            for (int i = 0; i < word.length(); i++) {
                int f = 0;
                for (int j = 0; j < target.length(); j++) {
                    if (word.charAt(i) == target.charAt(j)) {
                        f = 1;
                        break;
                    }
                }
                if (f == 0) {
                    changes++;
                }
            }
            if (word.length() < target.length()) {
                changes += target.length() - word.length();
            }

            if (changes < minchange) {
                minchange = changes;
                ans = word;
            }
        }
        System.out.println("Input words : ");
        System.out.println();
        printarray(arr);
        System.out.println();
        System.out.println(ans);

    }

}
