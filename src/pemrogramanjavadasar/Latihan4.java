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
public class Latihan4 {

    public double Hitung_Lembur(long Gapok, double Jam){
        double Uang_Lembur;
        Uang_Lembur = (Gapok / 169) * Jam;
        return Uang_Lembur;
    }
    
    public double Hitung_Jam(int jenis, int lama){
        double hasil;
        if (jenis == 1){
            if (lama >= 2) {
                hasil = ((lama - 1) * 2) + 1.5;
            } else {
                hasil = 1.5;
            }                
        } else {
            if (lama >= 9) {
                hasil = ((lama - 8) * 4) + 17; 
            } else if (lama == 8) {
                hasil = 17; 
            } else {
                hasil = lama * 2;
            }
        }
        return hasil;
    }
    
    public static void main(String args[]){
        Latihan3 Objek = new Latihan3();
        Latihan4 Objek2 = new Latihan4();
        Objek.judul();
        Scanner Input_Data = new Scanner(System.in);
        //Deklarasi Variabel
        String NmKar; long Gapok; int KdDiv; int Jml_Lembur; int i;
        //Deklarasi Array
        int[] Jam = new int[10];
        int[] Hari = new int[10];
        long Gaji_Pokok;
        double Jam_Dep;
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
        Objek.garis(33);
        for (i=1;i<=Jml_Lembur;i++){
            Jam_Dep = Objek2.Hitung_Jam(Hari[i],Jam[i]);
            System.out.print(String.format("%-3s",i));
            System.out.print(String.format("%-5s",Jam[i]));
            System.out.print(String.format("%-11s",Objek.Cek_Hari(Hari[i])));
            System.out.print(String.format("%-11s",Jam_Dep));
            System.out.print(String.format("%-12s",Objek2.Hitung_Lembur(Gaji_Pokok,Jam_Dep)));
            Objek.enter(1);                   
        }
        Objek.garis(33);
    }    
}
