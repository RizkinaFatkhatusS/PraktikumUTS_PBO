/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum_utspbo;

/**
 *
 * @author user
 */
public class Admin {
    
    public void KelolaKamar(Kamar kamar, boolean Tersedia){
        kamar.setTersedia(Tersedia);
        System.out.println("Status Tersedia Kamar " + kamar.getNo_Kamar() + "Sudah Diperbaharui.");
    }
}
