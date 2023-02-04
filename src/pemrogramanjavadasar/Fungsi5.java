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
public class Fungsi5 {
    
    public static String nama;
    public static String paket;
    public static String lama;
    public static int pilihan;
    public static int jml;    
    public static int harga;    
    
    public static void garis(){
        System.out.println("==================================");
    }
    
    public static void daftar_harga(){
        System.out.println("1 Paket Reguler (7 Hari): 5000/Kg");
        System.out.println("2 Paket Khusus  (3 Hari): 7000/Kg");
        System.out.println("3 Paket Express (1 Hari): 12000/Kg");
        System.out.println("4 Paket Kepepet (4 Jam) : 17000/Kg");
        garis();
        System.out.println("Lebih dari 10Kg diskon 10%");
        System.out.println("Lebih dari 5Kg diskon 5%");
    }
    
    public static void judul(){
        garis();
        System.out.println("Program Loundry Semoga Bersih");
        garis();
    }
    
    public static void data_masukan(){
        Scanner baca = new Scanner(System.in);
        System.out.println("\nData Masukan");
        garis();
        System.out.print("Masukan Nama Pelanggan         : ");
        nama = baca.nextLine();
        System.out.print("Masukan Pilihan Paket [1/2/3/4]: ");
        pilihan = baca.nextInt();
        System.out.print("Masukan Jumlah (Kg)            : ");
        jml = baca.nextInt();
    }
    
    public static void cetak(){
        System.out.print("\n\n\n");
        judul();
        System.out.println("Nama Pelanggan: " + nama);
        System.out.println("Pilihan Paket : " + paket);
        System.out.println("Lama          : " + lama);
        System.out.println("Harga Paket   : " + harga + "/Kg");
        System.out.println("Banyak        : " + jml + "Kg");
        garis();
        long total =  hitung_total(harga, jml);
        double diskon = hitung_diskon(jml, total);
        double grand = hitung_grand(total, diskon);
        System.out.println("Subtotal      : " + total);
        System.out.println("Diskon        : " + diskon);
        garis();
        System.out.println("Grand Total   : " + grand);
    }
    
    public static String pilihan_paket_b(int pilih){
        if (pilih == 1) { return  "Reguler"; }
        else if (pilih == 2){ return "Khusus"; }
        else if (pilih == 3){ return "Express"; }
        else{ return "Kepepet"; }
    }
    
    public static String pilihan_paket(){
        if (pilihan == 1) { return  "Reguler"; }
        else if (pilihan == 2){ return "Khusus"; }
        else if (pilihan == 3){ return "Express"; }
        else{ return "Kepepet"; }
    }
    
    public static String lama_paket(int pilih){
        if (pilih == 1) { return "7 Hari"; }
        else if (pilih == 2){ return "3 Hari"; }
        else if (pilih == 3){ return "1 Hari"; }
        else { return "4 Jam"; }
    }

    public static int harga_paket(int pilih) {
        if (pilih == 1) { return 5000; }
        else if (pilih == 2){ return 7000; }
        else if (pilih == 3){ return 12000; }
        else { return 17000; }
    }
    
    public static long hitung_total(int harga, int jumlah){
        long hasil;
        hasil = harga * jumlah;
        return hasil;
    }
    
    public static double hitung_diskon(int jumlah, long bayar){
        if (jumlah > 10) { return 0.1 * bayar; }
        else if (jumlah > 5) { return 0.05 * bayar; }
        else {return 0;}
    }
    
    public static double hitung_grand(long total, double diskon) {
        return total - diskon;
    }
    
    public static void perhitungan(){
        paket = pilihan_paket();
        lama = lama_paket(pilihan);
        harga = harga_paket(pilihan);
    }
    
    public static void main(String args[]){
        judul();
        daftar_harga();        
        data_masukan();
        perhitungan();
        cetak();
        pilihan = 5;
    }    
}
