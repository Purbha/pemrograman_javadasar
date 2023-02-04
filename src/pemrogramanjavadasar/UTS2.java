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
public class UTS2 {
    public void Garis(){
        System.out.println("==============================");
    }
    
    public void Judul(){
        Garis();
        System.out.println("     Program Aritmatika");
        Garis();      
        System.out.println("1. Menghitung Lingkaran");
        System.out.println("2. Menghitung Segitiga");
        System.out.println("3. Menghitung Persegi Panjang");
        Garis();      
    }
    
    public void Lingkaran(){
        Garis();
        Scanner Input = new Scanner(System.in);
        int jari; double Luas; double Kell;
        System.out.print("Masukan panjang jari2: ");jari = Input.nextInt();
        Luas = Math.PI * jari * jari;
        Kell = (2 * jari) * Math.PI;
        System.out.printf("Luas lingkarang adalah: %.2f\n",Luas);
        System.out.printf("Keliling lingkarang adalah: %.2f\n",Kell);
        Garis();
    }
    
    public void Segitiga(){
        Garis();
        Scanner Input = new Scanner(System.in);
        int alas; int tinggi; double luas;
        System.out.print("Masukan alas: ");alas = Input.nextInt();
        System.out.print("Masukan tinggi: ");tinggi = Input.nextInt();
        luas = (alas * tinggi) / 2;
        System.out.printf("Luas segitiga adalah: %.2f\n",luas);
        Garis();
    }
    
    public void Persegi(){
        Garis();
        Scanner Input = new Scanner(System.in);
        int Panjang; int Lebar; int Luas; int Kell;
        System.out.print("Masukan panjang persegi: ");Panjang = Input.nextInt();
        System.out.print("Masukan lebar persegi: ");Lebar = Input.nextInt();
        Luas = Panjang * Lebar;
        Kell = (2 * Panjang) + (2 * Lebar);
        System.out.println("Luas persegi adalah: " + Luas);        
        System.out.println("Keliling persegi adalah: " + Kell);        
        Garis();
    }
    
    public static void main(String args[]){
        UTS2 objek = new UTS2();
        objek.Judul();
        int Kode;
        String lagi="Y";
        Scanner Input = new Scanner(System.in);
        while("Y".equals(lagi) || "y".equals(lagi)){
            System.out.print("Masukan kode [1/2/3]: ");Kode = Input.nextInt();
            if(Kode == 1){
                objek.Lingkaran();
            } else if (Kode == 2){
                objek.Segitiga();
            } else {
                objek.Persegi();
            }
            System.out.print("Anda ingin input lagi? ");lagi = Input.next();
        }
    }    
}
