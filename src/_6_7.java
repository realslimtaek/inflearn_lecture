import java.util.*;
public class _6_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        for(int i = 0; i<n; i++){
            for(int j =0; j<2; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]!=o2[0] ? o1[0]-o2[0] : o1[1]-o2[1]; // 첫번째 기준 오름차순 > 두번째 기준 오름차순  : {1,30}{2,10}{3,50}{4,20}{5,40}{6,10}{6,20}{6,30}{6,40}{6,50}
                //return o1[0]!=o2[0] ? o1[0]-o2[0] : o2[1]-o1[1]; // 첫번째 기준 오름차순 > 두번째 기준 내림차순  : {1,30}{2,10}{3,50}{4,20}{5,40}{6,50}{6,40}{6,30}{6,20}{6,10}
            }
        });
        System.out.println(Arrays.deepToString(arr));
    }
}
