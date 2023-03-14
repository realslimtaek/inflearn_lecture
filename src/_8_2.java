import java.util.*;
import java.io.*;
public class _8_2 {
    static int tot;
    static int now;
    static int n;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tot = sc.nextInt();
        n = sc.nextInt();

        arr= new int[n];
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }

        solution(0,0);
        System.out.println(now);
    }
    public static void solution(int a,int sum){
        if(tot < sum) return;
        if(a == n){
            if(sum > now)
                now = sum;
        } else{
            solution(a+1,sum+arr[a]);
            solution(a+1,sum);
        }
    }
}
