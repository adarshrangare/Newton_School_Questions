class InsertionInCircularLinkedList{
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}


public static Node Insertion(Node head, int K){
//Enter your code here 

        Node newNode = new Node(K);

        if(head== null){
            head = newNode;
            newNode.next = head;
            return head;
        }

        Node tail = head;

        while(tail.next != head){

            tail = tail.next;
        }

        tail.next = newNode;
        newNode.next = head;


        // System.out.println(newNode.val +" "+newNode.next.val);

        return head;

}
}
