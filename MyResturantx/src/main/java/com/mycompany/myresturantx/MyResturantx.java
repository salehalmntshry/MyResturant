/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.myresturantx;

import java.util.ArrayList;
import java.util.Scanner;

public class MyResturantx {

    public static void main(String[] args) {

        orders invoices = new orders(); // create an orders object to store all the invoices

        final Scanner input = new Scanner(System.in); // create a Scanner object to read input from the user
        int invoiceNumb = 0; // initialize an integer to store the invoice number
        Helper helper = new Helper();
        boolean close = false;
        // create several food objects and add them to the Helper's food array list
        food f1 = new food();
        f1.setName("chicken");
        f1.setPrice(27);
        f1.setCalories(239);
        helper.saveFood(f1);

        food f2 = new food();
        f2.setName("Meat   ");
        f2.setPrice(38);
        f2.setCalories(143);
        helper.saveFood(f2);

        food f3 = new food();
        f3.setName("egg    ");
        f3.setPrice(14);
        f3.setCalories(63);
        helper.saveFood(f3);

        food f4 = new food();
        f4.setName("fruits ");
        f4.setPrice(50);
        f4.setCalories(210);
        helper.saveFood(f4);

        // create several beverages objects and add them to the Helper's beverages array list
        beverages b1 = new beverages();
        b1.setName("Pepsi  ");
        b1.setPrice(5);
        b1.setCalories(210);
        helper.saveBeverage(b1);

        beverages b2 = new beverages();
        b2.setName("cola   ");
        b2.setPrice(5);
        b2.setCalories(100);
        helper.saveBeverage(b2);

        beverages b3 = new beverages();
        b3.setName("orange ");
        b3.setPrice(8);
        b3.setCalories(45);
        helper.saveBeverage(b3);

        beverages b4 = new beverages();
        b4.setName("water  ");
        b4.setPrice(3);
        helper.saveBeverage(b4);

        ArrayList<food> foods =  helper.getFoods();
        ArrayList<beverages> beverages = helper.getBeverages();
        
        while (true) {
            order order = new order();
            while (true) {
                System.out.println("Enter one to buy food or two to buy beverage or 0 to end order or 9 to close: ");
                int option = input.nextInt(); // read the user's choice of food or beverage
                
                if (option == 0) { // if the user chooses 0, exit the inner loop
                    invoices.addInvoice(invoiceNumb, order);
                    break;
                } else if (option == 9) { // if the user chooses 1, show the food menu and ask for the quantity of the food
                    close = true;
                    break;
                } else if (option == 1) { // if the user chooses 1, show the food menu and ask for the quantity of the food
                    
                    int i = 1;
                    for (food food : foods) {
                        System.out.println(i + "-" + food.getName() + "       " + food.getPrice() + "     " + food.getCalories());
                        i++;
                    }

                    System.out.println("Select an option from the above menu :");
                    int foodNumber = input.nextInt();
                    int index = foodNumber - 1;
                    food selectedFood = helper.foods.get(index);

                    System.out.println("Enter How much you want:");
                    int quantity = input.nextInt();
                    baskate baskate = new baskate();
                    baskate.setName(selectedFood.getName());
                    baskate.setCalories(selectedFood.getCalories());
                    baskate.setPrice(selectedFood.getPrice());
                    baskate.setQuantity(quantity);
                    baskate.setTotalPrice(quantity*selectedFood.getPrice());
                    baskate.setFood(true);
                    order.addBaskates(baskate);

                } else if (option == 2) {// if the user chooses 2, show the beverages menu and ask for the quantity of the fbeverage
                    int i = 1;
                    for (beverages beverage : beverages) {
                        System.out.println(i + "-" + beverage.getName() + "       " + beverage.getPrice() + "     " + beverage.getCalories());
                        i++;
                    }
                    System.out.println("Select an option from the above menu :");
                    int beveragesNumper = input.nextInt();
                    int index = beveragesNumper - 1;
                    beverages selectedBeverage = helper.beverages.get(index);
                    System.out.println("Enter How much you want:");
                    int quantity = input.nextInt();
                    baskate baskate = new baskate();
                    baskate.setName(selectedBeverage.getName());
                    baskate.setCalories(selectedBeverage.getCalories());
                    baskate.setPrice(selectedBeverage.getPrice());
                    baskate.setQuantity(quantity);
                    baskate.setTotalPrice(quantity*selectedBeverage.getPrice());
                    baskate.setBeverages(true);
                    order.addBaskates(baskate);

                } else {
                    System.out.println("Error");
                }
            }
            if(close){
                break;
            }
            invoiceNumb++;
            while (true) {
                System.out.println("Do you want to print the bill? (y/n)");
                String choice = input.next();
                if (choice.equals("y")) {
                    invoices.printAllInvoice();
                    while (true) {
                        System.out.println("Enter Number Of Bill You want to print?");
                        int invoiceNumber = input.nextInt();
                        if (invoices.cheakBill(invoiceNumber)) {
                            invoices.printInvoice(invoiceNumber);
                            break;
                        } else {
                            System.out.println("Wrong Number");
                        }
                    }

                    break;
                } else if (choice.equals("n")) {
                    break;
                } else {
                    System.out.println("Error");
                }
            }

        }
    }
}
