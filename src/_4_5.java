import java.util.*;
import java.io.*;
public class _4_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
//            list.add(sc.nextInt());
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(solution(arr, n , k));
    }

    public static int solution(int[] arr, int n, int k){

        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for(int i = 0; i<n-2; i++){
            for(int j = i+1; j<n-1; j++){
                for(int l = j+1; l<n; l++){
                    Tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        int cnt = 0;
        for(int x : Tset){
            cnt++;
            if(cnt==k) return x;
        }

        return -1;
    }
}
