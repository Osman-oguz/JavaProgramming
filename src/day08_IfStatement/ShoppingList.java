package day08_IfStatement;

import java.util.Scanner;

public class ShoppingList {

    public static void main(String[] args) {
        String item1, item2, item3, report;
        double price1, price2, price3, totalPrice;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter item1 and its price:");
        item1 = input.next();
        price1 = input.nextDouble();

        System.out.println("Enter item2 and its price:");
        item2 = input.next();
        price2 = input.nextDouble();

        System.out.println("Enter item3 and its price:");
        item3 = input.next();
        price3 = input.nextDouble();

        totalPrice = price1 + price2 + price3;

        report = "Item1: " + item1+ " Price: " + price1+ ", Item2: "+
                item2+ " Price: "+ price2+ ", Item3: " + item3 +
                " Price " + price3 + "\nTotal Price: " + totalPrice ;

        System.out.println(report);



    }
}
