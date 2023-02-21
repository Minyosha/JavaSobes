package hw_2.number_2;

import java.util.Arrays;

public class CustomLinkedArray {

    private Object[] myStore;
    private int actSize = 0;

    public CustomLinkedArray() {
        myStore = new Object[10];
    }

    public Object get(int index) {
        if (index < actSize) {
            return myStore[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void add(Object obj) {
        if (myStore.length - actSize <= 5) {
            increaseListSize();
        }
        myStore[actSize++] = obj;
    }

    public Object remove(int index) {
        if (index < actSize) {
            System.out.print("Удаление элемента с индексом " + index + ". ");
            Object obj = myStore[index];
            myStore[index] = null;
            int tmp = index;
            while (tmp < actSize) {
                myStore[tmp] = myStore[tmp + 1];
                myStore[tmp + 1] = null;
                tmp++;
            }
            actSize--;
            return obj;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }

    }

    public int size() {
        return actSize;
    }

    private void increaseListSize() {
        myStore = Arrays.copyOf(myStore, myStore.length * 2);
        System.out.println("\nНовая длина массива: " + myStore.length);
    }


}
