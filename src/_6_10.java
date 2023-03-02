import java.util.*;
public class _6_10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println(solution(n,c,arr));

    }
    public static int solution(int n, int c, int[] arr){
        int answer = 0;

        int left = 1;
        int right = arr[n-1];
        while(left<=right) {
            int mid = (left+right)/2;
            if(count(arr,mid)>=c){
                answer = mid;
                left = mid+1;
            }
            else{
                right = mid -1;
            }
        }
        return answer;
    }

    public static int count(int[] arr, int dist){
        int cnt = 1;
        int ep = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] - ep >= dist) {
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }


}
