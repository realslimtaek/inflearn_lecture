import java.util.*;
public class _5_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(solution(str));
    }

    public static int solution(String str){

        Stack<Integer> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            if(Character.isDigit(ch)) {
                stack.push(Integer.parseInt(String.valueOf(ch)));
                continue;
            }
            int n1 = stack.pop();
            int n2 = stack.pop();
            if(ch == '+'){
                stack.push(n2 + n1);
                continue;
            }
            if(ch == '-'){
                stack.push(n2 - n1);
                continue;
            }
            if(ch == '*'){
                stack.push(n2 * n1);
                continue;
            }
            if(ch == '/'){
                stack.push(n2 / n1);
            }
        }
        return stack.get(0);
    }
}

/*
352+*9-



12
 */