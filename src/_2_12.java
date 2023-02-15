import java.util.*;
import java.io.*;
public class _2_12 {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sb = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(sb.nextToken());
        int m = Integer.parseInt(sb.nextToken());

        int[][] list = new int[m][n];
        for(int i = 0; i<m; i++){
            sb = new StringTokenizer(br.readLine());
            for(int j = 0; j<n; j++){
                list[i][j] = Integer.parseInt(sb.nextToken());
            }
        }

        System.out.println(solution(n,m,list));
    }

    public static int solution(int n, int m, int[][] list){
        int answer = 0;

        int[][] answerlist = new int[n+1][n+1];

        for(int i = 1 ; i<n+1; i++){
            Arrays.fill(answerlist[i],1,n,1);
            answerlist[i][i] = 0;
        }



        for(int i = 0; i<m; i++){
            for(int j = n-1; j>0; j--){
                int a = list[i][j];
                for(int k = j-1; k>=0; k--){
                    int b = list[i][k];
                    answerlist[a][b] = 0;
                }
            }
        }

        for(int i = 1; i <n+1; i++){
            for(int j = 1; j < n+1; j++){
                if(answerlist[i][j] == 1)
                    answer++;
            }
        }

        return answer;
    }
}
