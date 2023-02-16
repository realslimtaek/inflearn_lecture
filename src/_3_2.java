import java.util.*;
import java.io.*;
public class _3_2 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);

        int m = Integer.parseInt(br.readLine());
        int[] b = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++){
            b[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(b);

        for(int i : solution(n ,m ,a, b)){
            System.out.print(i + " ");

        }
    }

    public static ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> arr = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while(p1 < n && p2 < m){
            if(a[p1] == b[p2]){
                arr.add(a[p1++]);
                p2++;
                continue;
            }
            if(a[p1] < b[p2++]){
                continue;
            }
            p2++;
        }

        return arr;
    }

}
