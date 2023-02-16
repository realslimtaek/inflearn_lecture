import java.util.*;
import java.io.*;
public class _3_5 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(solution(n));
    }

    public static int solution(int n){
        int answer = 0;
        int rt = n/2+1;
        int lt = rt - 1;
        int sum = rt;
        while(rt > 3){
            sum += lt;
            if(sum == n){
                answer++;
                sum = --rt;
                lt = rt-1;
                continue;
            }
            if(sum>n){
                sum = --rt;
                lt = rt-1;
                continue;
            }
                lt--;
        }


        return answer;
    }
}