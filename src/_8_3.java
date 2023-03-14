import java.util.*;
import java.io.*;
public class _8_3 {
    static int n;
    static int[] arr_1;
    static int m;
    static int[] arr_2;
    static int point=0;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr_1 = new int[n];
        arr_2 = new int[n];
        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            arr_1[i] = Integer.parseInt(st.nextToken());
            arr_2[i] = Integer.parseInt(st.nextToken());
        }

        solution(0, 0, 0);
        System.out.println(point);
    }
    public static void solution(int a, int sum, int cur_time){
        if(cur_time > m) return;
        if(Objects.equals(n,a)){
            if(sum > point) {
                point = sum;
            }
        } else{
            solution(a+1, sum+arr_1[a], cur_time +arr_2[a]);
            solution(a+1,sum,cur_time);
        }
    }
}
