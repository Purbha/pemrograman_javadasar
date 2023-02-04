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
public class Latihan2 {
    public int Jumlah_Data;
    public String[] NmKar = new String[10];
    public long[] Gaji = new long[10];
    public long[] Tunj = new long[10];
    public long[] Bruto = new long[10];
    public double[] Jamsos = new double[10];
    public double[] Netto = new double[10];
    
    public void enter(int i){
        int y;
        for(y=1;y<=i;y++){ System.out.println(); }
    }
    
    public void garis(){
        int i = 70;
        String simbol = "-";
        do {
            System.out.print(simbol); i = i - 1;
        } while (i > 0);        
        enter(1);
    }
    
    public void insert_data(int indeks){
        int no = indeks + 1;
        System.out.println();
        garis();System.out.println("Data Ke - " + no);garis();
        Scanner masukan = new Scanner(System.in);
        Latihan2 Objek = new Latihan2();
        System.out.print("Nama Karyawan: ");NmKar[indeks] = masukan.next();
        System.out.print("Gaji Pokok   : ");Gaji[indeks] = masukan.nextLong();
        System.out.print("Tunjangan    : ");Tunj[indeks] = masukan.nextLong();
        garis();
    }
    
    public void cetak_data(int indeks) {
        System.out.print(String.format("%-3s",indeks+1));        
        System.out.print(String.format("%-6s",NmKar[indeks]));
        System.out.print(String.format("%-11s",Gaji[indeks]));
        System.out.print(String.format("%-10s",Tunj[indeks]));
        //Perhitungan
        Bruto[indeks] = hitung_bruto(Gaji[indeks],Tunj[indeks]);
        Jamsos[indeks] = hitung_jamsostek(Gaji[indeks]);
        Netto[indeks] = hitung_netto(Jamsos[indeks],Bruto[indeks]);
        
        System.out.print(String.format("%-10s",Bruto[indeks]));
        System.out.print(String.format("%-10s",Jamsos[indeks]));
        System.out.print(String.format("%-10s",Netto[indeks]));
    }
    
    public long hitung_bruto(long gapok, long tunjangan){
        long total_bruto;
        total_bruto = gapok + tunjangan;
        return total_bruto;
    }
    
    public double hitung_jamsostek(long gapok){
        double jamsostek;
        jamsostek = 0.02 * gapok;
        return jamsostek;
    }

    public double hitung_netto(double jamsos, long bruto){
        double netto;
        netto = bruto - jamsos;
        return netto;
    }
    
    public void judul(){
        garis();
        System.out.println("\tProgram Perhitungan Gaji Karyawan");
        garis();
    }
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
         //Create Object
        Latihan2 Objek = new Latihan2();
        Objek.judul();
        System.out.print("Masukan jumlah data: ");
        Objek.Jumlah_Data  =  input.nextInt();
        int i = 0;
        while (i<Objek.Jumlah_Data){
            Objek.insert_data(i); i++;
        }
        System.out.println();
        Objek.garis();
        System.out.println("Data Gaji");
        Objek.garis();
        System.out.println("No Nama  Gaji Pokok Tunjangan Bruto     Jamsostek Gaji Bersih");        
        for (i=0;i<Objek.Jumlah_Data;i++) {
            Objek.cetak_data(i);
            System.out.println();
        }
        Objek.garis();
    }
}
