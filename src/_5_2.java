import java.util.*;
import java.io.*;
public class _5_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String str = sc.next();

        System.out.println(solution(str));
    }

    public static String solution(String str){
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(char ch : str.toCharArray()){

            if(ch == ')'){
                while(stack.pop() != '(');
                continue;
            }
            stack.push(ch);
        }
        for (char character : stack) {
            sb.append(character);
        }


        return sb.toString();
    }
}
