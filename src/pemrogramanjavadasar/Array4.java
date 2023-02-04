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
public class Array4 {
    
    public static void main(String[] args){
        System.out.println("------------------------------------------");        
        System.out.println(" Program NILAI");
        System.out.println("------------------------------------------");
        System.out.print("Masukan jumlah data: ");
        Scanner Input = new Scanner(System.in);
        int JmlData_Irsyad;
        int i_Irsyad;
        String[] Nama_Irsyad = new String[10];
        int[] Absen_Irsyad = new int[10];
        int[] Tugas_Irsyad = new int[10];
        int[] UTS_Irsyad = new int[10];
        int[] UAS_Irsyad = new int[10];
        double[] Total_Irsyad = new double[10];
        JmlData_Irsyad = Input.nextInt();
        System.out.println();
        for(i_Irsyad=1;i_Irsyad<=JmlData_Irsyad;i_Irsyad++){
            System.out.println("Data ke " + i_Irsyad);
            System.out.print("Nama Mahasiswa : ");
            Nama_Irsyad[i_Irsyad] = Input.next();
            System.out.print("Nilai Absen    : ");
            Absen_Irsyad[i_Irsyad] = Input.nextInt();
            System.out.print("Nilai Tugas    : ");
            Tugas_Irsyad[i_Irsyad] = Input.nextInt();
            System.out.print("Nilai UTS      : ");
            UTS_Irsyad[i_Irsyad] = Input.nextInt();
            System.out.print("Nilai UAS      : ");
            UAS_Irsyad[i_Irsyad] = Input.nextInt();
            //==========================================//
            Total_Irsyad[i_Irsyad] = (Absen_Irsyad[i_Irsyad] * 0.1) + (Tugas_Irsyad[i_Irsyad] * 0.2) +
                    (UTS_Irsyad[i_Irsyad] * 0.3) + (UAS_Irsyad[i_Irsyad] * 0.4); 
            //==========================================//
            System.out.println();
        }
        System.out.println();
        System.out.println("------------------------------------------");        
        System.out.println("No Nama  Absen  Tugas  UTS  UAS  Total ");
        System.out.println("------------------------------------------");
        for(i_Irsyad=1;i_Irsyad<=JmlData_Irsyad;i_Irsyad++){
            System.out.print(i_Irsyad + "  ");
            System.out.print(Nama_Irsyad[i_Irsyad] + "   ");
            System.out.print(Absen_Irsyad[i_Irsyad] + "      ");
            System.out.print(Tugas_Irsyad[i_Irsyad] + "   ");
            System.out.print(UTS_Irsyad[i_Irsyad] + "   ");
            System.out.print(UAS_Irsyad[i_Irsyad] + "   ");
            System.out.print(Total_Irsyad[i_Irsyad] + "   ");
            System.out.println();
        }        
        System.out.println("------------------------------------------");
    }
    
}
