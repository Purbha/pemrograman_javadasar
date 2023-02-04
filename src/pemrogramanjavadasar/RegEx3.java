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
public class RegEx3 {
        public static void main(String args[]){
        String Telp1 = "081211683690";
        String Telp2 = "08561939419";
        System.out.println("Program Pemcarian Nomor Simpati");
        System.out.println("Telp 1: "+ Telp1);
        System.out.println("Telp 2: "+ Telp2);
        String Pola = "^0812";
        Pattern r;
        r = Pattern.compile(Pola);
        Matcher x;
        System.out.println("Pencocokan Telp 1");
        x = r.matcher(Telp1);
        if (x.find()){
            System.out.println("Nomor telp cocok");
        } else {
            System.out.println("Nomor telp tidak cocok");            
        }
        System.out.println("Pencocokan Telp 2");
        x = r.matcher(Telp2);
        if (x.find()){
            System.out.println("Nomor telp cocok");
        } else {
            System.out.println("Nomor telp tidak cocok");            
        }
    }
}
