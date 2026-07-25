import java.util.*;
class solution{

public static void printarray(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

System.out.println("Original Array : ");
printarray(arr);
System.out.println();
System.out.println("enter the element to remove");
int k = sc.nextInt();
//============================================================================

int count =0;
for(int i=0;i<arr.length;i++){
    if(arr[i]==k) count ++;
}
int [] newarr = new int[n-count];
int index =0;
for(int i=0;i<arr.length;i++){
    if(arr[i]!=k){
        newarr[index] = arr[i];
   index ++;
 }
}
printarray(newarr);
   sc.close(); }
}