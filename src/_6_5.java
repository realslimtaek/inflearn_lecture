import java.util.*;
public class _6_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<Integer,Integer> hashmap = new HashMap<>();

        String answer = "U";

        for(int i = 0; i<n; i++){
            int a = sc.nextInt();
            if(!hashmap.containsKey(a)){
                hashmap.put(a,hashmap.getOrDefault(a,0)+1);
            } else{
                answer  = "D";
                break;
            }
        }
        System.out.println(answer);

//        System.out.println(solution(arr));
    }
}
