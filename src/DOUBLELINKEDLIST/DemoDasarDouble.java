package DOUBLELINKEDLIST;
class Node{
    int data;//untuk simpan data
    Node next;//untuk link ke node setelahnya
    Node prev;//untuk link ke node sebelumnya

    public Node(int data) {
        this.data = data;
    }
    
}
public class DemoDasarDouble {
    public static void main(String[] args) {
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        Node node3 = new Node(40);
        Node current;
        
        current = node1;
        
        node1.next = node2;
        node2.prev = node1;
        node2.next = node3;
        node3.prev = node2;
        
        current = current.next;
        
        System.out.println(current.data);
    }
}
