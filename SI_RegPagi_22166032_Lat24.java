/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166032_lat24;

import java.util.Scanner;

/**
 *
 * @author fazad
 */
public class SI_RegPagi_22166032_Lat24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Program Perbandingan Dua Buah Nilai");

        System.out.print("Masukkan nilai pertama: ");
        int nilaiPertama = scanner.nextInt();

        System.out.print("Masukkan nilai kedua: ");
        int nilaiKedua = scanner.nextInt();

        if (nilaiPertama > nilaiKedua) {
            System.out.print("Nilai pertama lebih besar dari nilai kedua");
        } else if (nilaiPertama < nilaiKedua) {
            System.out.print("Nilai pertama lebih kecil dari nilai kedua");
        } else {
            System.out.print("Nilai pertama sama dengan nilai kedua");
        }

        System.out.println("Ulangi Aktifitas? (Ya/Tidak) :");
        String pilihan = scanner.next();

        while (pilihan.equalsIgnoreCase("Ya")) {
            System.out.print("Masukkan nilai pertama: ");
            nilaiPertama = scanner.nextInt();

            System.out.print("Masukkan nilai kedua: ");
            nilaiKedua = scanner.nextInt();

            if (nilaiPertama > nilaiKedua) {
                System.out.println("Nilai pertama lebih besar dari nilai kedua");
            } else if (nilaiPertama < nilaiKedua) {
                System.out.println("Nilai pertama lebih kecil dari nilai kedua");
            } else {
                System.out.println("Nilai pertama sama dengan nilai kedua");
            }

            System.out.print("Ulangi Aktifitas? (Ya/Tidak) :");
            pilihan = scanner.next();
        }
        while (pilihan.equalsIgnoreCase("Ya")) {
            System.out.print("Masukkan nilai pertama: ");
            nilaiPertama = scanner.nextInt();

            System.out.print("Masukkan nilai kedua: ");
            nilaiKedua = scanner.nextInt();

            if (nilaiPertama > nilaiKedua) {
                System.out.print("Nilai pertama lebih besar dari nilai kedua");
            } else if (nilaiPertama < nilaiKedua) {
                System.out.print("Nilai pertama lebih kecil dari nilai kedua");
            } else {
                System.out.print("Nilai pertama sama dengan nilai kedua");
            }

            System.out.print("Ulangi Aktifitas? (Ya/Tidak) :");
            pilihan = scanner.next();
        }
    }
}
