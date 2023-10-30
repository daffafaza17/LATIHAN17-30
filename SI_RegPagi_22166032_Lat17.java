/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166032_lat17;

import java.util.Scanner;

/**
 *
 *Nama      : Faza Daffa Haidar
 *Nim       : 22166032
 *Prodi     : Sistem Informasi
 *Deskripsi : Gaji Pokok
 * 
 */
public class SI_RegPagi_22166032_Lat17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int gajipokok;
        String status;
        double tunjangan;
        
        System.out.println("======Program Tunjangan======");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Berapa gaji pokok anda perbulan? :");
        gajipokok = scanner.nextInt();
        System.out.print("Status Anda? (menikah/belum) :");
        status = scanner.next();
        System.out.println("==============================");
               
        if (status.equalsIgnoreCase("Menikah")) {
            tunjangan = gajipokok * 0.35;
        } else 
            tunjangan = 0;

        System.out.println("\n");
        System.out.println("======Hasil Perhitungan Gaji Anda======");
        System.out.println("Gaji Pokok: Rp " + gajipokok);
        System.out.println("Tunjangan: Rp " + tunjangan);
        System.out.println("Total Gaji: Rp " + (gajipokok + tunjangan));
        System.out.println("(Developed by : Bintang Fajar Nusantara)");
        
    }
    
}
    