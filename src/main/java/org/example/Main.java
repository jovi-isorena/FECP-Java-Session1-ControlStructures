package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String membership;
        int age;
        float price;
        System.out.print("Enter membership status (Regular, VIP, Premium): ");
        membership = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        /* the price is $50 for users under 18,
        $100 for users aged 18 to 64,
        and $75 for users over 64.
        */
         if(membership.equalsIgnoreCase("regular")) {
             if (age > 64) {
                 price = 75.0f;
             } else if (age < 18) {
                 price = 50.0f;
             } else {
                 price = 100.0f;
             }
         }else if(membership.equalsIgnoreCase("vip")) {
            if (age > 64) {
                price = 112.5f;
            } else if (age < 18) {
                price = 75.0f;
            } else {
                price = 150.0f;
            }
        }else if(membership.equalsIgnoreCase("premium")) {
            if (age > 64) {
                price = 150.0f;
            } else if (age < 18) {
                price = 100.0f;
            } else {
                price = 200.0f;
            }
        }
        else {
            System.out.print("Invalid membership status entered.");
            return;
        }
        System.out.printf("Price: $%.2f", price);

    }
}