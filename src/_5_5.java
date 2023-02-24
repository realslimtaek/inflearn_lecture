import java.util.*;
public class _5_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(solution(str));
    }

    public static int solution(String str){

        int cnt = 0;
        Stack<Character> stack = new Stack<>();
        char[] arr = str.toCharArray();

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == ')'){
                if (arr[i-1] == '(') {
                    stack.pop();
                    cnt += stack.size();
                    continue;
                }
                stack.pop();
                cnt++;
                continue;
            }
            stack.push(arr[i]);
        }
        return cnt;
    }
}
