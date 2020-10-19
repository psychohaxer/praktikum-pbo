package antarmuka;

import kelas.Sepatu;

/**
 * 201951071 | FIRMAN ADI NUR FATIN
 * @author SILVERWOLF
 */

public class Main {
    public static void main(String args[]){
        Sepatu nike = new Sepatu();
        
        nike.setMerk("Nike");
        nike.setModel("Nike 123");
        nike.setWarna("Putih");
        nike.setUkuran(40);
        nike.setHarga(230000);
        
        System.out.println("Merk " + nike.getMerk());
        System.out.println("Model " + nike.getModel());
        System.out.println("Warna " + nike.getWarna());
        System.out.println("Ukuran " + nike.getUkuran());
        System.out.println("Harga " + nike.getHarga());
    }
}
