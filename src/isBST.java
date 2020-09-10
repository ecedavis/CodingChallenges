/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    boolean checkBST(Node root) {
        if (root == null){
            return true;
        }
        return bstHelper(root, Integer.MIN_VALUE,Integer.MAX_VALUE, true);
    }

    boolean bstHelper(Node root, int min, int max, boolean isLeft){
        boolean leftTrue = true;
        boolean rightTrue = true;
        if (root == null){
            return true;
        }
       if (root.data<=min || root.data>=max){
           //System.out.println("" + root.left.data + ">=" + root.data );
           return false;
       }
       
       return bstHelper(root.left, min, root.data, true) 
           && bstHelper(root.right, root.data, max, false);
   }

