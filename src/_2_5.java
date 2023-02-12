import java.util.*;
import java.io.*;

public class _2_5 {
    //asdf

    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        System.out.println(solution(num));

    }

    public static int solution(int num){
        int answer = 0;
        int[] list = new int[num+1];

        for(int i = 2; i<=num; i++){
            if(list[i] == 0) {
                answer++;
                for(int j = i; j<=num; j=j+i){
                    list[j]=1;
                }
            }
        }
        return answer;
    }
}
