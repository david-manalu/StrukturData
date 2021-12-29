package Test;

//import java.util.Scanner;

public class UjiBukuNilai {
    public static void main(String[] args) {
        BukuNilai bukuNilai1 = new BukuNilai("Selamat datang Pemrograman Java Lanjut");
        BukuNilai bukuNilai2 = new BukuNilai("Selamat Datang Struktur Data");
        
        System.out.println("Nama mata kuliah BukuNilai1 adalah " + bukuNilai1.getNamaMataKuliah());
        System.out.println("Nama mata kuliah BukuNilai2 adalah " + bukuNilai2.getNamaMataKuliah());
        
    }
}
