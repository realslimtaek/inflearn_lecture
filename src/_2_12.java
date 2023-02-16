import java.util.*;
import java.io.*;

public class _2_12 {
    /*
    //내 방식

    //그래프 인접행렬

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
    */

    //강의 방식

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(solution(n,m,arr));
    }

    public static int solution(int n, int m, int[][] arr){
        int answer = 0;
        for(int i = 1; i<=n; i++){
            //i번 학생과
            for(int j =1; j<=n; j++){
                //j번 학생의
                int cnt = 0;
                for(int k = 0; k<m; k++){
                    //k번째 테스트에서의
                    int pi=0, pj = 0;
                    for(int s = 0; s<n; s++){
                        //s 등수를 구하고
                        if(arr[k][s]==i) pi = s;
                        if(arr[k][s]==j) pj = s;
                    }
                    //멘토가 멘티 점수보다 높을경우(인덱스가 낮을경우) 카운트 ++
                    if(pi<pj) cnt++;
                }
                //모든 k번째 테스트에서 성립할 경우 점수 +
                if(cnt==m) answer++;
            }
        }
        return answer;
    }
}


