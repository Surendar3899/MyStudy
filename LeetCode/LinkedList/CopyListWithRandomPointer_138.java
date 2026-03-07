package LeetCode.LinkedList;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer_138 {

    public static void main(String[] args) {
        Node head = buildList();

        Node copiedHead = copyRandomList(head);

        System.out.println("List copied successfully!");

        while(copiedHead != null){
            System.out.println(copiedHead.val+"   "+((copiedHead.random)!=null?copiedHead.random.val:-1));
            copiedHead = copiedHead.next;
            
        }
    }

    public static Node copyRandomList(Node head) {
        if (head == null) return null;

        Map<Node, Node> map = new HashMap<>();

        // 1️⃣ Create copy nodes
        Node curr = head;
        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        // 2️⃣ Assign next and random pointers
        curr = head;
        while (curr != null) {
            Node copy = map.get(curr);
            copy.next = map.get(curr.next);      // null if curr.next is null
            copy.random = map.get(curr.random);  // null if curr.random is null
            curr = curr.next;
        }

        // 3️⃣ Return copied head
        return map.get(head);
    }

     public static Node buildList() {

        // Create nodes
        Node node1 = new Node(7);
        Node node2 = new Node(13);
        Node node3 = new Node(11);
        Node node4 = new Node(10);
        Node node5 = new Node(1);

        // Connect next pointers
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // Connect random pointers
        node1.random = null;
        node2.random = node1;
        node3.random = node5;
        node4.random = node3;
        node5.random = node1;

        return node1; // head
    }

}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
