/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Melly Dwiliani
 */
import java.util.Scanner;

public class BukaTutupJalan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan plat nomor 4 mobil (dipisahkan spasi):");
        String input = scan.nextLine();

        String[] platMobil = input.split(" ");
        StringBuilder gabunganPlat = new StringBuilder();
        for (String plat : platMobil) {
            gabunganPlat.append(plat);
        }

        long angkaGabungan = Long.parseLong(gabunganPlat.toString());

        long hasilKurang = angkaGabungan - 999999;

        if (hasilKurang % 5 == 0) {
            System.out.println("Berhenti");
        } else {
            System.out.println("Jalan");
        }

        scan.close();
    }
}
