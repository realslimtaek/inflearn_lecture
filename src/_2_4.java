import java.util.*;
import java.io.*;

public class _2_4 {

    public static void main(String[] args) throws Exception{

    Scanner sc = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int num = Integer.parseInt(br.readLine());

    System.out.println(solution(num));
    }

    public static String solution(int num){
        int[] list = new int[num+1];
        String answer = "1 1 ";
        list[0] = 1; list [1] = 1;
        for(int i = 2; i < num; i++){
            list[i] = list[i-1] + list[i-2];
            answer += list[i] + " ";
        }
        return answer;
    }

}
