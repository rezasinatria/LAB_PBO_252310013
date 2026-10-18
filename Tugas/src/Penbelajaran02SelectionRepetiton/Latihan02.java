package Penbelajaran02SelectionRepetiton;


import java.util.Scanner;

public class Latihan02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NPM: ");
        int npm = input.nextInt();

        if (npm > 1 && npm % 2 != 0 || npm == 2) {
            boolean prima = true;

            for (int i = 3; i * i <= npm; i += 2) {
                if (npm % i == 0) {
                    prima = false;
                    break;
                }
            }

            if (prima) {
                System.out.println("Termasuk bilangan PRIMA");
            } else {
                System.out.println("Bukan termasuk bilangan prima karena dapat dibagi dengan 2");
            }
        } else {
            System.out.println("Bukan termasuk bilangan prima karena dapat dibagi dengan 2");
        }

        input.close();
    }
}

