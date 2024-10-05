package akses;

import java.util.Scanner;

public class Admin extends Customer {
    Scanner input = new Scanner(System.in);
    saveData sv = new saveData();
    public void memilih() {
        System.out.println("pilih");
        System.out.println("1. cek kamar yang tersedia");
        System.out.println("2. melihat data customer");
        System.out.println("3. daftar kamar");
        int pilih = input.nextInt();
        input.nextLine();
        switch (pilih) {
            case 1:
                System.out.print("lihat kamar yang tersedia");
                sv.getJumlahKamar();
                break;
            case 2:
                System.out.print("lihat data customer");
                sv.getdataCostumer();
                break;
            case 3:
                System.out.print("Masukkan daftar");
                daftar();
                break;
            default:
                System.out.print("syntax error");
        }
    }


}
