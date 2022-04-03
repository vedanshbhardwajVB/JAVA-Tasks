import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" 0 : Tree \n 1 : Graph ");
        ArrayList<ArrayList<Integer>> adj;
        TreeNode root = null;
        int choice = sc.nextInt();
        if(choice == 0){
            root = TreeNode.createTree();
            TreeNode.printTree(root);
        }

        else if (choice == 1){
            adj = GraphDemo.createGraph();
            GraphDemo.printGraph(adj);
            System.out.println("Convert it to a TREE ? \n Y for YES \n N for NO");
            if (sc.next().charAt(0) == 'Y'){
                System.out.println("What must be the root of Tree out of these vertices ?");
                int source = sc.nextInt();
                root = GraphDemo.convertToTree(adj, source);
                TreeNode.printTree(root);
            }

        }

    }

}
