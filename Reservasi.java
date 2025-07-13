import java.time.LocalDateTime;

public class Reservasi {
    private final Pelanggan pelanggan;
    private final Lapangan lapangan;
    private final LocalDateTime waktu;
    private final int durasi;

    public Reservasi(Pelanggan pelanggan, Lapangan lapangan, LocalDateTime waktu, int durasi) {
        this.pelanggan = pelanggan;
        this.lapangan = lapangan;
        this.waktu = waktu;
        this.durasi = durasi;
    }

    public void tampilkanDetail() {
        System.out.println("Reservasi oleh " + pelanggan.getNama() + 
            " di lapangan " + lapangan.getNama() + 
            " pada " + waktu + 
            " selama " + durasi + " jam. Total: Rp" + (durasi * lapangan.getHargaPerJam()));
    }
}
