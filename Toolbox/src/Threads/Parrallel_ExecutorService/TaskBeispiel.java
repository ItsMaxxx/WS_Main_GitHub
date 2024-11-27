package Parrallel_ExecutorService;

public class TaskBeispiel implements Runnable {

    private final int taskID;

    public TaskBeispiel(int taskID){
        this.taskID = taskID;
    }

    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Task " + taskID + " output: " + i);
        }
    }

}
