import java.util.*;
public class _7_6 {

    static int[] check;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        check = new int[n+1];

        recursive(1);
    }

    public static void recursive(int L){
        if(L == n+1){
            String tmp = "";
            for (int i = 0; i<check.length; i++) {
                if (check[i] == 1)
                    tmp += i + " ";
            }
            if(tmp.length() > 0) System.out.println(tmp);
            return;
        }else{
            check[L] = 1;
            recursive(L+1);
            check[L] = 0;
            recursive(L+1);
        }
    }
}
