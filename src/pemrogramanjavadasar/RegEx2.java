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
public class RegEx2 {
       public static void main(String args[]){
        String kata1 = "abc"; String kata2 = "abc def";
        System.out.println("String kata1 adalah: " + kata1);
        System.out.println("String kata2 adalah: " + kata2);
        System.out.println("Hasil pengecekan abc pada variabel kata1: ");
        if (kata1.matches("abc")){ System.out.println("Ditemukan."); }
        else { System.out.println("Tidak ditemukan."); }
        System.out.println("Hasil pengecekan abc variabel kata2: ");
        if (kata2.matches("abc")){ System.out.println("Ditemukan"); }
        else { System.out.println("Tidak ditemukan"); }        
    }
}
