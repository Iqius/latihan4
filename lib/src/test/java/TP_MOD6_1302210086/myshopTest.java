/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TP_MOD6_1302210086;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ASUS
 */
public class myshopTest {
    
    public myshopTest() {
    }
    @Test
    public void gausaDiskon() {
        myshop shop = new myshop();
        double[] itemPrices = {800, 700, 700};
        double expectedTotal = 2400.0; 
        double actualTotal = shop.priceCalc(itemPrices);
        assertEquals(expectedTotal, actualTotal, 0.001);
    }
    
    @Test
    public void karoDiskon() {
        myshop shop = new myshop();
        double[] itemPrices = {400, 200, 600};
        double expectedTotal = 1080.0; 
        double actualTotal = shop.priceCalc(itemPrices);
        assertEquals(expectedTotal, actualTotal, 0.001);
    }
    
    @Test
    public void diskonMaksimal() {
        myshop shop = new myshop();
        double[] itemPrices = {400, 300, 200, 100, 50};
        double expectedTotal = 870.0; // (400 * 0.8 + 300 * 0.8 + 200 * 0.8 + 100 + 50)
        double actualTotal = shop.priceCalc(itemPrices);
        assertEquals(expectedTotal, actualTotal, 0.001);
    }
    
    @Test
    public void raBelonjo() {
        myshop shop = new myshop();
        double[] itemPrices = {};
        double expectedTotal = 0.0;
        double actualTotal = shop.priceCalc(itemPrices);
        assertEquals(expectedTotal, actualTotal, 0.001);
    }
    
}
