/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myresturantx;

import java.util.ArrayList;

public class Helper {

    // Create two static ArrayLists to store food and beverages
    ArrayList<food> foods = new ArrayList<food>();
    ArrayList<beverages> beverages = new ArrayList<beverages>();

    // Method to save a food object to the foods ArrayList
    public void saveFood(food f) {
        this.foods.add(f);
    }

    // Method to save a beverage object to the beverages ArrayList
    public void saveBeverage(beverages b) {
        this.beverages.add(b);
    }

    // Method to get the list of food objects stored in the foods ArrayList
    public ArrayList<food> getFoods() {
        return foods;
    }

    // Method to get the list of beverage objects stored in the beverages ArrayList
    public ArrayList<beverages> getBeverages() {
        return beverages;
    }

    // Method to get the food object at a specific index in the foods ArrayList
    public food getFood(int index) {
        return foods.get(index);
    }

    // Method to get the beverage object at a specific index in the beverages ArrayList
    public beverages getBeverages(int index) {
        return beverages.get(index);
    }

}
