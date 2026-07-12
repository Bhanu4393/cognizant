class MessageThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
        }
    }
}

public class ThreadCreation {
    public static void main(String[] args) {

        MessageThread thread1 = new MessageThread();
        MessageThread thread2 = new MessageThread();

        thread1.start();
        thread2.start();
    }
}