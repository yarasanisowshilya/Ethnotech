package Collection.Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Spotify {
    public static void main(String[] args) {
        Queue<String>q =new LinkedList<>();
        q.offer("ABC");
        q.offer("DEF");
        q.offer("GHI");
        q.offer("JKL");
        q.offer("MNO");
        q.offer("PQR");
        q.offer("STU");
        q.offer("VWX");
        q.offer("XYZ");
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Add");
        System.out.println("2.Delete");
        System.out.println("3.Display");
        System.out.println("4.Exit");
        while(true) {
            int option=sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter songs do you want to add:");
                    String newSong = sc.next();
                    q.offer(newSong);
                    break;
                case 2:
                    if (q.isEmpty()) {
                        System.out.println("NO Songs");
                    } else {
                        System.out.println(q.poll());
                    }
                    break;
                case 3:
                    if (q.isEmpty()) {
                        System.out.println("NO songs");
                    } else
                    {
                        System.out.println(q.peek());
            }
                    break;
                case 4:System.exit(0);
                
            }
        }


    }
}
