/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum_utspbo;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class Kamar implements Hotel{
   private String No_Kamar;
   private String Tipe_Kamar;
   private boolean Tersedia;
   private String WaktuMasuk;
   private String Harga;
   private String WaktuKeluar;
    
    public Kamar(String No_Kamar, String Tipe_Kamar, String Harga){
        this.No_Kamar = No_Kamar;
        this.Tipe_Kamar = Tipe_Kamar;
        this.Tersedia = true;
        this.Harga = Harga;
    }

   

    public String getNo_Kamar(){
        return No_Kamar;
    }
    
    public boolean isTersedia(){
        return Tersedia;
    }
    
    public void setTersedia(boolean Tersedia){
        this.Tersedia = Tersedia;
    }
    
    public String getHarga(){
        return Harga;
    }
    
    public void tampilkanDetail(){
        System.out.println("Nomo Kamar : " + No_Kamar + "| Tipe : " + Tipe_Kamar + "Harga : " + Harga + "| Tersedia : " + (Tersedia ? "YA" : "Tidak "));
    }

    public void WaktuMasuk() {
    }

    public void WaktuKeluar() {
    }
}
