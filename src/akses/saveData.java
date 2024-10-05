package akses;

import Hotel.Hotel;
import Hotel.Kamar;

import javax.lang.model.element.Name;

public class saveData implements save {
    String Jeniskamar;
    int JumlahTamu;
    int Umur;
    String Nama;
    String phone;
    int tamuSaatIni = 10;
    int age;



    public void daftar(String Jeniskamar, int JumlahTamu, int Umur, String Nama, String phone) {
        this.Jeniskamar = Jeniskamar;
        this.JumlahTamu = JumlahTamu;
        this.Umur = Umur;
        this.Nama = Nama;
        this.phone = phone;
        tamuSaatIni--;
        Kamar kamar = new Kamar(Jeniskamar, JumlahTamu, tamuSaatIni);
        Hotel hotel = new Hotel(this.age, this.Nama, this.phone);
        System.out.println("====== Data Kamar ======");
        kamar.getData();
        System.out.println("====== Data Hotel ======");
        hotel.getData();
    }

    public int getJumlahKamar() {
        return tamuSaatIni;
    }

    public void getdataCostumer() {
        if (tamuSaatIni == 10) {
            System.out.println("tidak ada yang menginap");
            return;
        }
        System.out.println("nama: "+ Nama);
        System.out.println("phone: "+ phone);
        System.out.println("jumlah: "+ age);
    }

}
