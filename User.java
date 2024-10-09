/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum_utspbo;

/**
 *
 * @author user
 */
public class User  {
    
    private String Nama;

public User(String Nama){
        this.Nama = Nama;
    }

public String getNama(){
    return Nama;
}

public void tampilkanInfo(){
    System.out.println("Nama : " + Nama);
    }
}
