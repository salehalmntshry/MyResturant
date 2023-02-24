package com.mycompany.myresturantx;

public class baskate {
// Fields to store the properties of the basket item
public String name;
public double price;
public int calories;
public int quantity;
public double totalPrice;
public boolean isFood = false;
public boolean isBeverages = false;

// Setter methods for each property
public void setName(String name) {
this.name = name;
}
public void setPrice(double price) {
this.price = price;
}
public void setCalories(int calories) {
this.calories = calories;
}
public void setQuantity(int quantity) {
this.quantity = quantity;
}
public void setBeverages(boolean isBeverages) {
this.isBeverages = isBeverages;
}
public void setFood(boolean isFood) {
this.isFood = isFood;
}
public void setTotalPrice(double totalPrice) {
this.totalPrice = totalPrice;
}

// Getter methods for each property
public String getName() {
return name;
}
public double getPrice() {
return price;
}
public int getCalories() {
return calories;
}
public int getQuantity() {
return quantity;
}
public boolean getBeverages() {
return isBeverages;
}
public boolean getFood() {
return isFood;
}
public double getTotalPrice() {
return totalPrice;
}
}