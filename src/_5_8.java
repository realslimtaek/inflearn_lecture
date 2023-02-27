import java.util.*;

public class _5_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m = sc.nextInt();

        int[] d = new int[n];
        Queue<Person> q = new LinkedList<>();
        for(int i = 0; i<n; i++){
            int a = sc.nextInt();
            d[i] = a;
            q.offer(new Person(i,a));
        }
        Arrays.sort(d);

        System.out.println(solution(n,m,d,q));

    }
    public static int solution(int n, int m, int[]d, Queue<Person> q){
        int answer = 1;
        int i = n-1;
        while(q.size()!= 0){
            if(q.peek().danger < d[i]){
                q.offer(q.poll());
                continue;
            }
            if(q.peek().id == m){
                break;
            }
            q.poll();
            answer++;
            i--;
        }



        return answer;
    }
}
class Person{
    int id;
    int danger;
    public Person(int id, int danger){
        this.id=id;
        this.danger = danger;
    }
}
