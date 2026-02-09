package com.malhari.product;

public class ProductManager {

    public double getPriceAfterTax(double price, double taxRate) {
        return price + (price * taxRate);
    }
 // Calculates the final price after applying a percentage discount.

    public double calculateDiscount(double price, double discountPercent) {
        return price - (price * (discountPercent / 100.0));
    }

}
