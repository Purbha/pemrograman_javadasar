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
public class Array2 {
    public static void main (String args[]) {
        
        Scanner Masukan = new Scanner(System.in);        
        System.out.println("Masukan Bilangan Integer");
        int i; int Bil[]; Bil = new int[5];
        //Looping
        for (i=0;i<=4;i++) {
            System.out.printf("Masukan bilangan ke-%d: ", i);
            Bil[i] = Masukan.nextInt();
        }
        System.out.println("     \nInput Data Berhasil");
        System.out.println("=================================");
        for (i=0;i<=4;i++) {
            System.out.printf("Bilangan ke-%d adalah: %d%n",i,Bil[i]);
        }
    }  
    
}
