import java.util.Scanner;

public class palindromearray {
static void printarray(int[]arr){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}

static boolean palindrome(int arr[]){
    int start =0;
    int end = arr.length-1;
    while(start<end){
        if(arr[start]!=arr[end]){
        return false;
    }
            start++;
            end --;}
return true;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
printarray(arr);
System.out.println();
System.out.println(palindrome(arr));    }

}
