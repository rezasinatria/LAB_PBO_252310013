package TugasPbo;

public class PesananFood {
	private String namaMakanan;
    private int jumlah;
    private double hargaTotal;

    public PesananFood(String namaMakanan, int jumlah) {
        this.namaMakanan = namaMakanan;
        this.jumlah = jumlah;
    }

    public void hitungTotal(double hargaSatuan) {
        hargaTotal = jumlah * hargaSatuan;
    }

    public double getHargaTotal() {
        return hargaTotal;
    }
}
