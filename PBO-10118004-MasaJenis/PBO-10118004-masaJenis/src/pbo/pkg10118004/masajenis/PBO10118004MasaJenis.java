/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg10118004.masajenis;

import java.util.Scanner;

/**
 *
 * @author ASUS A411UF
 */
public class PBO10118004MasaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner scn = new Scanner (System.in);
        kubus kbs = new kubus();
        
        System.out.println("========Massa Jenis Kubus========");
        System.out.print("Sisi : ");
        kbs.setSisi(scn.nextInt());
        System.out.print("Massa : ");
        kbs.setMassa(scn.nextInt());
        
        System.out.println("\n"+"========Hasil Perhitungan========");
        System.out.println("Volume : " + kbs.hitungVolume(kbs.getSisi()));
        System.out.println("Massa Jenis : " 
                + kbs.hitungMassaJenis(kbs.getMassa(), 
                        kbs.hitungVolume(kbs.getSisi())));
    }
    
}

    
    

