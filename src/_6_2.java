import java.util.*;
public class _6_2 {

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
        for(int i = n-1; i>=0; i--){
            for(int j = 0; j<i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

}
