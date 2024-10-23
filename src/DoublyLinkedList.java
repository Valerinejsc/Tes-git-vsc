public class DoublyLinkedList {
    private Node head;

    public DoublyLinkedList() {
        this.head = null;
    }

    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void insert(String data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < position - 1 && current != null; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void delete(String data) {
        if (head == null) return;
        if (head.data.equals(data)) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }
        Node current = head;
        while (current != null && !current.data.equals(data)) {
            current = current.next;
        }
        if (current != null) {
            if (current.next != null) {
                current.next.prev = current.prev;
            }
            if (current.prev != null) {
                current.prev.next = current.next;
            }
        }
    }

    public Node search(String data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
