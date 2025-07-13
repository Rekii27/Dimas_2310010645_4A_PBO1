public class Lapangan {
    private final String kode;
    private final String nama;
    private double hargaPerJam;

    public Lapangan(String kode, String nama, double hargaPerJam) {
        this.kode = kode;
        this.nama = nama;
        this.hargaPerJam = hargaPerJam;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public double getHargaPerJam() {
        return hargaPerJam;
    }

    public void setHargaPerJam(double hargaPerJam) {
        this.hargaPerJam = hargaPerJam;
    }

    public void tampilkanInfo() {
        System.out.println("Kode: " + kode + ", Nama: " + nama + ", Harga: Rp" + hargaPerJam + "/jam");
    }
}
