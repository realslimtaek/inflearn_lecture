import java.util.*;
import java.io.*;
public class _5_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String str = sc.next();

        System.out.println(solution(str));
    }

    public static String solution(String str){
        StringBuilder ans = new StringBuilder();
        char[] arr = str.toCharArray();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int[] intlist = new int[str.length()];

        for(int i = 0; i<arr.length; i++){
            if(Objects.equals(Character.toString(arr[i]), "(")){
                list1.add(i);
                continue;
            }
            if(Objects.equals(Character.toString(arr[i]), ")")){
                list2.add(i);
            }

            if(list1.size() != 0 &&list1.size() == list2.size()){
                for(int j = list1.get(0); j<=i; j++){
                    intlist[j] = 1;
                }
                list1.clear();
                list2.clear();
            }
        }

        for(int i = 0; i<arr.length; i++){
            if(intlist[i] == 0)
                ans.append(arr[i]);
        }
        return ans.toString();
    }
}
