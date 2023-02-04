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
public class RegEx1 {
    public static void main(String args[]){
        //Mendefinisikan Variable
        String Nama  = "Irsyad Purbha";

        //Mencocokan Nilai
        boolean Nilai1 = Nama.matches("Irsyad Purbha");
        boolean Nilai2 = Nama.matches("Irsyad Irwansyah");

        //Menampilkan Hasil
        System.out.println("Hasil Pertama : " + Nilai1);
        System.out.println("Hasil Kedua : " + Nilai2);
    }
}
