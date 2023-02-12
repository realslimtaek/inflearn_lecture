import java.util.*;
import java.io.*;
public class _2_8 {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        StringTokenizer sb = new StringTokenizer(br.readLine());
        int[] list = new int[num];

        for(int i = 0; i<num; i++){
            list[i] = Integer.parseInt(sb.nextToken());
        }
        System.out.println(solution(num,list));

    }

    public static String solution(int num, int[] list){
//        String answer = "";
        StringBuilder answer = new StringBuilder();
        int[] winner = new int[num];
        for(int i = 0; i<num; i++){
            int cnt = 1;
            for(int j=0;j<num;j++){
                if(list[i] < list[j]){
                    cnt++;
                }
                winner[i] = cnt;
            }
        }

        for (int j : winner) {
            answer.append(j).append(" ");
        }
        return answer.toString();
    }
}
