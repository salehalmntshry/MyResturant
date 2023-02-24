/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myresturantx;

import java.util.ArrayList;

public class orders {

    // Create an ArrayList to store orders
    ArrayList<order> invoice = new ArrayList<order>();
    public int totalPrice = 0;
    public int totalCalories = 0;
    // Method to add a new order to the ArrayList
    public void addInvoice(int id, order order) {
        // Check if the specified ID is within the bounds of the ArrayList
            invoice.add(order);
            totalPrice += order.getTotalPrice();
            totalCalories += order.getTotalCalories();
    }

    // Method to print all orders in the ArrayList
    public void printAllInvoice() {
        System.out.println("-------------------");
        System.out.println("total For All Invoice: " + this.getFullPrice() + " SAR");
        System.out.println("total For All Invoice: " + this.getFullCalories() + " calories");
        System.out.println("**************");
        System.out.println("Printing All Invoice");
        // Loop through the ArrayList and print the details of each order
        for (int index = 0; index < invoice.size(); index++) {
            order value = invoice.get(index);
            System.out.println("Your bill number " + index);
            value.printOrder();
            System.out.println("total: " + value.getTotalPrice() + " SAR");
            System.out.println("total: " + value.getTotalCalories() + " calories");
            System.out.println("-----");
        }

    }

    // Method to print a specific order in the ArrayList
    public void printInvoice(int billId) {
        // Retrieve the order with the specified ID from the ArrayList and print its details
        order value = invoice.get(billId);
        System.out.println("Print Invoice");
        System.out.println("**************");
        System.out.println("Your bill number " + billId);
        value.printOrder();
        System.out.println("total: " + value.getTotalPrice() + " SAR");
        System.out.println("total: " + value.getTotalCalories() + " calories");
    }

    // Method to check if a specific order exists in the ArrayList
    public Boolean cheakBill(int billId) {
        if (billId >= invoice.size() || billId < 0) {
            // If the specified ID is not within the bounds of the ArrayList, return false
            return false;
        } else {
            // If the specified ID is within the bounds of the ArrayList, return true
            return true;
        }
    }

    // Method to calculate the total price of all orders in the ArrayList
    public int getFullPrice() {
        return this.totalPrice;
    }

    // Method to calculate the total number of calories in all orders in the ArrayList
    public int getFullCalories() {
        return this.totalCalories;
    }
}
