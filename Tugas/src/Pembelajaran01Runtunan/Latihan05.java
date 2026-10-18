package Pembelajaran01Runtunan;


import java.util.Scanner;

public class Latihan05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Usia: ");
        int usia = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan Firstname: ");
        String firstname = input.nextLine();

        System.out.print("Masukkan Lastname: ");
        String lastname = input.nextLine();

        System.out.print("Masukkan NPM: ");
        String npm = input.nextLine();

        // CONCAT (penggabungan variabel)
        String hasil = usia + firstname + lastname + npm;

        System.out.println("Hasil CONCAT: " + hasil);

        input.close();
    }
}

