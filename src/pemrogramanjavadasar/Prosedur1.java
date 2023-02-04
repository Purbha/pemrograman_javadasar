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
public class Prosedur1 {

    public void garis(){
        System.out.println("=================================================");
    }
    
    public void Judul(){
        garis();
        System.out.println("Program Penjualan Obat Terlarang");
        garis();
    }
    
    public void turun(int x){
        int i;
        for (i=1;i<=x;i++){ System.out.println(); }
    }
    
    public void ketentuan(){
        System.out.println("Kode  Nama Obat  Harga Satuan  Harga 1 Strip");
        garis();
        System.out.println("A     Paramex    Rp 1.000      Rp 3.500");
        System.out.println("B     Neozep     Rp 1.500      Rp 5.500");
        System.out.println("C     Sanmol     Rp 2.000      Rp 7.500");
        garis();
        System.out.println("Keterangan: 1 strip isi 4 butir");
        System.out.println("Jika pembelian lebih dari 5 strip maka diskon 5 %");        
        System.out.println("Jika pembelian lebih dari 10 strip maka diskon 10 %");        
        garis();
    }
    
    public String Nama_Obat(String Kode){
        String Obat;
        switch (Kode) {
            case "A": Obat = "Paramex"; break; case "a": Obat = "Paramex"; break;
            case "B": Obat = "Neozep"; break; case "b": Obat = "Neozep"; break;
            default: Obat = "Sanmol"; break;
        }
        return Obat;
    }
    
    public long Total_Butir(String Obat, int Jumbel){
        long Harga;
        long Total;
        switch (Obat) {
            case "Paramex": Harga = 1000;
                break;
            case "Neozep": Harga = 1500;
                break;
            default: Harga = 2000; break;
        }
        Total = Harga * Jumbel;
        return Total;
    }
    
    public long Total_Strip(String Obat, int Jumbel){
        long Harga;
        long Total;
        switch (Obat) {
            case "Paramex": Harga = 3500;
                break;
            case "Neozep": Harga = 5500;
                break;
            default: Harga = 7500; break;
        }
        Total = Harga * Jumbel;
        return Total;
    }
    
    public long Subtotal(String Obat, int Jumbel){
        long Total;
        int Butir;
        int Strip;
        if (Jumbel < 4) {
            Total = Total_Butir(Obat, Jumbel);
        } else {
            Butir = Jumbel % 4;
            Strip = Jumbel / 4;
            Total = Total_Strip(Obat, Strip);
            Total = Total + Total_Butir(Obat, Butir);
        }
        return Total;
    }
    
    public static void main(String args[]){
        Prosedur1 Objek = new Prosedur1();
        Scanner Masukan = new Scanner(System.in);
        Objek.Judul(); Objek.ketentuan(); Objek.turun(1);
        String Nama;
        String Kode;
        String Nama_Obat;
        int Jml_Beli;
        long Subtotal;
        System.out.print("Masukan Nama       : "); Nama = Masukan.nextLine();        
        System.out.print("Kode Obat          : "); Kode = Masukan.next();
        System.out.print("Jumlah Beli (Butir): "); Jml_Beli = Masukan.nextInt();
        Objek.garis();
        Objek.turun(1);Objek.Judul();
        Nama_Obat = Objek.Nama_Obat(Kode);
        Subtotal = Objek.Subtotal(Nama_Obat,Jml_Beli);
        System.out.println("Data Pejualan Obat");
        System.out.println("Nama Pembeli    : " + Nama);
        System.out.println("Kode            : " + Kode);
        System.out.println("Nama Obat       : " + Nama_Obat);
        System.out.println("Subtotal        : " + Subtotal);
        Objek.garis();
    }
}
