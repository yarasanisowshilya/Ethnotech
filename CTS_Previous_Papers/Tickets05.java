package CTS_Previous_Papers;

import java.util.Scanner;

public class Tickets05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of ticket:");
        int tickets = sc.nextInt();

        if (tickets < 5 || tickets > 40) {
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
            return;
        }

        System.out.print("Do you want refreshment:");
        char refreshment = sc.next().charAt(0);

        System.out.print("Do you have coupon code:");
        char coupon = sc.next().charAt(0);

        System.out.print("Enter the circle:");
        char circle = sc.next().charAt(0);

        double ticketCost;

        if (circle == 'k') {
            ticketCost = 75;
        } else if (circle == 'q') {
            ticketCost = 150;
        } else {
            System.out.println("Invalid Input");
            return;
        }

        double total = tickets * ticketCost;

        if (refreshment == 'y') {
            total += tickets * 50;
        }

        if (tickets > 20) {
            total = total - (total * 0.10);
        }

        if (coupon == 'y') {
            total = total - (total * 0.02);
        }

        System.out.printf("Ticket cost: %.2f", total);

    }
}
