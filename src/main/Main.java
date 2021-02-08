/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author GAMES
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pohon input  = new Pohon();
        
        
        input.cemara();
        input.kelapa();
        System.out.println("===========================================================================");
        System.out.println("Tinggi pohon cemara adalah "+input.tinggi1+"cm");
        System.out.println("Tinggi pohon kelapa adalah "+input.tinggi2+"cm");
        
        
    }
    
}
