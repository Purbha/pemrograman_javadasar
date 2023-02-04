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
public class Prosedur3 {
    public static void main(String args[]){
        Prosedur1 Objek = new Prosedur1();
        Scanner Masukan = new Scanner(System.in);
        Objek.Judul(); Objek.ketentuan(); Objek.turun(1);
        String Nama;
        int Jml_Data; int i;
        String[] Kode = new String[10];
        String[] Nama_Obat = new String[10];
        int[] Jml_Beli  = new int[10];
        int[] Jml_Strip  = new int[10];
        int[] Jml_Butir  = new int[10];
        long[] Subtotal  = new long[10];
        System.out.print("Masukan Nama: "); Nama = Masukan.nextLine();        
        System.out.print("Jumlah Data : "); Jml_Data = Masukan.nextInt();
        Objek.garis();
        for (i=1;i<=Jml_Data;i++){
            System.out.println("Data Ke " + i + " Dari " + Jml_Data + " Data");
            System.out.print("Kode Obat          : "); Kode[i] = Masukan.next();
            System.out.print("Jumlah Beli (Butir): "); Jml_Beli[i] = Masukan.nextInt();
            Objek.garis();
        }
        Objek.turun(1);Objek.Judul();
        System.out.println("Data Pejualan Obat");
        System.out.println("Nama Pembeli: " + Nama);
        Objek.garis();
        System.out.println("No  Kode  Jumlah Beli  Jumlah Strip  Jumlah Butir  Nama Obat  Subtotal  ");
        Objek.garis();
        int Total_Beli=0;
        int Total_Strip=0;
        int Total_Butir=0;
        long Total_Subtotal=0;
        for (i=1;i<=Jml_Data;i++) {
            Nama_Obat[i] = Objek.Nama_Obat(Kode[i]);
            Subtotal[i] = Objek.Subtotal(Nama_Obat[i],Jml_Beli[i]);
            Jml_Strip[i] = Jml_Beli[i] / 4;
            Jml_Butir[i] = Jml_Beli[i] % 4;
            System.out.print(String.format("%-4s",i));  
            System.out.print(String.format("%-6s",Kode[i]));
            System.out.print(String.format("%-13s",Jml_Beli[i] + " Butir"));
            System.out.print(String.format("%-14s",Jml_Strip[i] + " Strip"));
            System.out.print(String.format("%-14s",Jml_Butir[i] + " Butir"));            
            System.out.print(String.format("%-11s",Nama_Obat[i]));
            System.out.print(String.format("%-10s",Subtotal[i]));
            System.out.println();
            Total_Beli = Total_Beli + Jml_Beli[i];
            Total_Strip = Total_Strip + Jml_Strip[i];
            Total_Butir = Total_Butir + Jml_Butir[i];
            Total_Subtotal = Total_Subtotal + Subtotal[i];
        }
        Objek.garis();
        System.out.print(String.format("%-10s","TOTAL"));  
        System.out.print(String.format("%-13s",Total_Beli + " Butir"));
        System.out.print(String.format("%-14s",Total_Strip + " Strip"));
        System.out.print(String.format("%-25s",Total_Butir + " Butir"));            
        System.out.print(String.format("%-10s",Total_Subtotal));
        Objek.turun(1);
        Objek.garis();
    } 
}
