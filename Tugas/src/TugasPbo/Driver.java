package TugasPbo;


public class Driver {
    private String namaDriver;
    private String nomorHP;
    private String status;

    public Driver(String namaDriver, String nomorHP) {
        this.namaDriver = namaDriver;
        this.nomorHP = nomorHP;
        this.status = "Menunggu pesanan";
    }

    public void antarPesanan() {
        status = "Sedang mengantar pesanan";
        System.out.println(namaDriver + " sedang mengantar makanan.");
    }

    public String getStatus() {
        return status;
    }
}

