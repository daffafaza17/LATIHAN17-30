/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166032_lat22;

import java.util.Scanner;

/**
 *
 * @author fazad
 */
public class SI_RegPagi_22166032_Lat22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=======Perhitungan lingkaran=======");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai diameter lingkaran : ");
        String diameterLingkaran = scanner.nextLine();
        
        try {
            int d = Integer.parseInt(diameterLingkaran);
            
            if(d <= 0) {
            System.out.println("Nilai Diameter Tidak Sesuai");
            
            } else {
                int jariJariLingkaran = d / 2;
                double luasLingkaran = Math.PI * jariJariLingkaran * jariJariLingkaran;
                double kelilingLingkaran = Math.PI * d;
        
                System.out.println("\n");
                System.out.println("=====Hasil Perhitungan Lingkaran=====");
                System.out.println("Jari-jari Lingkaran = " +jariJariLingkaran);
                System.out.println("Luas Lingkaran = "+luasLingkaran);
                System.out.println("Keliling Lingkaran = "+kelilingLingkaran);
            }
        } catch (NumberFormatException e) {
            System.out.println("Nilai Diameter Tidak Sesuai ");
        }

      }

}
