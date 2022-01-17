package tasks;


public class SymmetricTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int num) {
            data = num;
            left = right = null;
        }
    }

    static boolean utility(Node root1, Node root2) {
        /* base case : if both trees are empty then
        they are mirror images of each other */
        if (root1 == null && root2 == null)
            return true;

        /* for trees rooted at root1 and root2 to be mirror images,
        following conditions must be satisfied */
        if (root1 != null && root2 != null)
            /* Their root node's data must be same
            if this is not the case then immediately
            return false */
            return root1.data == root2.data &&

                    /*left subtree of left tree and right
                    subtree of right tree have to be mirror images*/
                    utility(root1.left, root2.right) &&

                        /*right subtree of left tree and left subtree
                        of right tree have to be mirror images*/
                    utility(root1.right, root2.left);


        /* This condition is reached when :
        if only either of root1 or root2 is empty */

        return false;
    }

    static boolean isSymmetric(Node root) {
        // apply utility function to check if tree is mirror of itself
        return utility(root, root);
    }

    public static void printResult() {
        /* construct the binary tree*/
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);
        root.right.right = new Node(3);

        if(isSymmetric(root))
            System.out.println("Symmetric Tree");
        else System.out.println("Not Symmetric");
    }
}
