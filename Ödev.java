/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ödev;

/**
 *
 * @author Plus
 */
import java.util.Scanner;
public class Ödev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayac;
        
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        
        for(int i = 2; i <= sayi ; i++)
        {
            sayac = 0;
            for(int j = 2; j < i; j++)
            {
                if(i % j == 0) {
                    sayac++;
                }
            }
            if(sayac == 0) {
                System.out.println(i + " asal bir sayidir.");
    }
        }
    }
}
