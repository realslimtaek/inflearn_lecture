import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class _1_11 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        br.close();

        System.out.println(solution(str));
    }
    public static String solution(String str){
        String answer = "";
        int count = 1;
        str += " ";

        for(int i = 0; i<str.length()-1; i++){
            if(!Objects.equals(str.charAt(i),str.charAt(i+1))){
                answer += str.charAt(i);
                if(count > 1){
                    answer += Integer.toString(count);
                    count = 1;
                }
                continue;
            }
            count++;
        }
        return answer;
//KKHSSSSSSSE
    }


}
