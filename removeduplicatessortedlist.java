import java.util.*;
class solution{

static void printarray(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
printarray(arr);
LinkedHashSet<Integer>list = new LinkedHashSet<>();
for(int ele : arr){
    list.add(ele);
} 
System.out.println("removed duplicates from sorted array : ");
System.out.println(list);
}

    
}