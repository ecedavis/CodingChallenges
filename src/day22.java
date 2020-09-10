//https://www.hackerrank.com/challenges/30-binary-search-trees/problem
public static int getHeight(Node root){
      //Write your code here
        if (root==null){
            return 0;
        }
        else{
            return Solution.heightHelper(root)-1;
        }
    }
    public static int heightHelper(Node root){
        if (root==null){
            return 0;
        }
        else{
            return 1 + java.lang.Math.max(heightHelper(root.left),heightHelper(root.right));
        }
    }

