import java.util.*;
import java.io.*;
public class _2_11 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int[][] list = new int[num][5];

        for(int i = 0; i<num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j<5; j++){
                list[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(solution(list, num));

    }

    public static int solution(int[][] list,int num){
        int winner = 1;
        int max = 0;

        for(int i = 0; i< num; i++){
            //i번학생과
            int count = 0;
            for(int j = 0; j < num; j++){
                //j번학생의
                for(int k = 0; k<5; k++){
                    //k학년 비교
                    if(Objects.equals(list[i][k], list[j][k])) {
                        count++;
                        break;
                    }
                }
            }
            if(count>max){
                max = count;
                winner = i+1;

            }
        }
        return winner;
    }
}
