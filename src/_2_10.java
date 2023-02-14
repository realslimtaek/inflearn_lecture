import java.util.*;
import java.io.*;
public class _2_10 {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[][] list = new int[num+2][num+2];

        for(int i = 1; i < num+1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 1; j < num+1; j++){
                list[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(solution(list,num));
    }

    public static int solution(int[][] list, int num){
        int answer = 0;

        for(int i = 1; i < num+1; i++){
            for(int j = 1; j < num+1; j++){
                if(list[i][j] > list[i-1][j] && list[i][j] > list[i+1][j] &&
                list[i][j] > list[i][j-1] && list[i][j] > list[i][j+1] ){
                    answer++;
                }
            }
        }

        return answer;
    }
}
