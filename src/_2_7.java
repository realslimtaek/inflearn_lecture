import java.util.*;
import java.io.*;
public class _2_7 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] list = new int[num];
        for(int i = 0; i<num; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(list,num));

    }

    public static int solution(int[] list, int num) {
        int cnt = 1;
        int answer = 0;
        for (int i = 0; i < num; i++) {
            if (Objects.equals(list[i], 1)) {
                answer += cnt;
                cnt++;
                continue;
            }
            cnt = 1;
        }
        return answer;
    }

}
