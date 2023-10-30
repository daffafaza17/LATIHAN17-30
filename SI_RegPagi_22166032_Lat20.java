/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166032_lat20;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 *Nama      : Faza Daffa Haidar
 *Nim       : 22166032
 *Prodi     : Sistem Informasi
 *Deskripsi : Kelipatan
 */
public class SI_RegPagi_22166032_Lat20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("========Program Target Tabungan========");
        // Saldo Awal
        double saldoAwal = 3500000;
        // Bunga per Bulan (dalam persen)
        double BungaPerBulan = 8.0;
        // Lama (bulan)
        double saldoTarget = 6000000;
        
         // Format saldo awal sebagai mata uang
        DecimalFormat df = new DecimalFormat("#,###,###");

        // Hitung saldo per bulan
        int bulan = 0;
        while (saldoAwal < saldoTarget) {
            double bunga = saldoAwal * (BungaPerBulan / 100);
            saldoAwal += bunga;
            bulan++;
        // Format saldo per bulan sebagai mata uang
        String saldoBulanFormatted = df.format(saldoAwal);
        System.out.println("Saldo di Bulan ke- " + bulan + ": Rp. " + saldoBulanFormatted);
        
        }
        }
}
