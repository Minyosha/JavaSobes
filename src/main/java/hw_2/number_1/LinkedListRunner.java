// Реализовать основные методы связанного списка

package hw_2.number_1;

public class LinkedListRunner {

    public static void main(String[] args) {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        list.addNodeToTail(1);
        list.addNodeToTail(2);
        list.addNodeToTail(3);
        list.addNodeToTail(4);
        list.addNodeToTail(5);
        list.print();
        System.out.println();

        list.deleteByIndex(1);
        list.print();
        System.out.println();

        list.addByIndex(22, 10);
        list.print();
    }

}
