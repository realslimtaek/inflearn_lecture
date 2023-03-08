import java.util.*;
public class _7_13 {
    static int N;
    static int M;
    static boolean[][] graph;
    static int[] answer;
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        answer = new int[N+1];
        Arrays.fill(answer, N);
        graph = new boolean[N+1][N+1];
        for(int i = 0; i<M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = true;
        }
        boolean[] isVisit = new boolean[N+1];
//        my_solving(1, isVisit);
        BFS();
        for(int i= 2; i<=N; i++){
            System.out.println(i +" : "+answer[i]);
        }

    }
    public static void my_solving(int n, boolean[] isVisit){
        cnt++;
        for(int i = 2; i<=N; i++){
            if(!isVisit[i] && graph[n][i]){

                isVisit[i] = true;
                if(answer[i] > cnt){
                    answer[i] = cnt;
                }
                my_solving(i, isVisit);
                cnt--;
                isVisit[i] = false;
            }
        }
    }

    public static void BFS(){
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        while(!q.isEmpty()){
            cnt++;
            for(int i = 0; i<q.size(); i++){
                int cur = q.poll();
                for(int j = 2; j<=N; j++) {
                    if (graph[cur][j]) {
                        q.offer(j);
                        if(answer[j] > cnt){
                            answer[j] = cnt;
                        }
                    }
                }
            }
        }
    }
}
/*
6 9
1 3
1 4
2 1
2 5
3 4
4 5
4 6
6 2
6 5
 */