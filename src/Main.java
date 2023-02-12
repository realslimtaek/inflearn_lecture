import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        String[] list = new String[a];

        for(int i = 0; i<a; i++){
            StringBuilder tmp = new StringBuilder(br.readLine());
            tmp.reverse();
            list[i] = tmp.toString();
            System.out.println(list[i]);
        }
    }
}