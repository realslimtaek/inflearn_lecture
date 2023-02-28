import java.util.*;
public class _6_8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(binary_search(arr,m)+1);
    }

    public static int binary_search(int[] arr, int m){

        int mid = 0;
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            mid = (left+right)/2;
            if(arr[mid] > m){
                right = mid;
                continue;
            }
            if(arr[mid] < m){
                left = mid;
                continue;
            }
            return mid;
        }
        return mid;
    }

}
