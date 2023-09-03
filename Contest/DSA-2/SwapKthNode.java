/*
// Information about the class Node
class Node
{
    int data;
    Node next;
    
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
// Should swap Kth node from beginning and Kth
// node from end in list and return new head.

// Note: it is method only.Try only on assignment editor https://my.newtonschool.co/playground/code/xslm3qz6x841
static Node swapkthnode(Node head, int num, int K)
{
       // Your code here
       if (head == null || K < 1 || K > num) {
        // Invalid input, return the original head
        return head;
    }

    // Initialize pointers for the Kth node from start and end
    Node kthNodeFromStart = head;
    Node kthNodeFromEnd = head;
    Node prevKthNodeFromStart = null;
    Node prevKthNodeFromEnd = null;

    // Traverse the list to find Kth node from start
    for (int i = 1; i < K; i++) {
        prevKthNodeFromStart = kthNodeFromStart;
        kthNodeFromStart = kthNodeFromStart.next;
    }

    // Traverse the list to find Kth node from end
    for (int i = 1; i < num - K + 1; i++) {
        prevKthNodeFromEnd = kthNodeFromEnd;
        kthNodeFromEnd = kthNodeFromEnd.next;
    }

    // Swap the data of Kth nodes
    if (prevKthNodeFromStart != null) {
        prevKthNodeFromStart.next = kthNodeFromEnd;
    } else {
        head = kthNodeFromEnd;
    }

    if (prevKthNodeFromEnd != null) {
        prevKthNodeFromEnd.next = kthNodeFromStart;
    } else {
        head = kthNodeFromStart;
    }

    Node temp = kthNodeFromStart.next;
    kthNodeFromStart.next = kthNodeFromEnd.next;
    kthNodeFromEnd.next = temp;

    return head;
}
