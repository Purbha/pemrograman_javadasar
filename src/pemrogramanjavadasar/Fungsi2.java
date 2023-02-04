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
public class Fungsi2 {
     
    public static void judul(){
        System.out.println("\tContoh Fungsi");
        System.out.println("================================");        
    }
    
    public static int total(int cupu, int d){
        int hasil;
        hasil = cupu * d;
        return hasil;
    }

    public static void main(String args[]){
        judul();
       int a,b;
       int lagi = 1;
        //Deklarasi Variable
        while(lagi == 1){
            Scanner masukan = new Scanner(System.in);
            System.out.print("Masukan nilai A: ");
            a = masukan.nextInt();
            System.out.print("Masukan nilai B: ");
            b = masukan.nextInt();
            System.out.println("Nilai A dikali B adalah: " + total(a,b));
            System.out.print("Mau input lagi [1/2]: ");lagi = masukan.nextInt();            
        }
    }

}
