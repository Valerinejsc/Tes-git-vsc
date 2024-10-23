public class Node {
    String data;
    Node next;
    Node prev; // Digunakan untuk DoublyLinkedList

    Node(String data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

