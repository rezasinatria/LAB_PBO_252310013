package Praktikum_2;

//VARIABEL

public class Latihan4 {
	
	public static void main(String[] args) {
		int umur = 20;
		
		if (umur < 13) {
			System.out.println("Anak anak");
		}
		else if(umur >= 13 && umur <= 17) {
			System.out.println("Remaja");
		}
		else {
			System.out.println("Dewasa");
		}
	}
	
}


package Praktikum3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class InventoryBuku {

    public static void main(String[] args) {

        ArrayList<String> buku = new ArrayList<String>();

        while (true) {

            String menu = JOptionPane.showInputDialog(
                null,
                "=== INVENTORY BUKU ===\n\n"
                + "1. Input Buku\n"
                + "2. Hapus Buku\n"
                + "3. Output Seluruh Buku\n"
                + "4. Keluar\n\n"
                + "Pilih menu (1-4):",
                "Inventory Buku",
                JOptionPane.QUESTION_MESSAGE
            );

            // Jika pengguna menekan Cancel
            if (menu == null) {
                break;
            }

            switch (menu) {

                case "1":
                    String judul = JOptionPane.showInputDialog(
                        null,
                        "Masukkan judul buku:",
                        "Input Buku",
                        JOptionPane.QUESTION_MESSAGE
                    );

                    if (judul != null && !judul.trim().isEmpty()) {
                        buku.add(judul.trim());

                        JOptionPane.showMessageDialog(
                            null,
                            "Buku berhasil disimpan!"
                        );
                    } else if (judul != null) {
                        JOptionPane.showMessageDialog(
                            null,
                            "Judul buku tidak boleh kosong!"
                        );
                    }
                    break;

                case "2":
                    if (buku.isEmpty()) {
                        JOptionPane.showMessageDialog(
                            null,
                            "Belum ada buku yang tersimpan."
                        );
                        break;
                    }

                    String daftarHapus = "=== DAFTAR BUKU ===\n\n";

                    for (int i = 0; i < buku.size(); i++) {
                        daftarHapus += i + ". " + buku.get(i) + "\n";
                    }

                    String inputIndex = JOptionPane.showInputDialog(
                        null,
                        daftarHapus + "\nMasukkan indeks buku yang dihapus:",
                        "Hapus Buku",
                        JOptionPane.QUESTION_MESSAGE
                    );

                    if (inputIndex == null) {
                        break;
                    }

                    try {
                        int index = Integer.parseInt(inputIndex);

                        if (index >= 0 && index < buku.size()) {
                            String bukuDihapus = buku.remove(index);

                            JOptionPane.showMessageDialog(
                                null,
                                "Buku \"" + bukuDihapus
                                + "\" berhasil dihapus."
                            );
                        } else {
                            JOptionPane.showMessageDialog(
                                null,
                                "Indeks buku tidak ditemukan!"
                            );
                        }

                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(
                            null,
                            "Indeks harus berupa angka!"
                        );
                    }
                    break;

                case "3":
                    if (buku.isEmpty()) {
                        JOptionPane.showMessageDialog(
                            null,
                            "Inventory buku masih kosong."
                        );
                    } else {
                        String daftarBuku = "=== SELURUH DATA BUKU ===\n\n";

                        for (int i = 0; i < buku.size(); i++) {
                            daftarBuku += i + ". "
                                + buku.get(i) + "\n";
                        }

                        JOptionPane.showMessageDialog(
                            null,
                            daftarBuku,
                            "Data Inventory Buku",
                            JOptionPane.INFORMATION_MESSAGE
                        );
                    }
                    break;

                case "4":
                    JOptionPane.showMessageDialog(
                        null,
                        "Program Inventory Buku selesai."
                    );
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(
                        null,
                        "Pilihan tidak valid! Pilih menu 1-4."
                    );
            }
        }
    }
}

