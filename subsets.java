import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class subsets {
   static  List<List<Integer>> result = new ArrayList<>();

static void solve(int i , Vector<Integer> vector , List<Integer> temp){

    if(i>=vector.size()) {result.add(new ArrayList<>(temp));
        return;
    }
    temp.add(vector.get(i));
    solve(i+1, vector, temp);
    temp.remove(temp.size()-1);
    solve(i+1,vector,temp);
    
}



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector<Integer> vector= new Vector<>();
     for(int i=0;i<n;i++){
        vector.add(sc.nextInt());
     }
     System.out.println("resultant array");
     System.out.println();
     System.out.println(vector);
     System.out.println("all subsets :");
     List<Integer> temp = new ArrayList<>();
     solve(0, vector, temp);
     for(List<Integer> subset : result){
        System.out.println(subset);

     }
    }
}
