package CTS_Previous_Papers;

import java.util.Scanner;

public class Fuel_Consumption01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank:");
        double litres=sc.nextInt();
        System.out.println("Enter the distance covered:");
        double distance=sc.nextInt();
        if (litres <= 0 || distance <= 0) {
            System.out.println("Invalid Input");
            return;
        }
        double consmued=(litres/distance)*100;
        System.out.printf("Liters/100KM %.2f" , consmued);
        double miles=distance*0.6214;
        double gallons=litres*0.2642;
        double Miles_gallons=miles/gallons;
        System.out.println();
        System.out.printf("Miles/gallons %.2f" , Miles_gallons);
    }
}
