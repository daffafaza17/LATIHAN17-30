/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166032_lat19;

import java.util.Scanner;

/**
 *
 *Nama      : Faza Daffa Haidar
 *Nim       : 22166032
 *Prodi     : Sistem Informasi
 *Deskripsi : Kelipatan
 */
public class SI_RegPagi_22166032_Lat19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Saldo Awal: ");
        int saldoAwal = scanner.nextInt();

        System.out.print("Bunga/Bulan (%): ");
        int bungaPerBulan = scanner.nextInt();

        System.out.print("Lama (bulan): ");
        int lama = scanner.nextInt();

        // Hitung saldo
        for (int i = 1; i <= lama; i++) {
            saldoAwal += saldoAwal * bungaPerBulan / 100;
            System.out.println("Saldo di bulan ke-" + i + " Rp." + saldoAwal);
 }
}

}

