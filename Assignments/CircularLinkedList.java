// https://my.newtonschool.co/playground/code/azv6c01b0sf0


class CircularLinkedList{
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}


public static Node MakeCircular(Node head) {
//enter your code here

    Node last = head;

    while(last.next !=null){

        last = last.next;

    }

    last.next = head;

    return head;


}
}
