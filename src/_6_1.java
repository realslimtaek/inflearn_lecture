import java.util.*;
public class _6_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int a : solution(n,arr)){
            System.out.print(a + " ");
        }
    }

    public static int[] solution(int n, int[] arr){
        for(int i = 0; i<n; i++){
            int low = arr[i];
            int key = i;
            for(int j = i+1; j<n; j++){
                if(arr[j] < low){
                    low = arr[j];
                    key = j;
                }
            }
            if(low == arr[i]) continue;
            int temp = arr[i];
            arr[i] = low;
            arr[key] = temp;
        }

        return arr;
    }

}
