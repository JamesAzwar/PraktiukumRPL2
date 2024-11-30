/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2_50421251;

/**
 *
 * @author ACER
 */
public class Pertemuan2_50421251 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Azwar", "50421251", 20);
        mahasiswa.tampilkanData();
        System.out.println();
        
        MahasiswaSarjana mahasiswaSarjana = new MahasiswaSarjana("Indah", "50421651", 20, "Informatika");
        mahasiswaSarjana.tampilkanData();
        System.out.println();
    }
    
}
