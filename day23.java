//https://www.hackerrank.com/challenges/30-binary-trees/problem
static void levelOrder(Node at){
    //Write your code here
    Queue<Node> q = new LinkedList();
    while(at != null ){
        System.out.print(at.data + " ");
        if (at.left !=null){
            q.add(at.left);
        }
        if (at.right !=null){
            q.add(at.right);
        }
        at=q.remove();
    }
}
