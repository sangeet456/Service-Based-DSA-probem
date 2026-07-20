import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

class removeduplicates{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
            
        }

        LinkedHashSet<Integer> sets = new LinkedHashSet<>();
        for(int ele : nums){
            sets.add(ele);
        }
        int i=0;
        for(int num: sets){
            nums[i++] = num;
        }
System.out.println(sets.size());

    }
}