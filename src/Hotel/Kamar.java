package Hotel;

public class Kamar {
   public String Jeniskamar;
   public int JumlahTamu;
   public int KamarSaatIni = 10;

    public Kamar(String Jeniskamar, int JumlahTamu, int KamarSaatIni) {
        this.Jeniskamar = Jeniskamar;
        this.JumlahTamu = JumlahTamu;
        this.KamarSaatIni = KamarSaatIni;
    }

    public void getData() {
        System.out.println("jenis kamar: " + Jeniskamar);
        System.out.println("jumlah Tamu: " + JumlahTamu);
        System.out.println("jumlah kamar yang tersedia: " + KamarSaatIni);
    }
}
