/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pemrogramanjavadasar;

/**
 *
 * @author irsyad
 */
public class Fungsi1 {
      
    public static void main(String args[]){
         int alas = 10;
         garis();
         System.out.println("  Program menghitung Segitiga"); int tinggi = 5;
         garis();
         double luas;
         System.out.print("Alas segitiga: " + alas + "\n");
         System.out.print("Tinggi segitiga: " + tinggi + "\n");
         luas = (alas * tinggi) * 0.5;
         System.out.printf("Luas segitiga adalah: %.2f cm \n",luas);
    }
 
    //Ini adalah prosedur garis
    public static void garis(){
       System.out.println("==================================");        
    }
         
}