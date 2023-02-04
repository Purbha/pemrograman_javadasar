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
public class Fungsi6 {
    public static void garis(){
        System.out.println("==============================================");
    }
    
    public static void judul(){
        garis();
        System.out.println("\tProgram Perhitungan Nilai");
        garis();
    }
    
    public static double hitung_total(int a, int b, int c, int d){
        double hasil = (0.1 * a) + (0.2 * b) + (0.3 * c) + (0.4 * d);
        return hasil;
    }

    public static String keterangan(char Grade){
        String Ket;
        if (Grade == 'A' || Grade == 'B'|| Grade == 'C'){
            Ket = "LULUS";
        } else {
            Ket = "TIDAK LULUS";
        }
        return Ket;
    }
            
    public static char cek_grade(double total){
        char grade;
        if (total>=80){ grade = 'A'; }
        else if(total>=69){ grade = 'B'; }
        else if(total>=56){ grade = 'C'; }
        else if(total>=40){ grade = 'D'; }
        else { grade = 'E'; }
        return grade;        
    }
    
    public static void main(String args[]){
        int jml_data;
        int i;
        int no;
        judul();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah Data: ");jml_data = input.nextInt();
        
        //Variable Array
        String nama[] = new String[10];
        String ket[] = new String[10];
        int absen[] = new int[10];
        int tugas[] = new int[10];
        int uts[] = new int[10];
        int uas[] = new int[10];
        double total[] = new double[10];
        char grade[] = new char[10];
        
        System.out.print("\n");
        for(i=0;i<jml_data;i++){
            no = i + 1;
            System.out.println("Data Ke - " + no);
            garis();
            System.out.print("Nama Mhs: ");nama[i] = input.next();
            System.out.print("Absen   : ");absen[i] = input.nextInt();
            System.out.print("Tugas   : ");tugas[i] = input.nextInt();
            System.out.print("UTS     : ");uts[i] = input.nextInt();
            System.out.print("UAS     : ");uas[i] = input.nextInt();
            total[i] = hitung_total(absen[i], tugas[i], uts[i], uas[i]);
            grade[i] = cek_grade(total[i]);
            ket[i] = keterangan(grade[i]);
            System.out.print("\n");
        }
        
        judul();
        System.out.println("No Nama      Absen Tugas UTS UAS Total Grade Keterangan");
        garis();
        for(i=0;i<jml_data;i++){
            no = i + 1;
            System.out.print(String.format("%-3s", no));
            System.out.print(String.format("%-10s", nama[i]));
            System.out.print(String.format("%-6s", absen[i]));
            System.out.print(String.format("%-6s", tugas[i]));
            System.out.print(String.format("%-4s", uts[i]));
            System.out.print(String.format("%-4s", uas[i]));
            System.out.print(String.format("%-6.1f", total[i]));
            System.out.print(String.format("%-6s", grade[i]));
            System.out.print(String.format("%-15s", ket[i]));
            System.out.print("\n");
        }
        garis();
    }    
}
