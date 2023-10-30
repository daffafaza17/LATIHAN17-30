/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166032_lat26;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author fazad
 */
public class SI_RegPagi_22166032_Lat26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date tanggalWaktuSaatIni = new Date();
        SimpleDateFormat formatTanggalWaktu = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        String tanggalWaktuSaatIniString = formatTanggalWaktu.format(tanggalWaktuSaatIni);

        System.out.println("Tanggal dan waktu saat ini: " + tanggalWaktuSaatIniString);
    }
    
}
