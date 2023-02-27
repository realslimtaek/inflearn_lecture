import java.util.*;
public class _6_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

//        ArrayList<Number> list = new ArrayList<>();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            int a = sc.nextInt();
//            list.add(new Number(a, 0));
            arr[i] = a;

        }

        System.out.println(solution(arr));
    }

    public static String solution(int[] arr){

        int[] unique = Arrays.stream(arr).distinct().toArray();

        if(unique.length == arr.length)
            return "U";

        return "D";
    }
}

class Number{

    int num;
    int cnt;

    public Number(int num, int cnt){
        this.num = num;
        this.cnt = cnt;
    }
}