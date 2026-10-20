package Quiz1;





import java.util.ArrayList;
import javax.swing.JOptionPane;

public class InvantoryBuku {

    public static void main(String[] args) {

        ArrayList<String> buku = new ArrayList<String>();
        boolean berjalan = true;

        while (berjalan) {

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

        }
    }
    
}