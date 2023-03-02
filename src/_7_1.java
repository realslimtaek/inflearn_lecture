import java.util.*;
public class _7_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursive(n);
    }

    public static void recursive(int n){
        if(n==0) return;
        recursive(n-1);
        System.out.print(n+" ");


    }
}
