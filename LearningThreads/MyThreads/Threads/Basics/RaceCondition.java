package LearningThreads.MyThreads.Threads.Basics;

class Rc
{
    int count=0;
   public  synchronized void incremenet()
    {
//        System.out.println("strating");
//
//        synchronized (this)
//        {
//        count++;
//    }
//        System.out.println("end");
        count++;
}
}

public class RaceCondition extends Thread {
   public static void main(String[] args) throws InterruptedException {


        Rc r = new Rc();
        Thread t1 = new Thread(()->{
        for (int i = 1; i <= 1000; i++) {
            r.incremenet();
        }}
        );
        Thread t2=new Thread(()-> {
            for (int i = 1; i <= 1000; i++) {
                r.incremenet();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(r.count);
    }
}
