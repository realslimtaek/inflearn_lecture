import java.util.*;
import java.io.*;

public class _5_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();


        System.out.println(solution(str));
    }

    public static String solution(String str){
        int cnt = 0;
        for (char c : str.toCharArray()) {
            if (cnt < 0) return "NO";
            if (Objects.equals(Character.toString(c), ")")) {
                cnt--;
                continue;
            }
            cnt++;
        }
        return "YES";

    }
}
