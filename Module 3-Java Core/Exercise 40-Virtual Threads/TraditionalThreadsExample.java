public class TraditionalThreadsExample {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        for (int i = 1; i <= 1000; i++) {

            int threadNumber = i;

            new Thread(() -> {
                System.out.println("Thread " + threadNumber);
            }).start();
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Time Taken: " + (endTime - startTime) + " ms");
    }
}