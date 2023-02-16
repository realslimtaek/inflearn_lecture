import java.util.*;
import java.io.*;
public class _3_1 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] list_1 = new int[n];
        for(int i = 0; i<n; i++){
            list_1[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] list_2 = new int[m];
        for(int i = 0; i < m; i++){
            list_2[i] = Integer.parseInt(st.nextToken());
        }

        for(int i : solution(list_1, list_2, n, m))
            System.out.print(i + " ");
//        System.out.println(solution(list_1, list_2, n, m));

    }

    public static ArrayList<Integer> solution(int[] list_1, int[] list_2, int n, int m){

        /*

        StringBuilder sb = new StringBuilder();

        int[] answer_list = new int[n+m];

        for(int i = 0; i<n; i++){
            answer_list[i] = list_1[i];
        }
        for(int i = 0; i<m; i++){
            answer_list[i+n] = list_2[i];
        }
            //배열 복사를 이런식으로도 할 수 있음.
//                        (복사할 배열, 시작할 인덱스, 붙여넣을 배열, 시작 인덱스, 총 몇개)
//        System.arraycopy(list_1,        0,     answer_list,   0,    n);
//        System.arraycopy(list_2, 0, answer_list, n, m);

        Arrays.sort(answer_list);

        for(int i = 0; i<n+m; i++){
            sb.append(answer_list[i]).append(" ");
        }
        return sb.toString();

        */


        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;

        while(p1 < n && p2 <m){
            if(list_1[p1]<list_2[p2]) {
                answer.add(list_1[p1++]);
                continue;
            }
            answer.add(list_2[p2++]);
        }
        while(p1 < n) answer.add(list_1[p1++]);
        while(p2 < m) answer.add(list_2[p2++]);

        return answer;
    }

}
