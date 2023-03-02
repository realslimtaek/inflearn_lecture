import java.util.*;
class Node{
    int data;
    Node lt, rt;
    public Node(int val){
        data = val;
        lt = rt = null;
    }
}

public class _7_5 {
    Node root;

    public static void main(String[] args) {
        _7_5 tree = new _7_5();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        recursive(tree.root);
    }
    public static void recursive(Node root){
        if(root == null) return;
        else{
            //전위
            //System.out.println(root.data);
            recursive(root.lt);
            //중위
            //System.out.println(root.data);
            recursive(root.rt);
            //후위
            //System.out.println(root.data);
        }
    }
}
