import java.util.*;
import java.io.*;
public class _4_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String st1 = sc.next();
        String st2 = sc.next();


        System.out.println(solution(st1,st2));
    }
    public static int solution(String st1, String st2){
        int answer = 0;
        int lt = 0, rt = st2.toCharArray().length-1;
        HashMap<Character, Integer> hash = new HashMap<>();
        HashMap<Character, Integer> hash2 = new HashMap<>();

        for(int i =0; i<st2.toCharArray().length-1; i++){
            hash.put(st1.charAt(i), hash.getOrDefault(st1.charAt(i),0)+1);
        }

        for(int i = 0; i<st2.toCharArray().length; i++){
            hash2.put(st2.charAt(i), hash2.getOrDefault(st2.charAt(i),0)+1);
        }

        for(int i = rt; i< st1.length(); i++){
            hash.put(st1.charAt(i), hash.getOrDefault(st1.charAt(i),0)+1);
            if(hash.equals(hash2)) {
                answer++;
            }
            hash.put(st1.charAt(lt),hash.get(st1.charAt(lt))-1);
            if(hash.get(st1.charAt(lt)) == 0) hash.remove(st1.charAt(lt));
            lt++;
        }

        return answer;
    }
}
