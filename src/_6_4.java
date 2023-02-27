import java.util.*;

public class _6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i : solution(s,n,arr)){
            System.out.print(i + " ");
        }

    }
    public static int[] solution(int s, int n, int[] arr){
        int[] answer = new int[s];

        for(int i = 0; i<n; i++){
            int j;
            for(j = 0; j<s-1; j++){
                if(arr[i] == answer[j]){
                    break;
                }
            }
            for(int k = j; k > 0; k--){
                answer[k] = answer[k-1];
            }
            answer[0] = arr[i];
        }

        return answer;
    }
}

/*
5 9
1 2 3 2 6 2 3 5 7

 */