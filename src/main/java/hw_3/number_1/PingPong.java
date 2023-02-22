package hw_3.number_1;

public class PingPong {
    private final Object sound = new Object();
    private volatile char currentLetter = 'A';

    public static void main(String[] args) {
        PingPong waitNotifyObj = new PingPong();
        Thread thread1 = new Thread(() -> {
            waitNotifyObj.printPing();
        });
        Thread thread2 = new Thread(() -> {
            waitNotifyObj.printPong();
        });
        thread1.start();
        thread2.start();
    }

    public void printPing() {
        synchronized (sound) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'A') {
                        sound.wait();
                    }
                    System.out.println("Ping");
                    currentLetter = 'B';
                    sound.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printPong() {
        synchronized (sound) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'B') {
                        sound.wait();
                    }
                    System.out.println("Pong");
                    currentLetter = 'A';
                    sound.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}