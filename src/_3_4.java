import java.io.*;
import java.util.*;

public class _3_4 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] a = new int[n];
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(st2.nextToken());
        }

        System.out.println(solution(n,m,a));
    }

    public static int solution(int n, int m, int[] a){
        int answer = 0;
        int pleft = 0, pright = 0;
        int sum = 0;
        while(pright < n){
             if(sum  < m){
                sum += a[pright++];
                if(Objects.equals(sum,m)){
                    answer++;
                    sum -= a[pleft++];
                }
                continue;
            }
            if(sum > m){
                sum -= a[pleft++];
                if(Objects.equals(sum,m)){
                    answer++;
                    sum -= a[pleft++];
                }
            }
        }

        return answer;
    }
}
