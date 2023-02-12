import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        String[] list = new String[a];

        for(int i = 0; i<a; i++){
            String tmp = new StringBuilder(br.readLine()).reverse().toString();
//            tmp.reverse();
            list[i] = tmp.toString();
            System.out.println(list[i]);
        }
    }
}
