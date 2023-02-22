import java.util.*;
import java.io.*;
public class _4_1  {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        System.out.println(solution(n, s));

    }

    public static String solution(int n, String s){
        String answer = "";
        int count = 0;
        HashMap<Character, Integer> hash = new HashMap<>(n);

        for(char temp : s.toCharArray()){

            if(!hash.containsKey(temp)){
                hash.put(temp,1);
                continue;
            }
            hash.put(temp,hash.get(temp) + 1);

            if(hash.get(temp) > count){
                answer = Character.toString(temp);
                count = hash.get(temp);
            }
        }

        return answer;
    }
}
