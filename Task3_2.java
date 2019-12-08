public class Task3_2 {
    public static void main(String args[]) {
        System.out.println("Пример3");
        ListNode myList = new ListNode();
        myList.addFirst(15);
        myList.printList();
        myList.addLast(3);
        myList.printList();
        myList.addFirst(8);
        myList.printList();
        myList.addLast(1);
        myList.printList();
        myList.sortList(true);
        myList.printList();
        myList.addBetween(12,2);
        myList.printList();
        myList.sortList(false);
        myList.printList();
        myList.deleteNode(3);
        myList.printList();
        myList.deleteLast();
        myList.printList();
        myList.deleteFirst();
        myList.printList();
    }

}
