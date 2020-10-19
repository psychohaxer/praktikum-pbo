/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

/**
 * 201951071 | FIRMAN ADI NUR FATIN
 * @author SILVERWOLF
 */

public class Elektronik {
    String merk;
    String nama;
    String warna;
    
    public void setData(String a, String b, String c){
       merk = a;
       nama = b;
       warna = c;
    }
    
    public void tampilData(){
        System.out.println("Nama: " + nama);
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
    }
}
