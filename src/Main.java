import akses.Admin;
import akses.Customer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Admin admin = new Admin();
        Customer customer = new Customer();

        System.out.println("pilih masuk");
        System.out.println("1. masuk sebagai admin");
        System.out.println("2. masuk pengguna ");
        System.out.print("pilih: ");
        int select = input.nextInt();
        input.nextLine();
        switch (select) {
            case 1:
                System.out.println("======Login======");
                System.out.print("masukan username: ");
                String Nama = input.nextLine();
                System.out.print("Masukkan password: ");
                String Password = input.nextLine();
                if (!Nama.equals("hemy") && !Password.equals("admin123")) {
                    System.out.println("Username atau password salah");
                    return;
                }
                System.out.println("berhasil masuk");
                admin.memilih();

                break;
            case 2:
                System.out.println("Masukkan pengguna ");
                customer.memilih();
                break;
            default:
                System.out.println("sytax error");
                break;
        }
    }

}