import java.util.*;
public class _7_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(recursive(n));
    }

    public static int recursive(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return recursive(n-1)+recursive(n-2);
    }
}
