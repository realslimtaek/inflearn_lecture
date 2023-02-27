import java.util.*;
public class _6_3 {

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
        for(int i = 1; i<n; i++){
            int temp = arr[i];
            int j = 0;
            for(j = i-1 ; j>=0; j--){
                if(arr[j] > temp){
                    arr[j+1] = arr[j];
                }
                else break;
            }
            arr[j+1] = temp;
        }

        return arr;
    }

}
