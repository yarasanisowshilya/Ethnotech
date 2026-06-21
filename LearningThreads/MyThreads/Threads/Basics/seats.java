package LearningThreads.MyThreads.Threads.Basics;

class s
{
    int seat=1;

    public void decremnet(String name) {
        synchronized (this)
        {
            if(seat>0)
            {
                System.out.println(name +" "+ "booked" + " "+ "seat");
                seat--;
            }
            else {
                System.out.println("no seats left");
            }
        }
    }
}

public class seats  {
    public static void main(String[] args) throws InterruptedException {


        s r = new s();
        Thread t1 = new Thread(()-> {
            r.decremnet("sowshilya");
        }
        );
        Thread t2=new Thread(()-> {
          r.decremnet("sows");
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(r.seat);
    }
}
