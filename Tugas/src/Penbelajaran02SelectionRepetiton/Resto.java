package Penbelajaran02SelectionRepetiton;


import java.util.Scanner;

public class Resto {
    private long Harga;
    private int pilihan;
    private Scanner input = new Scanner(System.in);

    public void chooseMenu() {
        System.out.println("\n===== DAFTAR MENU MAKANAN =====");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Bubur Ayam");
        System.out.println("3. Soto Ayam");
        System.out.print("Masukkan pilihan menu: ");

        pilihan = input.nextInt();

        long harga = getPrices();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memesan Nasi Goreng dengan harga Rp "
                        + String.format("%,d", harga).replace(',', '.') + ",-");
                break;
            case 2:
                System.out.println("Anda memesan Bubur Ayam dengan harga Rp "
                        + String.format("%,d", harga).replace(',', '.') + ",-");
                break;
            case 3:
                System.out.println("Anda memesan Soto Ayam dengan harga Rp "
                        + String.format("%,d", harga).replace(',', '.') + ",-");
                break;
            default:
                System.out.println("Maaf menu yang anda masukan salah.");
        }
    }

    private Long getPrices() {
        if (pilihan == 1) {
            Harga = 22000;
        } else if (pilihan == 2) {
            Harga = 15000;
        } else if (pilihan == 3) {
            Harga = 25000;
        } else {
            Harga = 0;
        }

        return Harga;
    }
}
