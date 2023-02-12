import java.util.*;
import java.io.*;
public class _2_2 {



    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] list = new int[num];

        for(int i = 0; i<num; i++){
            list[i] = sc.nextInt();
        }

        System.out.println(solution(list, num));
    }

    public static int solution(int[] list,int num){
        int temp = list[0];
        int count = 1;
        for(int i = 1; i<num; i++){
            if (temp < list[i]){
                count++;
                temp = list[i];
            }
        }
        return count;
    }
}

/*
8
130 135 148 140 145 150 150 153
 */
