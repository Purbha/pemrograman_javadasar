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
public class Prosedur2 {
        
    public static void main(String args[]){
        Prosedur1 Objek = new Prosedur1();
        Scanner Masukan = new Scanner(System.in);
        Objek.Judul(); Objek.ketentuan(); Objek.turun(1);
        String Nama;
        int Jml_Data; int i;
        String[] Kode = new String[10];
        String[] Nama_Obat = new String[10];
        int[] Jml_Beli  = new int[10];
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
        System.out.println("No  Kode  Jumlah Beli  Nama Obat  Subtotal  ");
        Objek.garis();
        for (i=1;i<=Jml_Data;i++) {
            Nama_Obat[i] = Objek.Nama_Obat(Kode[i]);
            Subtotal[i] = Objek.Subtotal(Nama_Obat[i],Jml_Beli[i]);
            System.out.print(String.format("%-4s",i));
            System.out.print(String.format("%-6s",Kode[i]));
            System.out.print(String.format("%-13s",Jml_Beli[i] + " Butir"));
            System.out.print(String.format("%-11s",Nama_Obat[i]));
            System.out.print(String.format("%-10s",Subtotal[i]));
            System.out.println();
        }
        Objek.garis();
    }
}
