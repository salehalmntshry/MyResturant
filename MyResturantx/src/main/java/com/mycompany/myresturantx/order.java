/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myresturantx;

import java.util.ArrayList;

public class order {
// ArrayList to store the items in the order
ArrayList<baskate> baskates = new ArrayList<baskate>();

// Variables to store the total price and total calories of the order
public int totalPrice = 0;
public int totalCalories = 0;

// Method to add a baskate to the order
public void addBaskates(baskate baskates) {
    this.baskates.add(baskates);
    totalPrice += baskates.getTotalPrice();
    totalCalories += baskates.getCalories();
}

// Method to get the total calories of the order
public int getTotalCalories() {
    return totalCalories;
}

// Method to get the total price of the order
public int getTotalPrice() {
    return totalPrice;
}

// Method to set the total calories of the order
public void setTotalCalories(int totalCalories) {
    this.totalCalories = totalCalories;
}

// Method to set the total price of the order
public void setTotalPrice(int totalPrice) {
    this.totalPrice = totalPrice;
}
  //Method to print the order
 // This method iterates over the items in the order and prints the name, price, calories, and quantity of each item
public void printOrder(){
    for (baskate value : baskates) {
        if(value.getBeverages()){
            System.out.print("Beverage name:" + value.getName() + "   price: " + value.getPrice()
            + "   calories: " + value.getCalories() + "   quantity : " + value.getQuantity() + "\n"
        );
        }else{
            System.out.print("food name:" + value.getName() + "   price: " + value.getPrice()
            + "   calories: " + value.getCalories() + "   quantity : " + value.getQuantity() + "\n"
        );
        }

    }

}
}