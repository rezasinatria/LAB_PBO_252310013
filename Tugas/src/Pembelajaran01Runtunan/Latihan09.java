package Pembelajaran01Runtunan;



import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Latihan09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Membuat object Students
        Students myBio = new Students();

        // Data produk
        String namaToko = "TOKO SERBAGUNA IBIK";
        String namaProduk = "ROTI ENAK";
        int hargaSatuan = 6300;

        // Input jumlah produk
        System.out.print("Masukan jumlah produk yang dibeli : ");
        int qty = input.nextInt();
        input.nextLine();

        // Input nama member melalui class Students
        System.out.print("Masukkan nama member: ");
        String namaMember = input.nextLine();

        // Menyimpan nama member melalui method Students
        myBio.getFullname(namaMember);

        // Perhitungan
        int total = qty * hargaSatuan;
        double diskon = 0;

        if (qty >= 3) {
            diskon = total * 0.05;
        }

        double subTotal = total - diskon;

        // Tanggal dan waktu saat ini
        LocalDateTime waktu = LocalDateTime.now();
        DateTimeFormatter format =
            DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)");

        // Cetak kwitansi
        System.out.println();
        System.out.println("======================================================");
        System.out.println("             " + namaToko);
        System.out.println("======================================================");
        System.out.println(waktu.format(format));
        System.out.println();
        System.out.println("ITEM          QTY    HARGA       TOTAL");
        System.out.println("======================================================");

        System.out.printf("%-14s %-6d Rp %,d    Rp %,d%n",
                          namaProduk, qty, hargaSatuan, total);

        System.out.println("------------------------------------------------------");
        System.out.printf("Diskon    : Rp %,.0f%n", diskon);
        System.out.printf("Sub Total : Rp %,.0f%n", subTotal);

        // Menampilkan nama member dari object Students
        System.out.println("Member Name : " + myBio.getFullname(namaMember));

        System.out.println("======================================================");

        input.close();
    }
}
