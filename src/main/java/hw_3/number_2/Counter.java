// Ðåàëèçîâàòü ïîòîêîáåçîïàñíûé ñ÷åò÷èê ñ ïîìîùüþ èíòåðôåéñà Lock.

package hw_3.number_2;

import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private static int count = 0;
    static ReentrantLock lock = new ReentrantLock();


    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
                perform();
        });
        Thread thread2 = new Thread(() -> {
                perform();
        });
        thread1.start();
        thread2.start();
    }

    public static void perform() {
        try {
            while (count < 15) {
                lock.lock();
                count = count + 1;
                System.out.println(count + " made by " + Thread.currentThread());
                lock.unlock();
                Thread.sleep(1000);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

}


