public class LinkedListBalance{  
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
} 

public static boolean findDifference(Node head) {
// write your code here

        int size =0;
        Node current = head;
        long sum = 0;
        while(current!=null){
            size++;
            sum+= current.data;
            current= current.next;
            //  System.out.println(size);
        }

        // System.out.println("size: "+size);
        // System.out.println("sum: "+sum);
        return sum%size==0;
            
}

}
