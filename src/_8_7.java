import java.util.*;
public class _8_7 {
    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();
        arr = new int[n+1][n+1];
        System.out.println(solution(n,r));

    }
    public static int solution(int n, int r){
        if(r== 0) {
            arr[n][r] = 1;
            return 1;
        }
        if(n==r){
            arr[n][r] = 1;
            return 1;
        }
        if(arr[n][r] == 0){
            arr[n][r] = solution(n-1,r-1) + solution(n-1,r);
        }
        return arr[n][r];
    }
}
