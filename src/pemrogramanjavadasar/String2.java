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
public class String2 {
    public static void main(String args[]){    
        int i;
        char[] Band_Array = {'M','U','S','E'};
        String Band = new String(Band_Array);  
        System.out.print("Nama band adalah ");
        System.out.println(Band);
        System.out.println("Terdiri dari:");
        for(i=0;i<4;i++) {
            System.out.println(Band_Array[i]);
        }
    }
}
