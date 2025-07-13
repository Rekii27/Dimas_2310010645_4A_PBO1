import java.util.ArrayList;

public class Database {
    public static ArrayList<Lapangan> daftarLapangan = new ArrayList<>();
    public static ArrayList<Reservasi> daftarReservasi = new ArrayList<>();

    public static void tambahLapangan(Lapangan l) {
        daftarLapangan.add(l);
    }

    public static void tampilkanLapangan() {
        for (Lapangan l : daftarLapangan) {
            l.tampilkanInfo();
        }
    }

    public static void tambahReservasi(Reservasi r) {
        daftarReservasi.add(r);
    }

    public static void tampilkanReservasi() {
        for (Reservasi r : daftarReservasi) {
            r.tampilkanDetail();
        }
    }
}
