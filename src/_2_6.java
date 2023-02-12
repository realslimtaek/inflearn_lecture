import java.util.*;
import java.io.*;
public class _2_6 {

    public static void main(String[] args) throws Exception{

        //asdf
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

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
        boolean isPrime = true;

        for(String i : list){
            StringBuilder sb = new StringBuilder(i);

            int asdf = Integer.parseInt(sb.reverse().toString());

            if(asdf < 2 ) continue;

            for(int j = 2; j<asdf; j++){
                if(asdf % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                answer += asdf + " ";
            }
            isPrime = true;

        }
        return answer;
    }
}
