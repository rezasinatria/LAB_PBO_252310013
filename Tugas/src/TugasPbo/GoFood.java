package TugasPbo;


public class GoFood {
    public static void main(String[] args) {
        PesananFood pesanan =
            new PesananFood("Nasi Goreng", 2);

        pesanan.hitungTotal(15000);

        System.out.println("Total harga: Rp" +
            pesanan.getHargaTotal());

        Driver driver =
            new Driver("Budi", "08123456789");

        driver.antarPesanan();

        System.out.println("Status: " +
            driver.getStatus());
    }
}

