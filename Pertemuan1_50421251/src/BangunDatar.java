import java.util.Scanner;

public class BangunDatar {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Pilih Bangun Datar:");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Lingkaran");
            System.out.print("Masukkan pilihan (1/2/3): ");
            int pilihan = scanner.nextInt();
            
            switch (pilihan) {
                case 1 -> {
                    // Menghitung Persegi
                    System.out.print("Masukkan panjang sisi persegi: ");
                    double sisi = scanner.nextDouble();
                    double kelilingPersegi = 4 * sisi;
                    double luasPersegi = sisi * sisi;
                    System.out.println("Keliling Persegi: " + kelilingPersegi);
                    System.out.println("Luas Persegi: " + luasPersegi);
                }
                    
                case 2 -> {
                    // Menghitung Persegi Panjang
                    System.out.print("Masukkan panjang: ");
                    double panjang = scanner.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    double lebar = scanner.nextDouble();
                    double kelilingPersegiPanjang = 2 * (panjang + lebar);
                    double luasPersegiPanjang = panjang * lebar;
                    System.out.println("Keliling Persegi Panjang: " + kelilingPersegiPanjang);
                    System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang);
                }
                    
                case 3 -> {
                    // Menghitung Lingkaran
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    double jariJari = scanner.nextDouble();
                    double kelilingLingkaran = 2 * Math.PI * jariJari;
                    double luasLingkaran = Math.PI * jariJari * jariJari;
                    System.out.println("Keliling Lingkaran: " + kelilingLingkaran);
                    System.out.println("Luas Lingkaran: " + luasLingkaran);
                }
                    
                default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
