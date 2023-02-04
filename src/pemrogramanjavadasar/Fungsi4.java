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
public class Fungsi4 {
    
    public static void garis(int lebar){
        int i;
        for (i=1;i<=lebar;i++){
            System.out.print("=");
        }
        System.out.print("\n");
    }
    
    public static void judul(){
        garis(50);
        System.out.println("\tProgram Menghitung Nilai Akhir");
        garis(50);
    }
    
    public static char cetak_grade(double nilai){
        char grade;
        if (nilai>=80){ grade = 'A'; }
        else if(nilai>=69){ grade = 'B'; }
        else if(nilai>=56){ grade = 'C'; }
        else if(nilai>=40){ grade = 'D'; }
        else { grade = 'E'; }
        return grade;        
    }
    
    public static void main (String args[]){
        judul();
        String nim; String nama; String grade;
        int absen; int tugas; int uts; int uas;
        double total;
        Scanner baca = new Scanner(System.in);
        System.out.print("Masukan nama\t: ");nama = baca.next();
        System.out.print("Masukan NIM\t: ");nim = baca.next();
        garis(50);
        System.out.print("Nilai absen\t: ");absen = baca.nextInt();
        System.out.print("Nilai tugas\t: ");tugas = baca.nextInt();
        System.out.print("Nilai UTS\t: ");uts = baca.nextInt();
        System.out.print("Nilai UAS\t: ");uas = baca.nextInt();
        garis(50);
        total = (0.1*absen)+(0.2*tugas)+(0.3*uts)+(0.4*uas);
        System.out.printf("Nilai total\t: %.2f%n", total);
        System.out.printf("Grade\t\t: %s%n", cetak_grade(total));
        garis(50);
    }    
}
