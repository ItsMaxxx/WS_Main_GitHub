package Parrallel_ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceBeispiel {
    public static void main(String[] args) {
        // Create an ExecutorService with a fixed-size thread pool
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Submit tasks for execution
        for (int i = 0; i < 10; i++) {
            final int taskId = i;
            executor.submit(new TaskBeispiel(taskId));
        }

        // Shutdown the ExecutorService when done
        executor.shutdown();
    }
}
