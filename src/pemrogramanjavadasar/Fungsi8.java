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
public class Fungsi8 {
    
    public static void Garis(){
        System.out.println("===============================================");
    }
    
    public static void Judul(){
        Garis();
        System.out.println("\t     Program Kolam Renang");
        Garis();
        System.out.println("Ketentuan Program");
        System.out.println("Umur  Kategori  Harga  Pelampung  Baju Renang");                        
        System.out.println(">=18  Dewasa    25k    12k        40k ");                        
        System.out.println("<18   Anak2     10k    5k         35k");
        Garis();
    }

    public static String Kategori(int Umur){
        if (Umur >= 18){ return "Dewasa"; } else { return "Anak-Anak"; }
    }
    
    public static int Harga(int Umur){
        if (Umur >= 18){ return 25000; } else { return 10000; }        
    }
    
    public static int P_Pelampung(int Kode, int Umur){
        if (Kode == 1) {
            if (Umur >= 18){ return 12000; } else { return 5000; }        
        } else {
            return 0;
        }        
    }
    
    public static int P_Renang(int Kode, int Umur){
        if (Kode == 1) {
            if (Umur >= 18){ return 40000; } else { return 35000; }        
        } else {
            return 0;
        }        
    }

    public static void main(String args[]){
        Scanner Input = new Scanner(System.in);
        String Nama; String Kat;
        int Umur; int Baju; int Pelampung;
        Judul();
        System.out.print("Masukan Nama     : ");Nama = Input.nextLine();
        System.out.print("Masukan Umur     : ");Umur = Input.nextInt();
        System.out.print("Pelampung   [0/1]: ");Pelampung = Input.nextInt();
        System.out.print("Baju Renang [0/1]: ");Baju = Input.nextInt();
        Garis();
        long B_Harga = Harga(Umur);
        long B_Pelampung = P_Pelampung(Pelampung, Umur);
        long B_Renang = P_Renang(Baju, Umur);
        long B_Total = B_Harga + B_Pelampung + B_Renang;
        System.out.println("Kategori         : " + Kategori(Umur));
        System.out.println("Harga            : " + B_Harga);        
        System.out.println("Pelampung        : " + B_Pelampung);        
        System.out.println("Baju Renang      : " + B_Renang); 
        Garis();
        System.out.println("Total Bayar      : " + B_Total); 
    }
    
}
