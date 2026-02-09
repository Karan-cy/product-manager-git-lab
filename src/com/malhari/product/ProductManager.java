package com.malhari.product;

public class ProductManager {

    public double getPriceAfterTax(double price, double taxRate) {
        return price + (price * taxRate);
    }
}
