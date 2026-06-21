package LearningThreads.MyThreads.Threads.Basics;

class Message
{
    boolean isMessage=false;
    public synchronized void receiver() throws InterruptedException {
        System.out.println("Waiting for Message");
        wait();
        System.out.println("Message Recieved");
    }
    public synchronized void sender()  {
        isMessage=true;
        notify();
        System.out.println("Message sent");
    }
}
public class IPC {
    public static void main(String[] args) throws InterruptedException {
Message m=new Message();
Thread t1=new Thread(()->{
    try {
        m.receiver();
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
});
        Thread t2=new Thread(()->{
            try {
                Thread.sleep(2000);//Here when their is no sleep ,
                // it will execute any of the thread at first so,
                // that it will varies at many times so,you sleep the thread2
                // and it wille xute t1 first and then t2
                m.sender();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
