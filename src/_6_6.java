import java.util.*;
public class _6_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cur = 0;
        int j = 0;
        int cnt = 0;
        int[] arr = new int[n+1];
        int[] arr2 = new int[n+1];
        for(int i = 1; i<=n; i++){
            cur = sc.nextInt();
            arr[i] = cur;
            arr2[i] = cur;
        }
        Arrays.sort(arr2);
        for(int i = 1; i<=n;i++){
            if(arr[i] != arr2[i]){
                if(cnt != 1){
                    cnt++;
                    j = i;
                } else {
                    System.out.println(j +" "+i);
                    break;
                }

            }
        }


    }
}
