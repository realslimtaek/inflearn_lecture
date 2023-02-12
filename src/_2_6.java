import java.util.*;
import java.io.*;
public class _2_6 {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        String[] list = new String[num];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i<num; i++){
            list[i] = st.nextToken();
        }
        System.out.println(solution(list));
    }

    public static String solution(String[] list){
        String answer = "";

        for(String i : list){
            StringBuilder sb = new StringBuilder(i);

            int reverse = Integer.parseInt(sb.reverse().toString());

            if(isPrime(reverse)){
                answer += reverse + " ";
            }

        }
        return answer;
    }

    public static Boolean isPrime(int num){
        if(num < 2 ) return false;

        for(int j = 2; j<num; j++){
            if(num % j == 0) {
                return false;
            }
        }
        return true;
    }
}
