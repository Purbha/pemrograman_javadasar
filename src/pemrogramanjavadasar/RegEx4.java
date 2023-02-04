/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pemrogramanjavadasar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author irsyad
 */
public class RegEx4 {
    public static void main(String args[]){
        String Angka1 = "123-45-6789";
        String Angka2 = "9876-5-4321";
        String Angka3 = "987-65-4321 (Cek)";
        String Angka4 = "987-65-4321";
        String Angka5 = "987-AB-4321";
        String Angka6 = "987-4321";
        String Angka7 = "987-43-211";
        /*
            Penjelasan Pola
            \d{3}-      --> Terdapat 3 angka didepan yg diikuti tanda "-"
            \d{2}-      --> Terdapat 2 angka yang diikuti tanda "-"
            \d{4})$     --> Harus terdapat 4 angka dibelakang
        */       
        String Pola = "^\\d{3}-\\d{2}-\\d{4}$";
        Pattern r;
        r = Pattern.compile(Pola);
        Matcher x;
        System.out.println("Pola RegEx: " + Pola);        
        System.out.println("Pencocokan Angka 1: " + Angka1);
        x = r.matcher(Angka1);
        if (x.find()){
            System.out.println("Angka 1 cocok");
        } else {
            System.out.println("Angka 1 tidak cocok");
        }
        System.out.println("Pencocokan Angka 2: " + Angka2);
        x = r.matcher(Angka2);
        if (x.find()){
            System.out.println("Angka 2 cocok");
        } else {
            System.out.println("Angka 2 tidak cocok");
        }
        System.out.println("Pencocokan Angka 3: " + Angka3);
        x = r.matcher(Angka3);
        if (x.find()){
            System.out.println("Angka 3 cocok");
        } else {
            System.out.println("Angka 3 tidak cocok");
        }
        System.out.println("Pencocokan Angka 4: " + Angka4);
        x = r.matcher(Angka4);
        if (x.find()){
            System.out.println("Angka 4 cocok");
        } else {
            System.out.println("Angka 4 tidak cocok");
        }
        System.out.println("Pencocokan Angka 5: " + Angka5);
        x = r.matcher(Angka5);
        if (x.find()){
            System.out.println("Angka 5 cocok");
        } else {
            System.out.println("Angka 5 tidak cocok");
        }
        System.out.println("Pencocokan Angka 6: " + Angka6);
        x = r.matcher(Angka6);
        if (x.find()){
            System.out.println("Angka 6 cocok");
        } else {
            System.out.println("Angka 6 tidak cocok");
        }
        System.out.println("Pencocokan Angka 7: " + Angka7);
        x = r.matcher(Angka7);
        if (x.find()){
            System.out.println("Angka 7 cocok");
        } else {
            System.out.println("Angka 7 tidak cocok");
        }
    }    
}
