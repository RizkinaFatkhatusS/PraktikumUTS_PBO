/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum_utspbo;

/**
 *
 * @author user
 */
public class Costumer extends User {
    private Kamar kamar;
    private String tanggalMasuk;
    private String tanggalkluar;
    private String tanggalKeluar;
    private String Harga;
    
    public Costumer(String Nama) {
        super(Nama);
    }
    
    
    public void Pemesanan(Kamar kamar, String tanggalMasuk, String tanggalKelua, String Harga){
        this.kamar = kamar;
        this.tanggalMasuk = tanggalMasuk;
        this.tanggalkluar = tanggalKeluar;
        this.Harga = Harga;
    }
    
    public void tampilkanPemesanan(){
        System.out.println("============================================================================================================");
        System.out.println("Kamar : " + kamar.getNo_Kamar() + ", Tanggal Masuk : " + tanggalMasuk + ", Tanggal Keluar : " + tanggalKeluar + "Harga : " + Harga);
        System.out.println("============================================================================================================");
    }
    
    public void pesanKamar(Kamar kamar, String tanggalMasuk, String tanggalKeluar, String Harga) {
        if (kamar.isTersedia()) {
            kamar.setTersedia(false);
            System.out.println("=========================================================================================================================");
            System.out.println("                                         Informasi Pemesanan Costemer                                                    ");
            System.out.println("=========================================================================================================================");
            System.out.println("Kamar " + kamar.getNo_Kamar() + " telah dipesan oleh " + getNama() + " dari " + tanggalMasuk + " sampai " + tanggalKeluar + "Harga : " + Harga );
            System.out.println("=========================================================================================================================");
        } else {
            System.out.println("kamar Tidak Tersedia.");
        }
    }
}
