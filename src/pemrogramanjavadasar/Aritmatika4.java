/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemrogramanjavadasar;
import java.util.Scanner;
/** @author Irsyad */
public class Aritmatika4 {
    public static void main(String[] args){
        int bil; int jml; int i;
        Scanner baca = new Scanner(System.in);
        System.out.print("Masukan bilangan bulat positif: ");
        bil = baca.nextInt(); jml = 0;
        for(i=1;i<=bil;i++){
            if (bil % i == 0) { jml++; }
        }
        if (jml == 2) { System.out.println("Bilangan Prima"); }             
        else { System.out.println("Bukan Bilangan Prima"); }       
    }
}
