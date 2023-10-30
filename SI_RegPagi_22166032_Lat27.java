/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166032_lat27;

import java.util.Scanner;

/**
 *
 * @author fazad
 */
public class SI_RegPagi_22166032_Lat27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Formatting Kalimat");

        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();

        String kalimatHurufBesar = kalimat.toUpperCase();
        String kalimatHurufKecil = kalimat.toLowerCase();

        System.out.println("==HASIL FORMATTING==");
        System.out.println("Huruf Besar : " + kalimatHurufBesar);
        System.out.println("Huruf Kecil : " + kalimatHurufKecil);
    }
    
}

