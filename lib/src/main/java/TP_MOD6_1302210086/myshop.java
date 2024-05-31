/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP_MOD6_1302210086;

/**
 *
 * @author ASUS
 */
public class myshop {
     public double priceCalc(double[] itemPrices) {
    int maxItemDisc = 3;
    double discount = 0.2;
    double total = 0;
 
    for (int i = 0; i < itemPrices.length; i++) {
        if (itemPrices[i] < 500 && maxItemDisc > 0) {
            total += (itemPrices[i] * (1 - discount));
            maxItemDisc--;
        } else {
            total += itemPrices[i];
        }
    }
        return total;
    }
}
