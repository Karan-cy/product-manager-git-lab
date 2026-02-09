package com.malhari.product;

public class ProductManager {

    public double getPriceAfterTax(double price, double taxRate) {
        return price + (price * taxRate);
    }
    public double calculateDiscount(double price, double discountPercent) {
        return price - (price * (discountPercent / 100.0));
    }

}
