import java.util.Scanner;

public class arrayoddeven {

static void printarray(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("enter the array elements : ");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        printarray(arr);
        //lets work the even and odd position//
           int result[] = new int[arr.length];
            int idx =0;
           for(int i=0;i<arr.length;i=i+2){
              result[idx]=arr[i];
                idx++;
            }

            for(int i=1;i<=arr.length-1;i=i+2){
                result[idx]= arr[i];
                idx++;
            }

     System.out.println();
  printarray(result);  }
           }
  
 


