import java.util.*;
class _7_6{
    static int[] check;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        check = new int[n+1];
        recursive(1);
    }

    public static void recursive(int a){
        String answer = "";
        if(a == n+1){
            for(int i = 1; i<n+1; i++){
                if(check[i] == 1)
                    answer += i + " ";
            }
            if(answer.length() > 0)
                System.out.println(answer);
        }else{
            check[a] = 1;
            recursive(a+1);
            check[a] = 0;
            recursive(a+1);
        }


    }
}