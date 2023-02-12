import java.util.*;
import java.io.*;
public class _2_9 {

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
        int answer = 0;
        int[] list_answer = new int[num];
        int[] check_list = new int[num];
        Arrays.fill(check_list,0);
        int winner = 1;


        for(int j = 0; j< num; j++){
            for(int i = 0; i < 5; i++){
                for(int k = 0; k<num; k++){
                    if(Objects.equals(j,k)) continue;
                    if(Objects.equals(list[j][i], list[k][i]))
                        check_list[k] = 1;
                }
            }
            for(int i : check_list)
                if(Objects.equals(i,1))
                    answer++;
            list_answer[j] = answer;
            answer = 0;
            Arrays.fill(check_list,0);
        }

        for(int i = 0; i<list_answer.length; i++){
            if(answer < list_answer[i]) {
                answer = list_answer[i];
                winner = i+1;
            }
        }
        return winner;
    }
}
