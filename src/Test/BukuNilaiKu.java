package Test;

import java.util.Scanner;

public class BukuNilaiKu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BukuNilai BukuNilaiKu = new BukuNilai();
        System.out.print("Silahkan masukkan nama mata kuliah : ");
        String namaMataKuliah = in.nextLine();
        BukuNilaiKu.tampilPesan();
    }
}
