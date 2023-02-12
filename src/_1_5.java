import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//a#b!GE*T@S
public class _1_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] list = str.toCharArray();
        int min = 0;
        int max = list.length-1;
        while(min <= max){
            if(!checkminEnglish(list,min)){
                min++;
                continue;
            }
            if(!checkmaxEnglish(list,max)) {
                max--;
                continue;
            }
            char temp = list[min];
            list[min] = list[max];
            list[max] = temp;
            min++;
            max--;

        }
        System.out.println(list);
    }

    public static boolean checkminEnglish(char[] list, int min){
        return ((list[min]>=97 && list[min] <= 122) || (list[min]>=65 && list[min] <= 90));
    }

    public static boolean checkmaxEnglish(char[] list, int max){
        return ((list[max]>=97 && list[max] <= 122) || (list[max]>=65 && list[max] <= 90));
    }
}