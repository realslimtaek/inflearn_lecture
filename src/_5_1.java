import java.util.*;
import java.io.*;

public class _5_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();


        System.out.println(solution(str));
    }

    public static String solution(String str){
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if (x == '(')stack.push(x);
            if (x == ')') {
                if(stack.isEmpty())
                    return "NO";
                stack.pop();
            }
        }

        return "YES";
    }
}
