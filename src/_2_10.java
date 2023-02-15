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
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        for(int i = 1; i < num+1; i++){
            for(int j = 1; j < num+1; j++){
                boolean flag = true;
                for(int k = 0; k<4; k++){
                    int nx= i+dx[k];
                    int ny= j+dy[k];
                    if(list[nx][ny] >= list[i][j]){
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;

            }
        }

        return answer;
    }
}
