/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;

/**
 *
 * @author Plus
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int sayi = 100;
        int toplam = 0;
 
        for(int i = 1; i <= sayi; ++i)
        {
            toplam += i;
        }
 
        System.out.println("1-100 arasindaki sayilarin toplami = " + toplam);
    }
    
}
