import java.util.*;
public class _2_1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int int_1 = sc.nextInt();
        int[] list = new int[int_1+1];
        list[0] = 0;
        for(int i = 1; i <= int_1; i++){
            list[i] = sc.nextInt();
        }
        System.out.println(Solution(list));
    }

    public static String Solution(int[] list){
        String answer = "";

        for(int i = 1; i < list.length ; i++){
            if(list[i-1] < list[i]){
                answer += list[i] + " ";
            }
        }



        return answer;
    }
}
