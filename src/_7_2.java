import java.util.*;
public class _7_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        recursive(n);
    }
    public static void recursive(int n){
        if(n == 0){
            return;
        }

        System.out.print(n%2);
        recursive(n/2);
    }
}
