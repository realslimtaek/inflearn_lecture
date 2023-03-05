import java.util.*;
public class _7_8 {
    static int e;
    static int n;
    static int[] dist = {1,-1,5};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        e = sc.nextInt();

        solution();
    }

    public static void solution(){
        Queue<Integer> q = new LinkedList<>();
        q.offer(n);
        int level = 0;
        int[] ch = new int[10001];
        ch[n] = 1;
        while(!q.isEmpty()){
            int len = q.size();
            for(int i = 0; i<len; i++){
                int cur = q.poll();

                for(int a : dist){
                    int v = cur + a;
                    if(v == e) {
                        System.out.println(level + 1);
                        return;
                    }
                    if(v >= 1 && v<= 10000 && ch[v] != 1){
                        q.offer(v);
                        ch[v] = 1;
                    }

                }

            }
            level++;
        }
    }
}