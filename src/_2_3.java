import java.util.*;
public class _2_3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int game = sc.nextInt();

        String[][] _try = new String[2][game+1];

        for(int i = 0; i<2; i++){
            for(int j = 0; j<game; j++){
                _try[i][j] = sc.next();
            }
        }
        for(int i = 0; i<game; i++){
            System.out.println(solution(_try[0][i],_try[1][i],game));
        }
    }

    public static String solution(String A, String B, int game){
        String answer = "B";

        if((Objects.equals(A,"1")&&Objects.equals(B,"3")) ||(Objects.equals(A,"2")&&Objects.equals(B,"1")) || (Objects.equals(A,"3")&&Objects.equals(B,"2"))){
            answer = "A";
        }
        if(Objects.equals(A,B)){
            answer = "D";
        }

        return answer;
    }
}
