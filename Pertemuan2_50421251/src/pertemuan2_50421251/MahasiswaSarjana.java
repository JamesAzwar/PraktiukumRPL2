/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2_50421251;

/**
 *
 * @author ACER
 */
public class MahasiswaSarjana extends Mahasiswa {
    private String jurusan;
    
    public MahasiswaSarjana (String nama, String npm, int umur, String jurusan){
         super(nama, npm, umur);
        this.jurusan = jurusan;
    }
    
    @Override
    public void tampilkanData(){
        super.tampilkanData();
        System.out.println("Jurusan: " + jurusan);
    }

}
