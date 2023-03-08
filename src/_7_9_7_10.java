import java.util.*;

class Node3{
    int data;
    Node3 lt, rt;

    Node3(int val){
        this.data =val;
        lt=rt=null;
    }
}

public class _7_9_7_10 {
    Node3 root;

    public static void main(String[] args) {

        _7_9_7_10 tree = new _7_9_7_10();
        tree.root = new Node3(1);
        tree.root.lt = new Node3(2);
        tree.root.rt = new Node3(3);
        tree.root.lt.lt = new Node3(4);
        tree.root.lt.rt = new Node3(5);

        BFS(tree.root);
        System.out.println(DFS(0,tree.root));
    }
    public static void BFS(Node3 root){

        int level = 0;
        Queue<Node3> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int length = q.size();
            Node3 cur = q.poll();
            for(int i = 0; i<length; i++){
                if(cur.lt.lt != null && cur.lt.rt != null)
                    q.offer(cur.lt);
                else {
                    System.out.println(level + 1);
                    return;
                }
                if(cur.rt.lt != null && cur.rt.rt != null)
                    q.offer(cur.rt);
                else{
                    System.out.println(level+1);
                    return;
                }
            }
        }
    }

    public static int DFS(int level,Node3 root){
        if(root.lt == null && root.rt == null){
            return level;
        }
        return Math.min(DFS(level+1,root.lt),DFS(level+1,root.rt));
    }
}
