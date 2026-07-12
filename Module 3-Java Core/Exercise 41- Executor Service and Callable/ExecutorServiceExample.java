import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Future<Integer>> results = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {

            int number = i;

            Callable<Integer> task = () -> number * number;

            Future<Integer> future = executor.submit(task);

            results.add(future);
        }

        for (Future<Integer> result : results) {

            try {
                System.out.println(result.get());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        executor.shutdown();
    }
}