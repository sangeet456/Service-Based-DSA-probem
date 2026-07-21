import java.util.HashMap;
import java.util.Scanner;

public class firstuniquecharacterinstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character,Integer> map = new HashMap<>();
        String s = sc.nextLine();
        char [] str = s.toCharArray();
        for(char ch : str){
            map.put(ch , map.getOrDefault(ch,0)+1);
        }
    
        //now returning jiska frequency 1 h wahi unique hoga//
        for(char ch : str){
        if(map.get(ch)==1) {System.out.println(ch);            
    return ;    }
    }

        System.out.println("-1");
    }
    
}
