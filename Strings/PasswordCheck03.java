package Strings;

import java.util.Scanner;

public class PasswordCheck03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Password:");

        String password = sc.nextLine();

        System.out.println(CheckPassword(password));
    }

       public static int  CheckPassword(String password) {

           String regex =
                   "^(?![0-9])" +     // should not start with digit
                           "(?=.*[A-Z])" +    // at least one capital letter
                           "(?=.*[0-9])" +    // at least one digit
                           "[^ /]{4,}$";      // no space or slash, min 4 chars

           if (password.matches(regex)) {
               return 1;
           } else {
               return 0;
           }
       }
    }
