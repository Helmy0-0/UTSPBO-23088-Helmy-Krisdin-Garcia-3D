package akses;

import Hotel.Kamar;
import Hotel.Hotel;

import java.util.Scanner;

public class Customer {
    Scanner input = new Scanner(System.in);
    int ketersediankamar;
    saveData sv = new saveData();

    public void memilih() {
        System.out.println("===========================");
        System.out.println("1. cek kamar yang tersedia");
        System.out.println("2. daftar kamar");
        System.out.print("pilih opsi: ");
        int pilih = input.nextInt();
        input.nextLine();
        switch (pilih) {
            case 1:
                System.out.println("cek kamar yang tersedia");
                System.out.println("kamar yang tersedia: " + sv.getJumlahKamar());
                break;
            case 2:
                daftar();
                break;
            default:
                System.out.println("Syntax eror");
                break;
        }
    }

    public void daftar() {

        System.out.println("======== daftar =======");
        System.out.print("Masukkan jenis kamar: ");
        String Jeniskamar = input.nextLine();
        System.out.print("masukam Jumlah tamu: ");
        int JumlahTamu = input.nextInt();
        input.nextLine();
        System.out.println("=======================");
        System.out.print("Nama: ");
        String Nama = input.nextLine();
        System.out.print("umur: ");
        int Umur = input.nextInt();
        input.nextLine();
        System.out.print("phone: ");
        String phone = input.nextLine();
        System.out.println("=======================");

        input.close();
        sv.daftar(Jeniskamar, JumlahTamu, Umur, Nama, phone );

    }

}
