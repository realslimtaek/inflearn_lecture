import java.io.*;
import java.util.*;

public class _3_3 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }

            System.out.print(solution(n,m,a));
    }

    public static int solution(int n, int m, int[] a){
        int answer = 0;
        for(int i = 0; i < m;i++){
            answer += a[i];
        }
        int max = answer;
        for(int i = 1; i<n-m; i++){
            max += (a[i-1] - a[i+m-1]);
            answer = Math.max(answer,max);
        }

        return answer;
    }

}
