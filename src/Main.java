public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyList = new SinglyLinkedList();
        DoublyLinkedList doublyList = new DoublyLinkedList();
        CircularLinkedList circularList = new CircularLinkedList();

        //Singly Linked List
        System.out.println("LINKED LIST");
        System.out.println("Add Data :");
        singlyList.add("Ace");
        singlyList.add("King");
        singlyList.traverse();
        System.out.println("Size :" + singlyList.size());
        System.out.println("Search for 'King' : " + (singlyList.search("King") != null ? "Ada" : "Tidak Ada"));
        System.out.println("Search for 'Queen' : " + (singlyList.search("Queen") != null ? "Ada" : "Tidak Ada"));
        
        System.out.println("Insert Data 'Jack' pada urutan ke 2 : ");
        singlyList.insert("Jack", 1);
        singlyList.traverse(); 
        
        System.out.println("Delete Data 'King' : ");
        singlyList.delete("King");
        singlyList.traverse(); 
        System.out.println("Size : " + singlyList.size());
        System.out.println();

        //Doubly Linked List
        System.out.println("DOUBLY LINKED LIST");
        System.out.println("Add Data :");
        doublyList.add("Ace");
        doublyList.add("King");
        doublyList.traverse();
        System.out.println("Size :" + doublyList.size());
        System.out.println("Search for 'King' : " + (doublyList.search("King") != null ? "Ada" : "Tidak Ada"));
        System.out.println("Search for 'Queen' : " + (doublyList.search("Queen") != null ? "Ada" : "Tidak Ada"));
        
        System.out.println("Insert Data 'Jack' pada urutan ke 1 : ");
        doublyList.insert("Jack", 0);
        doublyList.traverse();

        System.out.println("Delete Data 'King' : ");
        doublyList.delete("King");
        doublyList.traverse();
        System.out.println();

        //Circular Linked List
        System.out.println("CIRCULAR LINKED LIST");
        System.out.println("Add Data :");
        circularList.add("Ace");
        circularList.add("King");
        circularList.traverse();
        System.out.println("Size : " + circularList.size());
        System.out.println("Search for 'King' : " + (circularList.search("King") != null ? "Ada" : "Tidak Ada"));
        System.out.println("Search for 'Queen' : " + (circularList.search("Queen") != null ? "Ada" : "Tidak Ada"));

        System.out.println("Insert Data 'Jack' pada urutan terakhir :");
        circularList.insert("Jack", circularList.size());
        circularList.traverse();

        System.out.println("Delete Data 'King' : ");
        circularList.delete("King");
        circularList.traverse();
    }
}
