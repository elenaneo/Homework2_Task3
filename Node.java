 public class Node {
        public int value;
        public Node next;
        public Node prev;

        public Node(int val){
            this.value = val;
        }

        // Вывод всех элементов

        public void printNode() {
            System.out.print(value + " ");
        }
    }

