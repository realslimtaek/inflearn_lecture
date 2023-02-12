import java.util.*;


public class _1_12 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int str = sc.nextInt();
        String str2 = sc.next();

        System.out.print(solution(str, str2));


    }

    public static String solution(int str, String str2){

        String answer = "";
        int[] list = new int[str];
        str2 = str2.replace("#","1")
                .replace("*","0");

        for(int i = 0; i < str; i++){
            list[i] = (Integer.parseInt(str2.substring(i*7,(i+1)*7),2));
            answer += Character.toString((char) list[i]);
        }


        return answer;
    }
}

/*
4
#****###**#####**#####**##**
 */