import java.util.*;
public class _6_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Point> list = new ArrayList<>();

        for(int i = 0; i<n; i++){
            list.add(new Point(sc.nextInt(),sc.nextInt()));
        }
        Collections.sort(list);
        for(Point p : list){
            System.out.println(p.x + " "+ p.y);
        }
    }
}

class Point implements Comparable<Point>{
    public int x , y;
    Point(int n, int m){
        this.x = n;
        this.y = m;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }
}
