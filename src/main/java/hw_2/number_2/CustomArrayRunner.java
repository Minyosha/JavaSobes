// Реализовать основные методы ArrayList

package hw_2.number_2;


public class CustomArrayRunner {

    public static void main(String a[]) {
        CustomLinkedArray arr = new CustomLinkedArray();
        arr.add(new Integer(2));
        arr.add(new Integer(5));
        arr.add(new Integer(1));
        arr.add(new Integer(23));
        arr.add(new Integer(14));
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        arr.add(new Integer(29));
        System.out.println(arr.get(5));
        System.out.println("Размер: " + arr.size());
        System.out.println("Значение элемента: " + arr.remove(2));
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}