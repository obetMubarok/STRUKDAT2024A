package DOUBLELINKEDLIST;
class DoubleLL{
    Node first;//menunjuk ke node paling depan
    Node last;//menunjuk ke node paling belakang
    
    public void insertFirst(int newData){
        Node newNode = new Node(newData);//buat node baru
        if(first == null){//jika linkedList masih kosong
            first = newNode;
            last = newNode;
        }else{//jika linkedList tidak kosong
            newNode.next = first;
            first.prev = newNode;
            first = newNode;
        }
    }
    public void insertLast(int newData){
        Node newNode = new Node(newData);
        if(first == null){
            first = newNode;
            last = newNode;
        }else{
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
        }
    }
    public void display(){
        Node current = first;
        while(current != null){
            System.out.print(current.data+" ");//tampil data
            current = current.next;//current pindah ke node setelahnya
        }
    }
    public void removeLast(){
        last = last.prev;//last pindah ke node sebelumnya
        last.next = null;
    }
    public void removeFirst(){
        first = first.next;
        first.prev = null;
    }
    public boolean find(int key){
        boolean result = false;
        Node current = first;
        while(current != null){
            if(current.data == key){
                result = true;
                break;
            }
            current = current.next;
        }
        return result;
    }
    public void insertAfter(int after, int newData){
        Node newNode = new Node(newData);
        Node current = first;
        while(current != null){
            if(current.data == after){
                newNode.next = current.next;
                current.next = newNode;
                newNode.prev = current;
                newNode.next.prev = newNode;
                break;
            }
            current = current.next;
        }
    }
    public void removeKey(int key){
        Node current = first;
        if(first.data == key){
            removeFirst();
        }else if(last.data == key){
            removeLast();
        }else{
        while(current != null){
            if(current.data == key){
                current.next.prev = current.prev;
                current.prev.next = current.next;
                break;
            }
            current = current.next;
        }
        }
    }
}
public class DoubleLinkedList {
    public static void main(String[] args) {
        DoubleLL ll = new DoubleLL();
        ll.insertLast(10);
        ll.insertLast(20);
        ll.insertLast(30);
        ll.insertLast(40);
        
        
        ll.removeKey(40);
        ll.display();
        //System.out.println(ll.first.data);
    }
}
