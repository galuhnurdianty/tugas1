/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author my computer
 */
public class MinumAksi {
    public static void main(String[] args) {
        Minum kemasan_besar = new Minum();
        Minum kemasan_sedang = new Minum();
        Minum kemasan_kecil = new Minum();
        
        kemasan_besar.botol="Galon";
        kemasan_besar.vAir="19L";
        kemasan_besar.rasa="Tawar";
        kemasan_besar.warna="Bening";
        kemasan_besar.harga="17000";
        
        kemasan_sedang.botol="Fanta";
        kemasan_sedang.vAir="5L";
        kemasan_sedang.rasa="Manis";
        kemasan_sedang.warna="Merah";
        kemasan_sedang.harga="15000";
        
        kemasan_kecil.botol="Susu Beruang";
        kemasan_kecil.vAir="250ml";
        kemasan_kecil.rasa="Manis";
        kemasan_kecil.warna="Putih";
        kemasan_kecil.harga="8000";
        
        kemasan_besar.cetakInfo();
        kemasan_sedang.cetakInfo();
        kemasan_kecil.cetakInfo();
    }
}
