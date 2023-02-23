import java.util.*;
import java.io.*;
public class _4_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
//            list.add(sc.nextInt());
            arr[i] = sc.nextInt();
        }

        Collections.sort(list);
        Arrays.sort(arr);



        if(k<=n){
            System.out.println(arr[k-1]);
        }
        else{
            System.out.println("-1");
        }

    }
}
