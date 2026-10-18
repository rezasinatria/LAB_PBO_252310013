package Penbelajaran02SelectionRepetiton;


import java.util.Scanner;

public class Latihan05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of row: ");
        int baris = input.nextInt();

        int i = 0;

        while (i < baris) {
            int j = 0;

            while (j < baris) {
                if (i < baris / 2) {
                    if (j <= i || j >= baris - i - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    if (j <= baris - i - 1 || j >= i) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }

                j++;
            }

            System.out.println();
            i++;
        }

        input.close();
    }
}

