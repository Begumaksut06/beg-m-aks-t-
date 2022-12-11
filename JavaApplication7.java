/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author Plus
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int taban = 3, kuvvet = 4;
 
        long sonuc = 1;
 
        for (;kuvvet != 0; --kuvvet)
        {
            sonuc *= taban;
        }
 
        System.out.println("CEVAP = " + sonuc);
    }
    
}
