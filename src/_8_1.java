import java.util.*;
import java.io.*;

public class _8_1 {
    static boolean check = false;
    static int tot = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            tot += arr[i];
        }

        solution(arr, 0,0);
        if(check) System.out.println("YES");
        else System.out.println("NO");
    }
    public static void solution(int[] arr, int sum,int a){
        if(check) return;
        if(sum>tot/2) return;
        if(a == arr.length - 1){
            if(sum * 2 == tot){
                check = true;
            }
        } else{
            solution(arr, sum + arr[a], a+1);
            solution(arr,sum,a+1);
        }
    }
}
