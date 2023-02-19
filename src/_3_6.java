import java.util.*;
import java.io.*;
public class _3_6 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] list = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(n, m, list));

    }

    public static int solution(int n, int m, int[] list){
        int pl = 0;
        int answer = 0;
        while(pl < n-answer){
            int cnt = 0;
            int p0 = 0;
            int temp = 0;
            for(int i = pl; i<n; i++){
                if(list[i] == 1){
                    cnt++;
                    continue;
                }
                if(list[i] == 0){
                    if(p0 < m){
                        temp = i;
                        p0++;
                        cnt++;
                        continue;
                    }
                    i = temp;
                    break;
                }
            }
            pl++;
            answer = Math.max(answer,cnt);
        }
        return answer;
    }
}
