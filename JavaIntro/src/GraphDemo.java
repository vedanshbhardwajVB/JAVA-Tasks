import java.util.ArrayList;
import java.util.Scanner;

public class GraphDemo {

    public static ArrayList<ArrayList<Integer>> createGraph() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices in the graph");
        int v = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<v; i++)
            adj.add(new ArrayList<>());

        System.out.println("Enter the number of edges in the graph");
        int e = sc.nextInt();


        System.out.println("Now enter source and destination nodes for these "+e+" edges.....");
        for(int i=1; i<=e; i++){
            System.out.println("Edge number "+ i);
            System.out.println("Enter source vertex value -> source value separated by a space in one line...");
            int source = sc.nextInt();
            int destination = sc.nextInt();
            adj.get(source).add(destination);
            adj.get(destination).add(source);
        }
        return adj;
    }

    public static void printGraph(ArrayList<ArrayList<Integer>> adj) {
        for(int i=0; i< adj.size(); i++){
            System.out.print("Node "+i+" -> ");
            for(int value : adj.get(i)){
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }

    public static TreeNode convertToTree(ArrayList<ArrayList<Integer>> adj, int source){
        TreeNode<Integer> root = new TreeNode<>(source);
        ArrayList<Integer> vis = new ArrayList<>();
        vis.add(source);
        converter(root, adj.get(source), vis, adj);
        return root;
    }

    private static void converter(TreeNode curr, ArrayList<Integer> connections, ArrayList<Integer> vis, ArrayList<ArrayList<Integer>> adj){
        for(int i: connections){
            if(! vis.contains(i)){
                TreeNode<Integer> child = new TreeNode<>(i);
                curr.children.add(child);
                vis.add(child.data);
                converter(child, adj.get(i), vis, adj);
                vis.remove(vis.size()-1);
            }
        }
    }
}
