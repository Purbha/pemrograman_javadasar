/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pemrogramanjavadasar;
import java.util.Scanner;

/**
 *
 * @author irsyad
 */
public class UTS {
    public static String nama;
    public static String alamat;
    public static int film;
    public static int quality;
    public static int lama;
    
    public static void garis(){
        System.out.println("========================================");
    }

    public static void cetak_header(){
        garis();
        System.out.println("     Program Penyewaan Film Bajakan");
        garis();
        System.out.println("Daftar Film:");
        System.out.println("  1. Pocong Versus Aliens");
        System.out.println("  2. Ber*k Dalam Kubur");
        System.out.println("  3. Marwoto Sippuden");
        System.out.println("Kualitas:");
        System.out.println("  1. CAM");
        System.out.println("  2. BRRip");
        garis();
    }
    
    public static void daftar_harga(){
        System.out.println("Daftar Harga:");
        System.out.println("1. Pocong Versus Aliens -> CAM  : 5500");
        System.out.println("                        -> BRRip: 6500");
        System.out.println("2. Ber*k Dalam Kubur    -> CAM  : 6000");
        System.out.println("                        -> BRRip: 7000");
        System.out.println("3. Marwoto Sippuden     -> CAM  : 7500");
        System.out.println("                        -> BRRip: 8500");
        garis();
    }
    
    public static void ketentuan_lain(){
        System.out.println("Ketentuan Lain:");
        System.out.println("Jika Lama Sewa > 10 hari maka Diskon 10%");
        System.out.println("Jika Lama Sewa > 5 hari maka Diskon 5%");
        garis();
    }
    
    public static void insert_data(){
        Scanner input = new Scanner(System.in);
        System.out.println("Insert Data");
        System.out.print("  Nama Customer : "); nama = input.nextLine();
        System.out.print("  Alamat        : "); alamat = input.nextLine();
        System.out.print("  Film (1/2/3)  : "); film = input.nextInt();
        System.out.print("  Kualitas (1/2): "); quality = input.nextInt();        
        System.out.print("  Lama Sewa     : "); lama = input.nextInt();
        garis();
    }
    
    public static int harga_sewa(int kd_film, int kd_kualitas){
        if (kd_film == 1){
            if (kd_kualitas == 1){ return 5500; }
            else { return 6500; }
        }
        else if (kd_film == 2){
            if (kd_kualitas == 1){ return 6000; }
            else { return 7000; }
        }
        else{
            if (kd_kualitas == 1){ return 7500; }
            else { return 8500; }            
        }     
    }
    
    public static void cetak_data(){
        System.out.print("\n\n\n");
        garis();
        System.out.println("Data Penyewaan Film");
        garis();
        System.out.println("Nama Customer: " + nama);
        System.out.println("Alamat       : " + alamat);
        
        /*==================================================*/
        String judul_film;
        if (film == 1) { judul_film =  "Pocong Versus Aliens"; } 
        else if (film == 2) { judul_film = "Ber*k Dalam Kubur"; }
        else { judul_film  = "Marwoto Sippuden"; }
        /*==================================================*/  
        System.out.println("Judul Film   : " + judul_film);
        System.out.println("Lama Sewa    : " + lama);
        
        /*==================================================*/
        int harga_perhari = harga_sewa(film, quality);
        long subtotal = harga_perhari * lama;
        /*==================================================*/
        System.out.println("Harga Sewa   : " + harga_perhari);
        System.out.println("Subtotal     : " + subtotal);
        /*==================================================*/
        double diskon;
        double grand;
        if (lama > 10) { diskon = 0.1 * subtotal; }
        else if (lama > 5) { diskon = 0.05 * subtotal; }
        else { diskon = 0; }
        grand = subtotal - diskon;
        /*==================================================*/
        System.out.println("Diskon       : " + diskon);
        System.out.println("Grand Total  : " + grand);
    }
    
    public static void main(String args[]){
         cetak_header();
         daftar_harga();
         ketentuan_lain();
         insert_data();
         cetak_data();
    }    
}
