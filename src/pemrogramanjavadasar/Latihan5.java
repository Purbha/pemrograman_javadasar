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
public class Latihan5 {
    
    public double Hitung_Jamsostek(long Gapok){
        double hasil;
        hasil = 0.02 * Gapok;
        return hasil;
    }
    
    public static void main(String args[]){
        Latihan3 Objek = new Latihan3();
        Latihan4 Objek2 = new Latihan4();
        Latihan5 Objek3 = new Latihan5();
        Objek.judul();
        Scanner Input_Data = new Scanner(System.in);
        //Deklarasi Variabel
        String NmKar; long Gapok; int KdDiv; int Jml_Lembur; int i;
        //Deklarasi Array
        double Jamsos;
        double THP;
        double Jam_Dep;
        int[] Hari = new int[10];
        int[] Jam = new int[10];
        long Gaji_Pokok;
        double Total_Dept = 0;
        double Total_Uang = 0;
        int Total_Jam = 0;
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
        Objek.garis(33);
        Objek.judul();
        Gaji_Pokok = Objek.Cek_Gapok(KdDiv);
        System.out.println("Nama Karyawan : " + NmKar);
        System.out.println("Kode Divisi   : " + Objek.Cek_Divisi(KdDiv));
        System.out.println("Gaji Pokok    : " + Gaji_Pokok);
        System.out.println("Jumlah Lembur : " + Jml_Lembur);
        Objek.garis(33);
        System.out.println("No Lama Jenis Hari Jam Lembur Uang Lembur");
        Objek.garis(40);
        for (i=1;i<=Jml_Lembur;i++){
            Jam_Dep = Objek2.Hitung_Jam(Hari[i],Jam[i]);
            System.out.print(String.format("%-3s",i));
            System.out.print(String.format("%-5s",Jam[i]));
            System.out.print(String.format("%-11s",Objek.Cek_Hari(Hari[i])));
            System.out.print(String.format("%-11s",Jam_Dep));
            System.out.print(String.format("%-12s",Objek2.Hitung_Lembur(Gaji_Pokok,Jam_Dep)));
            Objek.enter(1);                   
            Total_Jam = Total_Jam + Jam[i];
            Total_Dept = Total_Dept + Jam_Dep;
            Total_Uang = Total_Uang + Objek2.Hitung_Lembur(Gaji_Pokok,Jam_Dep);
        }
        Jamsos = Objek3.Hitung_Jamsostek(Gaji_Pokok);
        THP = Gaji_Pokok + Total_Uang - Jamsos; 
        Objek.garis(40);
        System.out.printf("Total Jam     : %d\n",Total_Jam);
        System.out.printf("Total Depnaker: %.2f\n",Total_Dept);
        System.out.printf("Total Lembur  : %.2f\n",Total_Uang);
        System.out.printf("Gaji Pokok    : %d\n",Gaji_Pokok);        
        System.out.printf("Jamsostek     : %.2f\n",Jamsos);
        System.out.printf("Take Home Pay : %.2f\n",THP);
        Objek.garis(33);        
    }
}
