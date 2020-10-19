package kelas;

/**
 * 201951071 | FIRMAN ADI NUR FATIN
 * @author SILVERWOLF
 */

public class Sepatu {
    // Instance var
    String merk, model, warna;
    int ukuran;
    double harga;

    // Methods
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    public void setModel(String model){
        this.model = model;
    }
    
    public void setWarna(String warna){
        this.warna = warna;
    }
    
    public void setUkuran(int ukuran){
        this.ukuran = ukuran;
    }
    
    public void setHarga(double harga){
        this.harga = harga;
    }
    
    // Functions
    public String getMerk(){
        return this.merk;
    }
    
    public String getModel(){
        return this.model;
    }
    
    public String getWarna(){
        return this.warna;
    }
    
    public int getUkuran(){
        return this.ukuran;
    }
    
    public double getHarga(){
        return this.harga;
    }
}
