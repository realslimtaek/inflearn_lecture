import java.util.*;
import java.io.*;
public class _4_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(solution(k,arr));
    }

    public static String solution(int k, int[] arr){
        StringBuilder answer = new StringBuilder();
        int rt= 0;
        int lt = 0;
        HashMap<Integer, Integer> hash = new HashMap<>();

        for(int i = 0; i<k-1; i++){
            hash.put(arr[i],hash.getOrDefault(arr[i],0)+1);
        }

        for(rt = k-1; rt<arr.length; rt++){
            hash.put(arr[rt],hash.getOrDefault(arr[rt],0)+1);
            answer.append(hash.size()).append(" ");
            hash.put(arr[lt],hash.get(arr[lt])-1);
            if(hash.get(arr[lt]) == 0) hash.remove(arr[lt]);
            lt++;
        }
        return answer.toString();
    }
}
