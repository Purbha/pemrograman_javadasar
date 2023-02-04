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
public class Latihan3 {
        public Latihan3(){
        System.out.println("---------------------------------");
        System.out.println("Kode Divisi         Gaji Pokok");
        System.out.println("---------------------------------");
        System.out.println("   1 Divisi IT       6.500.000");
        System.out.println("   2 Divisi Finance  4.500.000");
        System.out.println("   3 Divisi Legal    4.000.000");
        System.out.println("---------------------------------");
        System.out.println("Kode Jenis Hari");
        System.out.println("---------------------------------");
        System.out.println("   1 Weekday");
        System.out.println("   2 Weekend");
        System.out.println("---------------------------------");
        System.out.println("Perhitungan Jam Lembur");
        System.out.println("---------------------------------");
        System.out.println("Weekday");
        System.out.println("- 1 jam pertama dikali 1.5");
        System.out.println("- Jam ke 2 dst dikali 2");
        System.out.println("Weekend");
        System.out.println("- 7 jam pertama dikali 2");
        System.out.println("- Jam ke 8 dikali 3");    
        System.out.println("- Jam ke 9 dst dikali 4");    
        System.out.println("---------------------------------");
        System.out.println("Perhitungan Uang Lembur");
        System.out.println("---------------------------------");
        System.out.println("Uang Lembur = (Gaji Pokok / 169) * Jam Lembur");
        System.out.println("---------------------------------");
    }
    
    public void enter(int jml){
       int i = 0;
       while (i < jml){ System.out.println(); i++; }      
    }
    
    public void garis(int Panjang){
        String cetak = "-"; int i = 0;
        do { System.out.print(cetak); i = i + 1; }
        while (i < Panjang);        
        enter(1);
    }
    
    public void judul(){
        System.out.println("Sistem Input Data Lembur");
        garis(33);
    }
    
    public String Cek_Divisi(int Kode_Div){
        String divisi;
        switch(Kode_Div) {
            case 1: divisi = "Divisi IT"; break;
            case 2: divisi = "Divisi Finance"; break;
            case 3: divisi = "Divisi Legal"; break;
            default: divisi = "Invalid Division"; break;
        }
        return divisi;
    }
    
    public long Cek_Gapok(int Kode_Div){
        long Gaji;
        switch(Kode_Div) {
            case 1: Gaji = 6500000; break;
            case 2: Gaji = 4500000; break;
            case 3: Gaji = 4000000; break;
            default: Gaji = 0; break;
        }
        return Gaji;   
    }
    
    public String Cek_Hari(int Kode_Hari){
        String Hari;
        switch(Kode_Hari) {
            case 1: Hari = "Weekday"; break;
            case 2: Hari = "Weekend"; break;
            default: Hari = "Invalid Days"; break;
        }
        return Hari;
    }
    
    public static void main(String args[]){
        Latihan3 Objek = new Latihan3();
        Objek.judul();
        Scanner Input_Data = new Scanner(System.in);
        //Deklarasi Variabel
        String NmKar; long Gapok; int KdDiv; int Jml_Lembur; int i;
        //Deklarasi Array
        int[] Jam = new int[10]; int[] Hari = new int[10];
        System.out.print("Nama Karyawan : ");NmKar = Input_Data.nextLine();
        System.out.print("Kode Divisi   : ");KdDiv = Input_Data.nextInt();
        System.out.print("Jumlah Lembur : ");Jml_Lembur = Input_Data.nextInt();
        for (i=1;i<=Jml_Lembur;i++){
            Objek.garis(33);
            System.out.println("Data Ke - " + i + " Dari " + Jml_Lembur);
            Objek.garis(33);
            System.out.print("Lama (Jam) : ");Jam[i] = Input_Data.nextInt();
            System.out.print("Jenis Hari : ");Hari[i] = Input_Data.nextInt();
        }
        /*===============================================================*/
        Objek.garis(33); Objek.judul();
        System.out.println("Nama Karyawan : " + NmKar);
        System.out.println("Kode Divisi   : " + Objek.Cek_Divisi(KdDiv));
        System.out.println("Gaji Pokok    : " + Objek.Cek_Gapok(KdDiv));
        System.out.println("Jumlah Lembur : " + Jml_Lembur);
        Objek.garis(33);
        System.out.println("No Lama Jenis Hari Uang Lembur Total");
        Objek.garis(33);
        for (i=1;i<=Jml_Lembur;i++){
            System.out.print(String.format("%-3s",i));
            System.out.print(String.format("%-5s",Jam[i]));
            System.out.print(String.format("%-11s",Objek.Cek_Hari(Hari[i])));
            Objek.enter(1);                   
        } Objek.garis(33);
    }
}
