/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemrogramanjavadasar;

import java.util.Scanner;

/**
 *
 * @author Irsyad
 */
public class Aritmatika5 {
    
      public static void main(String[] args){
           Scanner Input = new Scanner(System.in);
           int Total_Bayar;
           int Kode_Makanan;
           int Kode_Minuman;
           int Harga_Makanan;
           int Harga_Minuman;
           System.out.println("Menu Makanan");
           System.out.println("==============================");
           System.out.print("Masukan kode makanan [1/2/3]: ");
           Kode_Makanan = Input.nextInt();
           System.out.print("Masukan kode minuman [1/2]  : ");
           Kode_Minuman = Input.nextInt();
           System.out.println("==============================");
           if (Kode_Minuman == 1) { Harga_Minuman = 5000; }
           else { Harga_Minuman = 10000; }
           if (Kode_Makanan == 1) { Harga_Makanan = 10000; }
           else if (Kode_Makanan == 2) { Harga_Makanan = 15000; }
           else { Harga_Makanan = 20000; }
           Total_Bayar = Harga_Makanan + Harga_Minuman;
           System.out.println("Total Bayar: " + Total_Bayar);         
      }
}
