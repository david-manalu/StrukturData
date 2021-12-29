package Akun;

import java.util.Scanner;

public class UjiAkun {
    public static void main(String[] args) {
//        Menampilkan saldo awal
        Akun akun1 = new Akun(50.00);
        Akun akun2 = new Akun(-7.53);
        
        System.out.println("Saldo akun1: Rp. " + akun1.getSaldo());
        System.out.println("Saldo akun2: Rp. " + akun2.getSaldo());
        
        Scanner in = new Scanner(System.in);
        
        double jumlahTabungan;
        
//        Input saldo akun1
        System.out.println("\nMasukkan jumlah tabungan untuk akun1 : ");
        jumlahTabungan = in.nextDouble();
        
        System.out.println("Menambahkan " + jumlahTabungan + " kepada saldo akun1\n\n");
        akun1.kredit(jumlahTabungan);
        
        //menampilkan saldo
        System.out.println("saldo akun1: Rp. " + akun1.getSaldo());
        System.out.println("saldo akun2: Rp. " + akun2.getSaldo());
        
//        Input saldo akun2
        System.out.println("Masukkan jumlah tabungan untuk akun2 : ");
        jumlahTabungan = in.nextDouble();
        
        System.out.println("Menambahkan " + jumlahTabungan + " kepada saldo akun2\n\n");
        akun2.kredit(jumlahTabungan);
        
//        menampilkan saldo
        System.out.println("saldo akun1: Rp. " + akun1.getSaldo());
        System.out.println("saldo akun2: Rp. " + akun2.getSaldo());
    }
}
