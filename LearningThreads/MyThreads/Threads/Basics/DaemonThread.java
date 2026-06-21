package LearningThreads.MyThreads.Threads.Basics;

public class DaemonThread extends Thread{
   public void run()
    {
        try
        {
            while(true)
            {
                Thread.sleep(1000);
                System.out.println("hello");
            }
        }
        catch (InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
     DaemonThread t=new DaemonThread();
        System.out.println("starting");
     t.setDaemon(true);
      t.start();
        System.out.println("end");
    }
}
