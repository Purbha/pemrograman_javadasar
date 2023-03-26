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
public class RegEx5 {
    /*
    Susunan regex di atur pada fungsi Pattern yaitu
        ^[a-zA-Z0-9_.]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$
    dengan penjelasan:
    - Aturan pertama adalah tanda ^ yaitu tanda pembuka
    - aturan kedua adalah [a-zA-Z0-9_.] merupakan aturan nama email yang bisa
        dituliskan mulai a-z dengan huruf kecil ataupun kapital serta angka 0-9
        dan juga bisa dituliskan dengan menggabungkan karakter "_" dan karakter
        titik "."
    - aturan ketiga adalah karakter "@" merupakan aturan utama dari penulisan
        email, sehingga setelah penulisan nama email harus diikuti oleh karakter "@"
    - aturan keempat adalah [a-zA-Z0-9] merupakan nama provider yang dapat
        dituliskan mulai a-z dengan huruf kecil ataupun huruf kapital serta angka 0-9
    - aturan kelima adalah tanda titik "." yang merupakan tanda setelah nama
        provider yang dituliskan sebelum aturan keenam.
    - aturan keenam adalah [a-zA-Z0-9] merupakan aturan untuk penulisan
        akhiran dari provider, biasanya .com, .net dan lain-lain.
    - aturan ketujuh adalah karakter "$" adalah tanda penutup dari aturan regex
        pada java.
*/
    public static void main(String args[]){
        String Email1 = "irsyadpurbha@gmail.com";
        System.out.println("Email adalah: " + Email1);
        Pattern POLA = Pattern.compile("^[A-Za-z0-9_.]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        Matcher Cocok = POLA.matcher(Email1);
        if(Cocok.find()) {
            System.out.println("Komposisi email benar.");
        } else {
            System.out.println("Komposisi email salah");
        }
        /*
        int i = 0;
        while (Cocok.find()){
            //System.out.println(Cocok.start());
            i = Cocok.start() + 1;
        }
        if (i==0) { System.out.println("Komposisi email salah"); }
        else { System.out.println("Komposisi email benar."); }     
        */
    }
}
