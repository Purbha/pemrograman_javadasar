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
public class Prosedur4 {
    
    public double diskon(int jml, long total){
        double dis;
        if (jml > 10) { dis = 0.1 * total; }
        else if (jml > 5) { dis = 0.05 * total; }
        else { dis = 0; }
        return dis;
    }
    
    public static void main(String args[]){
        Prosedur1 Objek = new Prosedur1();
        Prosedur4 Ini = new Prosedur4();
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
        double[] Potongan = new double[10];
        double[] Grand = new double[10];
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
        System.out.println("No  Kode  Jumlah Beli  Jumlah Strip  Jumlah Butir  Nama Obat  Total  Diskon  Subtotal");
        Objek.garis();
        int Total_Beli=0; int Total_Strip=0; int Total_Butir=0; long Total_Subtotal=0;
        double Total_Diskon = 0; double Total_Grand = 0; double ppn; double bayar;
        
        for (i=1;i<=Jml_Data;i++) {
            Nama_Obat[i] = Objek.Nama_Obat(Kode[i]);
            Subtotal[i] = Objek.Subtotal(Nama_Obat[i],Jml_Beli[i]);
            Jml_Strip[i] = Jml_Beli[i] / 4;
            Jml_Butir[i] = Jml_Beli[i] % 4;
            Potongan[i] = Ini.diskon(Jml_Strip[i], Subtotal[i]);
            Grand[i] = Subtotal[i] - Potongan[i];
            System.out.print(String.format("%-4s",i));  
            System.out.print(String.format("%-6s",Kode[i]));
            System.out.print(String.format("%-13s",Jml_Beli[i] + " Butir"));
            System.out.print(String.format("%-14s",Jml_Strip[i] + " Strip"));
            System.out.print(String.format("%-14s",Jml_Butir[i] + " Butir"));            
            System.out.print(String.format("%-11s",Nama_Obat[i]));
            System.out.print(String.format("%-7s",Subtotal[i]));
            System.out.print(String.format("%-8s",Potongan[i]));
            System.out.print(String.format("%-8s",Grand[i]));
            System.out.println();
            Total_Beli = Total_Beli + Jml_Beli[i];
            Total_Strip = Total_Strip + Jml_Strip[i];
            Total_Butir = Total_Butir + Jml_Butir[i];
            Total_Subtotal = Total_Subtotal + Subtotal[i];
            Total_Diskon = Total_Diskon + Potongan[i];
            Total_Grand = Total_Grand + Grand[i];
        }
        
        Objek.garis();
        System.out.print(String.format("%-10s","TOTAL"));  
        System.out.print(String.format("%-13s",Total_Beli + " Butir"));
        System.out.print(String.format("%-14s",Total_Strip + " Strip"));
        System.out.print(String.format("%-25s",Total_Butir + " Butir"));            
        System.out.print(String.format("%-7s",Total_Subtotal));
        System.out.print(String.format("%-8s",Total_Diskon));
        System.out.print(String.format("%-8s",Total_Grand));
        Objek.turun(1);Objek.garis();
        ppn = 0.1 * Total_Grand;
        bayar = Total_Grand + ppn;
        System.out.printf("TOTAL BELANJA: %.2f%n",Total_Grand);
        System.out.printf("PPN          : %.2f%n",ppn);
        System.out.printf("TOTAL BAYAR  : %.2f%n",bayar);        
        Objek.garis();
        System.out.printf("TERIMA KASIH SUDAH MENGERJAKAN%n");        
        Objek.garis();
    } 

}
