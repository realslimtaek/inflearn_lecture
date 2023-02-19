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
        HashMap<Character, Integer> asdf = new HashMap<>(n);

        for(char temp : s.toCharArray()){

            if(!asdf.containsKey(temp)){
                asdf.put(temp,1);
                continue;
            }
            asdf.put(temp,asdf.get(temp) + 1);

            if(asdf.get(temp) > count){
                answer = Character.toString(temp);
                count = asdf.get(temp);
            }
        }

        return answer;
    }
}
