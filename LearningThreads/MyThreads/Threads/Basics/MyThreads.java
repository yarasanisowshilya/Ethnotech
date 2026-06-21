package LearningThreads.MyThreads.Threads.Basics;

public class MyThreads extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(2000);
                System.out.println("Mythreads" + i);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
