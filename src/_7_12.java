import java.util.*;
public class _7_12 {
    static int answer = 0;
    static int answer2 = 0;
    static int N;
    static ArrayList<ArrayList<Integer>> graph;
    //11은 이론이라 코드 없음.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        int m = sc.nextInt();

        boolean[][] node = new boolean[N+1][N+1];
        graph = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i<= N; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 1; i<=m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            node[a][b] = true;
            graph.get(a).add(b);

        }
        System.out.println(solution(node));
        System.out.println(solution_2());
    }
    //Solved by DFS
    public static int solution(boolean[][] node){

        for(int i = 2; i<=N; i++){
            boolean[] isVisit = new boolean[N+1];
            if(node[1][i]) {
                recursive(i, node, isVisit);
            }
        }
        return answer;
    }

    //Solved by Adjacency list
    public static int solution_2(){
        boolean[] isVisit = new boolean[N+1];
        recursive_2(1,graph,isVisit);
        return answer2;
    }

    public static void recursive(int n, boolean[][] node, boolean[] isVisit){
        isVisit[n] = true;
        if(n == N){
            answer++;
            isVisit[n] = false;
            return;
        }

        for(int i = 2; i<=N; i++) {
            if (n != i && node[n][i] && !isVisit[i]) {
                recursive(i, node, isVisit);
            }
        }
        isVisit[n] = false;
    }

    //인접리스트
    public static void recursive_2(int n , ArrayList<ArrayList<Integer>> graph, boolean[] isVisit){
        isVisit[n] = true;

        if(n == N){
            answer2++;
            isVisit[n] = false;
            return;
        }
        for(int nv : graph.get(n)){
            if(!isVisit[nv])
                recursive_2(nv, graph, isVisit);
        }
        isVisit[n] = false;

    }

}
