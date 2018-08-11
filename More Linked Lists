//https://www.hackerrank.com/challenges/30-linked-list-deletion/problem
    public static Node removeDuplicates(Node head) {
        //Write your code here
        Node at=head;
        while (at!=null){
            if (at.next != null){Solution.removeHelper(at);}
            else {return head;}
            at = at.next;
        }
        return head;
    }
   
    public static void removeHelper(Node head){
        Node at = head;
        while (at.next!=null){
            if (head.data == at.next.data){
                at.next = at.next.next;
            }
            else{
               at = at.next;
            }
        }
    }
