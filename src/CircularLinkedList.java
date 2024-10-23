public class CircularLinkedList {
    private Node head;

    public CircularLinkedList() {
        this.head = null;
    }

    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }

    public void insert(String data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            if (head == null) {
                head = newNode;
                newNode.next = head;
            } else {
                Node current = head;
                while (current.next != head) {
                    current = current.next;
                }
                newNode.next = head;
                current.next = newNode;
                head = newNode;
            }
        } else {
            Node current = head;
            for (int i = 0; i < position - 1 && current.next != head; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void delete(String data) {
        if (head == null) return;
        if (head.data.equals(data)) {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            if (head == head.next) {
                head = null;
            } else {
                current.next = head.next;
                head = head.next;
            }
            return;
        }
        Node current = head;
        while (current.next != head && !current.next.data.equals(data)) {
            current = current.next;
        }
        if (current.next != head) {
            current.next = current.next.next;
        }
    }

    public Node search(String data) {
        Node current = head;
        do {
            if (current.data.equals(data)) {
                return current;
            }
            current = current.next;
        } while (current != head);
        return null;
    }

    public void traverse() {
        if (head == null) return;
        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(back to head)");
    }

    public int size() {
        if (head == null) return 0;
        int count = 0;
        Node current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);
        return count;
    }
}
