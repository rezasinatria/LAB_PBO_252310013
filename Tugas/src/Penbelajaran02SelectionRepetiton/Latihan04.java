package Penbelajaran02SelectionRepetiton;


import java.util.Scanner;

public class Latihan04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai factor (minimal 20): ");
        int factor = input.nextInt();

        if (factor < 20) {
            System.out.println("Nilai factor tidak boleh kurang dari 20.");
        } else {
            System.out.print("Masukkan NPM: ");
            long npm = input.nextLong();

            System.out.print("Faktor " + factor + " adalah ");

            if (npm % 2 == 0) {
                // NPM GENAP: Ascending
                for (int i = 1; i <= factor; i++) {
                    if (factor % i == 0) {
                        System.out.print(i);

                        if (i < factor) {
                            System.out.print(", ");
                        }
                    }
                }
            } else {
                // NPM GANJIL: Descending
                boolean pertama = true;

                for (int i = factor; i >= 1; i--) {
                    if (factor % i == 0) {
                        if (!pertama) {
                            System.out.print(", ");
                        }

                        System.out.print(i);
                        pertama = false;
                    }
                }
            }

            System.out.println();
        }

        input.close();
    }
}

