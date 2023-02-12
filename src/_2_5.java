import java.util.*;
import java.io.*;

public class _2_5 {

    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        System.out.println(solution(num));

    }

    public static int solution(int num){
        int answer = 0;

        for(int i = 2; i<=num; i++){
            for(int j = 2; j<=i; j++){
                if(Objects.equals(i,j)) {
                    answer++;
                }
                if(i%j == 0) break;
            }
        }



        return answer;
    }
}
