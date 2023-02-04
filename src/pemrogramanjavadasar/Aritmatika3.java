/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pemrogramanjavadasar;

/**
 *
 * @author irsyad
 */
public class Aritmatika3 {
    
    public static void main (String args[]){
        int a; int b; int c;
        a = 1; b = 1; c = 0;
        System.out.println("Nilai a adalah: " + a);
        System.out.println("Nilai b adalah: " + b);
        System.out.println("Nilai c adalah: " + c + "\n\n");

        System.out.println("          Metode AND");
        System.out.println("===============================");
        if (a==1 && b==1 && c==1){
            System.out.println("Nilai dari perbandingan adalah BENAR");
        } else {
            System.out.println("Nilai dari perbandingan adalah SALAH");            
        }
        System.out.print("\n");
        System.out.println("          Metode OR");
        System.out.println("===============================");
        if (a==1 || b==1 || c==1) {
            System.out.println("Nilai dari perbandingan adalah BENAR");
        } else {
            System.out.println("Nilai dari perbandingan adalah SALAH");            
        }
    }
        
}
