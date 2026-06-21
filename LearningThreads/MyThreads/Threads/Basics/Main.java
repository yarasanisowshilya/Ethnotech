package LearningThreads.MyThreads.Threads.Basics;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Creation of threads ");
       System.out.println(Thread.currentThread().getName());

        MyThreads t = new MyThreads();
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
        for (int i = 1; i <=3; i++) {
            t.join();
            System.out.println(i + "iam in main");

        }
    }
}
