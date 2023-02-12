import java.util.*;
import java.io.*;
public class _2_9 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int[][] list = new int[num][num];

        for(int i = 0; i<num; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j<num; j++){
                list[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(solution(list,num));
    }

    public static int solution(int[][] list, int num){
        int answer = 0;
        int sum = 0;

        //행 합
        for(int i = 0; i <num; i++){
            for(int j = 0; j<num; j++){
                sum += list[i][j];
            }
            answer = checkAnswer(answer,sum);
            sum = 0;
        }



        //열 합
        for(int i = 0; i <num; i++){
            for(int j = 0; j<num; j++){
                sum += list[j][i];
            }
            answer = checkAnswer(answer,sum);
            sum = 0;
        }

        //왼쪽 대각선
        for(int i =0; i<num; i++){
            sum += list[i][i];
        }
        answer = checkAnswer(answer,sum);
        sum = 0;



        int k = 0;
        for(int i = num-1; i>=0; i--){
            sum += list[i][k];
            k++;
        }
        answer = checkAnswer(answer,sum);
        sum = 0;

        return answer;
    }

    public static int checkAnswer(int answer , int sum){
        return Math.max(answer, sum);
    }
}
