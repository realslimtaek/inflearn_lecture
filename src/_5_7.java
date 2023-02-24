import java.util.*;
public class _5_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();


        System.out.println(solution(str1,str2));
    }

    public static String solution(String str1, String str2){

        Queue<Character> queue = new LinkedList<>();

        for(char ch : str2.toCharArray()){
            queue.offer(ch);
        }

        for(char ch1 : str1.toCharArray()) {
            while(!queue.isEmpty()&&!(queue.peek() == ch1)) {
                queue.poll();
            }
            if(queue.isEmpty()) return "NO";
            queue.poll();
        }

        return "YES";

    }


}
/*
CBA
CGEADB
 */