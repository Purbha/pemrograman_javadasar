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
public class String1 {
    public static void main(String args[]){   
        //Judul
        System.out.println("Contoh Input Output String");
        System.out.print("+++++++++++++++++++++++++++\n");       
        
        //Deklarasi Variable
        String nama_belakang;
        String nama_lengkap;
        String nama_depan;
        
        Scanner masukan;
        masukan = new Scanner(System.in);
        
        //Input
        System.out.print("Masukan sebuah nama depan\t: ");
        nama_depan = masukan.nextLine();
        System.out.print("Masukan sebuah nama belakang\t: ");
        nama_belakang = masukan.next();
        nama_lengkap = nama_depan + ' ' + nama_belakang;
        System.out.println("Nama lengkap anda adalah: " + nama_lengkap); 
        
    }    
}
