package Pembelajaran01Runtunan;


import java.util.Scanner;

public class Latihan08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Membuat object Students
        Students myBio = new Students();

        // Input NPM
        System.out.print("Masukkan NPM: ");
        Integer npm = input.nextInt();
        input.nextLine();

        // Input nama lengkap
        System.out.print("Masukkan Nama Lengkap: ");
        String nama = input.nextLine();

        // Input nama kelas
        System.out.print("Masukkan Nama Kelas: ");
        String kelas = input.nextLine();

        // Input semester
        System.out.print("Masukkan Semester: ");
        Integer semester = input.nextInt();

        // Input IPK
        System.out.print("Masukkan IPK: ");
        Float ipk = input.nextFloat();

        // Memanggil 5 method pada class Students
        System.out.println("\n=== DATA MAHASISWA ===");
        System.out.println("NPM          : " + myBio.getNPM(npm));
        System.out.println("Nama Lengkap : " + myBio.getFullname(nama));
        System.out.println("Nama Kelas   : " + myBio.getClassName(kelas));
        System.out.println("Semester     : " + myBio.getSemester(semester));
        System.out.println("IPK          : " + myBio.getGPA(ipk));

        input.close();
    }
}

