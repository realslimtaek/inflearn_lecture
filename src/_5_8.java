import java.util.*;

public class _5_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m = sc.nextInt();

        int[] d = new int[n];
        int[] f = new int[n];
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i<n; i++){
            int a = sc.nextInt();
            d[i] = a;
            f[i] = a;
            q.offer(i);
        }
        Arrays.sort(d);

        System.out.println(solution(n,f,m,d,q));

    }
    public static int solution(int n, int[] f, int m, int[]d, Queue<Integer> q){
        int answer = 1;
        int i = n-1;
        while(q.size()!= 0){
            if(f[q.peek()] != d[i]){
                q.offer(q.poll());
                continue;
            }
            if(q.peek() == m) {
                break;
            }
            q.poll();
            answer++;
            i--;
        }



        return answer;
    }
}
