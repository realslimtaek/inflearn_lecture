import java.util.*;
import java.io.*;
public class _8_5 {
    static int n;
    static Integer[] coin_list;
    static int k = Integer.MAX_VALUE;
    static int tot;
    static boolean check = false;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        coin_list = new Integer[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = n-1; i>=0; i--){
            coin_list[i] = Integer.parseInt(st.nextToken());
        }
        tot = Integer.parseInt(br.readLine());
        Arrays.sort(coin_list,Collections.reverseOrder());
        solution(0,0, 0);
        System.out.println(k);
    }

    public static void solution(int n, int now, int cnt){
        if(cnt > k || now > tot || n==coin_list.length) return;
//        if(now > tot) return;
//        if(n == coin_list.length) return;
        if(now == tot) {
            if(k > cnt){
                k = cnt;
            }
        }else{
            solution(n,now+coin_list[n],cnt+1);
            solution(n+1,now,cnt);
        }
    }
}

/*
102
104
102
119
90
 */