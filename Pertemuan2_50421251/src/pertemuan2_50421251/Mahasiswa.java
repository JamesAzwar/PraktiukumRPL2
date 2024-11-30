/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2_50421251;

/**
 *
 * @author ACER
 */
public class Mahasiswa {
    private String nama;
    private String npm;
    private int umur;
    
     public Mahasiswa(String nama, String npm, int umur){
        this.nama = nama;
        this.npm = npm;
        this.umur = umur;
    }

    
    public void tampilkanData() {
        System.out.println ("Nama: " + nama);
        System.out.println ("NPM: " + npm);
        System.out.println ("Umur: " + umur);
    }
}
