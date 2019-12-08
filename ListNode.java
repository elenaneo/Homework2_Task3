public class ListNode {

    public Node first = null;
    public Node last = null;
    public Node tempForReplace = null;

    //метод определения если список пуст
    public boolean isEmptyList() {
        if (first == null)
        return true;
        else
        return false;
    }

   // метод добавления в начало списка
    public void addFirst(int value) {
        Node myNode = new Node(value);
        myNode.next = null;
        myNode.prev = null;

        if (isEmptyList()) {//если список пуст
            first = myNode;
            last = myNode;
        }
        else{
            first.prev = myNode;
            myNode.next = first;
            first = myNode;
        }
        System.out.println("Добавление значения " + value + " в начало списка");
    }
    //метод добавления в конец списка
    public void addLast(int value) {
        Node myNode = new Node(value);
        if (isEmptyList()) {
            first = myNode;
            last = myNode;
        }
        else {
            last.next = myNode;
            myNode.prev = last;
            last = myNode;
        }
        System.out.println("Добавление значения " + value + " в конец списка");
    }
    //метод добавления в середину списка
    public void addBetween(int value, int index) {
        Node myNode = new Node(value);
        Node tempNode = first;
        int len = 0;
        if (isEmptyList()) {
            first = tempNode;
            last = tempNode;
        }
        else{
            while (tempNode != null) {
                if (len == index-1) {
                    tempNode.next.prev = myNode;
                    myNode.next = tempNode.next.next.prev;
                    tempNode.next = myNode;
                    myNode.prev = tempNode;
                }
                tempNode = tempNode.next;
                len ++;
            }
        }
        System.out.println("Добавление значения " + value + " в позицию  " + index);
    }
// удаление поиции списка index
  public void deleteNode(int index) {
        Node tempNode = first;
        int len = 0, val=0;
        while (tempNode != null) {
            if (len == index-1) {
                tempNode.prev.next = tempNode.next;
                tempNode.next.prev = tempNode.prev;
                val=tempNode.value;
            }
            tempNode = tempNode.next;
           len ++;

        }
      System.out.println("Удалена позиция " + index+", значение "+val);
    }
    // удаление первой поиции списка index
    public void deleteFirst() {
        if (!isEmptyList()) {
            Node tempNode = first;
            if (first.next == null) {
                first = null;
                last = null;
            }
            else {
                first = first.next;
                first.prev = null;
            }
            System.out.println("Удален первый элемент списка");
        }
    }
    public void deleteLast() {
        Node tempNode = last;
        if (!isEmptyList()) {
            if (first.next == null) {
                first = null;
                last = null;
            }
            else {
                last = last.prev;
                last.next = null;
            }
            System.out.println("Удаление последнего элемента списка");
        }
    }

    // сортировка списка true - по возрастанию
    public void sortList(boolean sort) {
        Node tempNode = first;
        boolean still = false;
        int tempInt = 0;
        if (sort)
            System.out.println("Сортировка по возрастанию" );
        else
            System.out.println("Сортировка по убыванию" );
        do {
            if (tempNode.value < tempNode.next.value & !sort || tempNode.value > tempNode.next.value &sort) {
                //Сортировка по значению к мин.
                tempInt = tempNode.value;
                tempNode.value = tempNode.next.value;
                tempNode.next.value = tempInt;
                still = true;
            }
            if (still) {
                tempNode = first;
                still = false;
                tempInt = 0;
            }
            else {
                tempNode = tempNode.next;
                tempInt ++;
            }
        }
        while (tempNode != last);
    }

    public void printList() {
        Node tempNode = first;
        while (tempNode != null) {
            tempNode.printNode();
            tempNode = tempNode.next;
        }
        System.out.println();
    }
}

