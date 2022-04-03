import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeNode<E> {
    E data;
    ArrayList<E> children;

    TreeNode(E data){
        this.data = data;
        children=new ArrayList<E>();
    }

    public static void printTree(TreeNode root){
        if(root == null)
            return;
        System.out.print(root.data + "-> ");
        for(Object node : root.children){
            printTree((TreeNode) node);
        }
    }

    public static TreeNode createTree(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the root node value");
        String val = sc.next();
        TreeNode<String> root = new TreeNode<>(val);

        Queue<TreeNode> q = new LinkedList<>() ;
        q.offer(root);

        while( !q.isEmpty()){
            System.out.println("How many children does "+ q.peek().data +" node have ?");
            int no = sc.nextInt();
            for(int i=1; i<=no; i++){
                System.out.println("Enter the value of child number "+i);
                TreeNode<String> current = new TreeNode<>(sc.next());
                q.offer(current);
                q.peek().children.add(current);
            }
            q.poll();
        }

        System.out.println("Finished making the tree .........");
        return root;
    }
}