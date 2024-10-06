import akses.Admin;
import akses.Customer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Admin admin = new Admin();
        Customer customer = new Customer();

        System.out.println("Pilih Opsi");
        System.out.println("1. Masuk Sebagai Admin");
        System.out.println("2. Masuk Pengguna ");
        System.out.print("Pilih: ");
        int select = input.nextInt();
        input.nextLine();
        switch (select) {
            case 1:
                System.out.println("======Login======");
                System.out.print("Masukan Username: ");
                String Nama = input.nextLine();
                System.out.print("Masukkan Password: ");
                String Password = input.nextLine();
                if (!Nama.equals("Helmyadmin") || !Password.equals("admin123")) {
                    System.out.println("Username/Password salah!");
                    return;
                }
                System.out.println("Berhasil Masuk!");
                admin.memilih();

                break;
            case 2:
                System.out.println("Masukkan Pengguna ");
                customer.memilih();
                break;
            default:
                System.out.println("syntax error");
                break;
        }
    }

}
