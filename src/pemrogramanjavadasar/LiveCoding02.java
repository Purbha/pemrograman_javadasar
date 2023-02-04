/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemrogramanjavadasar;

import java.util.Scanner;

/**
 *
 * @author IRSYAD
 */
public class LiveCoding02 {
    
    public static void main(String[] args) {
        System.out.println("=========Bangunan Gudang Berbentuk Setengah Bola=========");
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukan Panjang Gudang: ");
        int pGudang = masukan.nextInt();
        System.out.print("Masukan Sisi Kardus: ");
        int sKardus = masukan.nextInt();
        System.out.print("Masukan Tinggi Kardus: ");
        int tKardus = masukan.nextInt();
        System.out.println("=========ANSWER=========");
        double tGudang = pGudang * 0.5;
        System.out.printf("Tinggi Gudang: %.2f\n",tGudang);
        int i,no = 1;
        int batasAtas = (int) (tGudang);
        System.out.printf("Tinggi Gudang (Pembulatan): %d\n",batasAtas);
        for(i=1;i<batasAtas;i+=tKardus) {
            System.out.printf("Tumpukan Ke: %d\n",no);
            
            no++;
        }
        
        /*
        Double jmlTumpuk = (tGudang / tKardus) - 1;
        System.out.printf("Jumlah Tumpukan Kardus Maksimal: %d\n",jmlTumpuk);
        //Jari2 Gudang
        Double jariGudang = pGudang * 0.5;
        //Volume Gudang
        Double vBola = Math.pow(jariGudang, 3) * Math.PI * (4/3);
        Double vGudang = vBola * 0.5;
        System.out.printf("Volume Gudang: %.2f\n",vGudang);
        //Volume Kardus
        int vKardus = sKardus * sKardus * tKardus;
        System.out.printf("Volume Kardus: %d\n",vKardus);
*/
    }
    
    double HitungJari(double diagonal, double tinggi) {
        Double hasil = 0.0;
        diagonal = Math.pow(diagonal, 2);
        tinggi = Math.pow(tinggi, 2);
        hasil = diagonal - tinggi;
        hasil = Math.sqrt(hasil);
        return hasil;
    }
    
}
