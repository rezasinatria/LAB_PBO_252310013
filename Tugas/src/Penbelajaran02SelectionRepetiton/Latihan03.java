package Penbelajaran02SelectionRepetiton;


import java.util.Scanner;

public class Latihan03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== DAFTAR MENU MAKANAN =====");
        System.out.println("1. Nasi Goreng  : Rp 22.000,-");
        System.out.println("2. Bubur Ayam   : Rp 15.000,-");
        System.out.println("3. Soto Ayam    : Rp 25.000,-");
        System.out.println("==============================");

        System.out.print("Masukkan pilihan menu: ");
        int pilihan = input.nextInt();

        System.out.println("\n===== PESANAN ANDA =====");

        switch (pilihan) {
            case 1:
                System.out.println("Anda memesan Nasi Goreng dengan harga Rp 22.000,-");
                break;
            case 2:
                System.out.println("Anda memesan Bubur Ayam dengan harga Rp15.000,-");
                break;
            case 3:
                System.out.println("Anda memesan Soto Ayam dengan harga Rp 25.000,-");
                break;
            default:
                System.out.println("Maaf menu yang anda masukan salah.");
        }

        input.close();
    }
}

