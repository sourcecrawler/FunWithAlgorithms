package linkedlist;

public class DeleteNode {

    public static void main(String...args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.print();
        list.delete(5);
        list.print();
    }
}
