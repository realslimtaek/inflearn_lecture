import java.util.*;
public class _6_9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        int cnt = 0;
        for(int i = 0; i<n; i++){
            int a = sc.nextInt();
            cnt += a;
            arr[i] = a;
        }
        System.out.println(solution(m,arr, cnt));
    }
    public static int solution(int m, int[] arr, int cnt){
        int left = Arrays.stream(arr).max().getAsInt();
        int right = cnt;
        int answer = 0;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(count(arr,mid) <= m){
                answer = mid;
                right = mid -1;
            } else left = mid + 1;
        }
        return answer;
    }
    public static int count(int[] arr, int capacity){
        int cnt = 1, sum = 0;

        for(int x : arr){
            if(sum+x > capacity){
                cnt++;
                sum = x;
            } else sum += x;
        }
        return cnt;

    }
}
