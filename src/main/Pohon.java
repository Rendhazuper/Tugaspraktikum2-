/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.*;
/**
 *
 * @author GAMES
 */
public class Pohon {
    Scanner input = new Scanner(System.in);
    
    int tinggi1, tinggi2;
    
    
    void cemara(){
        System.out.println("Pohon Cemara");
        System.out.print("Masukan tinggi Pohon Cemara (satuan cm):");
        tinggi1 = input.nextInt();
        
    }
            
     void kelapa(){
         System.out.println("Pohon Kelapa");
         System.out.print("Masukan tinggi Pohon Kelapa  (satuan cm): ");
         tinggi2 = input.nextInt();
         
         
     }  
    
}
