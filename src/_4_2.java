import java.util.*;
import java.io.*;
public class _4_2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String st1 = sc.next();
        String st2 = sc.next();

        System.out.println(solution(st1,st2));
    }

    public static String solution(String st1, String st2){

        HashMap<Character,Integer> hash1 = new HashMap<>();
        HashMap<Character,Integer> hash2 = new HashMap<>();

        for(char ch : st1.toCharArray()){
            hash1.put(ch,hash1.getOrDefault(ch,0)+1);
        }
        for(char ch : st2.toCharArray()){
            hash2.put(ch,hash2.getOrDefault(ch,0)+1);
        }

        if(Objects.equals(hash1,hash2)) return "YES";

        return "NO";
    }
}
