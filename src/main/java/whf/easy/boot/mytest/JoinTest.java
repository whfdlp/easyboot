package whf.easy.boot.mytest;

public class JoinTest {
    public static void main(String[] args) throws InterruptedException {
        final Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("thread1 " + i);
            }
        },"1");
        final Thread thread2 = new Thread(() -> {
            try {
                thread1.join();
            } catch (InterruptedException e) {
            }
            for (int i = 0; i < 100; i++) {
                System.out.println("thread2 " + i);
            }
        },"2");
        final Thread thread3 = new Thread(() -> {
            try {
                thread2.join();
            } catch (InterruptedException e) {
            }
            for (int i = 0; i < 100; i++) {
                System.out.println("thread3 " + i);
            }
        },"3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
