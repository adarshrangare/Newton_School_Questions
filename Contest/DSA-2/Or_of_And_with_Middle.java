class Or_of_And_with_Middle{
    class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }


 public static int orOfAnd(Node head) {

     Node current = head;
     Node mid = head;
     Node last = head;

     while(last.next!=null){

         mid = mid.next;
         last = last.next.next;
     }

  
        int result = 0;
        while(current !=null ){

            result = result | (mid.val & current.val);

            current = current.next;

        }


     return result;
 
}
}
