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

public class Lampu extends Elektronik {
    public static void main(String[] args){
        Elektronik Lampuku = new Elektronik();
        
        Lampuku.setData("Philips","Lampu","Putih");
        Lampuku.tampilData();
    }
}
