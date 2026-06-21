package CTS_Previous_Papers;

import java.util.Scanner;

public class Pizza02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of pizzas bought:");
        int pizzas = sc.nextInt();

        System.out.print("Enter the no of puffs bought:");
        int puffs = sc.nextInt();

        System.out.print("Enter the no of cool drinks bought:");
        int coolDrinks = sc.nextInt();

        int totalPrice = (pizzas * 100) + (puffs * 20) + (coolDrinks * 10);

        System.out.println("\nBill Details");
        System.out.println("No of pizzas:" + pizzas);
        System.out.println("No of puffs:" + puffs);
        System.out.println("No of cooldrinks:" + coolDrinks);
        System.out.println("Total price=" + totalPrice);
        System.out.println("ENJOY THE SHOW!!!");

        sc.close();
    }
}