/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum_utspbo;
/**
 *
 * @author user
 */

import java.util.Scanner;

public class ResefasiHotelMain {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Kamar kamar1 = new Kamar("01", "Regular","Rp.150.000");
        Kamar kamar2 = new Kamar("02", "Deluxe", "Rp.500.000" );
        Kamar kamar3 = new Kamar("03", "VIP", "Rp.1.000.00");
        Kamar kamar4 = new Kamar ("04", "VVIP", "Rp.1.200.00");
        
        System.out.println("=================================================");
        System.out.println("       Selamat Datang Di Hotel Azzure            ");
        System.out.println("=================================================");
        System.out.println(" 1. Admin                                        ");
        System.out.println(" 2. Costumer                                     ");
        System.out.println("=================================================");
        System.out.println("Pili Sebagai : ");
        int sebagai = scanner.nextInt();
        scanner.nextLine();
        
        if (sebagai == 1) {
            Admin admin = new Admin();
            System.out.println("=============================================");
            System.out.println("                 Menu Admin                  ");
            System.out.println("=============================================");
            System.out.println("Kelola Kamar ");
            System.out.println("Kamar yang tersedia: ");
            System.out.println("=============================================");
            System.out.println("| No Kamar  | Tipe Kamar  | Harga | Tersedia |");             
            System.out.println("=============================================");
            kamar1.tampilkanDetail();
            kamar2.tampilkanDetail();
            kamar3.tampilkanDetail();
            kamar4.tampilkanDetail();
            System.out.println("=============================================");
            

            System.out.println("Pilih nomor kamar untuk diubah statusnya:    ");
            System.out.println("=============================================");
            String nomorKamar = scanner.nextLine();
              
            Kamar kamar = null;
            switch (nomorKamar) {
                case "01":
                    kamar = kamar1;
                    break;
                case "02":
                    kamar = kamar2;
                    break;
                case "03":
                    kamar = kamar3;
                    break;
                case "04":
                    kamar = kamar4;
                    break; 
                default:
                    System.out.println("Kamar idak Ditemukan.");
                    return;
            }
        
            System.out.println("Ubah status ketersediaan (true/false):       ");
            boolean tersedia = scanner.nextBoolean();
            admin.KelolaKamar(kamar, tersedia);
            System.out.println("=============================================");

        } else if (sebagai == 2) {
            System.out.println("=============================================");
            System.out.println("Masukkan Nama: ");
            String namaCostumer = scanner.nextLine();
            System.out.println("=============================================");
            
            Costumer costumer = new Costumer(namaCostumer);
            System.out.println("=============================================");
            System.out.println("                Menu Costumer                ");
            System.out.println("=============================================");
            System.out.println(" 1. Memesan kamar                            ");
            System.out.println(" 2. Mengecek ketersediaan kamar              ");
            System.out.println("=============================================");
            System.out.println("Pilih Menu : \n");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan == 1) {
                System.out.println("=========================================");
                System.out.println("Pilih kamar yang tersedia:             \n");
                System.out.println("=========================================");
                System.out.println("=========================================");
                System.out.println("=============================================");
                System.out.println("| No Kamar  | Tipe Kamar  | Harga | Tersedia |);             ");
                System.out.println("=============================================");
                kamar1.tampilkanDetail();
                kamar2.tampilkanDetail();
                kamar3.tampilkanDetail();
                kamar4.tampilkanDetail();
                
                System.out.println("Masukkan Nomor kamar yang ingin dipesan: ");
                String nomorKamar = scanner.nextLine();
                System.out.println("=========================================");
                System.out.println("=========================================");
                System.out.println("Masukkan tanggal masuk (YY-MM-DD):       ");
                String tanggalMasuk = scanner.nextLine();
                System.out.println("Masukkan tanggal keluar (YY-MM-DD):      ");
                String tanggalKeluar = scanner.nextLine();
                System.out.println("=========================================");
                
                switch (nomorKamar) {
                    case "01":
                        String harga1 = kamar1.getHarga();
                        costumer.pesanKamar(kamar1, tanggalMasuk, tanggalKeluar, harga1);
                        break;
                    case "02":
                        String harga2 = kamar2.getHarga();
                        costumer.pesanKamar(kamar2, tanggalMasuk, tanggalKeluar, harga2);
                        break;
                    case "03":
                        String harga3 = kamar3.getHarga();
                        costumer.pesanKamar(kamar3, tanggalMasuk, tanggalKeluar, harga3);
                        break;
                    case "04":
                        String harga4 = kamar4.getHarga();
                        costumer.pesanKamar(kamar4, tanggalMasuk, tanggalKeluar, harga4);
                        break;
                    default:
                        System.out.println("Kamar tidak ditemukan.");
                        break;
                }

            } else if (pilihan == 2) {
                System.out.println("=========================================");
                System.out.println("           Ketersediaan kamar:           ");
                System.out.println("=========================================");
                System.out.println("=========================================");
                System.out.println("| No Kamar  | Tipe Kamar  | Harga | Tersedia |");
                System.out.println("=============================================");
                kamar1.tampilkanDetail();
                kamar2.tampilkanDetail();
                kamar3.tampilkanDetail();
                kamar4.tampilkanDetail();
                System.out.println("=========================================");
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
  }

}