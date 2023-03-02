import java.util.*;
public class _6_9{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(m, arr));
    }

    public static int solution(int m, int[] arr){
        int answer = 0;
        int left = Arrays.stream(arr).min().getAsInt();
        int right = Arrays.stream(arr).sum();

        while(left <= right){
            int mid = (left+right)/2;
            if(count(arr, mid) >= m){
                answer = mid;
                left = mid+1;
            } else{
                right = mid-1;
            }
        }
        return answer;
    }

    public static int count(int[] arr, int mid){
        int sum = 0;
        int cnt = 0;
        for(int i = 0; i<arr.length; i++){
            if(sum + arr[i] >= mid){
                cnt++;
                sum = arr[i];
            } else {
                sum += arr[i];
            }
        }
        return cnt;
    }
}