import java.util.*;
import java.io.*;
public class _5_3 {
    public static int[][] arr;
    public static int[] input;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        for(int i = 0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j<N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());

            }
        }
        int K = Integer.parseInt(br.readLine());
        input = new int[K];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<K; i++){
            input[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(N));
    }

    public static int solution(int N){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        int l = 0;
        int k = 0;
        for(int i : input){
            for(int j = 0; j<N; j++) {
                if (arr[j][i-1] != 0) {
                    stack.push(arr[j][i-1]);
                    k = arr[j][i-1];
                    arr[j][i-1] = 0;
                    break;
                }
                k = 0;
            }
            if(l==k){
                stack.pop();stack.pop();
                answer++;
                l = stack.peek();
                k=0;
                continue;
            }
            l = k;

        }
        return answer*2;
    }
}
